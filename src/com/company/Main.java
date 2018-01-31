package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int a;

        System.out.print("Iveskite skaiciu: ");
        a = in.nextInt();

        if (a % 2 == 0){
            System.out.print("Skaicius lyginis");
        }else {
            System.out.print("Skaicius nelyginis");
        }
    }
}
