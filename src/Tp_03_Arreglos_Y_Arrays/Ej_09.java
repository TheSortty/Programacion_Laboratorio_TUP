package Tp_03_Arreglos_Y_Arrays;

import java.util.Scanner;

public class Ej_09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese un dni");
        int dni = sc.nextInt();

        String letra = obtenerLetra(dni);
        System.out.println("el dni es:" + dni+letra);
    }
    public static String obtenerLetra(int dni){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int result = dni%23;
        return letras[result];
    }
}
