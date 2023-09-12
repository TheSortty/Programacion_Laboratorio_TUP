package Tp_03_Arreglos_Y_Arrays;

public class Ej_08 {
    public static void main(String[] args){
        String numeros = "45-9-8-6-45-23-21-74-96-32-45-25";
        int suma = 0;

        String[] arry = numeros.split("-");

        for (String s : arry) {
            int num = Integer.parseInt(s);
            suma = suma + num;
        }

        int promedio = suma / arry.length;
        System.out.println(promedio+" "+suma);
    }
}
