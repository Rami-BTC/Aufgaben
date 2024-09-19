package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Long
        System.out.println("Bitte Zahl eingeben (Long): ");
        long longInput = scanner.nextLong();
        long num = 0;
        long result = 0;

        while (longInput > 0) {         //Solange bis longInput = 0 ist
            num = longInput % 10;       //Letzte Zahl wird gespeichert, also bei 1234 = 123,4 <--
            longInput /= 10;            //longInput wird durch 10 gerechnet, also von 1234 auf 123

            result += num;              //Letzte Zahl von 1234 (4), wird verrechnet
        }
        System.out.println("Die Quersumme ist: " + result);

        //String
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Bitte Zahl eingeben (String): ");
        String stringInput = scanner2.nextLine();

        int currentIndex = stringInput.length();
        char character;
        int i = 0;
        while (currentIndex > 0) {

            character = stringInput.charAt(currentIndex -1);    //Letzte Zahl wird genommen (als char)
            currentIndex--;
            i += character - '0';   //Char wird als ASCII verrechnet, durch '0' wird der Wert und nicht das ASCII (wie z.B 57) benutzt.
        }
        System.out.println("Die Quersumme ist: " + i);
    }
}