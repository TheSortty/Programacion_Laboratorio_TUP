package Tp_04_Algoritmos_Fundamentales;

import java.util.Scanner;

public class Ej_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        int suma = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese un numero entero para la celda [" + (i+1) + ", " + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
                suma += matriz[i][j];
            }
        }

        int promedio = suma / (filas * columnas);
        boolean encontrado = false;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] == promedio) {
                    System.out.println("El promedio " + promedio + " se encuentra en la posicion [" + (i+1) + ", " + (j+1) + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontro ninguna coincidencia");
        }
    }
}
