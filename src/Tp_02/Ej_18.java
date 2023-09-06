package Tp_02;
import java.util.Calendar;
import java.util.Date;
public class Ej_18 {
    class FuncionesPrograma {
        public static Date getFechaDate(int dia, int mes, int anio) {
            Calendar calendario = Calendar.getInstance();
            calendario.set(anio, mes - 1, dia);
            return calendario.getTime();
        }
    }

    public static class Principal {
        public static void main(String[] args) {
            int dia = 1;
            int mes = 1;
            int anio = 2022;
            Date fecha = FuncionesPrograma.getFechaDate(dia, mes, anio);
            System.out.println(fecha);
        }
    }
}
