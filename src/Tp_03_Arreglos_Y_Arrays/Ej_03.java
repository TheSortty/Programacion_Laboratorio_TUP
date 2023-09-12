package Tp_03_Arreglos_Y_Arrays;

import java.util.Scanner;

public class Ej_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que tendra el array");
        int Longitud = sc.nextInt();

        int[] array = new int[Longitud];

        System.out.println("ingrese un numero");
        int numero = sc.nextInt();

        for (int i=0; i <= Longitud-1;i++){
            array[i] = numero * (i + 1);
        }

        for (int multiplo : array) {
            System.out.println(multiplo);
        }


    }
}