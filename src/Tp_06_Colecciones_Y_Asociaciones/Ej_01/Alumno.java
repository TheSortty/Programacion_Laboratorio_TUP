package Tp_06_Colecciones_Y_Asociaciones.Ej_01;

import java.util.ArrayList;
public class Alumno {
    String nombre_completo;
    long legajo;
    ArrayList<Nota> notas;
    public Alumno(String nombre_completo, long legajo){
        this.nombre_completo = nombre_completo;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }
    public void agregar_nota(Nota nota){
        this.notas.add(nota);
    }
    public double calcular_promedio(){
        double suma = 0.0;
        for (Nota nota : this.notas) suma = suma + nota.nota_examen;
        return suma / this.notas.size();
    }

}
