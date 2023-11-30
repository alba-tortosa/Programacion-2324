import java.util.Random;
import java.util.Scanner;

public class Util {

    public static int generarAleatorio(int minimo, int maximo) {
        Random r = new Random();
        return r.nextInt(minimo, maximo+1);
    }

    public static char leerTecla() {
        Scanner scanner = new Scanner(System.in);
        char letra = scanner.next().charAt(0);
        scanner.nextLine();
        return letra;
    }

    public static void continuar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pulse una tecla para continuar...");
        scanner.nextLine();
    }


}
