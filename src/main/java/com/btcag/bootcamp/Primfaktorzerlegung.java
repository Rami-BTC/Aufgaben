package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (long): ");

        long num = scanner.nextLong();
        long initialNum = num;
        long divider = 2;

        String factor = "";
        boolean isPrim;

        while (divider <= num) {
            long result = num % divider;

            isPrim = result == 0;

            while (isPrim) {
                factor = factor + divider +  " " ;
                num /= divider;
                isPrim = false;
            }
            divider++;
        }
        System.out.println("Die Zahl " + initialNum + " kann in folgende Faktoren zerlegt werden: "+ factor);
    }
}