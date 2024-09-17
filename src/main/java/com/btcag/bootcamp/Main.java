package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bitte Zahl eingeben");

        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();

        number *= number;
        System.out.println("Ergebnis: " + number);
    }
}