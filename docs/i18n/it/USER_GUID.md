🏠 **[Descrizione principale (README)](README.md)** | ❓ **[Domande frequenti (FAQ)](FAQ.md)**

# 📖 Guida utente di DiscountCards

Benvenuto in **DiscountCards** – il tuo archivio di tessere fedeltà sicuro, veloce e completamente autonomo. Questa guida ti aiuterà a configurare l'applicazione, ad aggiungere tessere e a utilizzarle con la massima efficienza.

---

## 📥 Capitolo 1: Installazione e primo avvio

1. **Download**: Vai alla sezione [Releases su GitHub](https://github.com/Storvild/android_discount_cards/releases) e scarica l'ultimo file con estensione `.apk` (ad esempio, `discount_cards_v1.1 7.apk`).
2. **Installazione**: Apri il file scaricato. Se il sistema richiede un'autorizzazione, consenti l'installazione di applicazioni da questa fonte (browser o file manager) nelle impostazioni di Android.
3. **Primo avvio**: L'applicazione si aprirà all'istante. Non richiede registrazione, creazione di un account o accesso a Internet.
4. **Autorizzazioni**: Al primo tentativo di scansionare una tessera con la fotocamera, l'applicazione richiederà l'accesso alla **Fotocamera**. Questa autorizzazione è opzionale: puoi rifiutarla se intendi aggiungere tessere manualmente o dalla galleria.

---

## ➕ Capitolo 2: Aggiungere una nuova tessera

Premi il pulsante fluttuante **«+»** nella schermata principale. Puoi anche premere nel menu "Aggiungi tessera...". Puoi utilizzare tre metodi di aggiunta (premendo le icone corrispondenti accanto al campo Codice):

### Metodo A: Scansione con fotocamera (Consigliato)
1. Inquadra la tessera fisica con la fotocamera del telefono.
2. L'applicazione riconoscerà automaticamente il codice a barre o codice QR utilizzando ML Kit.
3. Verifica il numero riconosciuto e premi «Salva».

### Metodo B: Selezione da file / galleria
1. Se hai già una foto del codice a barre nella galleria, scegli questa opzione.
2. Seleziona l'immagine e l'applicazione ne estrarrà i dati.

### Metodo C: Inserimento manuale
1. Inserisci il **Nome del negozio** (ad esempio, «Coop»).
2. Inserisci il **Codice della tessera** (manualmente o incollandolo).
3. Seleziona il **Tipo di codice** dall'elenco (ad esempio, `EAN_13` per la maggior parte delle tessere supermercato, `QR_CODE` o `PHONE` se lo sconto è fornito semplicemente per numero di telefono).
4. *(Opzionale)* Aggiungi una nota o un codice CVC/CVV.
5. Premi «Salva».

### 🚀 Aggiunta rapida e in blocco di tessere
- **Scansione di massa con fotocamera:** Nel menu a discesa della schermata principale ("..."), seleziona **Strumenti → Scansione di massa…**.
- **Importazione di massa da immagini:** Nel menu, seleziona **Strumenti → Importazione di massa da immagini…**.

---

## 🛒 Capitolo 3: Utilizzo delle tessere alla cassa

L'applicazione offre diversi modi comodi per presentare la tessera senza cercare nei menu:

### 1. Metodo principale
- Apri la tessera desiderata (se necessario, usa la ricerca).
- Mostra il codice a barre alla cassa.

### 2. Modalità a schermo intero (In caso di problemi di lettura)
- Apri la tessera desiderata.
- **Premi direttamente sull'immagine del codice a barre**.
- Si espanderà a schermo intero: lo sfondo diventerà bianco, la luminosità dello schermo aumenterà automaticamente al 100% e, in orientamento verticale, il codice a barre ruoterà di 90° per una lettura ideale da parte dello scanner della cassa.

### 3. Widget sulla schermata home
- Apri la schermata in cui hai installato il widget con il codice a barre e mostralo alla cassa.
- Consulta il Capitolo 8 per sapere come aggiungere un widget.

### 4. Invio del codice a barre (Condividi) se desideri che qualcun altro possa mostrare la tessera alla cassa.
- Nella schermata dei dettagli della tessera, premi il pulsante **«Condividi immagine del codice a barre»**.
- Seleziona l'applicazione di messaggistica o l'app desiderata. L'immagine verrà inviata in formato PNG con margini bianchi, garantendone la corretta scansione da parte del destinatario.

---

## 🗂️ Capitolo 4: Gestione e organizzazione delle tessere

Quando le tessere diventano molte, gli strumenti di organizzazione vengono in aiuto:

- **Ricerca**: Utilizza la barra di ricerca in alto nella schermata principale. La ricerca funziona per nome del negozio, numero di tessera e note.
- **Ordinamento**: Premi l'icona di ordinamento per organizzare le tessere per nome, data di creazione o frequenza d'uso.
- **Preferiti**: Premi l'icona della stella ⭐️ sulla tessera per spostare le tessere usate di frequente in cima all'elenco.
- **Menu contestuale**: Effettua una **pressione prolungata** su qualsiasi tessera nell'elenco per aprire rapidamente il menu «Modifica» o «Elimina».
- **Archivio**: Se una tessera è obsoleta ma non vuoi eliminarla, apri i suoi dettagli e premi «Sposta in archivio». Le tessere archiviate sono nascoste dall'elenco principale, dalla ricerca e dall'esportazione, ma possono essere ripristinate in qualsiasi momento tramite il menu «Archivio».

---

## 🎨 Capitolo 5: Personalizzazione dell'aspetto

Vai su **Impostazioni** (icona ingranaggio) per personalizzare l'applicazione:

- **Tema grafico**: Seleziona il tema chiaro, scuro o di sistema.
- **Modalità elenco compatta**: Attiva questa opzione per nascondere i codici a barre e i numeri di tessera nella schermata principale. Questo riduce l'altezza delle tessere della metà e velocizza notevolmente lo scorrimento su qualsiasi dispositivo.
- **Luminosità nella tessera**: Attiva il cursore della luminosità direttamente sulla schermata della tessera per una rapida regolazione manuale prima della scansione.
- **Lingua dell'interfaccia**: Seleziona una delle 11 lingue supportate indipendentemente dalla lingua del tuo sistema.

*Quando modifichi una singola tessera, puoi anche assegnarle un colore unico (tramite tavolozza o codice HEX, ad esempio `#0EE8A5`) e un'icona di categoria.*

---

## 💾 Capitolo 6: Backup e trasferimento dati

I tuoi dati appartengono solo a te. Crea regolarmente copie di backup.

### Esporta (Creazione copia)
1. Vai al menu ("...") → **Strumenti → Esporta su file…**.
2. Seleziona il formato:
   - **JSON**: Formato completo con tutti i dettagli (colori, icone, date, CVC, stato di archivio). Consigliato per il trasferimento su un altro dispositivo.
   - **CSV**: Formato tabellare (Nome, Codice, Tipo di codice, CVC, Nota). Comodo per la visualizzazione in Excel.
3. Salva il file in una cartella comoda o invialo immediatamente a te stesso via messaggistica/cloud.

### Importa (Ripristino copia)
1. **Metodo automatico**: Trova il file `.json` o `.csv` salvato nel file manager e premilo. Seleziona «Apri con» → **DiscountCards**. L'applicazione avvierà automaticamente il processo di importazione.
2. **Metodo manuale**: Vai al menu ("...") → **Strumenti → Importa da file…** e seleziona il file manualmente.
3. **Seleziona la modalità di importazione**:
   - **Unisci (MERGE)**: Aggiunge le nuove tessere a quelle esistenti (consigliato).
   - **Sovrascrivi (OVERWRITE)**: Elimina completamente le tessere attuali e le sostituisce con i dati del file.
4. **Se vengono rilevati duplicati**, l'applicazione proporrà una strategia: aggiorna esistenti, aggiungi come nuove o salta.

---

## ⚠️ Capitolo 7: Risoluzione dei problemi frequenti

| Problema | Soluzione |
| :--- | :--- |
| **La cassa non legge il codice a barre dallo schermo** | 1. Premi sul codice a barre per la modalità a schermo intero (luminosità massima + sfondo bianco).<br>2. Assicurati che durante la creazione della tessera sia stato selezionato il tipo di codice corretto (di solito `EAN_13` o `CODE_128`).<br>3. Pulisci lo schermo dalle impronte digitali. |
| **La fotocamera non mette a fuoco la tessera fisica** | Assicura una buona illuminazione. Se la fotocamera non riesce a mettere a fuoco, scatta una foto della tessera con la fotocamera normale del telefono e usa la funzione «Seleziona da file» in DiscountCards. |
| **L'applicazione sembra lenta con un numero elevato di tessere** | Vai su Impostazioni e attiva **«Modalità elenco compatta»**. Questo disattiverà la resa dei codici a barre nell'elenco generale e velocizzerà notevolmente le prestazioni. |
| **Non riesco a trovare il file importato** | Assicurati di aver scaricato il file in formato `.json` o `.csv`. Durante l'importazione, l'applicazione riconosce automaticamente i separatori in CSV (virgola, punto e virgola o tabulazione). |

---

## Capitolo 8: 🧩 Widget sulla schermata home

**Come aggiungere un widget alla schermata home del telefono?**  
1. Tieni premuto un qualsiasi punto vuoto sulla schermata home del tuo smartphone.  
2. Nel menu inferiore che appare, seleziona la voce **«Widget»**.  
3. Scorri l'elenco delle applicazioni e trova **DiscountCards**.  
4. Tieni premuta l'icona del widget e, senza sollevare il dito, trascinala in uno spazio libero sullo schermo.  
5. Subito dopo il posizionamento, si aprirà la finestra di configurazione: seleziona la tessera sconto desiderata dal tuo elenco e premi «Fatto» (o «Salva»).
6. Nelle impostazioni del widget c'è un'anteprima che mostra approssimativamente come apparirà il widget a varie dimensioni (la visualizzazione reale dipende dal modello di telefono). Le dimensioni reali del widget non cambiano da sole. Inoltre, nelle impostazioni puoi specificare se mostrare Nome e Codice a barre.

**Come modificare la tessera selezionata o le impostazioni del widget?**  
Hai due comodi modi per farlo:  
- **Tramite il widget stesso:** Premi il pulsante trasparente di modifica (in alto a destra nel widget stesso). Questo aprirà un menu in cui puoi scegliere un'altra tessera o modificare i parametri di visualizzazione.  
- **Tramite il menu Android:** Tieni premuto un widget già posizionato. Nel menu a comparsa che appare, premi **«Impostazioni widget»** (questo non funziona su tutti i telefoni).

**Come modificare le dimensioni del widget?**  
Il widget di DiscountCards è adattivo e supporta dimensioni da **1×1 a 5×5** celle. Per modificarne le dimensioni:  
1. Tieni premuto il widget sulla schermata home.  
2. Quando viene evidenziato, ai suoi bordi appariranno dei punti/linee di ridimensionamento (di solito punti o strisce blu/a contrasto).  
3. Trascina questi punti nella direzione desiderata per ingrandire o rimpicciolire l'area del widget.  
4. Rilascia il dito per fissare la nuova dimensione.  
💡 *Consiglio:* Alla dimensione minima (1×1) verrà visualizzata solo un'icona compatta o un mini codice a barre. Per ingrandire il codice a barre, puoi disattivare la visualizzazione del Nome nelle impostazioni. Per una scansione comoda alla cassa, si consiglia di utilizzare una dimensione di **2×2** o superiore, in modo che il nome del negozio e un codice a barre completo siano ben visibili.

---

## 📬 Feedback e supporto

L'applicazione è sviluppata con cura per gli utenti. Se hai trovato un errore, hai un suggerimento di miglioramento o desideri aggiungere il supporto per un nuovo formato di codice a barre, crea una segnalazione nella sezione [Issues su GitHub](https://github.com/Storvild/android_discount_cards/issues).

*Grazie per aver scelto DiscountCards! Conserva i tuoi sconti in modo sicuro e comodo.*
