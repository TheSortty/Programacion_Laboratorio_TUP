package TP_07.Parte_2;

import java.util.HashSet;

public class Computadora {
    String marca;
    String modelo;
    HashSet<componenteCPU> componentes;
    public Computadora(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.componentes = new HashSet<>();
    }
    public void añadirComponente(componenteCPU componente){
        this.componentes.add(componente);
    }
}
