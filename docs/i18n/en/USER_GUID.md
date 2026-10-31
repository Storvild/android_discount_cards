🏠 **[Main Description (README)](README.md)** | ❓ **[FAQ](FAQ.md)**

# 📖 DiscountCards User Guide

Welcome to **DiscountCards** – your reliable, fast, and completely offline loyalty card wallet. This guide will help you set up the app, add cards, and use them with maximum efficiency.

---

## 📥 Chapter 1: Installation and First Launch

1. **Download**: Go to the [Releases section on GitHub](https://github.com/Storvild/android_discount_cards/releases) and download the latest file with the `.apk` extension (for example, `discount_cards_v1.1 7.apk`).
2. **Installation**: Open the downloaded file. If the system prompts for permission, allow installing apps from this source (browser or file manager) in the Android settings.
3. **First Launch**: The app opens instantly. It requires no registration, account creation, or internet access.
4. **Permissions**: On your first attempt to scan a card with the camera, the app will request access to the **Camera**. This permission is optional: you can deny it if you plan to add cards manually or from the gallery.

---

## ➕ Chapter 2: Adding a New Card

Tap the floating **"+"** button on the main screen. You can also tap "Add card..." in the menu. You can use three methods to add a card (by tapping the corresponding icons next to the Code field):

### Method A: Camera Scanning (Recommended)
1. Point your phone's camera at the physical card.
2. The app automatically recognizes the barcode or QR code using ML Kit.
3. Check the recognized number and tap "Save".

### Method B: Select from File / Gallery
1. If you already have a photo of the barcode in your gallery, select this option.
2. Specify the image, and the app will extract data from it.

### Method C: Manual Entry
1. Enter the **Store Name** (for example, "Walmart").
2. Enter the **Card Code** (manually or by pasting it).
3. Select the **Code Type** from the list (for example, `EAN_13` for most grocery cards, `QR_CODE`, or `PHONE` if the discount is given simply by phone number).
4. *(Optional)* Add a note or CVC/CVV code.
5. Tap "Save".

---

## 🛒 Chapter 3: Using Cards at Checkout

The app offers several convenient ways to present a card without digging through menus:

### 1. Main Method
- Open the desired card (Use search if necessary).
- Present the barcode at the checkout.

### 2. Fullscreen Mode (In case of reading issues)
- Open the desired card.
- **Tap directly on the barcode image**.
- It will expand to full screen: the background becomes white, screen brightness automatically increases to 100%, and in portrait orientation, the barcode rotates 90° for optimal reading by the cashier's scanner.

### 3. Home Screen Widget
- Open the screen where you placed the barcode widget and show it at the checkout.
- See Chapter 8 on how to add a widget.

### 4. Sending a Barcode (Share) if you want someone else to present the card at checkout.
- On the card details screen, tap the **"Share barcode image"** button.
- Select a messenger or app. The image will be sent in PNG format with white margins, ensuring successful scanning by the recipient.

---

## 🗂️ Chapter 4: Managing and Organizing Cards

When you have many cards, organization tools come to the rescue:

- **Search**: Use the search bar at the top of the main screen. Search works by store name, card number, and notes.
- **Sorting**: Tap the sort icon to arrange cards by name, creation date, or frequency of use.
- **Favorites**: Tap the star icon ⭐️ on a card to move frequently used cards to the top of the list.
- **Context Menu**: Perform a **long press** on any card in the list to quickly bring up the "Edit" or "Delete" menu.
- **Archive**: If a card is outdated but you don't want to delete it, open its details and tap "Move to archive". Archived cards are hidden from the main list, search, and export, but can be restored at any time via the "Archive" menu.

---

## 🎨 Chapter 5: Customizing Appearance

Go to **Settings** (gear icon) to personalize the app:

- **Theme**: Select light, dark, or system theme.
- **Compact List Mode**: Enable this option to hide barcodes and card numbers on the main screen. This reduces card height by half and significantly speeds up scrolling on any device.
- **Brightness on Card**: Enable the brightness slider directly on the card screen for quick manual adjustments before scanning.
- **Interface Language**: Choose one of the 11 supported languages independently of your system language.

*When editing an individual card, you can also set a unique color for it (via a palette or HEX code, e.g. `#0EE8A5`) and a category icon.*

---

## 💾 Chapter 6: Backup and Data Transfer

Your data belongs to you alone. Create backups regularly.

### Export (Creating a Copy)
1. Go to Settings → **Export**.
2. Select format:
   - **JSON**: Full format with all details (colors, icons, dates, CVC, archive status). Recommended for transferring to another device.
   - **CSV**: Table format (Name, Code, Code Type, CVC, Note). Convenient for viewing in Excel.
3. Save the file to a convenient folder or send it to yourself via messenger/cloud.

### Import (Restoring a Copy)
1. **Automatic Method**: Find the saved `.json` or `.csv` file in your file manager and tap it. Select "Open with" → **DiscountCards**. The app will automatically launch the import process.
2. **Manual Method**: Go to Settings → **Import** and select the file manually.
3. **Select Import Mode**:
   - **MERGE**: Adds new cards to existing ones (recommended).
   - **OVERWRITE**: Completely deletes current cards and replaces them with data from the file.
4. **When duplicates are detected**, the app will offer a strategy: update existing, add as new, or skip.

---

## ⚠️ Chapter 7: Troubleshooting Common Issues

| Problem | Solution |
| :--- | :--- |
| **Checkout scanner does not read the barcode from the screen** | 1. Tap the barcode for fullscreen mode (maximum brightness + white background).<br>2. Make sure the correct code type was selected when creating the card (usually `EAN_13` or `CODE_128`).<br>3. Wipe fingerprints off your screen. |
| **Camera does not focus on the physical card** | Ensure good lighting. If the camera still fails, photograph the card with your phone's default camera and use the "Select from file" feature in DiscountCards. |
| **App feels slow with a large number of cards** | Go to Settings and enable **"Compact list mode"**. This disables rendering of barcodes in the general list and speeds up performance significantly. |
| **Cannot find the imported file** | Make sure you downloaded the file in `.json` or `.csv` format. When importing, the app automatically recognizes CSV delimiters (comma, semicolon, or tab). |


Here are clear, well-structured points for the FAQ section dedicated to working with widgets. They are written in plain language, taking into account Android features and DiscountCards app functionality.

---

## Chapter 8: 🧩 Home Screen Widgets

**How to add a widget to the phone's home screen?**  
1. Press and hold any empty space on your smartphone's home screen.  
2. In the bottom menu that appears, select **"Widgets"**.  
3. Scroll through the app list and find **DiscountCards**.  
4. Press and hold the widget icon and, without releasing your finger, drag it to a free space on the screen.  
5. Immediately after placing it, a configuration window will open: select the desired discount card from your list and tap "Done" (or "Save").
6. Widget settings include a preview showing approximately how the widget will look at various sizes (actual appearance depends on the phone model). The physical sizes of the real widget do not change automatically. You can also specify whether to display Name and Barcode in the settings.

**How to change the selected card or widget settings?**  
You have two convenient ways to do this:  
- **Via the widget itself:** Tap the transparent edit button (top right of the widget itself). This will open a menu where you can select a different card or change display options.  
- **Via the Android menu:** Press and hold the already placed widget. In the pop-up menu that appears, tap **"Widget settings"** (this does not work on all phones).

**How to resize a widget?**  
The DiscountCards widget is adaptive and supports sizes from **1×1 to 5×5** grid cells. To change its size:  
1. Press and hold the widget on the home screen.  
2. When selected, resize handles (usually blue or contrasting dots/lines) will appear on its edges.  
3. Drag these handles in the desired direction to increase or decrease the widget area.  
4. Release your finger to lock in the new size.  
💡 *Tip:* At the minimum size (1×1), only a compact icon or mini-barcode will be displayed. To enlarge the barcode, you can hide the Name display in settings. For convenient scanning at checkout, size **2×2** or larger is recommended so that the store name and full barcode are visible.

---

## 📬 Feedback and Support

The app is developed with user care in mind. If you find a bug, have a suggestion for improvement, or want to add support for a new barcode format, please open an issue in the [Issues section on GitHub](https://github.com/Storvild/android_discount_cards/issues).

*Thank you for choosing DiscountCards! Keep your discounts safe and convenient.*
