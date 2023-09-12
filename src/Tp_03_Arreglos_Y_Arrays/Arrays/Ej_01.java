package Tp_03_Arreglos_Y_Arrays.Arrays;

import java.util.Scanner;

public class Ej_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] paises = new String[4][4];

        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < paises[i].length; j++) {
                paises[i][j] = sc.nextLine();
            }
            System.out.println();
        }

        for (String[] pais : paises) {
            for (String pai : pais) {
                System.out.print(pai + " ");
            }
            System.out.println();
        }
    }
}
