package com.sda.javapoz25.pulawatkow;

public class ObliczDzialanieMatematyczne implements Runnable {
    private int liczbaA;
    private int liczbaB;
    private int czasPrzerwy;

    public ObliczDzialanieMatematyczne(int liczbaA, int liczbaB, int czasPrzerwy) {
        this.liczbaA = liczbaA;
        this.liczbaB = liczbaB;
        this.czasPrzerwy = czasPrzerwy;
    }

    @Override
    public void run() {
        System.out.println("Rozpoczynam pracę nad zadaniem: " + liczbaA + " + " + liczbaB);
        try {
            Thread.sleep(czasPrzerwy);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Kończę pracę, wynik to: " + (liczbaA + liczbaB));
    }
}
