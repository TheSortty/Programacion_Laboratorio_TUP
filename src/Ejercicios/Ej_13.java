package Ejercicios;

import java.util.Scanner;

public class Ej_13 {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int Num = cs.nextInt();
        int Suma = 0;
        for (int i = 1; i < Num; i++) {
            int auxiliar = Num % i;
            if (auxiliar == 0) {
                Suma = Suma + 1;
            }
        }
        if (Suma <= 2) {
            System.out.println("Tu numero es primo");
        } else {
            System.out.println("Tu numero NO es primo");
        }
    }
}