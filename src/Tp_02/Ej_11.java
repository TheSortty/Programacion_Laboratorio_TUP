package Tp_02;

import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = sc.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = sc.nextLine();

        // Usando el metodo equals
        boolean Iguales = palabra1.equals(palabra2);
        System.out.println("Usando el método equals: " + (Iguales ? "Las palabras son iguales" : "Las palabras no son iguales"));

        // Usando el metodo compareTo
        int resultadoCompareTo = palabra1.compareTo(palabra2);
        System.out.println("Usando el metodo compareTo: " + (resultadoCompareTo == 0 ? "Las palabras son iguales" : "Las palabras no son iguales"));

        // Usando el metodo compareToIgnoreCase
        int resultadoCompareToIgnoreCase = palabra1.compareToIgnoreCase(palabra2);
        System.out.println("Usando el metodo compareToIgnoreCase: " + (resultadoCompareToIgnoreCase == 0 ? "Las palabras son iguales" : "Las palabras no son iguales"));
    }
}
