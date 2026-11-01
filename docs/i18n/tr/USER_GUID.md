🏠 **[Ana Açıklama (README)](README.md)** | ❓ **[Sıkça Sorulan Sorular (FAQ)](FAQ.md)**

# 📖 DiscountCards Kullanım Kılavuzu

**DiscountCards**'a hoş geldiniz – güvenilir, hızlı ve tamamen çevrimdışı sadakat kartı kasanız. Bu kılavuz, uygulamayı ayarlamanıza, kart eklemenize ve bunları maksimum verimlilikle kullanmanıza yardımcı olacaktır.

---

## 📥 Bölüm 1: Kurulum ve İlk Çalıştırma

1. **İndirme**: [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases) bölümüne gidin ve `.apk` uzantılı en son dosyayı indirin (örneğin `discount_cards_v1.1 7.apk`).
2. **Kurulum**: İndirilen dosyayı açın. Sistem izin isterse, Android ayarlarında bu kaynaktan (tarayıcı veya dosya yöneticisi) uygulama yüklenmesine izin verin.
3. **İlk Çalıştırma**: Uygulama anında açılır. Kayıt olma, hesap oluşturma veya internet erişimi gerektirmez.
4. **İzinler**: Kamerayla ilk kart tarama denemenizde uygulama **Kamera** erişimi isteyecektir. Bu izin isteğe bağlıdır: Kartları manuel olarak veya galeriden eklemeyi planlıyorsanız reddedebilirsiniz.

---

## ➕ Bölüm 2: Yeni Kart Ekleme

Ana ekrandaki yüzen **«+»** düğmesine basın. Ayrıca menüdeki "Kart ekle..." seçeneğine de basabilirsiniz. Ekleme için üç yöntem kullanabilirsiniz (Kod alanının yanındaki ilgili simgelere basarak):

### Yöntem A: Kamerayla Tarama (Önerilen)
1. Telefonun kamerasını fiziksel karta doğrultun.
2. Uygulama, ML Kit yardımıyla barkodu veya QR kodunu otomatik olarak tanır.
3. Tanınan numarayı kontrol edin ve «Kaydet» düğmesine basın.

### Yöntem B: Dosyadan / Galeriden Seçme
1. Galerinizde zaten bir barkod fotoğrafı varsa bu seçeneği seçin.
2. Görseli belirtin, uygulama verileri görselden çıkaracaktır.

### Yöntem C: Manuel Giriş
1. **Mağaza Adı** girin (örneğin «Migros»).
2. **Kart Kodu** girin (manuel olarak veya kopyalayarak).
3. Listeden **Kod Tipi** seçin (örneğin çoğu gıda kartı için `EAN_13`, `QR_CODE` veya indirim yalnızca telefon numarasıyla veriliyorsa `PHONE`).
4. *(İsteğe bağlı)* Not veya CVC/CVV kodu ekleyin.
5. «Kaydet» düğmesine basın.

### 🚀 Hızlı ve Toplu Kart Ekleme
- **Kamera ile toplu tarama:** Ana ekran açılır menüsünden ("...") **Araçlar → Toplu tarama…** seçeneğini belirleyin.
- **Görsellerden toplu ekleme:** Menüden **Araçlar → Görsellerden toplu ekleme…** seçeneğini belirleyin.

---

## 🛒 Bölüm 3: Kartların Kasede Kullanımı

Uygulama, menülerde uğraşmadan kartı sunmanız için birkaç kullanışlı yol sunar:

### 1. Temel Yöntem
- İstediğiniz kartı açın (Gerekirse aramayı kullanın).
- Barkodu kasada gösterin.

### 2. Tam Ekran Modu (Okuma Sorunlarında)
- İstediğiniz kartı açın.
- **Doğrudan barkod görseline basın**.
- Tüm ekrana yayılacaktır: arka plan beyaz olacak, ekran parlaklığı otomatik olarak %100'e çıkacak ve portre modunda barkod kasiyer tarayıcısı tarafından ideal okuma için 90° dönecektir.

### 3. Ana Ekrandaki Widget
- Barkodlu widget'ı yerleştirdiğiniz ekranı açın ve kasada gösterin.
- Widget'ın nasıl ekleneceğini öğrenmek için Bölüm 8'e bakın.

### 4. Barkod Gönderme (Paylaşma) başkasının kartı kasada göstermesini istiyorsanız
- Kart detay ekranında **«Barkod görselini paylaş»** düğmesine basın.
- Bir mesajlaşma uygulaması veya uygulama seçin. Görsel, alıcı tarafından başarılı şekilde taranmasını garanti eden beyaz kenarlıklı PNG biçiminde gönderilecektir.

---

## 🗂️ Bölüm 4: Kart Yönetimi ve Organizasyonu

Kartlar çoğaldığında organizasyon araçları yardıma yetişir:

- **Arama**: Ana ekranın üst kısmındaki arama çubuğunu kullanın. Arama mağaza adına, kart numarasına ve notlara göre çalışır.
- **Sıralama**: Kartları isme, oluşturma tarihine veya kullanım sıklığına göre düzenlemek için sıralama simgesine basın.
- **Favoriler**: Sık kullanılan kartları listenin başına taşımak için karttaki yıldız ⭐️ simgesine basın.
- **Bağlam Menüsü**: «Düzenle» veya «Sil» menüsünü hızlıca çağırmak için listedeki herhangi bir karta **uzun basın**.
- **Arşiv**: Bir kart eskidiğinde ancak silmeye kıyamıyorsanız, detaylarını açın ve «Arşive taşı» düğmesine basın. Arşivlenen kartlar ana listeden, aramadan ve dışa aktarmadan gizlenir, ancak «Arşiv» menüsünden istenildiği zaman geri yüklenebilir.

---

## 🎨 Bölüm 5: Görünüm Ayarları

Uygulamayı kişiselleştirmek için **Ayarlar**'a (çark simgesi) gidin:

- **Tasarım Teması**: Açık, koyu veya sistem temasını seçin.
- **Kompakt Liste Modu**: Ana ekranda barkodları ve kart numaralarını gizlemek için bu seçeneği açın. Bu, kart yüksekliğini yarıya indirir ve tüm cihazlarda kaydırmayı önemli ölçüde hızlandırır.
- **Kartta Parlaklık**: Taramadan önce hızlı manuel ayarlama için doğrudan kart ekranında parlaklık kaydırıcısını etkinleştirin.
- **Arayüz Dili**: Sistem dilinizden bağımsız olarak desteklenen 11 dilden birini seçin.

*Münferit bir kartı düzenlerken, palet veya HEX kodu (örneğin `#0EE8A5`) ve kategori simgesi aracılığıyla benzersiz bir renk de belirleyebilirsiniz.*

---

## 💾 Bölüm 6: Yedekleme ve Veri Aktarımı

Verileriniz yalnızca size aittir. Düzenli olarak yedek oluşturun.

### Dışa Aktarma (Kopya Oluşturma)
1. Menüye ("...") gidin → **Araçlar → Dosyaya aktar…**.
2. Biçim seçin:
   - **JSON**: Tüm detayları içeren tam biçim (renkler, simgeler, tarihler, CVC, arşiv durumu). Başka bir cihaza aktarma için önerilir.
   - **CSV**: Tablo biçimi (İsim, Kod, Kod Tipi, CVC, Not). Excel'de görüntülemek için kullanışlıdır.
3. Dosyayı uygun bir klasöre kaydedin veya hemen kendinize mesajlaşma uygulaması/bulut üzerinden gönderin.

### İçe Aktarma (Kopyayı Geri Yükleme)
1. **Otomatik Yöntem**: Dosya yöneticisinde kaydedilmiş `.json` veya `.csv` dosyasını bulun ve üzerine basın. «Şununla aç» → **DiscountCards** seçin. Uygulama otomatik olarak içe aktarma sürecini başlatacaktır.
2. **Manuel Yöntem**: Menüye ("...") gidin → **Araçlar → Dosyadan içe aktar…** ve dosyayı seçin.
3. **İçe aktarma modunu seçin**:
   - **Birleştirme (MERGE)**: Yeni kartları mevcut olanlara ekler (önerilir).
   - **Yazma (OVERWRITE)**: Mevcut kartları tamamen siler ve dosyadan gelen verilerle değiştirir.
4. **Yinelenenler tespit edildiğinde** uygulama bir strateji sunacaktır: mevcutları güncelle, yeni olarak ekle veya atla.

---

## ⚠️ Bölüm 7: Sık Karşılaşılan Sorunların Çözümü

| Sorun | Çözüm |
| :--- | :--- |
| **Kasa ekrandan barkodu okumuyor** | 1. Tam ekran modu için barkoda basın (maksimum parlaklık + beyaz arka plan).<br>2. Kart oluşturulurken kod tipinin doğru seçildiğinden emin olun (genellikle `EAN_13` veya `CODE_128`).<br>3. Ekrandaki parmak izlerini silin. |
| **Kamera fiziksel karta odaklanmıyor** | İyi bir aydınlatma sağlayın. Kamera yetersiz kalırsa, kartı telefonun normal kamerasıyla fotoğraflayın ve DiscountCards'ta «Dosyadan seç» işlevini kullanın. |
| **Çok sayıda kart varken uygulama yavaş görünüyor** | Ayarlar'a gidin ve **«Kompakt liste modu»** seçeneğini açın. Bu, genel listede barkod çizimini kapatacak ve çalışmayı katlarca hızlandıracaktır. |
| **İçe aktarılan dosyayı bulamıyorum** | `.json` veya `.csv` biçiminde bir dosya indirdiğinizden emin olun. İçe aktarma sırasında uygulama CSV'deki ayırıcıları (virgül, noktalı virgül veya sekme) otomatik olarak tanır. |


İşte widget'larla çalışmaya ayrılmış SSS bölümü için hazırlanmış, net bir şekilde yapılandırılmış maddeler. Basit bir dille yazılmış olup Android özelliklerini ve DiscountCards uygulamasının işlevselliğini dikkate almaktadır.

---

## Bölüm 8: 🧩 Ana Ekran Widget'ları

**Telefonun ana ekranına nasıl widget eklenir?**  
1. Akıllı telefonunuzun ana ekranında boş bir yere parmağınızla uzun basın.  
2. Ortaya çıkan alt menüde **«Widget'lar»** (Widgets) öğesini seçin.  
3. Uygulama listesini kaydırın ve **DiscountCards** (veya «İndirim Kartları») uygulamasını bulun.  
4. Widget simgesine uzun basın ve parmağınızı kaldırmadan ekrandaki boş bir yere sürükleyin.  
5. Yerleştirmeden hemen sonra ayar penceresi açılacaktır: listenizden istediğiniz indirim kartını seçin ve «Bitti» (veya «Kaydet») düğmesine basın.
6. Widget ayarlarında, widget'ın farklı boyutlarda yaklaşık olarak nasıl görüneceğini gösteren bir önizleme vardır (gerçek görüntü telefon modeline bağlıdır). Gerçek widget'ın boyutları kendiliğinden değişmez. Ayrıca ayarlarda İsim ve Barkod gösterilip gösterilmeyeceğini belirtebilirsiniz.

**Seçilen kart veya widget ayarları nasıl değiştirilir?**  
Bunu yapmak için iki kullanışlı yolunuz vardır:  
- **Widget'ın kendisi üzerinden:** Widget'ın sağ üstündeki saydam düzenleme düğmesine basın. Bu, başka bir kart seçebileceğiniz veya görüntüleme parametrelerini değiştirebileceğiniz bir menü açacaktır.  
- **Android menüsü üzerinden:** Yerleştirilmiş widget'a parmağınızla uzun basın. Açılan açılır menüde **«Widget ayarları»** düğmesine basın (bu tüm telefonlarda çalışmaz).

**Widget boyutu nasıl değiştirilir?**  
DiscountCards widget'ı uyarlanabilirdir ve **1×1 ile 5×5** hücre arasındaki boyutları destekler. Boyutunu değiştirmek için:  
1. Ana ekrandaki widget'a parmağınızla uzun basın.  
2. Vurgulandığında, kenarlarında genişletme işaretleyicileri belirecektir (genellikle mavi veya zıt renkli noktalar/çizgiler).  
3. Widget alanını büyütmek veya küçültmek için bu işaretleyicileri istediğiniz yöne çekin.  
4. Yeni boyutu sabitlemek için parmağınızı bırakın.  
💡 *İpucu:* Minimum boyutta (1×1) yalnızca kompakt bir simge veya mini barkod görüntülenecektir. Barkodu büyütmek için ayarlardan İsim gösterimini kaldırabilirsiniz. Kasada rahat tarama için mağaza adının ve tam barkodun görülebilmesi amacıyla **2×2** veya daha büyük boyut kullanılması önerilir.

---

## 📬 Geri Bildirim ve Destek

Uygulama kullanıcılara özen gösterilerek geliştirilmektedir. Bir hata bulduysanız, bir geliştirme öneriniz varsa veya yeni bir barkod biçimi desteği eklemek istiyorsanız lütfen [GitHub Issues](https://github.com/Storvild/android_discount_cards/issues) bölümünde bir talep oluşturun.

*DiscountCards'ı seçtiğiniz için teşekkür ederiz! İndirimlerinizi güvenli ve rahat bir şekilde saklayın.*