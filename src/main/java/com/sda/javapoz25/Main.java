package com.sda.javapoz25;

public class Main {
    public static void main(String[] args) {
        // Klasa abstrakcyjna -
        //      - nie możemy tworzyć instancji klasy abstr.
        //      - może posiadać metody abstrakcyjne (metody bez implementacji/bez ciała)
        //                              [musimy je implementować w klasach dziedziczących]
        //      - klasy możemy rozszerzać jeden raz (jedna klasa może dziedziczyć jeden raz)
        //      - kasa abstrakcyjna może mieć pola
        //      - może posiadać ZWYKłE METODY (z implementacją)
        //
        //      -- Kiedy wybierzesz klasę abstrakcyjną, a kiedy interfejs? - jeśli klasy dziedziczące mają współdzielić pola
        //
        // przeciążanie metod (ta sama metoda, inne parametry [ilość lub typ])
        // Kompilator stara się dopasować metody po ich typach/ilości.
        // dziedziczenie

        // Interfejs -
        //      - może posiadać metody abstrakcyjne
        //      - może posiadać metody defaultowe
        //      - może być implementowany wiele razy
        //      - może ROZSZERZAć inny interfejs


        String zmienna1 = new String("cos");  // dodany do string pool
        String zmienna2 = new String("cos");

        System.out.println("Wynik 1: " + (zmienna1.equals(zmienna2)));      // true
        System.out.println("Wynik 2: " + (zmienna1 == zmienna2));           // false

        // java do wersji 8 - nie wolno dodawać do siebie stringów
        // tworzył się 3 string, który rezerwował więcej miejsca
        // StringBuilder - zastępca, którego powinno się używać, jeśli łączymy "tekst"
        zmienna1 = zmienna1 + " i cos innego";


        metoda("cos"); // string pool
    }

    private static void metoda(String str){

    }

    private static void metoda(String... str){

    }
}
