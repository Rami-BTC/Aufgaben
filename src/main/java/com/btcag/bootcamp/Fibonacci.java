package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib eine ganze Zahl ein: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        String resultStr = 0 + " ";
        while (a+b < n){  //Ich hoffe das zählt als einfache Bedingung
            int tmp = a;
            a += b;
            resultStr += a + " ";

            b = tmp;
        }
        System.out.print("Fibonacci-Zahlen bis " + n + ":\n" + resultStr);
    }
}