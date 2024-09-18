package com.btcag.bootcamp;

import java.util.Scanner;

public class PiGenauigkeit {
    public static void main(String[] args) {
        //WIP

        Scanner scanner = new Scanner(System.in);

        double num = 3;
        double result = 0;

        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?");
        int integerInput = scanner.nextInt();

        while (integerInput > 0) {
            integerInput--;

            result = result + 1/num;
            num += 2;
        }

        result *= 4;
        System.out.println("Nach 1 iteration(en) wurden Pi auf den Wert " + result + " berechnet");
    }
}
