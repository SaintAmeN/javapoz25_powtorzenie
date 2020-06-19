package com.sda.javapoz25.pulawatkow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        // Jeśli mówimy o wątku (Thread) i on zakończy pracę, to system operacyjny zwalnia zasoby.
        //      Nie można ponownie uruchomić tego samego wątku
        //      Uruchomienie wątku od nowa jest BARDZO MOCNO ZASOBOŻERNE
        //      Jedyne co możemy zrobić (żeby ponownie wykonać pewne zadanie) to stworzenie nowego wątku i przekazanie zadania ponownie do realizacji

        // Pula wątków
        //  - kolekcja wątków pewnego rodzaju
        //          -- wątki które są ZAWSZE (fixed)
        //          -- wątki które coś powtarzają (scheduled)
        //          -- wątki optymalizowane pod zadania (cached) (cache - pamięć podręczna)
        //                                      ///np w procesorach mamy pamięci(L1, L2, L3)
        //  - pula posiada kolejkę zadań. Jeśli kolejka jest pusta, to pula czeka na kolejne zadanie (zachowanie może się różnić)
        //  - pula wątków z definicji służy raczej do obsługi prostych/krótkich zadań asynchronicznie
        //  - jeśli wiemy, że wątek ma wykonywać długie i czasochłonne zadanie (to samo zadanie) przez cały czas, to powinniśmy wybrać Thread

        // abstract factory/ factory method
//        ExecutorService pulaWatkow = Executors.newFixedThreadPool(3);                     // - tworzy pulę, w której są 3 wątki,
                                                                                            //      mogą wykonywać równocześnie 3 zadania, reszta zadań czeka
                                                                                            //
//        ExecutorService pulaWatkow = Executors.newCachedThreadPool();                     // - tworzy pulę i gdy jest dużo zadań których pula nie wyrabia się
                                                                                            //      zakończyć to tworzy kolejne wątki żeby przyspieszyć wykonanie zadań
                                                                                            //      Jeśli wątek nie ma zadań przez 60 sekund, to zostaje zabity.
                                                                                            //
//        ExecutorService pulaWatkow = Executors.newSingleThreadExecutor();                 // - jeden wątek, jedno zadanie. Ma kolejkę zadań. Żyje wiecznie.
                                                                                            //
//        ScheduledExecutorService pulaWatkow = Executors.newScheduledThreadPool(2);        // - wątek cykliczny.
        ScheduledExecutorService pulaWatkow = Executors.newScheduledThreadPool(2); // pool-1
//        pulaWatkow.scheduleAtFixedRate() - powtarzaj co jakiś czas
//        pulaWatkow.scheduleWithFixedDelay() - wykonaj z opóźnieniem
        pulaWatkow.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Czy daleko jeszcze?");
            }
        }, 0L, 5, TimeUnit.SECONDS); // z zerwoym opóźnieniem. co 5 sekund powtórz

        ExecutorService pulaWatkowCached = Executors.newCachedThreadPool();
        pulaWatkowCached.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Wykonuje zadanie 1");
            }
        });

        // dodanie zadania do kolejki = submit
        pulaWatkowCached.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("Wykonuje zadanie 2");
            }
        });



    }
}
