package Tp_02;

import java.util.Scanner;

public class Ej_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cadena: ");
        String cadena = sc.nextLine();

        int longitud = cadena.length();
        System.out.println("El tamaño de la cadena es: " + longitud);

        int contadorVocales = 0;
        for (int i = 0; i < longitud; i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La cadena tiene " + contadorVocales + " vocales en total.");
    }
}

