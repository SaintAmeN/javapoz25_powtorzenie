package com.sda.javapoz25.szukaniewkolekcji;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Obywatel> obywatelMap = new HashMap<>();

        Obywatel o1 = new Obywatel("123", 2.3, "Pawel", "Gawel");
        obywatelMap.put(o1.getPesel(), o1);
        Obywatel o2 = new Obywatel("124", 2.2, "Pawelek", "Gawelek");
        obywatelMap.put(o2.getPesel(), o2);
        Obywatel o3 = new Obywatel("125", 2.1, "Marcin", "Marcinski");
        obywatelMap.put(o3.getPesel(), o3);
        Obywatel o4 = new Obywatel("126", 2.0, "Grzegorz", "Gregorianski");
        obywatelMap.put(o4.getPesel(), o4);

        obywatelMap.entrySet()
                .forEach(System.out::println);

        // ########## WYSZUKIWANIE W MAPIE  // (~)(1)
        System.out.println(obywatelMap.get("125").getNazwisko());

        Set<Obywatel> obywatelSet = new HashSet<>();
        obywatelSet.add(o1);
        obywatelSet.add(o2);
        obywatelSet.add(o3);
        obywatelSet.add(o4);

        // ########### WYSZUKIWANIE W SECIE
        for (Obywatel obywatel : obywatelSet) { // O(n)
            if(obywatel.getPesel().equalsIgnoreCase("125")){
                System.out.println(obywatel.getNazwisko());
                break;
            }
        }


    }
}
