package Tp_05_Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arry1 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 100 + 1);
            arry1.add(num);
        }

        System.out.println("Este es el array");

        for (int i = 0; i < 20; i++) {
            System.out.println(arry1.get(i));
        }

        int promedio = 0;
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            suma = suma + arry1.get(i);
        }
        promedio = suma / arry1.size();

        System.out.println("Este es el promedio");
        System.out.println(promedio);

        int numPromedio = 0;
        for (int i = 0; i < 20; i++) {
            if (arry1.get(i) == promedio){
                numPromedio++;
            }
        }
        System.out.println("La cantidad de numeros que son iguales al promedio es "+numPromedio);

        int mayPromedio = 0;
        int menPromedio = 0;
        for (int i = 0; i < 20; i++) {
            if (arry1.get(i)>promedio){
                mayPromedio++;
            }
            else{
                menPromedio++;
            }
        }

        System.out.println("La cantidad de numeros mayor al promedio son "+mayPromedio);
        System.out.println("La cantidad de numeros menor al promedio son "+menPromedio);
    }
}
