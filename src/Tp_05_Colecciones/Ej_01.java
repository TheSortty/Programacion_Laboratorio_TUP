package Tp_05_Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arry1 = new ArrayList<>();
        int numero;

        System.out.println("Ingresa los numeros, ingrese un numero menor a 0 para finalizar");

        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                arry1.add(numero);
            }
        } while (numero >= 0);

        System.out.println("Los números ingresados son: " + arry1);
    }
}
