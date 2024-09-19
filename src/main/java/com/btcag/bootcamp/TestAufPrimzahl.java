package com.btcag.bootcamp;

import java.util.Scanner;

public class TestAufPrimzahl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (long): ");

        long num = scanner.nextLong();
        long divider = num - 1;     //Das Berechnen der ursprünglichen Zahl ist nicht nötig, (ergibt immer 1)

        boolean isPrim = true;

        int tmp = 0;
        while (divider > 1) {       //Solange, bis der divider bei 2 ist. Alles darunter ist sinnlos (1/x ergibt immer Zahl)
            long result = num % divider;    //Wenn Rest == 0, dann ist die Zahl Teilbar.
            isPrim = result > 0;            //Wenn Zahl teilbar ist, dann isPrim auf True

            while (isPrim==false) {         //Wenn Zahl teilbar war, dann tmp +1, tmp = wie oft geteilt wurde.
                tmp++;
                isPrim = true;
            }
            divider--;
        }

        while (tmp > 0){                    //Wenn mind. einmal geteilt wurde, dann ist keine Primzahl, also isPrim false.
            isPrim = false;
            tmp = 0;
        }
        System.out.println("Ergebnis: " + isPrim);
    }
}