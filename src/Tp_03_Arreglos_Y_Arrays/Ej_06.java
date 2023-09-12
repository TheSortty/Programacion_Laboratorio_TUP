package Tp_03_Arreglos_Y_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ej_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Ingrese el numero que quiere buscar");
        int numero_buscado = sc.nextInt();

        int posicion =-1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numero_buscado) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1){
            System.out.println("El numero se encontro en la posicion "+ posicion);
        }else{
            System.out.println("El numero no se encontro");
        }

    }
}
