package Tp_02;

public class Ej_19 {
    static class OperacionMatematica {
        private double valor1;
        private double valor2;
        private String operacion;

        public double getValor1() {
            return valor1;
        }

        public void setValor1(double valor1) {
            this.valor1 = valor1;
        }

        public double getValor2() {
            return valor2;
        }

        public void setValor2(double valor2) {
            this.valor2 = valor2;
        }

        public String getOperacion() {
            return operacion;
        }

        public void setOperacion(String operacion) {
            this.operacion = operacion;
        }

        private double sumarNumeros() {
            return valor1 + valor2;
        }

        private double restarNumeros() {
            return valor1 - valor2;
        }

        private double multiplicarNumeros() {
            return valor1 * valor2;
        }

        private double dividirNumeros() {
            if (valor2 == 0) {
                System.out.println("No se puede dividir por cero.");
                return Double.NaN;
            }
            return valor1 / valor2;
        }

        public double aplicarOperacion(String operacion) {
            this.operacion = operacion;
            double resultado = 0.0;

            switch (operacion) {
                case "+":
                    resultado = sumarNumeros();
                    break;
                case "-":
                    resultado = restarNumeros();
                    break;
                case "*":
                    resultado = multiplicarNumeros();
                    break;
                case "/":
                    resultado = dividirNumeros();
                    break;
                default:
                    System.out.println("Operación no válida.");
                    break;
            }

            return resultado;
        }
    }

    public static class Calculo {
        public static void main(String[] args) {
            OperacionMatematica operacion = new OperacionMatematica();

            operacion.setValor1(10.0);
            operacion.setValor2(5.0);

            String[] operaciones = {"+", "-", "*", "/"};

            for (String op : operaciones) {
                double resultado = operacion.aplicarOperacion(op);
                System.out.println("Resultado de " + operacion.getValor1() + " " + op + " " + operacion.getValor2() + " = " + resultado);
            }
        }
    }

}
