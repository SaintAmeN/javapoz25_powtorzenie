package com.sda.javapoz25.bankwatki;

public class KontoBankowe {
    private double stanKonta;
    private final Object klucz = new Object();

    public KontoBankowe() {
        this.stanKonta = 0.0;
    }

    public void przelejNaKonto(double kwota) {
        synchronized (klucz) { // synchronized to miejsce do którego może wejść tylko 1 wątek
            stanKonta += kwota;
        }
    }

    public void przelejZKonta(double kwota) {
        synchronized (klucz) {
            stanKonta -= kwota;
        }
    }

    public void wypiszStanKonta() {
        System.out.println("Stan konta wynosi: " + stanKonta);
    }
}
