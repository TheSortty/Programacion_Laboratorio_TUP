package Tp_03_Arreglos_Y_Arrays;
public class Ej_10 {
    public static void main(String[] args) {
        int suma = 0;
        int[] arry1 = {5,6,4,2,1};
        int[] arry2 = {2,4,5,1,2,4,6,8,5,3};
        int[] arry3 = new int[10];

        for (int i = 0; i < arry1.length; i++) {
            for (int k : arry2) {
                suma = suma + arry1[i] * k;
            }
            arry3[i]=suma;
        }

        for (int j : arry3) {
            System.out.println(j);
        }
    }
}
