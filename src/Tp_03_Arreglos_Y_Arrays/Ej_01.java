package Tp_03_Arreglos_Y_Arrays;

public class Ej_01 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int elemento1 = numeros[2]; // Acceso al tercer elemento (indice 2)
        System.out.println("Elemento 1: " + elemento1); // Imprime "Elemento 1: 3"

        int elemento2 = numeros[10]; // Acceso a un indice fuera del tamaño del array
        // La linea anterior lanzara una ArrayIndexOutOfBoundsException en tiempo de ejecucion

        System.out.println("Esto no se imprimira debido a la excepcion.");
    }
}
