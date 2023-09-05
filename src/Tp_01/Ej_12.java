package Tp_01;

import java.util.Scanner;

public class Ej_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dia;

        do {
            System.out.print("Ingresa un número del 1 al 7 para representar un día de la semana: ");
            Dia = scanner.nextInt();
            if  (Dia > 7 || Dia <= 0){
                System.out.println("DIA INVALIDO");
            }
        } while (Dia < 1 || Dia > 7);

        String Estado = switch (Dia) {
            case 1, 2, 3, 4, 5 -> "Laboral";
            case 6, 7 -> "No Laboral";
            default -> "Día no válido";
        };

        System.out.println("El día " + Dia + " es un día " + Estado + ".");
    }
}
