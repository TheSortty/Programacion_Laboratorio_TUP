package Tp_02;
import java.util.Scanner;
public class Ej_23 {
    public class InvertirCadenaRecursiva {

        public static String invertirCadenaRecursiva(String cadena) {
            if (cadena.isEmpty()) {
                return cadena;
            } else {
                char ultimoCaracter = cadena.charAt(cadena.length() - 1);
                String cadenaSinUltimoCaracter = cadena.substring(0, cadena.length() - 1);
                return ultimoCaracter + invertirCadenaRecursiva(cadenaSinUltimoCaracter);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese una cadena: ");

            String cadena = scanner.nextLine();
            String cadenaInvertida = invertirCadenaRecursiva(cadena);

            System.out.println("Cadena invertida: " + cadenaInvertida);
        }
    }
}
