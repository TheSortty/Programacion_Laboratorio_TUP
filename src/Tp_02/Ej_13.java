package Tp_02;

import java.util.Scanner;

public class Ej_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la primera cadena: ");
        String Cadena1 = sc.nextLine();

        System.out.println("Ingresa la segunda cadena: ");
        String Cadena2 = sc.nextLine();

        if (Cadena1.contains(Cadena2)) {
            System.out.println("La segunda cadena se encuentra dentro de la primera.");
        } else {
            System.out.println("La segunda cadena no se encuentra dentro de la primera.");
        }
    }
}
