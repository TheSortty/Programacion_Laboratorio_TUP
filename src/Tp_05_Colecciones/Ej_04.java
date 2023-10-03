package Tp_05_Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arry1 = new ArrayList<>();

        for (int i = 0; i < 49; i++) {
            int num = (int) (Math.random() * 100 + 1);
            arry1.add(num);
        }

        for (int i = 0; i < 49; i++) {
            System.out.print(" "+arry1.get(i));
        }

        System.out.println(" ");
        System.out.println("Ingrese el numero que quiere buscar");
        int Buscar = sc.nextInt();
        int numero = 0;

        for (int i = 0; i < 49; i++) {
            if (Buscar == arry1.get(i)){
                numero = arry1.get(i);
                System.out.println("El numero fue encontrado en la posicion "+i);
                return;
            }
        }

        System.out.println("El numero no fue encontrado");
    }
}
