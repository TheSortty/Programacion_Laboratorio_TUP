package Tp_02;
import java.util.Scanner;
public class Ej_22 {

    public class SumaDigitosRecursiva {

        public static int sumaDigitosRecursiva(int numero) {
            if (numero < 10) {
                return numero;
            } else {
                int ultimoDigito = numero % 10;
                int numeroSinUltimoDigito = numero / 10;
                return ultimoDigito + sumaDigitosRecursiva(numeroSinUltimoDigito);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero entero: ");

            try {
                int numero = scanner.nextInt();
                int resultado = sumaDigitosRecursiva(numero);
                System.out.println("La suma de los digitos del numero ingresado es: " + resultado);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, ingrese un numero entero valido.");
            }
        }
    }
}
