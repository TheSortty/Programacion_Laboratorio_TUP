package Ejercicios;

import java.util.Scanner;

public class Ej_04 {
    public static void main(String[] args) {
        int Num1 = 10, Num2 = 24;
        Scanner cs = new Scanner(System.in);
        if (Num1 > Num2) {
            System.out.println("Su primer numero es mayor!");
        } else if (Num2 > Num1) {
            System.out.println("Su segundo numero es el mayor!");
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
}
