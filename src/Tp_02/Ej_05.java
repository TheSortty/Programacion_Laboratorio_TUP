package Tp_02;

import java.util.Scanner;

public class Ej_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int num = sc.nextInt();

        String numString = String.valueOf(num);
        System.out.println("El numero convertido a String es: " + numString);
    }
}

