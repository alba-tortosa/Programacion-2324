package ejercicios;


import java.util.Scanner;

public class EjercicioCondicional_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10:");
        int numero = scanner.nextInt();

        System.out.print("El número en letra es: ");
        mostrarNumeroEnLetra(numero);
    }

    /**
     * Muestra como letra el valor de numero
     * Para practicar if ... elseif ....
     */
    public static void mostrarNumeroEnLetra(int numero) {
        if (numero == 1) {
            System.out.println("uno");
        } else if (numero == 2) {
            System.out.println("dos");
        } else if (numero == 3) {
            System.out.println("tres");
        } else if (numero == 4) {
            System.out.println("cuatro");
        } else if (numero == 5) {
            System.out.println("cinco");
        } else if (numero == 6) {
            System.out.println("seis");
        } else if (numero == 7) {
            System.out.println("siete");
        } else if (numero == 8) {
            System.out.println("ocho");
        } else if (numero == 9) {
            System.out.println("nueve");
        } else if (numero == 10) {
            System.out.println("diez");
        } else {
            System.out.println("No has introducido un número del 1 al 10");
        }
    }
}
