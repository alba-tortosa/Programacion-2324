package ejercicios;


import java.util.Scanner;

public class EjercicioCondicional_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número de personas:");
        int numPersonas = scanner.nextInt();
        System.out.println("Dime un número de caramelos:");
        int numCaramelos = scanner.nextInt();

        repartirCaramelos(numPersonas, numCaramelos);
    }

    /**
     * Mostrar, en cada caso, el mensaje que corresponda de los tres siguientes:
     * " No hay caramelos para todos"
     * " A cada persona le tocan XX caramelos"
     * " A cada persona le tocan XX caramelos y sobran xx caramelos"
     */
    public static void repartirCaramelos(int personas, int caramelos) {
        int reparto = caramelos / personas;
        int sobra = caramelos%personas;
        if (reparto == 0) {
            System.out.println("No hay caramelos para todos");
        } else if (sobra == 0) {
            System.out.println("A cada persona le tocan " + reparto + " caramelos");
        } else {
            System.out.println("A cada persona le tocan " + reparto + " caramelos y sobran "
                    + sobra + " caramelos");
        }


    }
}
