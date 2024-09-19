package com.btcag.bootcamp;

import java.util.Scanner;

public class rueckwaertsAusgeben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String
        System.out.println("Bitte Zahl eingeben (String): ");
        String stringInput = scanner.nextLine();

        int currentIndex = stringInput.length();        //Index fängt hinten an
        String result = "";

        while (currentIndex > 0) {      //Solange bis alle Character durch sind (von hinten).
            result = result + stringInput.charAt(currentIndex -1);      //Character von hinten wird gespeichert
            currentIndex--;
        }

        System.out.println(result + "\n");

        //Long
        System.out.println("Bitte Zahl eingeben (Long): ");
        long longInput = scanner.nextLong();
        long reverse = 0;

        while (longInput > 0) {
            reverse = reverse * 10 + (longInput % 10);  //Rest, z.B bei 123 ist 12.3 (hinterste Zahl). X * 10, also z.B "30", damit am Ende 30 + X (z.B 30 + 5 = 35)
            longInput /= 10;    //longInput / 10, damit von z.B 123 auf 12. Rest fällt weg, weil long
        }

        System.out.println(reverse + "\n");
        System.out.println("Gibt man 01234 ein kommt statt 43210 nur 4321 raus, da 0 % 0 = 0 ist und 0 * 10 auch 0. " +
                "Die nächste Zahl wird also 0 + X gerechnet. Damit wird die 0 'überschrieben'");

    }
}