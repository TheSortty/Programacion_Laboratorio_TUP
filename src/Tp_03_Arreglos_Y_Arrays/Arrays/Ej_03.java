package Tp_03_Arreglos_Y_Arrays.Arrays;

import java.util.Scanner;

public class Ej_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un numero para el tamaño del array");
        int num = sc.nextInt();

        if (num >= 3 && num <= 10) {
            System.out.println("numero correcto");
            int[][] lista = new int[num][num];

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.println("ingrese un numero");
                    lista[i][j] = sc.nextInt();
                }
            }

            System.out.println("El array es el siguiente: ");
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print(lista[i][j] + " ");
                }
                System.out.println();
            }
            int suma = 0;

            int[] sumaColumnas = new int[num];
            for (int j = 0; j < num; j++) {
                for (int i = 0; i < num; i++) {
                    suma = suma + lista[i][j];
                }
                sumaColumnas[j] = suma;
                suma=0;
            }

            System.out.println("La suma de cada columna");
            for (int sumaColumna : sumaColumnas) {
                System.out.println(sumaColumna);
                suma = suma + sumaColumna;
            }

            System.out.println("la suma total es de :" + suma);
        } else {
            System.out.println("numero incorrecto no se ejecutara el programa");
        }

    }
}
