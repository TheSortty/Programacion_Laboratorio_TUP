package Tp_05_Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arry1 = new ArrayList<>();
        System.out.println("Ingrese los numeros del arreglo maximo 20 ");

        for (int i = 0; i < 20; i++) {
            arry1.add(sc.nextInt());
        }

        int numMay = arry1.get(0);
        int numMen = arry1.get(0);
        for (int i = 0; i < 20; i++) {
            if (numMay < arry1.get(i)){
                numMay = arry1.get(i);
            }
        }

        for (int i = 0; i < 20; i++) {
            if (numMen > arry1.get(i)){
                numMen = arry1.get(i);
            }
        }

        System.out.println("El numero mayor es "+numMay);
        System.out.println("EL numero menor es "+numMen);

        int dif = numMay - numMen;
        System.out.println("La diferencia entre el mayor y el menor es "+dif);
    }
}
