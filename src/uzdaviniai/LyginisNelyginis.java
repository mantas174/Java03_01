package uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {
    public LyginisNelyginis(){

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
