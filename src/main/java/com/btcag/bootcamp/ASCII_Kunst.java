package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst {
    public static void main(String[] args) {

        //Würfel--------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Groeße des Vierecks: ");
        int sizeRec = sc.nextInt();
        int rowRec = sizeRec;

        while (rowRec > 0 ) {
            int tmp = sizeRec;
            while (tmp > 0) {
                System.out.print("*");
                tmp--;
            }
            System.out.println();
            rowRec--;
        }

        //Dreieck--------------
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Groeße des Dreiecks: ");
        int sizeTri = sc2.nextInt();
        int rowTri = 1;

        while (rowTri <= sizeTri) {
            int tmp = 0;
            while (tmp < rowTri) {
                System.out.print("*");
                tmp++;
            }
            System.out.println();
            rowTri++;
        }
    }
}