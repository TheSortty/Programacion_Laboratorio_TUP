package Tp_02;

public class Ej_09 {
    public static void main(String[] args) {
        String cadena = "La lluvia en Mendoza es escasa";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            System.out.print((int) caracter + " ");
        }
    }
}
