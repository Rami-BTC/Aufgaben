package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst_II {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Groeße der Sanduhrhaelfte: ");
        int sizeClo = sc2.nextInt();
        int rowClo = sizeClo;

        while (rowClo > 0) {
            int tmp = 0;
            while (tmp < rowClo) {
                System.out.print("*");
                tmp++;
            }
            System.out.println();
            rowClo--;
        }

        while (rowClo <= sizeClo) {
            int tmp = 0;
            while (tmp < rowClo) {
                System.out.print("*");
                tmp++;
            }
            System.out.println();
            rowClo++;
        }
    }
}