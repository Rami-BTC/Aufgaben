package com.btcag.bootcamp;

import java.util.Scanner;

public class Geometrie {
    public static void main(String[] args) throws InterruptedException {
        //Kreis------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gebe den Radius(r) für deinen Kreis ein (>0): ");
        int radius = sc.nextInt();

        //--------
        double areaEasy = 3.14 * radius*radius;
        //--------

        System.out.println("Der Flächeninhalt des Kreises beträgt: " + areaEasy + " Quadratkartoffeln \n");

        //Rechteck------------------------------
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Bitte gebe die Länge für dein Rechteck ein (>0): ");
        int length = sc2.nextInt();

        System.out.println("Bitte gebe die Breite für dein Rechteck ein (>0): ");
        int width = sc2.nextInt();

        //--------
        int areaRec = length * width;
        //--------

        System.out.println("Der Flächeninhalt des Rechteckes beträgt: " + areaRec + " Quadratkartoffeln \n");
    }
}