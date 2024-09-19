package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktorzerlegung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (long): ");

        long num = scanner.nextLong();
        long initialNum = num;
        long divider = 2;

        String factor = "";
        boolean isPrim;

        while (divider <= num) {            //Solange, bis divider gleich Zahl ist. Also von 2 Rauf
            long result = num % divider;    //Rest wird gepseichert

            isPrim = result == 0;           //Wenn kein Rest: dann Primzahl

            while (isPrim) {                //Solange, bis Primzahl false ist.
                factor = factor + divider +  " " ;      //Primzahl wird zum String geschrieben
                num /= divider;                         //Da z.B 2 % 12 teilbar ist, wird anschließend auch 2/12 gerechnet
                isPrim = false;                         //While-Schleife verlassen...
            }
            divider++;
        }
        System.out.println("Die Zahl " + initialNum + " kann in folgende Faktoren zerlegt werden: "+ factor);
    }
}