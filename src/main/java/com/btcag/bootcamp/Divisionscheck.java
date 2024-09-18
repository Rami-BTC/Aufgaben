package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcher Divisor soll geprueft werden?");
        int divisor = sc.nextInt();

        System.out.println("Bis zu welcher Zahl?");
        int max = sc.nextInt();

        int i = 0;
        while (i < max){
            int mod = i % divisor;

            while (mod == 0){
                System.out.println(i);
                mod = 1;
            }
            i++;
        }
    }
}
