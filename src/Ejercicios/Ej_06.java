package Ejercicios;

import java.util.Scanner;

public class Ej_06 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Ingrese el monto para calcular el valor final con IVA");
        double num = cs.nextDouble();
        System.out.println(num + (num * 0.21));
    }
}
