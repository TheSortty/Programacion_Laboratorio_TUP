package Tp_03_Arreglos_Y_Arrays.Arrays;

import java.util.Scanner;

public class Ej_04 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = null;
        boolean matrizLlena = false;

        while (true) {
            System.out.println("----MENU----");
            System.out.println("a) Rellenar la matriz ");
            System.out.println("b) Suma de una fila");
            System.out.println("c) Suma de una columna");
            System.out.println("d) Sumar la diagonal principal");
            System.out.println("e) Sumar la diagonal inversa");
            System.out.println("f) La media los valores de la matriz");
            System.out.println("g) Salir");
            System.out.print("Seleccione una opción: ");

            char opcion = sc.next().charAt(0);

            if (opcion == 'a') {
                System.out.print("Ingrese un valor entero (mayor o igual a 4 y menor o igual a 10): ");
                int num = sc.nextInt();

                if (num >= 4 && num <= 10) {
                    matriz = new int[num][num];
                    matrizLlena = true;

                    System.out.println("Rellene la matriz:");
                    for (int i = 0; i < num; i++) {
                        for (int j = 0; j < num; j++) {
                            System.out.print("Ingrese el valor en la posición [" + i + "][" + j + "]: ");
                            matriz[i][j] = sc.nextInt();
                        }
                    }
                } else {
                    System.out.println("Numero incorrecto! D: el valor no esta en el rango permitido.");
                    System.out.println("PORFAVOR INTENTE OTRA VEZ...");
                }
            } else if (opcion == 'b') {
                if (!matrizLlena) {
                    System.out.println("Debes rellenar la matriz antes de realizar esta opción.");
                    continue;
                }

                System.out.print("Ingrese el número de fila para calcular la suma: ");
                int fila = sc.nextInt();

                if (fila >= 0 && fila < matriz.length) {
                    int sumaFila = 0;
                    for (int i = 0; i < matriz.length; i++) {
                        sumaFila += matriz[fila][i];
                    }
                    System.out.println("La suma de la fila " + fila + " es: " + sumaFila);
                } else {
                    System.out.println("Fila incorrecta");
                }
            } else if (opcion == 'c') {
                if (!matrizLlena) {
                    System.out.println("Debes rellenar la matriz antes de realizar esta opcion");
                    continue;
                }

                System.out.print("Ingrese el numero de columna para calcular la suma: ");
                int columna = sc.nextInt();

                if (columna >= 0 && columna < matriz.length) {
                    int sumaColumna = 0;
                    for (int[] ints : matriz) {
                        sumaColumna += ints[columna];
                    }
                    System.out.println("La suma de la columna " + columna + " es: " + sumaColumna);
                } else {
                    System.out.println("Columna incorrecta.");
                }
            } else if (opcion == 'd') {
                if (!matrizLlena) {
                    System.out.println("Debes rellenar la matriz antes de realizar esta opción.");
                    continue;
                }

                int sumaDiagonalPrincipal = 0;
                for (int i = 0; i < matriz.length; i++) {
                    sumaDiagonalPrincipal += matriz[i][i];
                }
                System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
            } else if (opcion == 'e') {
                if (!matrizLlena) {
                    System.out.println("Debes rellenar la matriz antes de realizar esta opcion");
                    continue;
                }

                int sumaDiagonalInversa = 0;
                for (int i = 0; i < matriz.length; i++) {
                    sumaDiagonalInversa += matriz[i][matriz.length - 1 - i];
                }
                System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
            } else if (opcion == 'f') {
                if (!matrizLlena) {
                    System.out.println("Se debes rellenar la matriz antes de realizar esta opcion");
                    continue;
                }

                int sumaTotal = 0;
                for (int[] ints : matriz) {
                    for (int j = 0; j < matriz.length; j++) {
                        sumaTotal += ints[j];
                    }
                }
                double media = (double) sumaTotal / (matriz.length * matriz.length);
                System.out.println("La media de todos los valores de la matriz es: " + media);
            } else if (opcion == 'g') {
                System.out.println("Fin del programa");
                break;
            } else {
                System.out.println("Opcion incorrecta");
            }
        }
    }
}
