package Tp_02;

import java.util.Scanner;

public class Ej_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero de 3 dígitos (100-999): ");
        int Num = sc.nextInt();

        // Verificar que el numero este en el rango correcto
        if (Num < 100 || Num > 999) {
            System.out.println("El numero ingresado no está en el rango correcto.");
            return;
        }

        // Calcular la suma de los digitos
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += Num % 10;
            Num /= 10;
        }

        System.out.println("La suma de los digitos es: " + suma);
    }



}
