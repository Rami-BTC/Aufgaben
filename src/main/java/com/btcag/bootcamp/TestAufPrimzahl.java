package com.btcag.bootcamp;

import java.util.Scanner;

public class TestAufPrimzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (long): ");

        long num = scanner.nextLong();
        long divider = num - 1;

        boolean isPrim = true;

        while (divider > 1) {
            long result = num % divider;
            isPrim = result > 0;
            divider--;
        }
        System.out.println("Ergebnis: " + isPrim);
    }
}