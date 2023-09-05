package Tp_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ej_17 {


    public class FuncionesPrograma {
        public static String getFechaString(Date fecha) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            return formato.format(fecha);
        }
    }

    public class Principal {
        public static void main(String[] args) {
            Date fecha = new Date();
            String fechaString = FuncionesPrograma.getFechaString(fecha);
            System.out.println(fechaString);
        }
    }
}