import java.util.Scanner;

public class ToBinaryAndHexadecimal { // główna klasa programu w Javie

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // utworzenie obiektu scanner do inputu z klawiatury

        System.out.println("Copyright Szymon Rybikowski"); // copyright

        System.out.print("Podaj liczbę dziesiętną (-128 do 127): "); // pokazuje użytkownikowi zakres liczb

        String wejscie = scanner.next(); // pobranie wpisanej wartości jako tekst (int zgubiłby znak minus przy -0)

        if (wejscie.matches("-0+")) { // sprawdzenie czy użytkownik wpisał -0 (liczba ujemna zero nie istnieje)
            System.out.println("NIE MA TAKIEJ LICZBY");
        } else {
            try {
                int liczba = Integer.parseInt(wejscie); // zamiana tekstu na liczbę całkowitą

                if (liczba >= -128 && liczba <= 127) { // sprawdzenie czy liczba mieści się w zakresie

                    String wynikBinarny = Integer.toBinaryString(liczba & 0xFF); // konwersja liczby na ciąg binarny z użyciem & 0xFF i toBinaryString

                    String wynik8Bitow = String.format("%8s", wynikBinarny).replace(' ', '0'); // wyrównanie do ciągu 8 znaków

                    String wynikHex = String.format("%02X", liczba & 0xFF); // konwersja na hex (2 cyfry, wielkie litery) z użyciem tej samej maski & 0xFF

                    System.out.println("Liczba binarna: " + wynik8Bitow); // wyświetlenie wyniku binarnego
                    System.out.println("Liczba szesnastkowa: 0x" + wynikHex); // wyświetlenie wyniku szesnastkowego

                } else {
                    System.out.println("Błąd!! Liczba musi być z zakresu od -128 do 127!"); // błąd gdy liczba wykracza poza zakres
                }

            } catch (NumberFormatException e) { // wyjątek gdy input to inne znaki niż liczby
                System.out.println("Błąd!! To nie jest poprawna liczba całkowita!");
            }
        }

        scanner.close(); // zamknięcie skanera w celu zwolnienia zasobów systemowych
    }
} // Copyright Szymon Rybikowski
