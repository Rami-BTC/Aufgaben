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

        while (longInput > 0) {
            num = longInput % 10;
            longInput /= 10;

            result += num;
            num = 0;
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

            character = stringInput.charAt(currentIndex -1);
            currentIndex--;
            i += character - '0';
        }

        System.out.println("Die Quersumme ist: " + i);
    }
}
