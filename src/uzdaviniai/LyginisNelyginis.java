package uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {
    private  int _a;

    public int getA() {
        return _a;
    }
    public void setA(int value){
        _a = value;
    }
    public void skaiciuok(){

        if (_a % 2 == 0){
            System.out.print("Skaicius lyginis");
        } else {
            System.out.print("Skaicius nelyginis");
        }
    }
}
