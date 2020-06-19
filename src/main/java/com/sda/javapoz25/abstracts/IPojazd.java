package com.sda.javapoz25.abstracts;

// Pojazd -> Pojazd4Kołowy -> PojazdSilnikowy ->
//                                             - sedan
//                                             - kabriolet...
// słówko final przed klasą powoduje, że nie można jej rozszerzyć
// idea klasy abstr. - służy do tego by być dziedziczona
//
// immutable - niezmienna - np. String
//          jeśli stworzyliśmy obiekt tego typu, to jego zawartość (wartość pól) nie może się zmienić

//public final class IPojazd {
public abstract class IPojazd {
    protected int iloscMiejscSiedzacych;
    protected int predkosc;

    // final przed metodą powoduje, że nie możemy jej nadpisać
    public final void zwiekszPredkosc() {
        predkosc++;
    }
}
