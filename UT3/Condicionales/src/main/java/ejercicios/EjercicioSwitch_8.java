package ejercicios;


import java.util.Scanner;

public class EjercicioSwitch_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra y te diré si es una vocal:");
        char letra = scanner.next().charAt(0);

        if (esVocal(letra)) {
            System.out.println("Es una vocal.");
        } else {
            System.out.println("NO es una vocal.");
        }
    }

    /**
     * Demo de la sentencia switch
     * devuelve true si es vocal / false en otro caso
     */
    public static boolean esVocal(char letra) {
        switch (letra) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }

    }
}
