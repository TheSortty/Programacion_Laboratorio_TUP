package Tp_01;

import java.util.Scanner;

public class Ej_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String Con_Correcta = "password123";

        int Intentos = 3;
        boolean AccesoCorrecto = false;

        do {
            System.out.print("Introduce la contraseña: ");
            String Con_Ingresada = scanner.nextLine();

            if (Con_Ingresada.equals(Con_Correcta)) {
                AccesoCorrecto = true;
                break;
            } else {
                Intentos--;
                System.out.println("Contraseña incorrecta. Te quedan " + Intentos + " intentos.");
            }

        } while (Intentos > 0);

        if (AccesoCorrecto) {
            System.out.println("Acceso Correcto");
        } else {
            System.out.println("Se agotaron los intentos. Acceso denegado.");
        }
    }
}
