package ejercicios;


import java.util.Scanner;

public class EjercicioCondicional_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        int numero = scanner.nextInt();

        if (esSieteUltimaCifra(numero)) {
            System.out.println("La última cifra del número es un 7.");
        } else  {
            System.out.println("La última cifra del número NO es un 7.");
        }

    }

    /**
     * Devuelve true si la última cifra de numero es 7
     */
    public static boolean esSieteUltimaCifra(int numero) {
        int resto = numero % 10;
        if (resto == 7) return true;
        else return false;

    }
}
