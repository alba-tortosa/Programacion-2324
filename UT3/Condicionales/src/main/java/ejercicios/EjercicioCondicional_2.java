package ejercicios;


import java.util.Scanner;

public class EjercicioCondicional_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero positivo o negativo:");
        int numero = scanner.nextInt();

        System.out.println("El valor absoluto es: " + obtenerValorAbsoluto(numero));

    }

    /**
     * Calcula y devuelve el valor absoluto de numero
     */
    public static int obtenerValorAbsoluto(int numero) {
        if (numero >= 0) {
            return numero;
        } else {
            return -numero;
        }

    }

}
