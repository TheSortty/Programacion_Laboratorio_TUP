package Tp_03_Arreglos_Y_Arrays;

import java.util.Random;

public class Ej_05 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[20];

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) * 2 + 2;
            suma = suma + numeros[i];
        }

        int promedio = suma/numeros.length;
        int iguales = 0;
        int mayor = 0;
        int menor = 0;
        for (int numero : numeros) {
            if (numero == promedio){
                iguales++;
            }
            if (promedio < numero){
                mayor++;
            }
            if (promedio > numero ){
                menor++;
            }
        }

        System.out.println("promedio: "+promedio);
        System.out.println("iguales: "+iguales);
        System.out.println("mayor: "+mayor);
        System.out.println("menor: "+menor);

    }
}
