package Tp_02;

import java.util.Scanner;

public class Ej_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();

        System.out.print("¿Quieres convertir la frase a mayusculas o minusculas? (M/mayusculas, m/minusculas): ");
        String opcion = sc.nextLine();

        if (opcion.equals("M")) {
            String fraseMayusculas = frase.toUpperCase();
            System.out.println("La frase en mayusculas es: " + fraseMayusculas);
        } else if (opcion.equals("m")) {
            String fraseMinusculas = frase.toLowerCase();
            System.out.println("La frase en minusculas es: " + fraseMinusculas);
        } else {
            System.out.println("Opcion no valida.");
        }
    }
}
