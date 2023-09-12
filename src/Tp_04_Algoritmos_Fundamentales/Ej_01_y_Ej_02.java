package Tp_04_Algoritmos_Fundamentales;

import java.util.Arrays;
import java.util.Scanner;
/*Respuestas
          Ordenamiento por Inserción: Es una manera muy natural de ordenar para un ser humano y
y puede usarse facilmente para ordenar de forma arbitraria.
          Algoritmo de la burbuja: El método de ordenamiento burbuja consiste en comparar cada elemento de la estructura
con el siguiente e intercambiándolos si corresponde. El proceso se repite hasta que
la estructura esté ordenada. El orden se establece de acuerdo a la clave y la estructura
tiene que tener acceso directo a sus componentes
          Ordenamiento por selección: El ordenamiento por selección mejora el ordenamiento burbuja haciendo un sólo
intercambio por cada pasada a través de la lista. Para hacer esto, un ordenamiento por selección busca
el valor mayor a medida que hace una pasada y, después de completar la pasada, lo pone en
la ubicación correcta.
          Quick-short: consiste en acomodar un elemento llamado Pivot en su posición
definitiva, luego ordenar los elementos menores al Pivot y a continuación ordenar los
elementos mayores al Pivot.
          Busqueda secuencial: Ésta comprueba secuencialmente cada elemento de la lista para el valor
objetivo hasta que es encontrado o hasta que todos los elementos hayan sido comparados.
          Busqueda binaria: Es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos.
Funciona al dividir repetidamente a la mitad la porción de la lista que podría contener al elemento, hasta
reducir las ubicaciones posibles a solo una.
          Recorrido de Profundidad: es un algoritmo que permite recorrer todos los nodos de un grafo.
Es una generalización del recorrido preorden de un árbol.
           Recorrido de anchura: es un algoritmo de búsqueda para lo cual recorre los nodos de un grafo, comenzando en la raíz
(eligiendo algún nodo como elemento raíz en el caso de un grafo), para luego explorar todos los vecinos
de este nodo.*/
public class Ej_01_y_Ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ordenamiento por inserción ");
        int[] arry1 = {5, 3, 4, 6, 7, 8, 1, 9, 2, 10, 14, 13, 12, 11, 15};
        Arrays.sort(arry1);
        for (int value : arry1) {
            System.out.print(" " + value);
        }
        System.out.println(" ");
        System.out.print("Algoritmo de la burbuja ");
        int[] arry2 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        for (int i = 0; i < arry2.length - 1; i++) {
            for (int j = 0; j < arry2.length - 1; j++) {
                if (arry2[j] > arry2[j + 1]) {
                    int aux = arry2[j];
                    arry2[j] = arry2[j + 1];
                    arry2[j + 1] = aux;
                }


            }

        }
        System.out.println(" ");
        for (int k : arry2) {
            System.out.print(" " + k);
        }
        System.out.println(" ");
        System.out.print("Ordenamiento por selección ");
        int[] arry3 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        for (int i = 1; i < arry3.length; i++) {
            int aux = arry3[i];
            int j = i - 1;
            while ((j >= 0) && (aux < arry3[j])) {
                arry3[j + 1] = arry3[j];
                j--;
            }
            arry3[j + 1] = aux;
        }
        System.out.println(" ");
        for (int j : arry3) {
            System.out.print(" " + j);
        }
        System.out.println(" ");
        System.out.println("Búsqueda secuencial");
        int[] arry4 = {9, 7, 5, 4, 2, 1, 8, 6, 3, 15, 13, 14, 11, 12, 10};
        System.out.println("Ingrese un numero para buscarlo en el array");
        int numingresado = sc.nextInt();
        boolean encontro=false;
        for (int j : arry4) {
            if (numingresado == j) {

                encontro = true;
                break;
            }
        }

        if (encontro){
            System.out.println("El numero fue encontrado");
        }else{
            System.out.println("El numero no se encuntra en la lista");
        }

    }
}
