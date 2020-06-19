package com.sda.javapoz25.bankwatki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {
    private KontoBankowe kontoBankowe = new KontoBankowe();
    private ExecutorService watek_wykonywania_przelewow = Executors.newFixedThreadPool(5);

    public void przelewWychodzacy(int kwota){
        watek_wykonywania_przelewow.submit(new ZleceniePrzelewu(kontoBankowe, kwota, KierunekPrzelewu.WYCHODZACY));
    }

    public void przelewPrzychodzacy(int kwota){
        watek_wykonywania_przelewow.submit(new ZleceniePrzelewu(kontoBankowe, kwota, KierunekPrzelewu.PRZYCHODZACY));
    }

    public void wypiszStanKonta(){
        kontoBankowe.wypiszStanKonta();
    }
}
