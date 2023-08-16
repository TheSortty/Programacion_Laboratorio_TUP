package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej_01 {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);

        System.out.println("Introduzca su nombre");

        String Nombre = cs.nextLine();

        System.out.println("Bienvenido " + Nombre);

    }
}
