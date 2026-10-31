🏠 **[Główny opis (README)](README.md)** | ❓ **[Często zadawane pytania (FAQ)](FAQ.md)**

# 📖 Podręcznik użytkownika DiscountCards

Witamy w **DiscountCards** – Twoim bezpiecznym, szybkim i w pełni autonomicznym magazynie kart lojalnościowych. Ten podręcznik pomoże Ci skonfigurować aplikację, dodać karty i używać ich z maksymalną wydajnością.

---

## 📥 Rozdział 1: Instalacja i pierwsze uruchomienie

1. **Pobieranie**: Przejdź do sekcji [Releases na GitHubie](https://github.com/Storvild/android_discount_cards/releases) i pobierz najnowszy plik z rozszerzeniem `.apk` (np. `discount_cards_v1.1 7.apk`).
2. **Instalacja**: Otwórz pobrany plik. Jeśli system poprosi o uprawnienie, zezwól na instalację aplikacji z tego źródła (przeglądarki lub menedżera plików) w ustawieniach Androida.
3. **Pierwsze uruchomienie**: Aplikacja otworzy się natychmiast. Nie wymaga rejestracji, tworzenia konta ani dostępu do Internetu.
4. **Uprawnienia**: Przy pierwszej próbie zeskanowania karty aparatem aplikacja poprosi o dostęp do **Aparatu**. To uprawnienie jest opcjonalne: możesz odmówić, jeśli planujesz dodawać karty ręcznie lub z galerii.

---

## ➕ Rozdział 2: Dodawanie nowej karty

Naciśnij pływający przycisk **«+»** na ekranie głównym. Możesz również nacisnąć w menu "Dodaj kartę...". Możesz użyć trzech sposobów dodawania (naciskając odpowiednie ikony obok pola Kod):

### Sposób A: Skanowanie aparatem (Zalecane)
1. Skieruj aparat telefonu na kartę fizyczną.
2. Aplikacja automatycznie rozpozna kod kreskowy lub kod QR za pomocą ML Kit.
3. Sprawdź rozpoznany numer i naciśnij «Zapisz».

### Sposób B: Wybór z pliku / galerii
1. Jeśli masz już zdjęcie kodu kreskowego w galerii, wybierz tę opcję.
2. Wskaż obraz, a aplikacja wyodrębni z niego dane.

### Sposób C: Wprowadzanie ręczne
1. Wprowadź **Nazwę sklepu** (np. «Biedronka»).
2. Wprowadź **Kod karty** (ręcznie lub wklejając go).
3. Wybierz **Typ kodu** z listy (np. `EAN_13` dla większości kart spożywczych, `QR_CODE` lub `PHONE`, jeśli rabat jest udzielany po prostu po numerze telefonu).
4. *(Opcjonalnie)* Dodaj notatkę lub kod CVC/CVV.
5. Naciśnij «Zapisz».

---

## 🛒 Rozdział 3: Używanie kart przy kasie

Aplikacja oferuje kilka wygodnych sposobów okazania karty bez wyszukiwania w menu:

### 1. Sposób główny
- Otwórz żądaną kartę (w razie potrzeby użyj wyszukiwania).
- Pokaż kod kreskowy przy kasie.

### 2. Tryb pełnoekranowy (W przypadku problemów z odczytem)
- Otwórz żądaną kartę.
- **Naciśnij bezpośrednio na obraz kodu kreskowego**.
- Rozwinie się na cały ekran: tło stanie się białe, jasność ekranu automatycznie wzrośnie do 100%, a w orientacji pionowej kod kreskowy obróci się o 90° dla idealnego odczytu przez skaner kasjera.

### 3. Widget na ekranie głównym
- Otwórz ekran, na którym zainstalowałeś widget z kodem kreskowym i pokaż go przy kasie.
- Jak dodać widget, zobacz Rozdział 8.

### 4. Wysyłanie kodu kreskowego (Udostępnij), jeśli chcesz, aby ktoś inny mógł pokazać kartę przy kasie.
- Na ekranie szczegółów karty naciśnij przycisk **«Udostępnij obraz kodu kreskowego»**.
- Wybierz komunikator lub aplikację. Obraz zostanie wysłany w formacie PNG z białymi marginesami, co gwarantuje jego pomyślne zeskanowanie przez odbiorcę.

---

## 🗂️ Rozdział 4: Zarządzanie i organizacja kart

Gdy kart staje się dużo, z pomocą przychodzą narzędzia organizacji:

- **Wyszukiwanie**: Użyj paska wyszukiwania u góry ekranu głównego. Wyszukiwanie działa po nazwie sklepu, numerze karty i notatkach.
- **Sortowanie**: Naciśnij ikonę sortowania, aby uporządkować karty według nazwy, daty utworzenia lub częstotliwości użycia.
- **Ulubione**: Naciśnij ikonę gwiazdki ⭐️ na karcie, aby przenieść często używane karty na początek listy.
- **Menu kontekstowe**: Wykonaj **długie naciśnięcie** na dowolnej karcie na liście, aby szybko wywołać menu «Edytuj» lub «Usuń».
- **Archiwum**: Jeśli karta jest nieaktualna, ale szkoda jej usuwać, otwórz jej szczegóły i naciśnij «Przenieś do archiwum». Zarchiwizowane karty są ukryte z głównej listy, wyszukiwania i eksportu, ale można je przywrócić w dowolnym momencie przez menu «Archiwum».

---

## 🎨 Rozdział 5: Dostosowywanie wyglądu

Przejdź do **Ustawień** (ikona koła zębatego), aby spersonalizować aplikację:

- **Motyw graficzny**: Wybierz motyw jasny, ciemny lub systemowy.
- **Kompaktowy tryb listy**: Włącz tę opcję, aby ukryć kody kreskowe i numery kart na ekranie głównym. Zmniejsza to wysokość kart o połowę i znacząco przyspiesza przewijanie na wszystkich urządzeniach.
- **Jasność na karcie**: Włącz suwak jasności bezpośrednio na ekranie karty, aby szybko dostosować ją ręcznie przed skanowaniem.
- **Język interfejsu**: Wybierz jeden z 11 obsługiwanych języków niezależnie od języka Twojego systemu.

*Podczas edycji pojedynczej karty możesz również nadać jej unikalny kolor (za pomocą palety lub kodu HEX, np. `#0EE8A5`) i ikonę kategorii.*

---

## 💾 Rozdział 6: Kopia zapasowa i przenoszenie danych

Twoje dane należą tylko do Ciebie. Regularnie twórz kopie zapasowe.

### Eksport (Tworzenie kopii)
1. Wejdź w Ustawienia → **Eksport**.
2. Wybierz format:
   - **JSON**: Pełny format ze wszystkimi szczegółami (kolory, ikony, daty, CVC, status archiwum). Zalecany do przenoszenia na inne urządzenie.
   - **CSV**: Format tabelaryczny (Nazwa, Kod, Typ kodu, CVC, Notatka). Wygodny do przeglądania w Excelu.
3. Zapisz plik w wygodnym folderze lub od razu wyślij go do siebie w komunikatorze/chmurze.

### Import (Przywracanie kopii)
1. **Sposób automatyczny**: Znajdź zapisany plik `.json` lub `.csv` w menedżerze plików i naciśnij na niego. Wybierz «Otwórz za pomocą» → **DiscountCards**. Aplikacja automatycznie uruchomi proces importu.
2. **Sposób ręczny**: Wejdź w Ustawienia → **Import** i wybierz plik ręcznie.
3. **Wybierz tryb importu**:
   - **Scalanie (MERGE)**: Dodaje nowe karty do istniejących (zalecane).
   - **Nadpisywanie (OVERWRITE)**: Całkowicie usuwa bieżące karty i zastępuje je danymi z pliku.
4. **W przypadku wykrycia duplikatów** aplikacja zaproponuje strategię: zaktualizuj istniejące, dodaj jako nowe lub pomiń.

---

## ⚠️ Rozdział 7: Rozwiązywanie typowych problemów

| Problem | Rozwiązanie |
| :--- | :--- |
| **Kasa nie odczytuje kodu kreskowego z ekranu** | 1. Naciśnij na kod kreskowy, aby przejść do trybu pełnoekranowego (maksymalna jasność + białe tło).<br>2. Upewnij się, że podczas tworzenia karty wybrano prawidłowy typ kodu (zwykle `EAN_13` lub `CODE_128`).<br>3. Wytrzyj ekran z odcisków palców. |
| **Aparat nie ustawia ostrości na karcie fizycznej** | Zapewnij dobre oświetlenie. Jeśli aparat nie daje rady, zrób zdjęcie karty zwykłym aparatem telefonu i użyj funkcji «Wybierz z pliku» w DiscountCards. |
| **Aplikacja wydaje się wolna przy dużej liczbie kart** | Wejdź w Ustawienia i włącz **«Kompaktowy tryb listy»**. Wyłączy to generowanie kodów kreskowych na liście ogólnej i wielokrotnie przyspieszy działanie. |
| **Nie mogę znaleźć zaimportowanego pliku** | Upewnij się, że pobrałeś plik w formacie `.json` lub `.csv`. Podczas importu aplikacja automatycznie rozpozna separatory w CSV (przecinek, średnik lub tabulacja). |

---

## Rozdział 8: 🧩 Widgety na ekranie głównym

**Jak dodać widget na ekran główny telefonu?**  
1. Przytrzymaj palcem dowolne puste miejsce na ekranie głównym smartfona.  
2. W dolnym menu, które się pojawi, wybierz pozycję **«Widgety»**.  
3. Przewiń listę aplikacji i znajdź **DiscountCards**.  
4. Przytrzymaj ikonę widgetu i nie puszczając palca, przeciągnij go na wolne miejsce na ekranie.  
5. Zaraz po umieszczeniu otworzy się okno konfiguracji: wybierz żądaną kartę rabatową z listy i naciśnij «Gotowe» (lub «Zapisz»).
6. W ustawieniach widgetu znajduje się podgląd, który pokazuje w przybliżeniu, jak widget będzie wyglądał przy różnych rozmiarach (rzeczywisty wygląd zależy od modelu telefonu). Rzeczywiste rozmiary widgetu nie zmieniają się same z siebie. W ustawieniach można również określić, czy pokazywać Nazwę i Kod kreskowy.

**Jak zmienić wybraną kartę lub ustawienia widgetu?**  
Masz dwa wygodne sposoby, aby to zrobić:  
- **Przez sam widget:** Naciśnij przezroczysty przycisk edycji (w prawym górnym rogu samego widgetu). Otworzy to menu, w którym możesz wybrać inną kartę lub zmienić parametry wyświetlania.  
- **Przez menu Androida:** Przytrzymaj palcem już umieszczony widget. W wyświetlonym menu rozwijanym naciśnij **«Ustawienia widgetu»** (to nie działa na wszystkich telefonach).

**Jak zmienić rozmiar widgetu?**  
Widget DiscountCards jest adaptacyjny i obsługuje rozmiary od **1×1 do 5×5** komórek. Aby zmienić jego rozmiar:  
1. Przytrzymaj widget na ekranie głównym.  
2. Gdy zostanie podświetlony, na jego krawędziach pojawią się uchwyty rozciągania (zwykle niebieskie lub kontrastowe punkty/paski).  
3. Pociągnij za te uchwyty w żądanym kierunku, aby powiększyć lub zmniejszyć obszar widgetu.  
4. Puść palec, aby utrwalić nowy rozmiar.  
💡 *Wskazówka:* Przy minimalnym rozmiarze (1×1) wyświetlana będzie tylko kompaktowa ikona lub mini kod kreskowy. Aby powiększyć kod kreskowy, możesz w ustawieniach wyłączyć wyświetlanie Nazwy. Dla wygodnego skanowania przy kasie zaleca się używanie rozmiaru **2×2** lub większego, aby widoczna była nazwa sklepu i pełny kod kreskowy.

---

## 📬 Informacje zwrotne i wsparcie

Aplikacja jest rozwijana z troską o użytkowników. Jeśli znalazłeś błąd, masz propozycję ulepszenia lub chcesz dodać obsługę nowego formatu kodów kreskowych, utwórz zgłoszenie w sekcji [Issues na GitHubie](https://github.com/Storvild/android_discount_cards/issues).

*Dziękujemy za wybór DiscountCards! Przechowuj swoje rabaty bezpiecznie i wygodnie.*
