package Tp_02;
public class Ej_02 {
    public static void main(String[] args){
        //Si asignamos un valor a un variable que esta fuera de su rango se produce un desbordamiento (Overflow).
        int MaxInt = Integer.MAX_VALUE;
        System.out.println("Valor maximo de int: " + MaxInt);
        //He aqui un ejemplo:
        int Overflow = MaxInt + 1;
        System.out.println("Desbordamiento de int: " + Overflow);
        //Puede ser arreglado usando un dato mas grande, como LONG
        long LargeValue = (long) MaxInt + 1;
        System.out.println("Valor correcto usando long: " + LargeValue);
    }
}
