package com.sda.javapoz25.bankwatki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0) {
                bank.przelewPrzychodzacy(10); // + (5000 * 10)
            } else {
                bank.przelewWychodzacy(10);   // - (5000 * 10)
            }
        }
        // suma = 0

        String komenda;
        do {
            komenda = scanner.nextLine();

            if (komenda.equalsIgnoreCase("stan")) {
                bank.wypiszStanKonta();
            }
            System.out.println("Komenda: " + komenda);

        } while (!komenda.equalsIgnoreCase("quit"));

    }
}
