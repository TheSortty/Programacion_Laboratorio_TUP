package Tp_02;

import java.util.Scanner;

public class Ej_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        cadena = cadena.toLowerCase();
        String nuevaCadena = cadena.replace('a', 'e');
        System.out.println("La nueva cadena es: " + nuevaCadena);
    }
}
