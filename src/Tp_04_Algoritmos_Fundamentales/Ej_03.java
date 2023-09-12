package Tp_04_Algoritmos_Fundamentales;

import java.util.Arrays;
import java.util.Scanner;

public class Ej_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Ordenar;
        while (true) {
            System.out.println("Ingrese asc o desc");
            Ordenar = sc.next();
            Ordenar = Ordenar.toLowerCase();
            if (Ordenar.equals("asc") || Ordenar.equals("desc")) {
                break;
            }
        }
        System.out.println("Ordenamiento por inserción ");
        int[] arry1 = {5, 3, 4, 6, 7, 8, 1, 9, 2, 10, 14, 13, 12, 11, 15};
        Arrays.sort(arry1);
        if (Ordenar.equals("asc")) {
            for (int j : arry1) {
                System.out.print(" " + j);
            }
        }
        if (Ordenar.equals("desc")) {
            for (int j = arry1.length - 1; j >= 0; j--) {
                System.out.print(" " + arry1[j]);
            }
        }
        System.out.println(" ");
        System.out.print("Algoritmo de la burbuja ");
        int[] arry2 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        if (Ordenar.equals("asc")) {
            for (int i = 0; i < arry2.length - 1; i++) {
                for (int j = 0; j < arry2.length - 1; j++) {
                    if (arry2[j] > arry2[j + 1]) {
                        int aux = arry2[j];
                        arry2[j] = arry2[j + 1];
                        arry2[j + 1] = aux;
                    }
                }
            }
        }
        if (Ordenar.equals("desc")) {
            for (int i = 0; i < arry2.length - 1; i++) {
                for (int j = 0; j < arry2.length - 1; j++) {
                    if (arry2[j] < arry2[j + 1]) {
                        int aux = arry2[j];
                        arry2[j] = arry2[j + 1];
                        arry2[j + 1] = aux;
                    }


                }
            }
        }
        System.out.println(" ");
        for (int k : arry2) {
            System.out.print(" " + k);
        }
        System.out.println(" ");
        System.out.print("Ordenamiento por selección ");
        int[] arry3 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        if (Ordenar.equals("asc")){
            for (int i = 1; i < arry3.length; i++) {
                int aux = arry3[i];
                int j = i - 1;
                while ((j >= 0) && (aux < arry3[j])) {
                    arry3[j + 1] = arry3[j];
                    j--;
                }
                arry3[j + 1] = aux;
            }
        }
        if (Ordenar.equals("desc")){
            for (int i = 1; i < arry3.length; i++) {
                int aux = arry3[i];
                int j = i - 1;
                while ((j >= 0) && (aux > arry3[j])) {
                    arry3[j + 1] = arry3[j];
                    j--;
                }
                arry3[j + 1] = aux;
            }
        }
        System.out.println(" ");
        for (int j : arry3) {
            System.out.print(" " + j);
        }


    }
}
