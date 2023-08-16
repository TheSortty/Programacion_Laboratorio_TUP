import java.util.Scanner;

public class Ej_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dia;

        do {
            System.out.print("Ingresa un número del 1 al 7 para representar un día de la semana: ");
            Dia = scanner.nextInt();
        } while (Dia < 1 || Dia > 7);

        String Estado;

        switch (Dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Estado = "Laboral";
                break;
            case 6:
            case 7:
                Estado = "No Laboral";
                break;
            default:
                Estado = "Día no válido";
        }

        System.out.println("El día " + Dia + " es un día " + Estado + ".");
    }
}
