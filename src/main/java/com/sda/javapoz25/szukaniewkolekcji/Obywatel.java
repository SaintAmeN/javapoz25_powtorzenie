package com.sda.javapoz25.szukaniewkolekcji;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Obywatel {

    @EqualsAndHashCode.Include
    private String pesel;

    private double wzrost;
    private String imie;
    private String nazwisko;


}
