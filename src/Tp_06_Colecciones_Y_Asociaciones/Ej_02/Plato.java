package Tp_06_Colecciones_Y_Asociaciones.Ej_02;

import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato() {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = ingredientes;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }


    //public String toString() {
    //    String resultado = nombreCompleto + "\n" + " Precio: " + precio;
    //    if (esBebida==false) {
    //        resultado += "\n" + " Ingredientes: " + ingredientes;
    //    }
    //    return resultado;
    //}
    public String toString() {
        String resultado = nombreCompleto + "\n" + "Precio: $" + precio ;
        if (!esBebida) {
            resultado += "\n" + "Ingredientes: " + "\n" + "Nombre     " + "Cantidad     " + "Unidad de medida ";
            for (Ingrediente i : ingredientes) {
                resultado += "\n" + i.toString();
            }
        }
        return resultado;
    }
}
