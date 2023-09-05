package Tp_02;

import java.util.Scanner;

public class Ej_04 {
    public static void main(String[]Args){

        double[] Denominaciones = {200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05};
        int[] Cuenta = new int[Denominaciones.length];

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad: ");
        double Cantidad = sc.nextDouble();

        for (int i = 0; i < Denominaciones.length; i++) {
            Cuenta[i] = (int) (Cantidad / Denominaciones[i]);
            Cantidad -= Cuenta[i] * Denominaciones[i];
        }

        for (int i = 0; i < Denominaciones.length; i++) {
            if (Cuenta[i] > 0) {
                if (Denominaciones[i] >= 2)
                    System.out.println(Cuenta[i] + " billetes de " + Denominaciones[i]);
                else
                    System.out.println(Cuenta[i] + " monedas de " + Denominaciones[i]);
            }
        }
    }
}
