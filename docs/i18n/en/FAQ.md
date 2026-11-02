🏠 **[Main Description (README)](README.md)** | 📖 **[User Guide](USER_GUID.md)**

# ❓ Frequently Asked Questions (FAQ) — DiscountCards

## 📌 General Questions

**What is DiscountCards?**  
It is a lightweight and fast Android app for storing, scanning, and using loyalty and discount cards. It replaces physical card wallets by allowing you to instantly show a barcode at the checkout right from your smartphone screen.

**Is the app free?**  
Yes, the project is completely free and distributed as Open Source under the MIT license. You can download the latest APK version in the [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases) section.

**Are there ads or trackers in the app?**  
No. The app is completely self-contained, contains no ads, and does not use any analytics or tracking tools.

**Does the app work without internet?**  
Yes, it is a **completely offline app**. Its manifest does not even include the `android.permission.INTERNET` permission. All data is stored exclusively on your device, guaranteeing functionality even in areas with no network coverage (for example, in hypermarket basements).

---

## 🔒 Security and Privacy

**Where is my data saved?**  
All data (cards, settings, statistics) is stored locally in your device's database. No information is sent to third-party servers.

**What permissions does the app request?**  
The app requires only one permission, and it is requested **only at the moment of use**:
- `android.permission.CAMERA` — necessary exclusively for scanning physical cards via the camera. If you add cards manually or from the gallery, this permission is not required.

---

## 💳 Usage and Features

**How do I add a new card?**  
There are three methods:
1. **Manually:** enter the store name, card number, and select the barcode format.
2. **Scanning:** tap the button in the "Card Number" section with the QR code icon and point the camera at the physical card (using ML Kit for fast recognition).
3. **From File:** tap the button in the "Card Number" section and select a saved barcode image from your gallery or file manager.

**How to quickly add many cards?**  
- **Bulk camera scanning:** select *Tools → Bulk scanning…* in the main screen drop-down menu ("..."). The camera opens in continuous scanning mode: point it at card barcodes one by one, and cards will be created with store name = code.
- **Bulk import from images:** select *Tools → Bulk import from images…* in the drop-down menu. Select multiple photos from gallery, and ML Kit will recognize barcodes on them and create new cards.
- **"Save & Add Another" button (`+`):** on the card creation/edit screen, next to the "Save" button, there is a square `+` button. It saves the current card and prepares the form for the next one — keeping the store name, color, icon, and format pre-filled, placing the cursor at the end of the card number field, and resetting creation date and view count. This allows you to continuously enter a batch of cards one after another.
- **"Create a copy…" feature:** long-press any card in the main list (context menu) and select **"Create a copy…"**. This opens the new card form with pre-filled settings for rapid saving.
- **Batch import from file:** in *Tools → Import from file…*, you can load a card list file (`JSON` or `CSV`), or simply tap such a file in your file manager.

**What barcode formats are supported?**  
The app generates and recognizes: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. There is also a `PHONE` mode for cards where the discount is provided simply by phone number (displayed as large text, without generating a barcode).

**What to do if a barcode is difficult to read? How to make sure the cashier can easily scan the barcode from the screen?**  
- Tap the barcode on the card: it will open **fullscreen** with maximum brightness, white background, and automatically rotate 90° (in portrait orientation) for ideal scanning.
- In settings, you can enable "Show brightness on card" to adjust brightness with a slider directly on the card screen.
- You can also tap the **"Share barcode image"** button to send a PNG barcode image with white margins to a messenger (for example, if you are buying something through a courier or a friend).

**How to speed up the app on a low-end device?**  
In settings, enable **"Compact list mode"**. This turns off barcode and card number rendering on the main screen, cutting list item heights in half and significantly accelerating loading and scrolling.

**Can I add notes or a CVC code to a card?**  
Yes, when editing a card, you can add any custom note as well as a field for a CVC/CVV code (for example, for redeeming bonus points).

---

## 🏭 Additional Use Cases

**What other ways can I use the app?**
DiscountCards is not only great for loyalty cards, but also for other barcode-related tasks. It is especially valuable **in places without network access** (hypermarket basements, warehouses, rural areas) — all data is stored locally and available instantly, and you can transfer it to your office later via any connection or cable.

- **📦 Bulk scanning at a warehouse** — use the *Bulk scanning…* mode to continuously scan product barcodes at a warehouse. Each scanned barcode is automatically saved as a new card with the name equal to the code.
- **📋 Inventory** — scan all items one by one in bulk scanning mode, then export the result to **CSV** for further processing in Excel or other spreadsheet editors.
- **📷 Batch import from photos** — if you already have photos of products with barcodes, select *Bulk import from images…* and upload multiple photos at once. The app recognizes barcodes via ML Kit and creates cards automatically.
- **✏️ Batch entry with custom names** — if you need meaningful names rather than just codes, use the **"Save & Add Another"** button (the square `+` next to "Save") on the edit form. After each scan or manual entry, you save the card, change the name, and press `+` again — format, color, icon, and store remain pre-filled.

> [!TIP]
> In bulk scanning mode and batch import from images, the card name will be equal to the barcode. If you need a custom name, use the "Save & Add Another" button or edit the card after creation.

**How do I send the scanned data to a computer or the office?**
After scanning, you can send the collected data in any convenient way:
- **📤 Export to file (JSON / CSV):** select *Tools → Export to file…*, save the JSON or CSV to your device and transfer it to your office or accounting.
- **📲 Share:** the same feature *Tools → Share…* opens the Android system menu — you can send the file **directly to a messenger** (Telegram, WhatsApp, Signal), **to your email** (Gmail, Outlook, etc.), **to the cloud** (Drive, Dropbox, OneDrive), or to any other app installed on your phone.
- **📧 By email:** just pick your email client from the "Share" menu and attach the file — it even works over plain MMS if your email client supports it.
- **🔁 Transfer to another device:** send the file via Bluetooth, Wi-Fi Direct, or a USB cable, then open it on another phone or computer.

---

## 💾 Backup and Data Transfer

**How to create a backup of cards?**  
Open the main screen drop-down menu ("...") and select **Tools → Export to file…**. You can save all data in **JSON** format (full data structure, recommended) or **CSV** (table format, convenient for viewing in Excel).

**How to transfer cards to a new phone?**  
1. On the old device, export cards to a file via *Tools → Export to file…* (JSON or CSV).
2. Transfer this file to the new device (via Bluetooth, messenger, cloud, or USB).
3. On the new device, open the file through a file manager. The app will automatically intercept the action and offer to import cards.

**What do the import modes mean?**  
- **MERGE:** adds cards from the file to those already existing in the app.
- **OVERWRITE:** completely deletes all current cards and replaces them with data from the file.
- *When matching cards are found* (by number and name), you can choose a strategy: update existing, add as new duplicates, or skip them.

---

## 🧩 Widgets and Organization

**Can I show a card without opening the app?**  
Yes. Add the DiscountCards widget to your home screen. It supports sizes from 1×1 to 5×5, displays barcode and store name, and opens the full card instantly when tapped.

**How to get organized if there are too many cards?**  
- Use **Favorites** (⭐️) for frequently used cards so they stay at the top of the list.
- Use **Archive**: move unused or expired cards there. They will disappear from the main list, search, and export, but will not be permanently deleted. You can restore them anytime.
- Delete a card if you are sure you will no longer need it.

**Can I customize the appearance of cards?**  
Yes. For each card, you can select a category icon, a color from the palette, or specify an exact HEX code (`#RRGGBB`). Light, dark, and system themes are also supported.

---

## 🛠 Troubleshooting

**The cashier's scanner does not read the barcode from my screen. What should I do?**  
1. Make sure the correct **barcode format** was selected when creating the card (for example, `EAN_13` for most grocery cards).
2. Use barcode fullscreen mode (tap on it in the card) to ensure 100% brightness and a white background.
3. Wipe fingerprints and smudges off your screen.

**The app cannot scan my physical card with the camera.**  
- Make sure you granted the app permission to access the camera (requested when tapping the scanner button for the first time).
- Ensure good lighting and hold the camera parallel to the barcode at a distance of 10–20 cm.
- If the barcode is damaged or the camera fails, use the **"Select from file"** feature after taking a picture of the card with the standard phone camera.

**How to change the app language?**  
In the app settings, there is a separate "Language" item. You can choose one of 12 supported languages (Russian, English, Deutsch, Français, Español, Português, Italiano, 日本語, 简体中文, العربية, Türkçe, हिन्दी) independently of your smartphone's system language.

---

*If you did not find an answer to your question, you can create a new issue in the [Issues](https://github.com/Storvild/android_discount_cards/issues) section on the project's GitHub.*
