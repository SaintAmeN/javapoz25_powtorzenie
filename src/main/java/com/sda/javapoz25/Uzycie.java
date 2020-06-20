package com.sda.javapoz25;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Uzycie {
    public static void main(String[] args) {

        TimeProvider provider = new TimeProvider();
//        LocalDate dzisiaj = provider.today();
        LocalDate dzisiaj = LocalDate.now();

//        LocalDateTime teraz = provider.now();
        LocalDateTime teraz = LocalDateTime.now();

        Map<String, Rekord> rejestr = new HashMap<>();
        Rekord r = new Rekord("123", "cos", 2);

        rejestr.put(r.getNrSer(), r);

        new ParaLiczb(1, 2);
        new ParaLiczb(2, 1);

        // Map - wyszukiwanie po jednym specyficznym polu
        // SET - działania na zbiorach - słowo klucz unikalność
        // PriorityQueue - priorytetyzowanie po kryteriach
        // ArrayList - jeśli jest mowa o przeszukiwaniu kolekcji (iterowaniu, pętlach)
        // LinkedList - operacje usuwania i dodawania na początku lub końcu // lifo fifo
        // lifo - last in first out (naleśniki odkładamy na stos)
        // fifo - first in first out (kolejka)

        // LinkedHashMap - zachowuje kolejność wstawiania
        // TreeMap - dodaje funkcjonalności sortowania kluczy (kryterium - Comparator)
    }

    @Data
    @AllArgsConstructor
    static class Rekord{
        String nrSer;
        String nazwa;
        int cena;
    }

    @AllArgsConstructor
    static class ParaLiczb{
        int a;
        int b;
    }
}
