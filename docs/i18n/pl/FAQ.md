🏠 **[Główny opis (README)](README.md)** | 📖 **[Podręcznik użytkownika](USER_GUID.md)**

# ❓ Często zadawane pytania (FAQ) — DiscountCards

## 📌 Pytania ogólne

**Czym jest DiscountCards?**  
To lekka i szybka aplikacja dla Androida do przechowywania, skanowania i używania kart lojalnościowych oraz kart rabatowych. Zastępuje fizyczne portfele z kartami, pozwalając na natychmiastowe okazanie kodu kreskowego przy kasie prosto z ekranu smartfona.

**Czy aplikacja jest darmowa?**  
Tak, projekt jest całkowicie darmowy i dystrybuowany z otwartym kodem źródłowym (Open Source) na licencji MIT. Aktualną wersję APK można pobrać w sekcji [GitHub Releases](https://github.com/Storvild/android_discount_cards/releases).

**Czy w aplikacji są reklamy lub trackery?**  
Nie. Aplikacja jest w pełni autonomiczna, nie zawiera reklam i nie używa żadnych trackerów analitycznych ani śledzących.

**Czy aplikacja działa bez Internetu?**  
Tak, to **aplikacja całkowicie offline**. W jej manifeście nie ma nawet uprawnienia `android.permission.INTERNET`. Wszystkie dane są przechowywane wyłącznie na Twoim urządzeniu, co gwarantuje działanie nawet w strefach bez zasięgu sieci (np. w piwnicznych pomieszczeniach hipermarketów).

---

## 🔒 Bezpieczeństwo i prywatność

**Gdzie są zapisywane moje dane?**  
Wszystkie dane (karty, ustawienia, statystyki) są przechowywane lokalnie w bazie danych Twojego urządzenia. Żadne informacje nie są wysyłane na zewnętrzne serwery.

**Jakie uprawnienia wymaga aplikacja?**  
Aplikacja wymaga tylko jednego uprawnienia, i jest ono proszone **tylko w momencie użycia**:
- `android.permission.CAMERA` — wymagane wyłącznie do skanowania fizycznych kart za pomocą aparatu. Jeśli dodajesz karty ręcznie lub z galerii, to uprawnienie nie będzie potrzebne.

---

## 💳 Używanie i funkcje

**Jak dodać nową kartę?**  
Są trzy sposoby:
1. **Ręcznie:** wprowadzić nazwę sklepu, numer karty i wybrać format kodu kreskowego.
2. **Skanowanie:** nacisnąć przycisk w sekcji "Numer karty" z ikoną kodu QR i skierować aparat na kartę fizyczną (z użyciem ML Kit do szybkiego rozpoznawania).
3. **Z pliku:** nacisnąć przycisk w sekcji "Numer karty" i wybrać zapisany obraz kodu kreskowego z galerii lub menedżera plików.

**Jakie formaty kodów kreskowych są obsługiwane?**  
Aplikacja generuje i rozpoznaje: `QR_CODE`, `CODE_128`, `EAN_13`, `EAN_8`, `UPC_A`, `CODE_39`, `PDF_417`, `AZTEC`. Dostępny jest również tryb `PHONE` dla kart, w których rabat udzielany jest po prostu po numerze telefonu (wyświetlany dużym tekstem, bez generowania kodu kreskowego).

**Co zrobić, jeśli kod kreskowy słabo się odczytuje? Jak sprawić, by kasjer łatwo odczytał kod kreskowy z ekranu?**  
- Naciśnij na kod kreskowy na kartce: otworzy się **na cały ekran** z maksymalną jasnością, białym tłem i automatycznie obróci o 90° (w orientacji pionowej) dla idealnego skanowania.
- W ustawieniach można włączyć „Pokaż jasność na karcie”, aby regulować jasność suwakiem bezpośrednio na ekranie karty.
- Możesz również nacisnąć przycisk **«Udostępnij obraz kodu kreskowego»**, aby wysłać obraz PNG kodu kreskowego z białymi marginesami do komunikatora (np. jeśli kupujesz coś przez kuriera lub znajomego).

**Jak przyspieszyć działanie aplikacji na słabszym urządzeniu?**  
W ustawieniach włącz **«Kompaktowy tryb listy»**. Wyłączy to generowanie kodów kreskowych i numerów kart na ekranie głównym, zmniejszając wysokość elementów listy o połowę i znacznie przyspieszając ładowanie oraz przewijanie.

**Czy można dodać notatki lub kod CVC do karty?**  
Tak, podczas edycji karty można dodać dowolną notatkę, a także pole na kod CVC/CVV (np. do realizowania punktów bonusowych).

---

## 💾 Kopia zapasowa i przenoszenie danych

**Jak utworzyć kopię zapasową kart?**  
Wejdź w Ustawienia → Eksport. Możesz zapisać wszystkie dane w formacie **JSON** (pełna struktura danych, zalecane) lub **CSV** (tabela wygodna do przeglądania w Excelu).

**Jak przenieść karty na nowy telefon?**  
1. Na starym urządzeniu wyeksportuj karty do pliku (JSON lub CSV).
2. Prześlij ten plik na nowe urządzenie (przez Bluetooth, komunikator, chmurę lub USB).
3. Na nowym urządzeniu otwórz plik przez menedżer plików. Aplikacja automatycznie przechwyci akcję i zaproponuje import kart.

**Co oznaczają tryby importu?**  
- **Scalanie (MERGE):** dodaje karty z pliku do już istniejących w aplikacji.
- **Nadpisywanie (OVERWRITE):** całkowicie usuwa wszystkie bieżące karty i zastępuje je danymi z pliku.
- *W przypadku dopasowania kart* (po numerze i nazwie) możesz wybrać strategię: zaktualizuj istniejące, dodaj jako nowe duplikaty lub pomiń je.

---

## 🧩 Widgety i organizacja

**Czy można pokazać kartę bez otwierania aplikacji?**  
Tak. Dodaj widget DiscountCards na ekran główny. Obsługuje rozmiary od 1×1 do 5×5, wyświetla kod kreskowy i nazwę sklepu, a po dotknięciu natychmiast otwiera pełną kartę.

**Jak uporządkować karty, gdy jest ich zbyt dużo?**  
- Użyj **Ulubionych** (⭐️) dla często używanych kart, aby były wyżej na liście.
- Użyj **Archiwum**: przenieś tam nieużywane lub przeterminowane karty. Znikną z głównej listy, wyszukiwania i eksportu, ale nie zostaną trwale usunięte. Zawsze można je przywrócić.
- Usuń kartę, jeśli masz pewność, że już się nie przyda.

**Czy można dostosować wygląd kart?**  
Tak. Dla każdej karty można wybrać ikonę kategorii, kolor z palety lub podać dokładny kod HEX (`#RRGGBB`). Obsługiwane są również motywy jasne, ciemne i systemowe.

---

## 🛠 Rozwiązywanie problemów

**Skaner przy kasie nie odczytuje kodu kreskowego z mojego ekranu. Co robić?**  
1. Upewnij się, że podczas tworzenia karty prawidłowo wybrano **format kodu kreskowego** (np. dla większości kart spożywczych to `EAN_13`).
2. Użyj trybu pełnoekranowego kodu kreskowego (naciśnij na niego w karcie), aby zapewnić 100% jasności i białe tło.
3. Wytrzyj ekran z odcisków palców i tłustych śladów.

**Aplikacja nie może zeskanować mojej fizycznej karty aparatem.**  
- Upewnij się, że przyznałeś aplikacji dostęp do aparatu (proszone przy pierwszym naciśnięciu przycisku skanera).
- Zapewnij dobre oświetlenie i trzymaj aparat równolegle do kodu kreskowego w odległości 10–20 cm.
- Jeśli kod kreskowy jest uszkodzony lub aparat nie daje rady, użyj funkcji **«Wybierz z pliku»**, wcześniej fotografując kartę standardowym aparatem telefonu.

**Jak zmienić język aplikacji?**  
W ustawieniach aplikacji znajduje się osobna pozycja „Język”. Możesz wybrać jeden z 11 obsługiwanych języków (Rosyjski, English, Deutsch, Français, Español, Português, 日本語, 简体中文, العربية, Türkçe, हिन्दी) niezależnie od języka systemowego Twojego smartfona.

---

*Jeśli nie znalazłeś odpowiedzi na swoje pytanie, możesz utworzyć nowy wątek w sekcji [Issues](https://github.com/Storvild/android_discount_cards/issues) na GitHubie projektu.*
