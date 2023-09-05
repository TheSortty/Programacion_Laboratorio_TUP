package Tp_02;

import java.util.Scanner;

public class Ej_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero decimal: ");
        double valorDecimal = sc.nextDouble();

        // Convertir a short
        short valorShort = (short) valorDecimal;
        System.out.println("Valor en short: " + valorShort);

        // Convertir a int
        int valorInt = (int) valorDecimal;
        System.out.println("Valor en int: " + valorInt);

        // Convertir a long
        long valorLong = (long) valorDecimal;
        System.out.println("Valor en long: " + valorLong);

        // Convertir a String
        String valorString = Double.toString(valorDecimal);
        System.out.println("Valor en String: " + valorString);

        // Convertir a float
        float valorFloat = (float) valorDecimal;
        System.out.println("Valor en float: " + valorFloat);





    }
}
