package com.btcag.bootcamp;

import java.util.Scanner;

public class PiGenauigkeit {
    public static void main(String[] args) {
        //WIP

        Scanner scanner = new Scanner(System.in);

        double num = 3;
        double result = 1;

        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?");
        int integerInput = scanner.nextInt();

        int n = 1;

        while (n < integerInput) {
            //Formel 4 * (1 - 1/3 + 1/5 - 1/7))

            if (n % 2 == 0){
                result = result + 1/num;
            }
            else{
                result = result - 1/num;
            }
            num += 2;
            n++;
        }

        result *= 4;
        System.out.println("Nach 1 iteration(en) wurden Pi auf den Wert " + result + " berechnet");
    }
}
