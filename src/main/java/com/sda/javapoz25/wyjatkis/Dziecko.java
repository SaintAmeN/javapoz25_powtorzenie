package com.sda.javapoz25.wyjatkis;

import java.util.Random;

// żeby móc uruchomić wątek, to obiekt musi implementować interfejs Runnable
public class Dziecko implements Runnable {
    private boolean czyZywe;
    private String nazwa;

    public Dziecko(String nazwa) {
        this.nazwa = nazwa;
        this.czyZywe = true;
    }

    public void zatrzymajDziecko() {
        this.czyZywe = false;
    }

    @Override
    public void run() {
        System.out.println("Start dziecka o nazwie: " + nazwa);
        while (czyZywe) { // nigdy nie robić while(true)
            int iloscMilisekundCiszy = new Random().nextInt(10000);

            try {
                Thread.sleep(iloscMilisekundCiszy);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Daleko jeszcze?");
        }
        System.err.println("Koniec pracy: " + nazwa);
    }
}
