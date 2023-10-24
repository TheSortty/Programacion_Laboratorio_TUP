package TP_07;

import java.util.HashMap;
import java.util.Scanner;

public class Ej_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        while (true) {
            System.out.println("Eliga una opcion");
            System.out.println("1- Cargar Datos en la Agenda\n" +
                    "2- Buscar Teléfono por Nombre\n" +
                    "3- Listar Agenda");
            int opcion = sc.nextInt();
            sc.nextLine();
            while (true) {
                if (opcion == 1) {
                    System.out.println("Ingrese el nombre del contacto");
                    String contacto = sc.nextLine();
                    System.out.println("Ingrese el numero de " + contacto);
                    long numeroTelefono = sc.nextLong();
                    agenda.put(contacto, numeroTelefono);
                    sc.nextLine();
                    System.out.println("¿Desea ingresar otro contacto?");
                    String condicionWhileContacto = sc.nextLine();
                    condicionWhileContacto = condicionWhileContacto.toLowerCase();
                    if (condicionWhileContacto.equals("no")) break;

                } else if (opcion == 3) {
                    System.out.println(agenda);
                    break;

                } else if (opcion == 2) {
                    System.out.println("Ingrese el nombre del contacto a buscar");
                    String contactoBusqueda = sc.nextLine();
                    boolean condicionBusqueda = agenda.containsKey(contactoBusqueda);
                    if (condicionBusqueda){
                        System.out.println("El contacto fue" +
                                " encontrado este es su numero " + agenda.get(contactoBusqueda));
                    }else{
                        System.out.println("El nombre no esta resgistrado");
                    }
                    break;
                }
            }
        }
    }

}

