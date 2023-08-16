import java.util.Scanner;

public class Ej_13 {
    public static void main(String[] args) {

        Scanner cs = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int Num = cs.nextInt();
        int Suma = 0;
        /*if (Num <= 1) {
            System.out.println("Su numero no es primo.");
        } else if (Num <= 3) {
            System.out.println("Su numero es primo");
        } else if (Num % 2 == 0 || Num % 3 == 0) {
            System.out.println("Su numero no es primo.");
        }
        for (int i = 5; i * i <= Num; i += 6) {
            if (Num % i == 0 || Num % (i + 2) == 0) {
                System.out.println("Su numero no es primo.");
            }
        }
        for (int i = 2; i <= Math.sqrt(Num); i++) {
            if (Num % i == 0) {
                System.out.println("Su numero no es primo.");
            }else{
                System.out.println("Su numero es primo");
            }
        }*/
        for (int i = 1; i < Num; i++) {
            int auxiliar = Num % i;
            if (auxiliar == 0) {
                Suma = Suma + 1;
            }
        }
        if (Suma <= 2) {
            System.out.println("Tu numero es primo");
        } else {
            System.out.println("Tu numero NO es primo");
        }
    }
}