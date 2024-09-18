package com.btcag.bootcamp;

import java.util.Scanner;

public class ArithmetischeOperatione {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number (var++): ");
        int num = scanner.nextInt();

        System.out.println("var++ = " + num++);
        System.out.println("Die Variabel wird erst nach dem Ausgeben verechnet. Nun ist sie: " + num + "\n");

        System.out.print("Enter number (++var): ");
        num = scanner.nextInt();
        System.out.println("++var = " + ++num);
        System.out.println("Die Variabel wird vor dem Ausgeben verrechnet");
    }
}