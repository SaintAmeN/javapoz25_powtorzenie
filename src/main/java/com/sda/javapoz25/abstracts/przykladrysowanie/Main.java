package com.sda.javapoz25.abstracts.przykladrysowanie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IRysowalny> rysowalnyList = new ArrayList<>();
        rysowalnyList.add(new Kwadrat());
        rysowalnyList.add(new Kwadrat());
        rysowalnyList.add(new Trojkat());

        rysowalnyList.forEach(obiekt -> obiekt.narysujMnie());
//        Poniżej odpowiednik pętlą for:
//        for (IRysowalny obiekt : rysowalnyList) {
//            obiekt.narysujMnie();
//        }

    }
}
