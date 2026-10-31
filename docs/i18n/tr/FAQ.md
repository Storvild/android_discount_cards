🏠 **[Ana Açıklama (README)](README.md)** | 📖 **[Kullanım Kılavuzu](USER_GUID.md)**

# ❓ Sıkça Sorulan Sorular (FAQ) — DiscountCards

## 📌 Genel Sorular

**DiscountCards nedir?**  
Sadakat kartlarını ve indirim kartlarını saklamak, taramak ve kullanmak için tasarlanmış hafif ve hızlı bir Android uygulamasıdır. Kartlı fiziksel cüzdanların yerini alarak, doğrudan akıllı telefon ekranınızdan kasada barkodu anında göstermenize olanak tanır.

**Uygulama ücretsiz mi?**  
Evet, proje tamamen ücretsizdir ve MIT lisansı altında Açık Kaynaklı (Open Source) olarak dağıtılmaktadır. Güncel APK sürümünü [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases) bölümünden indirebilirsiniz.

**Uygulamada reklam veya takipçiler var mı?**  
Hayır. Uygulama tamamen bağımsızdır, reklam içermez ve hiçbir analitik veya takipçi izleyici kullanmaz.

**Uygulama internet olmadan çalışır mı?**  
Evet, bu **tamamen çevrimdışı bir uygulamadır**. Bildiriminde (manifest) `android.permission.INTERNET` izni bile yoktur. Tüm veriler yalnızca cihazınızda saklanır, bu da ağ kapsama alanı olmayan alanlarda (örneğin hipermarketlerin bodrum katlarında) bile çalışmayı garanti eder.

---

## 🔒 Güvenlik ve Gizlilik

**Verilerim nereye kaydediliyor?**  
Tüm veriler (kartlar, ayarlar, istatistikler) cihazınızın veritabanında yerel olarak saklanır. Hiçbir bilgi üçüncü taraf sunuculara gönderilmez.

**Uygulama hangi izinleri istiyor?**  
Uygulamanın yalnızca bir izne ihtiyacı vardır ve bu izin **yalnızca kullanım anında** istenir:
- `android.permission.CAMERA` — yalnızca kamerayla fiziksel kartları taramak için gereklidir. Kartları manuel olarak veya galeriden ekliyorsanız bu izin gerekmez.

---

## 💳 Kullanım ve İşlevler

**Yeni kart nasıl eklenir?**  
Üç yöntem vardır:
1. **Manuel:** Mağaza adını, kart numarasını girin ve barkod biçimini seçin.
2. **Tarama:** "Kart numarası" bölümündeki QR kodu simgeli düğmeye basın ve kamerayı fiziksel karta doğrultun (hızlı tanıma için ML Kit kullanılarak).
3. **Dosyadan:** "Kart numarası" bölümündeki düğmeye basın ve galeriden veya dosya yöneticisinden kaydedilmiş barkod görselini seçin.

**Hangi barkod biçimleri destekleniyor?**  
Uygulama şunları üretir ve tanır: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. Ayrıca, indirimin yalnızca telefon numarasıyla sağlandığı kartlar için `PHONE` modu vardır (büyük metin olarak görüntülenir, barkod üretilmez).

**Barkod kötü okunuyorsa ne yapılmalı? Kasiyerin ekrandan barkodu kolayca okumasını nasıl sağlarım?**  
- Karttaki barkoda basın: Maksimum parlaklık, beyaz arka plan ve ideal tarama için (portre modunda) 90° otomatik dönüş ile **tam ekranda** açılacaktır.
- Doğrudan kart ekranındaki kaydırıcıyla parlaklığı ayarlamak için ayarlarda «Kartta parlaklığı göster» seçeneğini açabilirsiniz.
- Ayrıca, mesajlaşma uygulamasına beyaz kenarlıklı PNG barkod görseli göndermek için **«Barkod görselini paylaş»** düğmesine basabilirsiniz (örneğin, kurye veya arkadaş aracılığıyla bir şey satın alıyorsanız).

**Düşük donanımlı bir cihazda uygulama nasıl hızlandırılır?**  
Ayarlar'dan **«Kompakt liste modu»** seçeneğini açın. Bu, ana ekrandaki barkodların ve kart numaralarının çizimini kapatacak, liste öğelerinin yüksekliğini yarıya indirecek ve yükleme ile kaydırmayı önemli ölçüde hızlandıracaktır.

**Karta not veya CVC kodu eklenebilir mi?**  
Evet, kartı düzenlerken isteğe bağlı notlar ve CVC/CVV kodu alanı ekleyebilirsiniz (örneğin, puan harcamak için).

---

## 💾 Yedekleme ve Veri Aktarımı

**Kartların yedeği nasıl oluşturulur?**  
Ayarlar → Dışa Aktar'a gidin. Tüm verileri **JSON** (tam veri yapısı, önerilir) veya **CSV** (Excel'de görüntülemek için kullanışlı tablo) biçiminde kaydedebilirsiniz.

**Kartlar yeni bir telefona nasıl aktarılır?**  
1. Eski cihazda kartları bir dosyaya aktarın (JSON veya CSV).
2. Bu dosyayı yeni cihaza aktarın (Bluetooth, mesajlaşma uygulaması, bulut veya USB aracılığıyla).
3. Yeni cihazda dosyayı dosya yöneticisi aracılığıyla açın. Uygulama eylemi otomatik olarak yakalayacak ve kartları içe aktarmayı önerecektir.

**İçe aktarma modları ne anlama gelir?**  
- **Birleştirme (MERGE):** Dosyadaki kartları uygulamada zaten mevcut olanlara ekler.
- **Yazma (OVERWRITE):** Mevcut tüm kartları tamamen siler ve dosyadan gelen verilerle değiştirir.
- *Kartlar çakıştığında* (numara ve isme göre) bir strateji seçebilirsiniz: Mevcutları güncelle, yeni kopyalar olarak ekle veya atla.

---

## 🧩 Widget'lar ve Organizasyon

**Uygulamayı açmadan kart gösterilebilir mi?**  
Evet. Ana ekrana DiscountCards widget'ını ekleyin. 1×1 ile 5×5 arasındaki boyutları destekler, barkod ve mağaza adını görüntüler ve dokunulduğunda tam kartı anında açar.

**Çok fazla kart olduğunda düzen nasıl sağlanır?**  
- Sık kullanılan kartların listede üstte kalması için **Favoriler** (⭐️) özelliğini kullanın.
- **Arşiv** özelliğini kullanın: Kullanılmayan veya süresi dolmuş kartları oraya taşıyın. Ana listeden, aramadan ve dışa aktarmadan kaybolurlar ancak kalıcı olarak silinmezler. İstenildiği zaman geri yüklenebilirler.
- Kartın artık gerekli olmadığından eminseniz kartı silin.

**Kartların görünümü özelleştirilebilir mi?**  
Evet. Her kart için bir kategori simgesi, paletten renk seçebilir veya tam HEX kodunu (`#RRGGBB`) belirleyebilirsiniz. Ayrıca açık, koyu ve sistem tasarım temaları desteklenir.

---

## 🛠 Sorun Giderme

**Kasadaki tarayıcı ekranımdan barkodu okumuyor. Ne yapmalıyım?**  
1. Kart oluşturulurken **barkod biçiminin** doğru seçildiğinden emin olun (örneğin çoğu gıda kartı için `EAN_13`).
2. %100 parlaklık ve beyaz arka plan sağlamak için barkodun tam ekran modunu kullanın (kartın üzerindeki barkoda basın).
3. Ekrandaki parmak izlerini ve yağlı izleri silin.

**Uygulama fiziksel kartımı kamerayla tarayamıyor.**  
- Uygulamaya kamera erişim izni verdiğinizden emin olun (tarayıcı düğmesine ilk basıldığında istenir).
- İyi bir aydınlatma sağlayın ve kamerayı 10–20 cm mesafeden barkoda paralel tutun.
- Barkod hasarlıysa veya kamera yetersiz kalırsa, kartı telefonun standart kamerasıyla fotoğrafladıktan sonra **«Dosyadan seç»** işlevini kullanın.

**Uygulama dili nasıl değiştirilir?**  
Uygulama ayarlarında ayrı bir «Dil» öğesi vardır. Akıllı telefonunuzun sistem dilinden bağımsız olarak desteklenen 11 dilden birini (Rusça, English, Deutsch, Français, Español, Português, 日本語, 简体中文, العربية, Türkçe, हिन्दी) seçebilirsiniz.

---

*Sorunuza yanıt bulamadıysanız projenin GitHub sayfasındaki [Issues](https://github.com/Storvild/android_discount_cards/issues) bölümünde yeni bir konu açabilirsiniz.*