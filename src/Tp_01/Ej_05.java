package Tp_01;

import java.util.Scanner;

public class Ej_05 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Escriba 1 valor");
        int Num1 = cs.nextInt();
        if (Num1 % 2 == 0) {
            System.out.println("Su numero es par");
        }else{
            System.out.println("Su numero es impar");
        }
    }
}
