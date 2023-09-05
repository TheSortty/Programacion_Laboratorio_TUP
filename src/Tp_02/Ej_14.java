package Tp_02;

public class Ej_14 {
    public static void main(String[] args) {

        // Declaracion de una variable de tipo primitivo int
        int a = 10;
        // Declaracion de una variable de tipo Integer (clase envolvente)
        Integer b = 10;

        // Impresion del valor de la variable a
        System.out.println(a); // Imprime 10
        // Impresion del valor del objeto Integer al que hace referencia la variable b
        System.out.println(b); // Imprime 10

        //Las clases envolventes como Integer pueden ser null, mientras que los tipos primitivos como int no pueden serlo
        // Asignacion de 'null' a la variable b
        b = null;
        // Impresion del valor de la variable b
        System.out.println(b); // Imprime null.

    }
}
