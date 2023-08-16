package Ejercicios;

public class Ej_09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i==1){
                System.out.println(i);
            }else if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
            }else if (i==100){
                System.out.println(i);
            }
        }
    }
}
