package Tp_05_Colecciones;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Ej_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arry1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            arry1.add(sc.nextInt());
        }

        ArrayList<Integer> arry2 = new ArrayList<>();
        ArrayList<Integer> arry3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arry2.add(arry1.get(i));
            arry3.add(arry1.get(i));
        }

        Collections.sort(arry2);
        System.out.println("Los numeros ordenarados de menor a mayor son");
        for (int i = 0; i < 10; i++) {
            System.out.println(arry2.get(i));
        }

        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(arry3, comparador);
        System.out.println("Los numeros ordenarados de mayor a menor son: ");

        for (int i = 0; i < 10; i++) {
            System.out.println(arry3.get(i));
        }
    }
}
