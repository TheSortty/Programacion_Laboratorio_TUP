package Tp_01;

import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Num;

        do {
            System.out.print("Ingresa un que sea mayor a 0: ");
            Num = scanner.nextInt();
        } while (Num <= 0);

        System.out.println("Número válido ingresado: " + Num);
    }
}
