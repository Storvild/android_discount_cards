package com.example.discountcards.ui.addedit

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.discountcards.data.local.entity.DiscountCard
import com.example.discountcards.data.repository.CardRepository
import com.google.mlkit.vision.barcode.BarcodeScanning
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.common.InputImage
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class AddEditCardViewModel(
    private val repository: CardRepository,
    private val cardId: Long? = null,
    private val duplicateFromId: Long? = null,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {

    private val _uiState = MutableStateFlow(AddEditCardUiState(cardId = cardId))
    val uiState: StateFlow<AddEditCardUiState> = _uiState.asStateFlow()

    init {
        if (cardId != null && cardId > 0) {
            loadCard(cardId)
        } else if (duplicateFromId != null && duplicateFromId > 0) {
            loadCardForDuplicate(duplicateFromId)
        }
    }

    private fun loadCardForDuplicate(id: Long) {
        viewModelScope.launch(ioDispatcher) {
            _uiState.update { it.copy(isLoading = true) }
            val card = repository.getCardByIdDirect(id)
            if (card != null) {
                _uiState.update {
                    it.copy(
                        storeName = card.storeName,
                        cardNumber = card.cardNumber,
                        barcodeFormat = card.barcodeFormat,
                        cvc = card.cvc,
                        note = card.note,
                        cardColor = card.cardColor,
                        iconName = card.iconName.ifBlank { "shopping_bag" },
                        isFavorite = card.isFavorite,
                        usageCount = 0,
                        isArchived = false,
                        createdAt = null,
                        isLoading = false,
                        isEditMode = false,
                        cardId = null,
                        selectCardNumberTrigger = System.currentTimeMillis()
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        userMessage = "Card not found"
                    )
                }
            }
        }
    }

    private fun loadCard(id: Long) {
        viewModelScope.launch(ioDispatcher) {
            _uiState.update { it.copy(isLoading = true) }
            val card = repository.getCardByIdDirect(id)
            if (card != null) {
                _uiState.update {
                    it.copy(
                        storeName = card.storeName,
                        cardNumber = card.cardNumber,
                        barcodeFormat = card.barcodeFormat,
                        cvc = card.cvc,
                        note = card.note,
                        cardColor = card.cardColor,
                        iconName = card.iconName.ifBlank { "shopping_bag" },
                        isFavorite = card.isFavorite,
                        usageCount = card.usageCount,
                        isArchived = card.isArchived,
                        createdAt = card.createdAt,
                        isLoading = false,
                        isEditMode = true
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        userMessage = "Card not found"
                    )
                }
            }
        }
    }

    fun onStoreNameChanged(name: String) {
        _uiState.update {
            it.copy(
                storeName = name,
                storeNameError = if (name.isNotBlank()) null else it.storeNameError
            )
        }
    }

    fun onCardNumberChanged(number: String) {
        _uiState.update {
            it.copy(
                cardNumber = number,
                cardNumberError = if (number.isNotBlank()) null else it.cardNumberError
            )
        }
    }

    fun onBarcodeFormatChanged(format: String) {
        _uiState.update { it.copy(barcodeFormat = format) }
    }

    fun onCvcChanged(cvc: String) {
        _uiState.update { it.copy(cvc = cvc) }
    }

    fun onNoteChanged(note: String) {
        _uiState.update { it.copy(note = note) }
    }

    fun onCardColorChanged(colorInt: Int) {
        _uiState.update { it.copy(cardColor = colorInt) }
    }

    fun onIconNameChanged(iconName: String) {
        _uiState.update { it.copy(iconName = iconName) }
    }

    fun onFavoriteChanged(isFavorite: Boolean) {
        _uiState.update { it.copy(isFavorite = isFavorite) }
    }

    fun openCameraScanner() {
        _uiState.update { it.copy(isCameraScannerOpen = true) }
    }

    fun closeCameraScanner() {
        _uiState.update { it.copy(isCameraScannerOpen = false) }
    }

    fun onBarcodeScanned(cardNumber: String, barcodeFormat: String) {
        viewModelScope.launch(ioDispatcher) {
            val currentState = _uiState.value
            val existingCards = repository.getCardsByNumber(cardNumber)
            val hasDuplicate = existingCards.any { it.id != currentState.cardId }

            if (hasDuplicate) {
                _uiState.update {
                    it.copy(
                        isCameraScannerOpen = false,
                        showDuplicateWarningDialog = true,
                        pendingCardNumber = cardNumber,
                        pendingBarcodeFormat = barcodeFormat
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        cardNumber = cardNumber,
                        barcodeFormat = barcodeFormat,
                        cardNumberError = null,
                        isCameraScannerOpen = false,
                        userMessage = "Barcode recognized: $cardNumber"
                    )
                }
            }
        }
    }

    fun onDuplicateWarningConfirmed() {
        val state = _uiState.value
        val pendingAction = state.pendingSaveAction

        _uiState.update {
            it.copy(
                showDuplicateWarningDialog = false,
                duplicateWarningType = DuplicateWarningType.NONE,
                existingDuplicateFormat = "",
                pendingSaveAction = PendingSaveAction.NONE
            )
        }

        if (pendingAction != PendingSaveAction.NONE) {
            viewModelScope.launch(ioDispatcher) {
                performSave(isAddAnother = (pendingAction == PendingSaveAction.SAVE_AND_ADD_ANOTHER))
            }
        } else if (state.pendingCardNumber.isNotBlank()) {
            _uiState.update {
                it.copy(
                    cardNumber = state.pendingCardNumber,
                    barcodeFormat = state.pendingBarcodeFormat,
                    cardNumberError = null,
                    pendingCardNumber = "",
                    pendingBarcodeFormat = "",
                    userMessage = "Barcode recognized: ${state.pendingCardNumber}"
                )
            }
        }
    }

    fun onDuplicateWarningDismissed() {
        _uiState.update {
            it.copy(
                showDuplicateWarningDialog = false,
                duplicateWarningType = DuplicateWarningType.NONE,
                existingDuplicateFormat = "",
                pendingSaveAction = PendingSaveAction.NONE,
                pendingCardNumber = "",
                pendingBarcodeFormat = ""
            )
        }
    }

    fun processGalleryImage(context: Context, uri: Uri) {
        viewModelScope.launch(ioDispatcher) {
            runCatching {
                val inputImage = InputImage.fromFilePath(context, uri)
                val scanner = BarcodeScanning.getClient()
                scanner.process(inputImage)
                    .addOnSuccessListener { barcodes ->
                        if (barcodes.isNotEmpty()) {
                            val barcode = barcodes.first()
                            val rawValue = barcode.rawValue ?: barcode.displayValue ?: ""
                            val detectedFormat = mapMlKitFormatToString(barcode.format)
                            if (rawValue.isNotBlank()) {
                                onBarcodeScanned(rawValue, detectedFormat)
                            } else {
                                _uiState.update { it.copy(userMessage = "ERROR_BARCODE_NOT_FOUND") }
                            }
                        } else {
                            _uiState.update { it.copy(userMessage = "ERROR_BARCODE_NOT_FOUND") }
                        }
                    }
                    .addOnFailureListener {
                        _uiState.update { it.copy(userMessage = "ERROR_BARCODE_NOT_FOUND") }
                    }
                    .addOnCompleteListener {
                        runCatching { scanner.close() }
                    }
            }.onFailure {
                _uiState.update { it.copy(userMessage = "ERROR_BARCODE_NOT_FOUND") }
            }
        }
    }

    fun saveCard(skipDuplicateCheck: Boolean = false) {
        checkAndSaveCard(isAddAnother = false, skipDuplicateCheck = skipDuplicateCheck)
    }

    fun saveAndAddAnother(skipDuplicateCheck: Boolean = false) {
        checkAndSaveCard(isAddAnother = true, skipDuplicateCheck = skipDuplicateCheck)
    }

    private fun checkAndSaveCard(isAddAnother: Boolean, skipDuplicateCheck: Boolean) {
        val currentState = _uiState.value
        val isStoreNameValid = currentState.storeName.isNotBlank()
        val isCardNumberValid = currentState.cardNumber.isNotBlank()

        if (!isStoreNameValid || !isCardNumberValid) {
            _uiState.update {
                it.copy(
                    storeNameError = if (!isStoreNameValid) "ERROR_STORE_NAME_EMPTY" else null,
                    cardNumberError = if (!isCardNumberValid) "ERROR_CARD_NUMBER_EMPTY" else null
                )
            }
            return
        }

        viewModelScope.launch(ioDispatcher) {
            val cardNumber = currentState.cardNumber.trim()
            val barcodeFormat = currentState.barcodeFormat

            if (!skipDuplicateCheck) {
                val existingCards = repository.getCardsByNumber(cardNumber)
                    .filter { it.id != currentState.cardId }

                if (existingCards.isNotEmpty()) {
                    val exactMatch = existingCards.firstOrNull {
                        it.barcodeFormat.equals(barcodeFormat, ignoreCase = true)
                    }

                    val warningType = if (exactMatch != null) {
                        DuplicateWarningType.EXACT_DUPLICATE
                    } else {
                        DuplicateWarningType.DIFFERENT_FORMAT
                    }

                    val existingFormat = exactMatch?.barcodeFormat ?: existingCards.first().barcodeFormat

                    _uiState.update {
                        it.copy(
                            showDuplicateWarningDialog = true,
                            duplicateWarningType = warningType,
                            existingDuplicateFormat = existingFormat,
                            pendingSaveAction = if (isAddAnother) PendingSaveAction.SAVE_AND_ADD_ANOTHER else PendingSaveAction.SAVE
                        )
                    }
                    return@launch
                }
            }

            performSave(isAddAnother = isAddAnother)
        }
    }

    private suspend fun performSave(isAddAnother: Boolean) {
        val currentState = _uiState.value
        _uiState.update { it.copy(isSaving = true) }
        val card = DiscountCard(
            id = currentState.cardId ?: 0,
            storeName = currentState.storeName.trim(),
            cardNumber = currentState.cardNumber.trim(),
            barcodeFormat = currentState.barcodeFormat,
            note = currentState.note.trim(),
            cardColor = currentState.cardColor,
            iconName = currentState.iconName,
            isFavorite = currentState.isFavorite,
            cvc = currentState.cvc,
            usageCount = currentState.usageCount,
            isArchived = currentState.isArchived,
            createdAt = currentState.createdAt ?: System.currentTimeMillis(),
            updatedAt = System.currentTimeMillis()
        )

        if (currentState.isEditMode) {
            repository.updateCard(card)
        } else {
            repository.insertCard(card)
        }

        if (isAddAnother) {
            _uiState.update {
                it.copy(
                    cardId = null,
                    isEditMode = false,
                    isSaving = false,
                    isSaved = false,
                    createdAt = null,
                    usageCount = 0,
                    showDuplicateWarningDialog = false,
                    duplicateWarningType = DuplicateWarningType.NONE,
                    pendingSaveAction = PendingSaveAction.NONE,
                    selectCardNumberTrigger = System.currentTimeMillis(),
                    userMessage = "CARD_SAVED"
                )
            }
        } else {
            _uiState.update {
                it.copy(
                    isSaving = false,
                    isSaved = true,
                    showDuplicateWarningDialog = false,
                    duplicateWarningType = DuplicateWarningType.NONE,
                    pendingSaveAction = PendingSaveAction.NONE
                )
            }
        }
    }

    fun onUserMessageShown() {
        _uiState.update { it.copy(userMessage = null) }
    }

    companion object {
        fun mapMlKitFormatToString(mlKitFormat: Int): String {
            return when (mlKitFormat) {
                Barcode.FORMAT_QR_CODE -> "QR_CODE"
                Barcode.FORMAT_CODE_128 -> "CODE_128"
                Barcode.FORMAT_EAN_13 -> "EAN_13"
                Barcode.FORMAT_EAN_8 -> "EAN_8"
                Barcode.FORMAT_UPC_A -> "UPC_A"
                Barcode.FORMAT_CODE_39 -> "CODE_39"
                Barcode.FORMAT_PDF417 -> "PDF_417"
                Barcode.FORMAT_AZTEC -> "AZTEC"
                else -> "CODE_128"
            }
        }
    }
}
