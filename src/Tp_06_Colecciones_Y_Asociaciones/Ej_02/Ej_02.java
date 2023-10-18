package Tp_06_Colecciones_Y_Asociaciones.Ej_02;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> menuPlatos = new ArrayList<Plato>();
        while (true) {
            Plato plato = new Plato();
            System.out.println("Ingrese el nombre del plato: ");
            plato.setNombreCompleto(sc.nextLine());
            System.out.println("Ingrese el precio del plato");
            plato.setPrecio(sc.nextDouble());
            sc.nextLine();
            System.out.println("¿El plato es de tipo bebida? s/n");
            String paraBebida;
            paraBebida = sc.nextLine();
            if (paraBebida.equals("s")) {
                plato.setEsBebida(true);
                System.out.println("¿Desea ingresar otro plato?");
                String otroPlato = sc.nextLine();
                if (otroPlato.equals("n")) break;
                menuPlatos.add(plato);
            } else {
                plato.setEsBebida(false);
                System.out.println("Ingrese cuantos ingredientes tiene su plato(numero)");
                int cantidadIngredientes;
                cantidadIngredientes = sc.nextInt();
                ArrayList<Ingrediente> ingredientes1 = new ArrayList<Ingrediente>();
                int b = 0;
                sc.nextLine();
                for (int i = 0; i < cantidadIngredientes; i++) {
                    Ingrediente ingredientes = new Ingrediente();
                    System.out.println("Ingrese el nombre del ingrediente " + ++b);
                    ingredientes.setNombre(sc.nextLine());
                    System.out.println("Ingrese la cantidad del ingrediente");
                    ingredientes.setCantidad(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Ingrese la unidad de medida");
                    ingredientes.setUnidadDeMedida(sc.nextLine());
                    ingredientes1.add(ingredientes);
                    plato.setIngredientes(ingredientes1);
                }

                menuPlatos.add(plato);
                System.out.println("¿Desea ingresar otro plato?");
                String otroPlato = sc.nextLine();
                if (otroPlato.equals("n")) break;
            }


        }

        System.out.println("-----------MENÚ----------------");
        for (Plato plato : menuPlatos) {
            System.out.println(plato.toString());
            System.out.println("----------------------------------");
        }
    }
}
