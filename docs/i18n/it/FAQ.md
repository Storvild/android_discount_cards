🏠 **[Descrizione principale (README)](README.md)** | 📖 **[Guida utente](USER_GUID.md)**

# ❓ Domande frequenti (FAQ) — DiscountCards

## 📌 Domande generali

**Che cos'è DiscountCards?**  
È un'applicazione Android leggera e veloce per archiviare, scansionare e utilizzare tessere fedeltà e tessere sconto. Sostituisce i portafogli fisici pieni di tessere, consentendo di mostrare all'istante il codice a barre alla cassa direttamente dallo schermo dello smartphone.

**L'applicazione è gratuita?**  
Sì, il progetto è completamente gratuito e distribuito a codice sorgente aperto (Open Source) sotto licenza MIT. Puoi scaricare la versione APK attuale nella sezione [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases).

**Ci sono pubblicità o tracker nell'applicazione?**  
No. L'applicazione è completamente autonoma, non contiene pubblicità e non utilizza alcun tracker analitico o di tracciamento.

**L'applicazione funziona senza Internet?**  
Sì, è un'**applicazione completamente offline**. Nel suo manifesto non è persino presente l'autorizzazione `android.permission.INTERNET`. Tutti i dati sono memorizzati unicamente sul tuo dispositivo, garantendo il funzionamento anche in zone prive di rete (ad esempio nei seminterrati degli ipermercati).

---

## 🔒 Sicurezza e privacy

**Dove vengono salvati i miei dati?**  
Tutti i dati (tessere, impostazioni, statistiche) sono memorizzati localmente nel database del tuo dispositivo. Nessuna informazione viene inviata a server di terze parti.

**Quali autorizzazioni richiede l'applicazione?**  
L'applicazione richiede solo un'autorizzazione, e viene richiesta **solo al momento dell'uso**:
- `android.permission.CAMERA` — necessaria esclusivamente per scansionare le tessere fisiche tramite la fotocamera. Se aggiungi le tessere manualmente o dalla galleria, questa autorizzazione non sarà necessaria.

---

## 💳 Utilizzo e funzionalità

**Come aggiungere una nuova tessera?**  
Ci sono tre modi:
1. **Manualmente:** inserire il nome del negozio, il numero della tessera e selezionare il formato del codice a barre.
2. **Scansione:** premere il pulsante nella sezione "Numero tessera" con l'icona del codice QR e inquadrare la tessera fisica con la fotocamera (utilizzando ML Kit per un riconoscimento rapido).
3. **Da file:** premere il pulsante nella sezione "Numero tessera" e selezionare un'immagine salvata del codice a barre dalla galleria o dal file manager.

**Come aggiungere rapidamente molte carte?**  
- **Scansione di massa con fotocamera:** seleziona dal menu a discesa (*Strumenti → Scansione di massa…*). La fotocamera si aprirà in modalità di scansione continua.
- **Importazione di massa da immagini:** seleziona dal menu a discesa (*Strumenti → Importazione di massa da immagini…*). Seleziona più immagini dalla galleria.
- **Pulsante "Salva e aggiungi un'altra" (`+`):** nella schermata di creazione/modifica c'è un pulsante quadrato `+`.
- **Funzione "Crea una copia…":** premi a lungo su qualsiasi carta nell'elenco e seleziona **"Crea una copia…"**.
- **Importazione di massa da file:** nel menu *Strumenti → Importa da file…*, puoi caricare un file (`JSON` o `CSV`).

**Quali formati di codice a barre sono supportati?**  
L'applicazione genera e riconosce: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. È disponibile anche la modalità `PHONE` per le tessere in cui lo sconto viene applicato semplicemente tramite numero di telefono (visualizzato a caratteri grandi, senza generazione del codice a barre).

**Cosa fare se il codice a barre non viene letto bene? Come fare in modo che l'operatore legga facilmente il codice a barre dallo schermo?**  
- Premi sul codice a barre nella tessera: si aprirà **a schermo intero** con la massima luminosità, sfondo bianco e ruoterà automaticamente di 90° (in orientamento verticale) per una scansione perfetta.
- Nelle impostazioni è possibile attivare «Mostra la luminosità nella tessera» per regolare la luminosità con un cursore direttamente sulla schermata della tessera.
- Puoi anche premere il pulsante **«Condividi immagine del codice a barre»** per inviare un'immagine PNG del codice a barre con margini bianchi a un'app di messaggistica (ad esempio se acquisti tramite un corriere o un amico).

**Come velocizzare l'applicazione su un dispositivo meno potente?**  
Nelle impostazioni, attiva la **«Modalità elenco compatta»**. Questo disattiverà la resa dei codici a barre e dei numeri di tessera nella schermata principale, riducendo l'altezza degli elementi dell'elenco della metà e velocizzando notevolmente il caricamento e lo scorrimento.

**È possibile aggiungere note o il codice CVC a una tessera?**  
Sì, durante la modifica di una tessera è possibile aggiungere una nota a piacere, oltre a un campo per il codice CVC/CVV (ad esempio per il riscatto dei punti bonus).

---

## 💾 Backup e trasferimento dati

**Come creare una copia di backup delle tessere?**  
Apri il menu a discesa della schermata principale ("...") e seleziona **Strumenti → Esporta su file…**. Puoi salvare tutti i dati in formato **JSON** o **CSV**.

**Come trasferire le tessere su un nuovo telefono?**  
1. Sul vecchio dispositivo, esporta le tessere in un file tramite *Strumenti → Esporta su file…* (JSON o CSV).
2. Trasferisci questo file sul nuovo dispositivo (tramite Bluetooth, messaggistica, cloud o USB).
3. Sul nuovo dispositivo, apri il file tramite il file manager. L'applicazione intercetterà automaticamente l'azione e proporrà di importare le tessere.

**Cosa significano le modalità di importazione?**  
- **Unisci (MERGE):** aggiunge le tessere del file a quelle già esistenti nell'applicazione.
- **Sovrascrivi (OVERWRITE):** elimina completamente tutte le tessere attuali e le sostituisce con i dati del file.
- *In caso di corrispondenza delle tessere* (per numero e nome), puoi scegliere una strategia: aggiorna esistenti, aggiungi come nuovi duplicati o salta.

---

## 🧩 Widget e organizzazione

**È possibile mostrare una tessera senza aprire l'applicazione?**  
Sì. Aggiungi il widget di DiscountCards alla schermata home. Supporta dimensioni da 1×1 a 5×5, mostra il codice a barre e il nome del negozio e, al tocco, apre istantaneamente la tessera completa.

**Come mettere ordine se ci sono troppe tessere?**  
- Usa i **Preferiti** (⭐️) per le tessere usate frequentemente, in modo che compaiano più in alto nell'elenco.
- Usa l'**Archivio**: sposta lì le tessere non utilizzate o scadute. Scompariranno dall'elenco principale, dalla ricerca e dall'esportazione, ma non verranno eliminate definitivamente. Possono essere ripristinate in qualsiasi momento.
- Elimina la tessera se sei sicuro che non ti servirà più.

**È possibile personalizzare l'aspetto delle tessere?**  
Sì. Per ogni tessera puoi scegliere un'icona di categoria, un colore dalla tavolozza o definire un codice HEX esatto (`#RRGGBB`). Sono supportati anche i temi chiaro, scuro e di sistema.

---

## 🛠 Risoluzione dei problemi

**Lo scanner della cassa non legge il codice a barre dal mio schermo. Cosa posso fare?**  
1. Assicurati che durante la creazione della tessera sia stato selezionato il **formato del codice a barre** corretto (ad esempio, per la maggior parte delle tessere supermercato è `EAN_13`).
2. Usa la modalità a schermo intero del codice a barre (premi su di esso nella tessera) per garantire il 100% di luminosità e lo sfondo bianco.
3. Pulisci lo schermo da impronte digitali e macchie di grasso.

**L'applicazione non riesce a scansionare la mia tessera fisica con la fotocamera.**  
- Assicurati di aver concesso all'applicazione l'accesso alla fotocamera (richiesto alla prima pressione del pulsante dello scanner).
- Garantisci una buona illuminazione e tieni la fotocamera parallela al codice a barre a una distanza di 10–20 cm.
- Se il codice a barre è danneggiato o la fotocamera non riesce a leggerlo, usa la funzione **«Seleziona da file»**, dopo aver fotografato la tessera con la fotocamera normale del telefono.

**Come cambiare la lingua dell'applicazione?**  
Nelle impostazioni dell'applicazione c'è una voce separata «Lingua». Puoi scegliere una delle 11 lingue supportate (Russo, English, Deutsch, Français, Español, Português, 日本語, 简体中文, العربية, Türkçe, हिन्दी) indipendentemente dalla lingua del sistema del tuo smartphone.

---

*Se non hai trovato la risposta alla tua domanda, puoi creare una nuova segnalazione nella sezione [Issues](https://github.com/Storvild/android_discount_cards/issues) del GitHub del progetto.*
