package com.sda.javapoz25.wyjatkis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile dzieciaków?");
        int ilosc = Integer.parseInt(scanner.nextLine());

        List<Dziecko> dzieckos = new ArrayList<>();
        for (int i = 0; i < ilosc; i++) {
            Dziecko noweDziecko = new Dziecko("" + i);
            Thread watek = new Thread(noweDziecko);

            watek.start(); // start wątku!!!!!!!!!!!

            dzieckos.add(noweDziecko); // dziecko o imieniu/nazwie w postaci liczby
        }

//        watek.join();// niech ten wątek (ten który wywołał instrukcję join) poczeka aż wskazany (watek) zakończy pracę
        String komenda;
        do{
            komenda = scanner.nextLine();

            if(komenda.startsWith("zatrzymaj")){ // zatrzymaj 1
                int numerDziecka = Integer.parseInt(komenda.split(" ")[1]);
                dzieckos.get(numerDziecka).zatrzymajDziecko();
            }else{
                System.out.println("Nie rozpoznaje komendy: " + komenda);
            }

        }while (!komenda.equals("quit"));

//        for (Dziecko dziecko : dzieckos) {
//
//        }

    }
}
