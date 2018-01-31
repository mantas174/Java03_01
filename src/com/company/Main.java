package com.company;

import uzdaviniai.LyginisNelyginis;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
        // write your code here
            Scanner in = new Scanner(System.in);

            System.out.print("Iveskite skaiciu: ");
            int a = in.nextInt();

            LyginisNelyginis obj = new LyginisNelyginis();
            obj.setA(a);
            System.out.println("Skaicius: " + obj.getA());
            obj.skaiciuok();

        }
}
