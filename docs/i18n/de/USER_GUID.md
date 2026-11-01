🏠 **[Hauptbeschreibung (README)](README.md)** | ❓ **[FAQ](FAQ.md)**

# 📖 DiscountCards Benutzerhandbuch

Willkommen bei **DiscountCards** – Ihrer zuverlässigen, schnellen und vollständig offline funktionierenden Aufbewahrung für Kundenkarten. Dieses Handbuch hilft Ihnen, die App einzurichten, Karten hinzuzufügen und sie mit maximaler Effizienz zu nutzen.

---

## 📥 Kapitel 1: Installation und erster Start

1. **Herunterladen**: Gehen Sie zum Bereich [Releases auf GitHub](https://github.com/Storvild/android_discount_cards/releases) und laden Sie die neueste Datei mit der Endung `.apk` herunter (z. B. `discount_cards_v1.1 7.apk`).
2. **Installation**: Öffnen Sie die heruntergeladene Datei. Wenn das System nach einer Berechtigung fragt, erlauben Sie die Installation von Apps aus dieser Quelle (Browser oder Dateimanager) in den Android-Einstellungen.
3. **Erster Start**: Die App öffnet sich sofort. Sie erfordert keine Registrierung, Erstellung eines Kontos oder Internetzugang.
4. **Berechtigungen**: Beim ersten Versuch, eine Karte mit der Kamera zu scannen, fordert die App Zugriff auf die **Kamera** an. Diese Berechtigung ist optional: Sie können sie verweigern, wenn Sie Karten manuell oder aus der Galerie hinzufügen möchten.

---

## ➕ Kapitel 2: Hinzufügen einer neuen Karte

Tippen Sie auf die schwebende Schaltfläche **„+“** auf dem Hauptbildschirm. Sie können auch im Menü auf „Karte hinzufügen...“ tippen. Sie können drei Methoden zum Hinzufügen verwenden (indem Sie auf die entsprechenden Symbole neben dem Code-Feld tippen):

### Methode A: Kamera-Scan (Empfohlen)
1. Richten Sie die Kamera Ihres Telefons auf die physische Karte.
2. Die App erkennt den Barcode oder QR-Code mithilfe von ML Kit automatisch.
3. Überprüfen Sie die erkannte Nummer und tippen Sie auf „Speichern“.

### Methode B: Auswahl aus Datei / Galerie
1. Wenn Sie bereits ein Foto des Barcodes in Ihrer Galerie haben, wählen Sie diese Option.
2. Wählen Sie das Bild aus, und die App extrahiert die Daten daraus.

### Methode C: Manuelle Eingabe
1. Geben Sie den **Ladenrahmen / Name** ein (z. B. „Rewe“).
2. Geben Sie den **Kartencode** ein (manuell oder durch Einfügen).
3. Wählen Sie den **Codetyp** aus der Liste (z. B. `EAN_13` für die meisten Kundenkarten, `QR_CODE` oder `PHONE`, wenn der Rabatt einfach über die Telefonnummer gewährt wird).
4. *(Optional)* Fügen Sie eine Notiz oder einen CVC/CVV-Code hinzu.
5. Tippen Sie auf „Speichern“.

### 🚀 Schnelles und Massenhinzufügen von Karten
- **Massen-Scan mit Kamera:** Wählen Sie im Menü ("...") den Punkt **Werkzeuge → Massen-Scan…**. Die Kamera öffnet sich im kontinuierlichen Scan-Modus. Richten Sie sie nacheinander auf Barcodes.
- **Massenimport aus Bildern:** Wählen Sie im Menü **Werkzeuge → Massenimport aus Bildern…**. Wählen Sie mehrere Bilder aus der Galerie, und ML Kit erstellt daraus Karten.
- **Schaltfläche „Speichern & weitere hinzufügen“ (`+`):** Tippen Sie auf die quadratische `+`-Taste neben „Speichern“.
- **Kontextmenü „Kopie erstellen…“:** Drücken Sie lange auf eine Karte in der Liste.

---

## 🛒 Kapitel 3: Nutzung der Karten an der Kasse

Die App bietet mehrere bequeme Möglichkeiten, eine Karte vorzuzeigen, ohne in Menüs zu suchen:

### 1. Hauptmethode
- Öffnen Sie die gewünschte Karte (Nutzen Sie bei Bedarf die Suche).
- Zeigen Sie den Barcode an der Kasse vor.

### 2. Vollbildmodus (Bei Leseproblemen)
- Öffnen Sie die gewünschte Karte.
- **Tippen Sie direkt auf das Barcode-Bild**.
- Es wird auf dem gesamten Bildschirm angezeigt: Der Hintergrund wird weiß, die Bildschirmhelligkeit erhöht sich automatisch auf 100 %, und im Hochformat dreht sich der Barcode um 90° für eine optimale Erfassung durch den Scanner des Kassierers.

### 3. Widget auf dem Startbildschirm
- Öffnen Sie den Bildschirm, auf dem Sie das Barcode-Widget platziert haben, und zeigen Sie es an der Kasse.
- Siehe Kapitel 8 zum Hinzufügen eines Widgets.

### 4. Barcode senden (Teilen), wenn jemand anderes die Karte an der Kasse vorzeigen soll.
- Tippen Sie auf dem Kartendetail-Bildschirm auf die Schaltfläche **„Barcode-Bild teilen“**.
- Wählen Sie einen Messenger oder eine App aus. Das Bild wird im PNG-Format mit weißem Rand gesendet, was ein erfolgreiches Scannen beim Empfänger garantiert.

---

## 🗂️ Kapitel 4: Verwaltung und Organisation von Karten

Wenn es viele Karten werden, helfen Organisationswerkzeuge weiter:

- **Suche**: Nutzen Sie die Suchleiste oben auf dem Hauptbildschirm. Die Suche funktioniert nach Ladenname, Kartennummer und Notizen.
- **Sortierung**: Tippen Sie auf das Sortiersymbol, um Karten nach Name, Erstellungsdatum oder Nutzungshäufigkeit zu ordnen.
- **Favoriten**: Tippen Sie auf das Sternsymbol ⭐️ auf der Karte, um häufig genutzte Karten an den Anfang der Liste zu verschieben.
- **Kontextmenü**: Führen Sie einen **langen Druck** auf eine beliebige Karte in der Liste aus, um schnell das Menü „Bearbeiten“ oder „Löschen“ aufzurufen.
- **Archiv**: Wenn eine Karte veraltet ist, Sie sie aber nicht löschen möchten, öffnen Sie ihre Details und tippen Sie auf „Ins Archiv verschieben“. Archivierte Karten werden aus der Hauptliste, der Suche und dem Export ausgeblendet, können aber jederzeit über das Menü „Archiv“ wiederhergestellt werden.

---

## 🎨 Kapitel 5: Anpassung des Erscheinungsbilds

Gehen Sie zu den **Einstellungen** (Zahnrad-Symbol), um die App zu personalisieren:

- **Design**: Wählen Sie ein helles, dunkles oder systembasiertes Design.
- **Kompakter Listenmodus**: Aktivieren Sie diese Option, um Barcodes und Kartennummern auf dem Hauptbildschirm auszublenden. Dies halbiert die Kartenhöhe und beschleunigt das Scrollen auf allen Geräten erheblich.
- **Helligkeit auf Karte**: Aktivieren Sie den Helligkeitsregler direkt auf dem Kartenbildschirm für schnelle manuelle Anpassungen vor dem Scannen.
- **Sprache der Benutzeroberfläche**: Wählen Sie eine der 11 unterstützten Sprachen unabhängig von Ihrer System-Sprache.

*Beim Bearbeiten einer einzelnen Karte können Sie ihr auch eine eindeutige Farbe (über eine Palette oder einen HEX-Code, z. B. `#0EE8A5`) und ein Kategorie-Symbol zuweisen.*

---

## 💾 Kapitel 6: Sicherung und Datenübertragung

Ihre Daten gehören nur Ihnen. Erstellen Sie regelmäßig Sicherungen.

### Export (Erstellen einer Kopie)
1. Gehen Sie zu Einstellungen → **Export**.
2. Wählen Sie das Format:
   - **JSON**: Vollständiges Format mit allen Details (Farben, Symbole, Daten, CVC, Archivstatus). Empfohlen für die Übertragung auf ein anderes Gerät.
   - **CSV**: Tabellenformat (Name, Code, Codetyp, CVC, Notiz). Praktisch zur Anzeige in Excel.
3. Speichern Sie die Datei in einem bequemen Ordner oder senden Sie sie sich direkt per Messenger/Cloud.

### Import (Wiederherstellen einer Kopie)
1. **Automatische Methode**: Suchen Sie die gespeicherte `.json`- oder `.csv`-Datei in Ihrem Dateimanager und tippen Sie darauf. Wählen Sie „Öffnen mit“ → **DiscountCards**. Die App startet automatisch den Importvorgang.
2. **Manuelle Methode**: Gehen Sie zu Einstellungen → **Import** und wählen Sie die Datei manuell aus.
3. **Importmodus wählen**:
   - **Zusammenführen (MERGE)**: Fügt neue Karten zu bestehenden hinzu (empfohlen).
   - **Überschreiben (OVERWRITE)**: Löscht aktuelle Karten vollständig und ersetzt sie durch Daten aus der Datei.
4. **Beim Erkennen von Duplikaten** bietet die App eine Strategie an: Bestehende aktualisieren, als neue hinzufügen oder überspringen.

---

## ⚠️ Kapitel 7: Lösung häufiger Probleme

| Problem | Lösung |
| :--- | :--- |
| **Kassenscanner liest den Barcode nicht vom Bildschirm** | 1. Tippen Sie auf den Barcode für den Vollbildmodus (maximale Helligkeit + weißer Hintergrund).<br>2. Stellen Sie sicher, dass beim Erstellen der Karte der richtige Codetyp gewählt wurde (meist `EAN_13` oder `CODE_128`).<br>3. Wischen Sie Fingerabdrücke vom Bildschirm ab. |
| **Kamera fokussiert nicht auf die physische Karte** | Sorgen Sie für gute Beleuchtung. Wenn die Kamera weiterhin Probleme hat, fotografieren Sie die Karte mit der normalen Telefonkamera und nutzen Sie die Funktion „Aus Datei auswählen“ in DiscountCards. |
| **App wirkt bei vielen Karten langsam** | Gehen Sie zu den Einstellungen und aktivieren Sie **„Kompakter Listenmodus“**. Dies deaktiviert das Rendern von Barcodes in der Gesamtliste und beschleunigt die Leistung um ein Vielfaches. |
| **Kann die importierte Datei nicht finden** | Stellen Sie sicher, dass Sie die Datei im Format `.json` oder `.csv` heruntergeladen haben. Beim Import erkennt die App CSV-Trennzeichen (Komma, Semikolon oder Tabulator) automatisch. |


Hier sind klar strukturierte Punkte für den FAQ-Bereich zur Arbeit mit Widgets. Sie sind in einfacher Sprache verfasst und berücksichtigen Android-Besonderheiten sowie die Funktionen der App DiscountCards.

---

## Kapitel 8: 🧩 Widgets auf dem Startbildschirm

**Wie füge ich ein Widget auf dem Startbildschirm des Telefons hinzu?**  
1. Halten Sie eine beliebige freie Stelle auf dem Startbildschirm Ihres Smartphones gedrückt.  
2. Wählen Sie im unten erscheinenden Menü den Punkt **„Widgets“**.  
3. Scrollen Sie durch die App-Liste und suchen Sie **DiscountCards**.  
4. Halten Sie das Widget-Symbol gedrückt und ziehen Sie es, ohne den Finger loszulassen, auf eine freie Stelle auf dem Bildschirm.  
5. Direkt nach dem Platzieren öffnet sich ein Einstellungsfenster: Wählen Sie die gewünschte Rabattkarte aus Ihrer Liste und tippen Sie auf „Fertig“ (oder „Speichern“).
6. In den Widget-Einstellungen gibt es eine Vorschau, die ungefähr zeigt, wie das Widget bei verschiedenen Größen aussieht (tatsächliche Darstellung hängt vom Telefonmodell ab). Die tatsächlichen Abmessungen des Widgets ändern sich dabei nicht. Zudem können Sie in den Einstellungen festlegen, ob Name und Barcode angezeigt werden sollen.

**Wie ändere ich die ausgewählte Karte oder die Widget-Einstellungen?**  
Sie haben zwei bequeme Möglichkeiten dazu:  
- **Über das Widget selbst:** Tippen Sie auf die transparente Bearbeitungsschaltfläche (oben rechts im Widget). Dies öffnet ein Menü, in dem Sie eine andere Karte auswählen oder Anzeigeoptionen ändern können.  
- **Über das Android-Menü:** Halten Sie das bereits platzierte Widget gedrückt. Tippen Sie im erscheinenden Pop-up-Menü auf **„Widget-Einstellungen“** (funktioniert nicht auf allen Telefonen).

**Wie ändere ich die Größe des Widgets?**  
Das DiscountCards-Widget ist adaptiv und unterstützt Größen von **1×1 bis 5×5** Rasterzellen. Um seine Größe zu ändern:  
1. Halten Sie das Widget auf dem Startbildschirm gedrückt.  
2. Nach der Auswahl erscheinen an den Rändern Ziehpunkte (meist blaue oder kontrastierende Punkte/Linien).  
3. Ziehen Sie diese Punkte in die gewünschte Richtung, um den Widget-Bereich zu vergrößern oder zu verkleinern.  
4. Lassen Sie den Finger los, um die neue Größe zu fixieren.  
💡 *Tipp:* Bei minimaler Größe (1×1) wird nur ein kompaktes Symbol oder ein Mini-Barcode angezeigt. Um den Barcode zu vergrößern, können Sie in den Einstellungen die Anzeige des Namens ausblenden. Für ein bequemes Scannen an der Kasse wird eine Größe von **2×2** oder größer empfohlen, damit Ladenname und vollständiger Barcode sichtbar sind.

---

## 📬 Feedback und Unterstützung

Die App wird mit Sorgfalt für die Nutzer entwickelt. Wenn Sie einen Fehler finden, einen Verbesserungsvorschlag haben oder Unterstützung für ein neues Barcode-Format hinzufügen möchten, erstellen Sie bitte ein Anliegen im Bereich [Issues auf GitHub](https://github.com/Storvild/android_discount_cards/issues).

*Vielen Dank, dass Sie sich für DiscountCards entschieden haben! Bewahren Sie Ihre Rabatte sicher und bequem auf.*
