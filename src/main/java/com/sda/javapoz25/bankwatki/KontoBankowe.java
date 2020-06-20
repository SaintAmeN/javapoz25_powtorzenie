package com.sda.javapoz25.bankwatki;

public class KontoBankowe {
    private double stanKonta;
    private final Object klucz = new Object();

    public KontoBankowe() {
        this.stanKonta = 0.0;
    }

    public void przelejNaKonto(double kwota) {
        // sekcja krytyczna to miejsce w kodzie gdzie może dojść do zjawisk błędów asynchronicznych (m. in. zjawiska wyścigów)
        synchronized (klucz) { // synchronized to miejsce do którego może wejść tylko 1 wątek
            stanKonta += kwota;
        }
    }

    public void przelejZKonta(double kwota) {
        synchronized (klucz) {
            stanKonta -= kwota;
        }
    }

    // do metody może wejść tylko jeden wątek
    public synchronized void wypiszStanKonta() {
        System.out.println("Stan konta wynosi: " + stanKonta);
    }
}
