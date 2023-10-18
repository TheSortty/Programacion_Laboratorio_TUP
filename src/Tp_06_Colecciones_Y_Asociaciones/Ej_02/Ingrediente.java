package Tp_06_Colecciones_Y_Asociaciones.Ej_02;
public class Ingrediente {
    String nombre;
    double cantidad;
    String unidadDeMedida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    //public String toString() {
    //    return "\n " + nombre + "\n" + " Cantidad: " + cantidad + "\n" + " Unidad de medida: " + unidadDeMedida + "\n" + "-------------";
    //}
    public String toString() {
        return nombre + " " + cantidad + " " + unidadDeMedida;
    }
}
