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

## 💾 Backup and Data Transfer

**How to create a backup of cards?**  
Go to Settings → Export. You can save all data in **JSON** format (full data structure, recommended) or **CSV** (table format, convenient for viewing in Excel).

**How to transfer cards to a new phone?**  
1. On the old device, export cards to a file (JSON or CSV).
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
In the app settings, there is a separate "Language" item. You can choose one of 11 supported languages (Russian, English, Deutsch, Français, Español, Português, 日本語, 简体中文, العربية, Türkçe, हिन्दी) independently of your smartphone's system language.

---

*If you did not find an answer to your question, you can create a new issue in the [Issues](https://github.com/Storvild/android_discount_cards/issues) section on the project's GitHub.*
