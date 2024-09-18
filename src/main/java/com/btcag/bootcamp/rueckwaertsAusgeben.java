package com.btcag.bootcamp;

import java.util.Scanner;

public class rueckwaertsAusgeben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String
        System.out.println("Bitte Zahl eingeben (String): ");
        String stringInput = scanner.nextLine();

        int currentIndex = stringInput.length();
        String result = "";

        while (currentIndex > 0) {
            result = result + stringInput.charAt(currentIndex -1);
            currentIndex--;
        }

        System.out.println(result + "\n");

        //Long
        System.out.println("Bitte Zahl eingeben (Long): ");
        long longInput = scanner.nextLong();
        long reverse = 0;

        while (longInput > 0) {
            reverse = reverse * 10 + (longInput % 10);
            longInput /= 10;
        }

        System.out.println(reverse + "\n");
        System.out.println("Gibt man 01234 ein kommt statt 43210 nur 4321 raus, da 0 % 0 = 0 ist und 0 * 10 auch 0. " +
                "Die nächste Zahl wird also 0 + X gerechnet. Damit wird die 0 'überschrieben'");

    }
}