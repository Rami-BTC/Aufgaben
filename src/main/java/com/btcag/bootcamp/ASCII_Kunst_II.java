package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCII_Kunst_II {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Groeße der Sanduhrhaelfte: ");
        int sizeClo = sc2.nextInt();
        int rowClo = sizeClo;

        while (rowClo > 0) {            //Solange, bis die letzte Reihe, in dem Fall 0, erreicht wurde
            int tmp = 0;
            while (tmp < rowClo) {      //Reihennummer, entspricht der Sternenanzahl, daher soviele Sterne-
                System.out.print("*");  //wie die Reihennummer groß ist.
                tmp++;
            }
            System.out.println();
            rowClo--;
        }

        while (rowClo <= sizeClo) {     //Solange, bis die Größe des Dreiecks erreicht wurde.
            int tmp = 0;
            while (tmp < rowClo) {      //Reihennummer, entspricht der Sternenanzahl, daher soviele Sterne-
                System.out.print("*");  //wie die Reihennummer groß ist.
                tmp++;
            }
            System.out.println();
            rowClo++;
        }
    }
}