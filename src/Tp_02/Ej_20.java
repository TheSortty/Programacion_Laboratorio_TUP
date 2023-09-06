package Tp_02;
import java.util.Scanner;
public class Ej_20 {

    static class Fraccion {
        private int numerador;
        private int denominador;

        public Fraccion(int numerador, int denominador) {
            this.numerador = numerador;
            if (denominador != 0) {
                this.denominador = denominador;
            } else {
                throw new IllegalArgumentException("El denominador no puede ser cero.");
            }
        }

        public Fraccion sumarFracciones(Fraccion f1, Fraccion f2) {
            int nuevoNumerador = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
            int nuevoDenominador = f1.denominador * f2.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        public Fraccion restarFracciones(Fraccion f1, Fraccion f2) {
            int nuevoNumerador = f1.numerador * f2.denominador - f2.numerador * f1.denominador;
            int nuevoDenominador = f1.denominador * f2.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        public Fraccion multiplicarFracciones(Fraccion f1, Fraccion f2) {
            int nuevoNumerador = f1.numerador * f2.numerador;
            int nuevoDenominador = f1.denominador * f2.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        public Fraccion dividirFracciones(Fraccion f1, Fraccion f2) {
            if (f2.numerador == 0) {
                throw new IllegalArgumentException("No se puede dividir por cero.");
            }
            int nuevoNumerador = f1.numerador * f2.denominador;
            int nuevoDenominador = f1.denominador * f2.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }

        public String toString() {
            return numerador + "/" + denominador;
        }
    }

    public static class OperacionesFraccion {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el numerador de la primera fraccion:");
            int numerador1 = scanner.nextInt();
            System.out.println("Ingrese el denominador de la primera fraccion (distinto de cero):");
            int denominador1 = scanner.nextInt();

            System.out.println("Ingrese el numerador de la segunda fraccion:");
            int numerador2 = scanner.nextInt();
            System.out.println("Ingrese el denominador de la segunda fraccion (distinto de cero):");
            int denominador2 = scanner.nextInt();

            Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
            Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

            Fraccion suma = fraccion1.sumarFracciones(fraccion1, fraccion2);
            Fraccion resta = fraccion1.restarFracciones(fraccion1, fraccion2);
            Fraccion multiplicacion = fraccion1.multiplicarFracciones(fraccion1, fraccion2);

            try {
                Fraccion division = fraccion1.dividirFracciones(fraccion1, fraccion2);
                System.out.println("Suma: " + suma);
                System.out.println("Resta: " + resta);
                System.out.println("Multiplicacion: " + multiplicacion);
                System.out.println("Division: " + division);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            scanner.close();
        }
    }

}
