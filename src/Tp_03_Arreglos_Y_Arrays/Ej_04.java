package Tp_03_Arreglos_Y_Arrays;

import java.util.Scanner;

public class Ej_04 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        for (int i=0;i < numeros.length;i++) {
            System.out.println("Ingrese un numero");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (mayor < numero){
                mayor = numero;
            }
            if (menor > numero ){
                menor = numero;
            }
        }

        int diferencia = mayor-menor;

        System.out.println("mayor:" + mayor);
        System.out.println("menor:" + menor);
        System.out.println("diferencia:" + diferencia);

    }
}
