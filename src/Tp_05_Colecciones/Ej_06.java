package Tp_05_Colecciones;
import java.util.ArrayList;
import java.util.Scanner;

class Celda {
    int fila;
    int columna;
    String valor;
    Celda(int fila, int columna, String valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
    }
}
class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<>();
    void agregarCelda(int fila, int columna, String valor) {
        Celda celda = new Celda(fila, columna, valor);
        matrizCuadrada.add(celda);
    }
    void mostrarMatriz() {

        for (Celda c : matrizCuadrada) {
            System.out.println("Fila: " + c.fila + ", Columna: " + c.columna + ", Valor: " + c.valor);
        }
    }
}

public class Ej_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz();

        while(true) {
            System.out.println("Ingrese el valor para la celda");
            String valor = sc.nextLine();
            if (valor.equals("FIN")) break;

            System.out.println("Ingrese la fila ");
            int fila = sc.nextInt();

            System.out.println("Ingrese la columna ");
            int columna = sc.nextInt();

            sc.nextLine();

            matriz.agregarCelda(fila, columna, valor);
        }

        matriz.mostrarMatriz();
    }
}
