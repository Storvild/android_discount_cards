🏠 **[Description principale (README)](README.md)** | ❓ **[FAQ](FAQ.md)**

# 📖 Guide de l'utilisateur DiscountCards

Bienvenue dans **DiscountCards** – votre portefeuille de cartes de fidélité fiable, rapide et entièrement hors ligne. Ce guide vous aidera à configurer l'application, ajouter des cartes et les utiliser avec une efficacité maximale.

---

## 📥 Chapitre 1 : Installation et premier lancement

1. **Téléchargement** : Accédez à la section [Releases sur GitHub](https://github.com/Storvild/android_discount_cards/releases) et téléchargez le dernier fichier avec l'extension `.apk` (par exemple, `discount_cards_v1.1 7.apk`).
2. **Installation** : Ouvrez le fichier téléchargé. Si le système demande une autorisation, autorisez l'installation d'applications à partir de cette source (navigateur ou gestionnaire de fichiers) dans les paramètres Android.
3. **Premier lancement** : L'application s'ouvre instantanément. Elle ne nécessite aucune inscription, création de compte ou accès à Internet.
4. **Autorisations** : Lors de votre première tentative de scan d'une carte avec l'appareil photo, l'application demandera l'accès à l'**Appareil photo**. Cette autorisation est facultative : vous pouvez la refuser si vous prévoyez d'ajouter des cartes manuellement ou depuis la galerie.

---

## ➕ Chapitre 2 : Ajout d'une nouvelle carte

Appuyez sur le bouton flottant **« + »** sur l'écran principal. Vous pouvez également appuyer sur « Ajouter une carte... » dans le menu. Vous pouvez utiliser trois méthodes d'ajout (en appuyant sur les icônes correspondantes à côté du champ Code) :

### Méthode A : Scan par appareil photo (Recommandé)
1. Pointez l'appareil photo de votre téléphone vers la carte physique.
2. L'application reconnaît automatiquement le code-barres ou le code QR à l'aide de ML Kit.
3. Vérifiez le numéro reconnu et appuyez sur « Enregistrer ».

### Méthode B : Sélection depuis un fichier / la galerie
1. Si vous possédez déjà une photo du code-barres dans votre galerie, choisissez cette option.
2. Indiquez l'image et l'application en extraira les données.

### Méthode C : Saisie manuelle
1. Saisissez le **Nom du magasin** (par exemple, « Carrefour »).
2. Saisissez le **Code de la carte** (manuellement ou en le collant).
3. Sélectionnez le **Type de code** dans la liste (par exemple, `EAN_13` pour la plupart des cartes de supermarché, `QR_CODE`, ou `PHONE` si la réduction est accordée simplement par numéro de téléphone).
4. *(Optionnel)* Ajoutez une note ou un code CVC/CVV.
5. Appuyez sur « Enregistrer ».

---

## 🛒 Chapitre 3 : Utilisation des cartes à la caisse

L'application propose plusieurs moyens pratiques de présenter une carte sans chercher dans les menus :

### 1. Méthode principale
- Ouvrez la carte souhaitée (Utilisez la recherche si nécessaire).
- Présentez le code-barres à la caisse.

### 2. Mode plein écran (En cas de problème de lecture)
- Ouvrez la carte souhaitée.
- **Appuyez directement sur l'image du code-barres**.
- Il s'agrandira sur tout l'écran : le fond deviendra blanc, la luminosité de l'écran augmentera automatiquement à 100 %, et en orientation portrait, le code-barres pivotera de 90° pour une lecture optimale par le scanner du caissier.

### 3. Widget sur l'écran d'accueil
- Ouvrez l'écran sur lequel vous avez placé le widget avec code-barres et présentez-le à la caisse.
- Voir le Chapitre 8 pour savoir comment ajouter un widget.

### 4. Envoi du code-barres (Partager) si vous souhaitez que quelqu'un d'autre présente la carte à la caisse.
- Sur l'écran de détails de la carte, appuyez sur le bouton **« Partager l'image du code-barres »**.
- Sélectionnez une messagerie ou une application. L'image sera envoyée au format PNG avec des marges blanches, garantissant son scan réussi par le destinataire.

---

## 🗂️ Chapitre 4 : Gestion et organisation des cartes

Lorsque les cartes deviennent nombreuses, les outils d'organisation viennent à la rescousse :

- **Recherche** : Utilisez la barre de recherche en haut de l'écran principal. La recherche fonctionne par nom de magasin, numéro de carte et notes.
- **Tri** : Appuyez sur l'icône de tri pour organiser les cartes par nom, date de création ou fréquence d'utilisation.
- **Favoris** : Appuyez sur l'icône d'étoile ⭐️ sur la carte pour placer les cartes fréquemment utilisées en haut de la liste.
- **Menu contextuel** : Effectuez un **appui long** sur n'importe quelle carte de la liste pour faire apparaître rapidement le menu « Modifier » ou « Supprimer ».
- **Archives** : Si une carte est obsolète mais que vous ne souhaitez pas la supprimer, ouvrez ses détails et appuyez sur « Transférer dans les archives ». Les cartes archivées sont masquées de la liste principale, de la recherche et de l'exportation, mais peuvent être restaurées à tout moment via le menu « Archives ».

---

## 🎨 Chapitre 5 : Personnalisation de l'apparence

Accédez aux **Paramètres** (icône d'engrenage) pour personnaliser l'application :

- **Thème d'affichage** : Sélectionnez le thème clair, sombre ou système.
- **Mode liste compact** : Activez cette option pour masquer les codes-barres et numéros de cartes sur l'écran principal. Cela réduit la hauteur des cartes de moitié et accélère considérablement le défilement sur n'importe quel appareil.
- **Luminosité sur la carte** : Activez le curseur de luminosité directement sur l'écran de la carte pour des ajustements manuels rapides avant le scan.
- **Langue de l'interface** : Choisissez l'une des 11 langues prises en charge indépendamment de la langue de votre système.

*Lors de la modification d'une carte individuelle, vous pouvez également lui attribuer une couleur unique (via une palette ou un code HEX, par exemple `#0EE8A5`) et une icône de catégorie.*

---

## 💾 Chapitre 6 : Sauvegarde et transfert de données

Vos données n'appartiennent qu'à vous. Créez régulièrement des sauvegardes.

### Exportation (Créer une copie)
1. Accédez à Paramètres → **Exportation**.
2. Sélectionnez le format :
   - **JSON** : Format complet avec tous les détails (couleurs, icônes, dates, CVC, statut d'archive). Recommandé pour le transfert vers un autre appareil.
   - **CSV** : Format tableau (Nom, Code, Type de code, CVC, Note). Pratique pour un affichage dans Excel.
3. Enregistrez le fichier dans un dossier pratique ou envoyez-le-vous directement via messagerie/cloud.

### Importation (Restauration d'une copie)
1. **Méthode automatique** : Trouvez le fichier `.json` ou `.csv` enregistré dans votre gestionnaire de fichiers et appuyez dessus. Sélectionnez « Ouvrir avec » → **DiscountCards**. L'application lancera automatiquement le processus d'importation.
2. **Méthode manuelle** : Accédez à Paramètres → **Importation** et sélectionnez le fichier manuellement.
3. **Sélectionnez le mode d'importation** :
   - **Fusion (MERGE)** : Ajoute de nouvelles cartes aux cartes existantes (recommandé).
   - **Écraser (OVERWRITE)** : Supprime complètement les cartes actuelles et les remplace par les données du fichier.
4. **En cas de détection de doublons**, l'application proposera une stratégie : mettre à jour les existantes, ajouter comme nouvelles, ou ignorer.

---

## ⚠️ Chapitre 7 : Résolution des problèmes fréquents

| Problème | Solution |
| :--- | :--- |
| **Le scanner de la caisse ne lit pas le code-barres sur l'écran** | 1. Appuyez sur le code-barres pour le mode plein écran (luminosité maximale + fond blanc).<br>2. Assurez-vous que le bon type de code a été sélectionné lors de la création de la carte (généralement `EAN_13` ou `CODE_128`).<br>3. Essuyez les traces de doigts sur l'écran. |
| **L'appareil photo ne fait pas la mise au point sur la carte physique** | Assurez un bon éclairage. Si l'appareil photo ne parvient toujours pas à faire la mise au point, photographiez la carte avec l'appareil photo par défaut du téléphone et utilisez la fonction « Sélectionner depuis un fichier » dans DiscountCards. |
| **L'application semble lente avec un grand nombre de cartes** | Accédez aux Paramètres et activez le **« Mode liste compact »**. Cela désactive le rendu des codes-barres dans la liste générale et accélère le fonctionnement considérablement. |
| **Impossible de trouver le fichier importé** | Assurez-vous d'avoir téléchargé le fichier au format `.json` ou `.csv`. Lors de l'importation, l'application reconnaît automatiquement les séparateurs CSV (virgule, point-virgule ou tabulation). |


Voici des points clairs et bien structurés pour la section FAQ consacrée au fonctionnement des widgets. Ils sont rédigés dans un langage simple et prennent en compte les spécificités d'Android et les fonctionnalités de l'application DiscountCards.

---

## Chapitre 8 : 🧩 Widgets sur l'écran d'accueil

**Comment ajouter un widget sur l'écran d'accueil du téléphone ?**  
1. Maintenez le doigt appuyé sur un emplacement vide de l'écran d'accueil de votre smartphone.  
2. Dans le menu inférieur qui apparaît, sélectionnez l'élément **« Widgets »**.  
3. Faites défiler la liste des applications et trouvez **DiscountCards**.  
4. Maintenez l'icône du widget appuyée et, sans relâcher le doigt, faites-la glisser vers un emplacement libre sur l'écran.  
5. Immédiatement après le placement, une fenêtre de configuration s'ouvre : sélectionnez la carte de réduction souhaitée dans votre liste et appuyez sur « Terminé » (ou « Enregistrer »).
6. Dans les paramètres du widget, un aperçu montre approximativement l'apparence du widget selon différentes tailles (l'affichage réel dépend du modèle de téléphone). Les dimensions réelles du widget ne changent pas d'elles-mêmes. Vous pouvez également spécifier dans les paramètres s'il faut afficher le Nom et le Code-barres.

**Comment modifier la carte sélectionnée ou les paramètres du widget ?**  
Vous disposez de deux moyens pratiques pour le faire :  
- **Via le widget lui-même :** Appuyez sur le bouton transparent de modification (en haut à droite du widget lui-même). Cela ouvrira un menu vous permettant de choisir une autre carte ou de modifier les paramètres d'affichage.  
- **Via le menu Android :** Maintenez appuyé le widget déjà placé. Dans le menu contextuel qui apparaît, appuyez sur **« Paramètres du widget »** (cela ne fonctionne pas sur tous les téléphones).

**Comment redimensionner un widget ?**  
Le widget DiscountCards est adaptatif et prend en charge des tailles allant de **1×1 à 5×5** cases. Pour modifier sa taille :  
1. Maintenez appuyé le widget sur l'écran d'accueil.  
2. Lorsqu'il est sélectionné, des poignées de redimensionnement (généralement des points/lignes bleus ou contrastés) apparaissent sur ses bords.  
3. Etirez ces poignées dans la direction souhaitée pour agrandir ou réduire la zone du widget.  
4. Relâchez le doigt pour valider la nouvelle taille.  
💡 *Conseil :* À la taille minimale (1×1), seule une icône compacte ou un mini code-barres sera affiché. Pour agrandir le code-barres, vous pouvez désactiver l'affichage du Nom dans les paramètres. Pour un scan pratique à la caisse, une taille de **2×2** ou plus est recommandée pour que le nom du magasin et le code-barres complet soient visibles.

---

## 📬 Commentaires et assistance

L'application est développée avec soin pour les utilisateurs. Si vous trouvez un bug, avez une suggestion d'amélioration ou souhaitez ajouter la prise en charge d'un nouveau format de code-barres, veuillez créer une demande dans la section [Issues sur GitHub](https://github.com/Storvild/android_discount_cards/issues).

*Merci d'avoir choisi DiscountCards ! Conservez vos réductions en toute sécurité et avec praticité.*
