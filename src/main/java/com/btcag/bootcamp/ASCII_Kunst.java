package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst {
    public static void main(String[] args) {

        //Würfel--------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Groeße des Vierecks: ");
        int sizeRec = sc.nextInt();
        int rowRec = sizeRec;           //Es gibt so viele "Reihen" wie der Würfel groß ist

        while (rowRec > 0 ) {           //Solange, bis die letzte "Reihe" erreicht wurde
            int tmp = sizeRec;
            while (tmp > 0) {           //Solange, bis die "Breite" ausgeschrieben wurde
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
        int rowTri = 1;                 //Anfang bei "Reihe" 1

        while (rowTri <= sizeTri) {     //Solange, bis die "Größe" des Dreiecks erreicht wurde
            int tmp = 0;
            while (tmp < rowTri) {      //Da, die Reihennummer der Sternenanzahl entspricht, schreiben wir-
                System.out.print("*");  //dieselbe Sternenanzahl aus, wie die Reihennummer groß ist.
                tmp++;
            }
            System.out.println();
            rowTri++;
        }
    }
}