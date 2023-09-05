package Tp_02;

import java.util.Scanner;

public class Ej_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        String subcadena = cadena.substring(3, 5);

        System.out.println(subcadena);
    }
    
}
