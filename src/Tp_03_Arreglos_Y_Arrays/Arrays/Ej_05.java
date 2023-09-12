package Tp_03_Arreglos_Y_Arrays.Arrays;

import java.util.Scanner;

public class Ej_05 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String[][] maquina = {{"caramelo","100","10"},{"mogul", "50", "5"}, {"chicle","150","10"}, {"kiktat","200","2"}};
        int ventas = 0;

        while(true){
            System.out.println("seleccione una opcion");
            System.out.println("1.Pedir golosina");
            System.out.println("2.Mostrar golosinas");
            System.out.println("3.Rellenar maquina");
            System.out.println("4.Apagar maquina");
            int opcion = sc.nextInt();

            if (opcion == 1){

                System.out.println("ingrese la posicion de la golosina");
                int posicion = sc.nextInt();

                System.out.println("ingrese la cantidad para llevar");

                int cantidadLlevar = sc.nextInt();
                int cantidadMaquina = Integer.parseInt(maquina[posicion-1][2]);

                if((cantidadMaquina-cantidadLlevar) >= 0){
                    System.out.println("aqui estan tus:" + cantidadLlevar + "golosinas");
                    maquina[posicion-1][2] = String.valueOf(cantidadMaquina-cantidadLlevar);
                    ventas = ventas + (Integer.parseInt(maquina[posicion-1][1])*cantidadLlevar);
                }else{
                    System.out.println("no hay cantidad disponible");
                }
            }

            if(opcion == 2){
                for (int i = 0; i < 4 ; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(maquina[i][j] +" ");
                    }
                    System.out.println();
                }
            }

            if (opcion == 3){
                System.out.println("ingrese la contraseña");
                String Password = sc.nextLine();

                if (Password.equals("AdminXYZ")){
                    System.out.println("ingrese la posicion de la golosina a llenar");
                    int posicion = sc.nextInt();

                    System.out.println("Cantidad a recargar");
                    int cantidadRecargar = sc.nextInt();

                    maquina[posicion-1][2] = String.valueOf(Integer.parseInt(maquina[posicion-1][2])+ cantidadRecargar);
                }else{
                    System.out.println("contraseña incorrecta");
                }
            }

            if (opcion == 4){
                System.out.println("apagando maquina");
                break;
            }
        }
        System.out.println("la cantidad de ventas fue de:" + ventas);
    }
}
