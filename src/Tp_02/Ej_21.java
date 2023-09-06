package Tp_02;
import java.util.Scanner;
public class Ej_21 {
    public class SumaRecursiva {

        public static int sumaRecursiva(int numero) {
            if (numero <= 1) {
                return 1;
            } else {
                return numero + sumaRecursiva(numero - 1);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero entero mayor a cero: ");

            try {
                int numero = scanner.nextInt();
                if (numero <= 0) {
                    System.out.println("El numero debe ser mayor a cero.");
                } else {
                    int resultado = sumaRecursiva(numero);
                    System.out.println("La suma de los numeros naturales desde " + numero + " hasta 1 es: " + resultado);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingrese un numero entero valido.");
            }
        }
    }

}
