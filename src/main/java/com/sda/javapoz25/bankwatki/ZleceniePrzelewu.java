package com.sda.javapoz25.bankwatki;

public class ZleceniePrzelewu implements Runnable{
    private KontoBankowe kontoBankowe;
    private double kwotaPrzelewu;
    private KierunekPrzelewu kierunekPrzelewu;

    public ZleceniePrzelewu(KontoBankowe kontoBankowe, double kwotaPrzelewu, KierunekPrzelewu kierunekPrzelewu) {
        this.kontoBankowe = kontoBankowe;
        this.kwotaPrzelewu = kwotaPrzelewu;
        this.kierunekPrzelewu = kierunekPrzelewu;
    }

    @Override
    public void run() {
        if(kierunekPrzelewu == KierunekPrzelewu.PRZYCHODZACY){
            kontoBankowe.przelejNaKonto(kwotaPrzelewu);
        }

        if (kierunekPrzelewu == KierunekPrzelewu.WYCHODZACY){
            kontoBankowe.przelejZKonta(kwotaPrzelewu);
        }
    }
}
