# ToBinaryAndHexadecimal

Program konsolowy w Javie, który zamienia liczbę dziesiętną z zakresu od -128 do 127 na 8-bitowy zapis binarny oraz szesnastkowy (hex). Liczby ujemne są zapisywane w kodzie uzupełnień do dwóch (U2).

## Opis działania

1. Program prosi o podanie liczby dziesiętnej.
2. Sprawdza, czy wpisana wartość jest liczbą całkowitą.
3. Sprawdza, czy liczba mieści się w zakresie od -128 do 127.
4. Stosuje maskę `& 0xFF`, aby otrzymać dokładnie 8 bitów (także dla liczb ujemnych).
5. Zamienia wynik na ciąg binarny, uzupełnia zerami do 8 znaków i wypisuje go.
6. Zamienia ten sam bajt na zapis szesnastkowy (2 cyfry, wielkie litery) i wypisuje go z prefiksem `0x`.

W przypadku błędnych danych program wyświetla komunikat o błędzie.

## Wykorzystane elementy Javy

- klasa `Scanner` i metoda `hasNextInt()`
- operator bitowy `&` i maska `0xFF`
- `Integer.toBinaryString()`
- `String.format()` (w tym `%02X` dla hex) oraz `replace()`

## Uruchomienie

```bash
javac ToBinaryAndHexadecimal.java
java ToBinaryAndHexadecimal
```

## Przykłady

| Wejście | Binarnie   | Hex      |
|---------|------------|----------|
| 5       | `00000101` | `0x05`   |
| -1      | `11111111` | `0xFF`   |
| -128    | `10000000` | `0x80`   |
| 127     | `01111111` | `0x7F`   |
| 128     | komunikat o błędzie | —  |

## Autor

Szymon Rybikowski
