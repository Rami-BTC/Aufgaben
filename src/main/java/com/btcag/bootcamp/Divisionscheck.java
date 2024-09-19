package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcher Divisor soll geprueft werden?");
        int divisor = sc.nextInt();

        System.out.println("Bis zu welcher Zahl?");
        int max = sc.nextInt();

        int i = 0;                      //i = iterator
        while (i < max){                //Solange bis die maximale Zahl erreicht wurde
            int mod = i % divisor;      //Jede Zahl bis "max" wird dividiert durch divisor, Rest wird gespeichert

            while (mod == 0){           //wenn kein Rest vorhanden, dann Zahl ausgeben, da Teilbar
                System.out.println(i);
                mod = 1;                //While-Schleife verlassen...
            }
            i++;
        }
    }
}