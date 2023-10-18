package Tp_06_Colecciones_Y_Asociaciones.Ej_01;

public class Nota {
    String catedra;
    double nota_examen;
    public Nota(String catedra, double nota_examen) {
        this.catedra = catedra;
        this.nota_examen = nota_examen;
    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public double getNota_examen() {
        return nota_examen;
    }

    public void setNota_examen(double nota_examen) {
        this.nota_examen = nota_examen;
    }
}