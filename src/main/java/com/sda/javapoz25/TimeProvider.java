package com.sda.javapoz25;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeProvider {

    public LocalDate today() {
        return LocalDate.now();
    }

    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
