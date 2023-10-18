package Tp_06_Colecciones_Y_Asociaciones.Ej_01;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String salida_while;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        while (true) {
            System.out.println("Ingrese los nombres de sus alumnos y sus legajos ");
            Alumno alumnos1 = new Alumno(sc.nextLine(), sc.nextLong());
            sc.nextLine();
            System.out.println("¿Cuantas catedras tiene su alumno? ");
            int catedras = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < catedras-1; i++) {
                System.out.println("Ingrese la materia y nota de su alumno");
                alumnos1.agregar_nota(new Nota(sc.nextLine(), sc.nextDouble()));
                sc.nextLine();

                System.out.println("Si termino de ingresar las notas ingrese si, sino ingrese no");
                String salida_for = sc.nextLine();
                salida_for = salida_for.toLowerCase();
                if (salida_for.equals("si")) break;
            }
            alumnos.add(alumnos1);
            System.out.println("Si usted termino de ingresar a sus alumnos ingrese " +
                    "'si', si desea continuar ingrese cualquier tecla");
            salida_while = sc.nextLine();
            salida_while = salida_while.toLowerCase();
            if (salida_while.equals("si")) break;
        }
        for (Alumno Alumno : alumnos) {
            System.out.println("Nombre: " + Alumno.nombre_completo);
            System.out.println("Legajo: " + Alumno.legajo);
            System.out.println("Promedio de notas: " + Alumno.calcular_promedio());
            System.out.println();
        }
    }
}
