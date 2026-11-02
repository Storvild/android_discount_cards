🏠 **[Description principale (README)](README.md)** | 📖 **[Guide de l'utilisateur](USER_GUID.md)**

# ❓ Foire aux questions (FAQ) — DiscountCards

## 📌 Questions générales

**Qu'est-ce que DiscountCards ?**  
C'est une application Android légère et rapide pour stocker, scanner et utiliser des cartes de fidélité et de réduction. Elle remplace les portefeuilles physiques de cartes en vous permettant de présenter instantanément un code-barres à la caisse directement depuis l'écran de votre smartphone.

**L'application est-elle gratuite ?**  
Oui, le projet est entièrement gratuit et distribué en Open Source sous licence MIT. Vous pouvez télécharger la dernière version APK dans la section [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases).

**Y a-t-il des publicités ou des traceurs dans l'application ?**  
Non. L'application est totalement autonome, ne contient aucune publicité et n'utilise aucun outil d'analyse ou de suivi.

**L'application fonctionne-t-elle sans Internet ?**  
Oui, c'est une **application totalement hors ligne**. Son manifeste ne contient même pas l'autorisation `android.permission.INTERNET`. Toutes les données sont stockées exclusivement sur votre appareil, ce qui garantit son fonctionnement même dans les zones sans réseau (par exemple dans les sous-sols des hypermarchés).

---

## 🔒 Sécurité et confidentialité

**Où mes données sont-elles enregistrées ?**  
Toutes les données (cartes, paramètres, statistiques) sont stockées localement dans la base de données de votre appareil. Aucune information n'est envoyée vers des serveurs tiers.

**Quelles autorisations l'application demande-t-elle ?**  
L'application ne demande qu'une seule autorisation, et celle-ci est demandée **uniquement au moment de l'utilisation** :
- `android.permission.CAMERA` — nécessaire exclusivement pour le scan des cartes physiques via l'appareil photo. Si vous ajoutez des cartes manuellement ou depuis la galerie, cette autorisation n'est pas requise.

---

## 💳 Utilisation et fonctionnalités

**Comment ajouter une nouvelle carte ?**  
Il existe trois méthodes :
1. **Manuellement :** saisir le nom du magasin, le numéro de carte et sélectionner le format du code-barres.
2. **Scan :** appuyer sur le bouton dans la section « Numéro de carte » avec l'icône de code QR et pointer l'appareil photo vers la carte physique (avec ML Kit pour une reconnaissance rapide).
3. **Depuis un fichier :** appuyer sur le bouton dans la section « Numéro de carte » et sélectionner une image de code-barres enregistrée depuis la galerie ou le gestionnaire de fichiers.

**Comment ajouter rapidement plusieurs cartes ?**  
- **Scan en masse par appareil photo :** sélectionnez le menu déroulant (*Outils → Scan en masse…*). L'appareil photo s'ouvre en mode de numérisation continue : pointez-le sur les codes-barres des cartes l'un après l'autre, et les cartes seront enregistrées.
- **Importation en masse d'images :** sélectionnez le menu déroulant (*Outils → Importation en masse d'images…*). Choisissez plusieurs photos de la galerie, et ML Kit reconnaîtra leurs codes-barres.
- **Bouton « Enregistrer & ajouter une autre » (`+`) :** sur l'écran de création/modification, à côté du bouton « Enregistrer », se trouve un bouton carré `+`. Il enregistre la carte actuelle et prépare le formulaire pour la suivante.
- **Fonction « Créer une copie… » :** appuyez longuement sur une carte dans la liste principale (menu contextuel) et sélectionnez **« Créer une copie… »**. Cela ouvre le formulaire prérempli pour un enregistrement rapide.
- **Importation en lot depuis un fichier :** dans le menu *Outils → Importer depuis un fichier…*, vous pouvez charger un fichier de cartes (`JSON` ou `CSV`).

**Quels formats de codes-barres sont pris en charge ?**  
L'application génère et reconnaît : `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. Il existe également un mode `PHONE` pour les cartes où la réduction est accordée simplement par numéro de téléphone (affiché en grand texte, sans génération de code-barres).

**Que faire si le code-barres est difficile à lire ? Comment s'assurer que le caissier puisse facilement lire le code-barres sur l'écran ?**  
- Appuyez sur le code-barres dans la carte : il s'ouvrira **en plein écran** avec une luminosité maximale, un fond blanc, et pivotera automatiquement de 90° (en orientation portrait) pour un scan idéal.
- Dans les paramètres, vous pouvez activer « Afficher la luminosité sur la carte » pour ajuster la luminosité avec un curseur directement sur l'écran de la carte.
- Vous pouvez également appuyer sur le bouton **« Partager l'image du code-barres »** pour envoyer une image PNG du code-barres avec marges blanches sur une messagerie (par exemple si vous achetez quelque chose via un livreur ou un ami).

**Comment accélérer l'application sur un appareil peu puissant ?**  
Dans les paramètres, activez le **« Mode liste compact »**. Cela désactive la génération des codes-barres et des numéros de cartes sur l'écran principal, réduisant la hauteur des éléments de la liste de moitié et accélérant considérablement le chargement et le défilement.

**Peut-on ajouter des notes ou un code CVC à une carte ?**  
Oui, lors de la modification d'une carte, vous pouvez ajouter une note personnalisée ainsi qu'un champ pour un code CVC/CVV (par exemple pour l'utilisation de points bonus).

---

## 🏭 Cas d'utilisation supplémentaires

**Comment puis-je encore utiliser l'application ?**
DiscountCards est non seulement idéal pour les cartes de fidélité et de réduction, mais aussi pour d'autres tâches liées aux codes-barres. Il est particulièrement précieux **dans les lieux sans accès au réseau** (sous-sols d'hypermarchés, entrepôts, zones rurales) — toutes les données sont stockées localement et disponibles instantanément ; vous pouvez les transmettre plus tard à votre bureau par n'importe quel moyen (connexion ou câble).

- **📦 Scan en masse en entrepôt** — utilisez le mode *Scan en masse…* pour scanner continuellement les codes-barres des produits en entrepôt. Chaque code scanné est automatiquement enregistré comme une nouvelle carte dont le nom correspond au code.
- **📋 Inventaire** — scannez tous les articles les uns après les autres en mode de scan en masse, puis exportez le résultat en **CSV** pour le traiter ensuite dans Excel ou un autre tableur.
- **📷 Ajout par lots à partir de photos** — si vous avez déjà des photos de produits avec codes-barres, choisissez *Ajout par lots à partir d'images…* et importez plusieurs photos d'un coup. L'application reconnaît les codes-barres via ML Kit et crée les cartes automatiquement.
- **✏️ Saisie par lots avec noms personnalisés** — si vous souhaitez saisir un nom signifiant plutôt qu'un simple code, utilisez le bouton **« Enregistrer et ajouter un nouveau »** (le carré `+` à côté d'« Enregistrer ») dans le formulaire d'édition. Après chaque scan ou saisie manuelle, vous enregistrez la carte, modifiez le nom et appuyez sur `+` à nouveau — le format, la couleur, l'icône et le magasin restent pré-remplis.

> [!TIP]
> En mode de scan en masse et lors de l'ajout par lots à partir d'images, le nom de la carte est identique au code-barre. Pour personnaliser le nom, utilisez le bouton « Enregistrer et ajouter un nouveau » ou modifiez la carte après sa création.

**Comment envoyer les données scannées vers un ordinateur ou le bureau ?**
Après le scan, vous pouvez envoyer les données collectées de la manière la plus pratique :
- **📤 Exporter vers un fichier (JSON / CSV) :** choisissez *Outils → Exporter vers un fichier…*, enregistrez le fichier JSON ou CSV sur votre appareil, puis transmettez-le à votre bureau ou à la comptabilité.
- **📲 Partager (Share) :** la même fonctionnalité *Outils → Partager…* ouvre le menu système Android — vous pouvez envoyer le fichier **directement dans un messager** (Telegram, WhatsApp, Signal), **par e-mail** (Gmail, Outlook, etc.), **dans le cloud** (Drive, Dropbox, OneDrive) ou vers toute autre application installée sur le téléphone.
- **📧 Par e-mail :** il suffit de choisir votre client de messagerie dans le menu « Partager » et de joindre le fichier — cela fonctionne même via MMS si votre client de messagerie le supporte.
- **🔁 Transfert vers un autre appareil :** envoyez le fichier par Bluetooth, Wi-Fi Direct ou câble USB, puis ouvrez-le sur un autre téléphone ou un ordinateur.

---

## 💾 Sauvegarde et transfert de données

**Comment créer une sauvegarde des cartes ?**  
Ouvrez le menu déroulant ("...") de l'écran principal et sélectionnez **Outils → Exporter dans un fichier…**. Vous pouvez enregistrer toutes les données au format **JSON** ou **CSV**.

**Comment transférer les cartes vers un nouveau téléphone ?**  
1. Sur l'ancien appareil, exportez les cartes dans un fichier via *Outils → Exporter dans un fichier…* (JSON ou CSV).
2. Transférez ce fichier sur le nouvel appareil (via Bluetooth, messagerie, cloud ou USB).
3. Sur le nouvel appareil, ouvrez le fichier via un gestionnaire de fichiers. L'application interceptera automatiquement l'action et proposera d'importer les cartes.

**Que signifient les modes d'importation ?**  
- **Fusion (MERGE) :** ajoute les cartes du fichier à celles déjà existantes dans l'application.
- **Écraser (OVERWRITE) :** supprime complètement toutes les cartes actuelles et les remplace par les données du fichier.
- *En cas de cartes correspondantes* (par numéro et nom), vous pouvez choisir une stratégie : mettre à jour les existantes, ajouter comme nouveaux doublons, ou les ignorer.

---

## 🧩 Widgets et organisation

**Peut-on présenter une carte sans ouvrir l'application ?**  
Oui. Ajoutez le widget DiscountCards à votre écran d'accueil. Il prend en charge des tailles de 1×1 à 5×5, affiche le code-barres et le nom du magasin, et ouvre la carte complète instantanément lorsque vous appuyez dessus.

**Comment s'organiser si les cartes sont trop nombreuses ?**  
- Utilisez les **Favoris** (⭐️) pour les cartes fréquemment utilisées afin qu'elles restent en haut de la liste.
- Utilisez les **Archives** : déplacez-y les cartes inutilisées ou expirées. Elles disparaîtront de la liste principale, de la recherche et de l'exportation, mais ne seront pas supprimées définitivement. Vous pouvez les restaurer à tout moment.
- Supprimez une carte si vous êtes sûr de ne plus en avoir besoin.

**Peut-on personnaliser l'apparence des cartes ?**  
Oui. Pour chaque carte, vous pouvez sélectionner une icône de catégorie, une couleur dans la palette ou spécifier un code HEX exact (`#RRGGBB`). Les thèmes clair, sombre et système sont également pris en charge.

---

## 🛠 Dépannage

**Le scanner de la caisse ne lit pas le code-barres sur mon écran. Que faire ?**  
1. Assurez-vous que le bon **format de code-barres** a été sélectionné lors de la création de la carte (par exemple `EAN_13` pour la plupart des cartes de supermarché).
2. Utilisez le mode plein écran du code-barres (appuyez dessus dans la carte) pour garantir 100 % de luminosité et un fond blanc.
3. Essuyez les traces de doigts et de gras sur l'écran.

**L'application n'arrive pas à scanner ma carte physique avec l'appareil photo.**  
- Assurez-vous d'avoir accordé à l'application l'accès à l'appareil photo (demandé lors du premier appui sur le bouton du scanner).
- Assurez un bon éclairage et tenez l'appareil photo parallèlement au code-barres à une distance de 10 à 20 cm.
- Si le code-barres est endommagé ou que l'appareil photo échoue, utilisez la fonction **« Sélectionner depuis un fichier »** après avoir pris en photo la carte avec l'appareil photo standard du téléphone.

**Comment changer la langue de l'application ?**  
Dans les paramètres de l'application, il y a un élément séparé « Langue ». Vous pouvez choisir l'une des 12 langues prises en charge (Russe, English, Deutsch, Français, Español, Português, Italiano, 日本語, 简体中文, العربية, Türkçe, हिन्दी) indépendamment de la langue système de votre smartphone.

---

*Si vous n'avez pas trouvé de réponse à votre question, vous pouvez créer un nouveau sujet dans la section [Issues](https://github.com/Storvild/android_discount_cards/issues) sur le GitHub du projet.*
