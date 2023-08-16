package Ejercicios;

import java.util.Scanner;

public class Ej_14 {
    public static void main(String[] args) {
        int Random = new Double(Math.random() * 100).intValue(); //No entiendo porque 'double' sale con error
        int Intentos = 0;

        System.out.println("Intenta adivinar un numero entre 0 y 100");

        Scanner scanner = new Scanner(System.in);
        int Num;

        do {
            System.out.print("Numero Ingresado: ");
            Num = scanner.nextInt();
            Intentos++;

            if (Num < Random) {
                System.out.println("Es muy bajo");
            } else if (Num > Random) {
                System.out.println("Es muy alto");
            } else {
                System.out.println("Correcto, numero encontrado, cantidad de intentos: " + Intentos);
            }
        } while (Num != Random);
    }
}
