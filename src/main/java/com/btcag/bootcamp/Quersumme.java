package com.btcag.bootcamp;

import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        //Dieses Projekt ist im WIP!

        Scanner scanner = new Scanner(System.in);

        //Long
        System.out.println("Bitte Zahl eingeben (Long): ");
        long input = scanner.nextLong();
        long num = 0;
        long result = 0;

        while (input > 0) {
            num = num * 10 + (input % 10);
            input /= 10;

            result += num;
            num = 0;
        }
        System.out.println("Die Quersumme ist: " + result);

        //String
        System.out.println("Bitte Zahl eingeben (String): ");
        String input2 = scanner.nextLine();

        int currentIndex = input2.length();
        char test;
        int i = 0;
        while (currentIndex > 0) {

            test = input2.charAt(currentIndex -1);
            currentIndex--;
            i += test;
        }

        System.out.println("Die Quersumme ist: " + i);
    }
}
