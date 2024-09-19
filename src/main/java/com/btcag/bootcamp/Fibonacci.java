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
        while (a+b < n){            //Solange, bis a + b nicht größer als die ursprüngliche Eingabe ist.
            int tmp = a;
            a += b;                 //Fibonacci-Rechnung (1+1, 1+2, 2+3)
            resultStr += a + " ";   //Ergebnisspeicherung in einem String

            b = tmp;                //Da, immer mit der vorherigen Zahl gerechnet wird, speichern wir diese.
        }
        System.out.print("Fibonacci-Zahlen bis " + n + ":\n" + resultStr);
    }
}