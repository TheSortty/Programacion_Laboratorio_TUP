package Tp_03_Arreglos_Y_Arrays;
import java.util.Scanner;
public class Ej_02 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero para la posicion " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los valores ingresados son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
    }
}
