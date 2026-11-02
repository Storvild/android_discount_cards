🏠 **[Hauptbeschreibung (README)](README.md)** | 📖 **[Benutzerhandbuch](USER_GUID.md)**

# ❓ Häufig gestellte Fragen (FAQ) — DiscountCards

## 📌 Allgemeine Fragen

**Was ist DiscountCards?**  
Es ist eine leichte und schnelle Android-App zum Speichern, Scannen und Verwenden von Kundenkarten und Rabattkarten. Sie ersetzt physische Geldbörsen mit Karten und ermöglicht es Ihnen, an der Kasse sofort einen Barcode direkt vom Bildschirm Ihres Smartphones vorzuzeigen.

**Ist die App kostenlos?**  
Ja, das Projekt ist vollständig kostenlos und wird als Open Source unter der MIT-Lizenz bereitgestellt. Sie können die aktuelle APK-Version im Bereich [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases) herunterladen.

**Gibt es in der App Werbung oder Tracker?**  
Nein. Die App ist vollständig autark, enthält keine Werbung und verwendet keinerlei Analyse- oder Tracking-Werkzeuge.

**Funktioniert die App ohne Internet?**  
Ja, es ist eine **vollständige Offline-App**. In ihrem Manifest ist nicht einmal die Berechtigung `android.permission.INTERNET` enthalten. Alle Daten werden ausschließlich auf Ihrem Gerät gespeichert, was die Funktion selbst in Bereichen ohne Mobilfunknetz (z. B. in Kellergeschossen von Supermärkten) garantiert.

---

## 🔒 Sicherheit und Datenschutz

**Wo werden meine Daten gespeichert?**  
Alle Daten (Karten, Einstellungen, Statistiken) werden lokal in der Datenbank Ihres Geräts gespeichert. Es werden keine Informationen an Server Dritter gesendet.

**Welche Berechtigungen fordert die App an?**  
Die App benötigt nur eine einzige Berechtigung, und diese wird **nur im Moment der Nutzung** angefordert:
- `android.permission.CAMERA` — ausschließlich erforderlich für das Scannen physischer Karten über die Kamera. Wenn Sie Karten manuell oder aus der Galerie hinzufügen, wird diese Berechtigung nicht benötigt.

---

## 💳 Nutzung und Funktionen

**Wie füge ich eine neue Karte hinzu?**  
Es gibt drei Methoden:
1. **Manuell:** Ladenname und Kartennummer eingeben sowie das Barcode-Format auswählen.
2. **Scannen:** auf die Schaltfläche im Bereich „Kartennummer“ mit dem QR-Code-Symbol tippen und die Kamera auf die physische Karte richten (unter Verwendung von ML Kit für schnelle Erkennung).
3. **Aus Datei:** auf die Schaltfläche im Bereich „Kartennummer“ tippen und ein gespeichertes Barcode-Bild aus der Galerie oder dem Dateimanager auswählen.

**Wie kann man schnell viele Karten hinzufügen?**  
- **Massen-Scan mit Kamera:** Wählen Sie im Hauptmenü ("...") den Punkt *Werkzeuge → Massen-Scan…*. Die Kamera öffnet sich im kontinuierlichen Scan-Modus: Richten Sie sie nacheinander auf Barcodes, und die Karten werden automatisch gespeichert.
- **Massenimport aus Bildern:** Wählen Sie im Menü *Werkzeuge → Massenimport aus Bildern…*. Wählen Sie mehrere Bilder aus der Galerie, und ML Kit erkennt die Barcodes darauf automatisch.
- **Schaltfläche „Speichern & weitere hinzufügen“ (`+`):** Auf dem Erstellungs-/Bearbeitungsbildschirm befindet sich neben „Speichern“ die quadratische Schaltfläche `+`. Sie speichert die aktuelle Karte und bereitet das Formular für die nächste vor — Geschäft, Farbe, Icon und Format bleiben vorausgefüllt, der Cursor steht am Ende des Nummernfelds und Erstellungsdatum/Aufrufzähler werden zurückgesetzt.
- **Funktion „Kopie erstellen…“:** Drücken Sie lange auf eine Karte in der Hauptliste (Kontextmenü) und wählen Sie **„Kopie erstellen…“**. Dadurch wird das Formular mit den kopierten Daten zum schnellen Speichern geöffnet.
- **Stapel-Import aus Datei:** Über *Werkzeuge → Aus Datei importieren…* können Sie eine Kartenlistendatei (`JSON` oder `CSV`) importieren.

**Welche Barcode-Formate werden unterstützt?**  
Die App erstellt und erkennt: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. Zudem gibt es den Modus `PHONE` für Karten, bei denen der Rabatt einfach über die Telefonnummer gewährt wird (wird in großem Text ohne Barcode-Erstellung angezeigt).

**Was tun, wenn der Barcode schlecht lesbar ist? Wie sorgt man dafür, dass der Kassierer den Barcode leicht vom Bildschirm scannt?**  
- Tippen Sie auf den Barcode in der Karte: Er öffnet sich **im Vollbild** mit maximaler Helligkeit, weißem Hintergrund und dreht sich im Hochformat automatisch um 90° für ein ideales Scannen.
- In den Einstellungen können Sie „Helligkeit auf Karte anzeigen“ aktivieren, um die Helligkeit mit einem Regler direkt auf dem Kartenbildschirm anzupassen.
- Sie können auch auf die Schaltfläche **„Barcode-Bild teilen“** tippen, um ein PNG-Barcode-Bild mit weißem Rand an einen Messenger zu senden (z. B. wenn Sie etwas über einen Kurier oder Freund kaufen).

**Wie beschleunige ich die App auf einem schwächeren Gerät?**  
Aktivieren Sie in den Einstellungen den **„Kompakten Listenmodus“**. Dies schaltet die Barcode- und Kartennummern-Generierung auf dem Hauptbildschirm aus, halbiert die Höhe der Listenelemente und beschleunigt das Laden und Scrollen erheblich.

**Kann man Notizen oder einen CVC-Code zu einer Karte hinzufügen?**  
Ja, beim Bearbeiten einer Karte können Sie eine beliebige Notiz sowie ein Feld für einen CVC/CVV-Code hinzufügen (z. B. zum Einlösen von Bonuspunkten).

---

## 🏭 Zusätzliche Anwendungsfälle

**Wie kann ich die App noch auf andere Weise verwenden?**
DiscountCards eignet sich nicht nur für Treue- und Rabattkarten, sondern auch für andere Barcode-Aufgaben. Besonders wertvoll ist die App **an Orten ohne Netzwerkzugang** (Keller von Hypermärkten, Lager, ländliche Gebiete) — alle Daten werden lokal gespeichert und stehen sofort zur Verfügung; Sie können sie später per jeder Verbindung oder Kabel in Ihr Büro übertragen.

- **📦 Massen-Scanning im Lager** — verwenden Sie den Modus *Massen-Scanning…*, um Produkbarcodes im Lager kontinuierlich zu scannen. Jeder gescannte Barcode wird automatisch als neue Karte gespeichert, deren Name dem Code entspricht.
- **📋 Inventur** — scannen Sie alle Artikel nacheinander im Massen-Scanning-Modus und exportieren Sie das Ergebnis dann in **CSV** für die weitere Bearbeitung in Excel oder anderen Tabellenprogrammen.
- **📷 Batch-Import aus Fotos** — wenn Sie bereits Fotos von Produkten mit Barcodes haben, wählen Sie *Batch-Import aus Bildern…* und laden Sie mehrere Fotos gleichzeitig hoch. Die App erkennt die Barcodes per ML Kit und erstellt automatisch Karten.
- **✏️ Batch-Eingabe mit individuellen Namen** — wenn Sie aussagekräftige Namen statt bloßer Codes benötigen, nutzen Sie die Schaltfläche **«Speichern und neue hinzufügen»** (das quadratische `+` neben „Speichern“) im Bearbeitungsformular. Nach jedem Scan oder jeder manuellen Eingabe speichern Sie die Karte, ändern den Namen und drücken `+` erneut — Format, Farbe, Icon und Laden bleiben vorausgefüllt.

> [!TIP]
> Im Massen-Scanning-Modus und beim Batch-Import aus Bildern entspricht der Kartenname dem Barcode. Für individuelle Namen nutzen Sie die Schaltfläche „Speichern und neue hinzufügen“ oder bearbeiten Sie die Karte nach der Erstellung.

**Wie übertrage ich die gescannten Daten auf den Computer oder ins Büro?**
Nach dem Scannen können Sie die gesammelten Daten auf jede bequeme Weise senden:
- **📤 Export in eine Datei (JSON / CSV):** wählen Sie *Werkzeuge → In Datei exportieren…*, speichern Sie die JSON- oder CSV-Datei auf dem Gerät und übergeben Sie sie an Ihr Büro oder an die Buchhaltung.
- **📲 Teilen (Share):** dieselbe Funktion *Werkzeuge → Teilen…* öffnet das Android-Systemmenü — Sie können die Datei **direkt an einen Messenger** (Telegram, WhatsApp, Signal) senden, **per E-Mail** (Gmail, Outlook usw.) versenden, in die **Cloud** (Drive, Dropbox, OneDrive) hochladen oder an jede andere App auf dem Telefon senden.
- **📧 Per E-Mail:** wählen Sie einfach Ihren E-Mail-Client aus dem „Teilen“-Menü und hängen Sie die Datei an — es funktioniert sogar über gewöhnliches MMS, falls Ihr E-Mail-Client dies unterstützt.
- **🔁 Übertragung auf ein anderes Gerät:** senden Sie die Datei per Bluetooth, Wi-Fi Direct oder USB-Kabel und öffnen Sie sie anschließend auf einem anderen Telefon oder Computer.

---

## 💾 Sicherung und Datenübertragung

**Wie erstelle ich eine Sicherungskopie der Karten?**  
Öffnen Sie das Hauptmenü ("...") und wählen Sie **Werkzeuge → In Datei exportieren…**. Sie können alle Daten im Format **JSON** oder **CSV** speichern.

**Wie übertrage ich Karten auf ein neues Telefon?**  
1. Exportieren Sie auf dem alten Gerät die Karten in eine Datei über *Werkzeuge → In Datei exportieren…* (JSON oder CSV).
2. Übertragen Sie diese Datei auf das neue Gerät (per Bluetooth, Messenger, Cloud oder USB).
3. Öffnen Sie auf dem neuen Gerät die Datei über einen Dateimanager. Die App fängt die Aktion automatisch ab und bietet den Import der Karten an.

**Was bedeuten die Importmodi?**  
- **Zusammenführen (MERGE):** fügt Karten aus der Datei zu den bereits in der App vorhandenen hinzu.
- **Überschreiben (OVERWRITE):** löscht alle aktuellen Karten vollständig und ersetzt sie durch Daten aus der Datei.
- *Bei übereinstimmenden Karten* (nach Nummer und Name) können Sie eine Strategie wählen: Bestehende aktualisieren, als neue Duplikate hinzufügen oder überspringen.

---

## 🧩 Widgets und Organisation

**Kann man eine Karte anzeigen, ohne die App zu öffnen?**  
Ja. Fügen Sie das DiscountCards-Widget Ihrem Startbildschirm hinzu. Es unterstützt Größen von 1×1 bis 5×5, zeigt Barcode und Ladenname an und öffnet beim Tippen sofort die vollständige Karte.

**Wie sorgt man für Ordnung, wenn es zu viele Karten werden?**  
- Nutzen Sie **Favoriten** (⭐️) für häufig genutzte Karten, damit sie oben in der Liste bleiben.
- Nutzen Sie das **Archiv**: Verschieben Sie ungenutzte oder abgelaufene Karten dorthin. Sie verschwinden aus der Hauptliste, der Suche und dem Export, werden jedoch nicht dauerhaft gelöscht. Sie können sie jederzeit wiederherstellen.
- Löschen Sie eine Karte, wenn Sie sicher sind, dass Sie sie nicht mehr benötigen.

**Kann man das Erscheinungsbild der Karten anpassen?**  
Ja. Für jede Karte können Sie ein Kategorie-Symbol, eine Farbe aus der Palette wählen oder einen genauen HEX-Code (`#RRGGBB`) angeben. Helles, dunkles und systembasiertes Design werden ebenfalls unterstützt.

---

## 🛠 Fehlerbehebung

**Der Scanner an der Kasse liest den Barcode nicht von meinem Bildschirm. Was tun?**  
1. Stellen Sie sicher, dass beim Erstellen der Karte das richtige **Barcode-Format** gewählt wurde (z. B. `EAN_13` für die meisten Kundenkarten).
2. Nutzen Sie den Barcode-Vollbildmodus (auf den Barcode in der Karte tippen), um 100 % Helligkeit und einen weißen Hintergrund zu gewährleisten.
3. Wischen Sie Fingerabdrücke und Fettspuren vom Bildschirm ab.

**Die App kann meine physische Karte nicht mit der Kamera scannen.**  
- Stellen Sie sicher, dass Sie der App den Zugriff auf die Kamera erlaubt haben (wird beim ersten Tippen auf die Scanner-Schaltfläche angefordert).
- Sorgen Sie für gute Beleuchtung und halten Sie die Kamera im Abstand von 10–20 cm parallel zum Barcode.
- Wenn der Barcode beschädigt ist oder die Kamera versagt, nutzen Sie die Funktion **„Aus Datei auswählen“**, nachdem Sie die Karte mit der normalen Telefonkamera fotografiert haben.

**Wie ändere ich die Sprache der App?**  
In den App-Einstellungen gibt es einen eigenen Punkt „Sprache“. Sie können eine der 12 unterstützten Sprachen (Russisch, English, Deutsch, Français, Español, Português, Italiano, 日本語, 简体中文, العربية, Türkçe, हिन्दी) unabhängig von der System-Sprache Ihres Smartphones wählen.

---

*Wenn Sie keine Antwort auf Ihre Frage gefunden haben, können Sie ein neues Thema im Bereich [Issues](https://github.com/Storvild/android_discount_cards/issues) auf dem GitHub des Projekts erstellen.*
