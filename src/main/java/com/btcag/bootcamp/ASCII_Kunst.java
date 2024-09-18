package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst {
    public static void main(String[] args) {

        //Würfel--------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Groeße des Vierecks: ");
        int size = sc.nextInt();
        int row = size;

        while (row > 0 ) {
            int tmp = size;
            while (tmp > 0) {
                System.out.print("*");
                tmp--;
            }
            System.out.println();
            row--;
        }

        //Dreieck--------------
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Groeße des Dreiecks: ");

    }
}