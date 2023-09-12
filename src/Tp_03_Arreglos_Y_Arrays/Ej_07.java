package Tp_03_Arreglos_Y_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ej_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese un numero");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("ascendente");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("descendente");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[9 - i]);
        }


    }
}
