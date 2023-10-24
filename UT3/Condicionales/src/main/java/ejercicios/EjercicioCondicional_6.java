package ejercicios;


import java.util.Scanner;

public class EjercicioCondicional_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        int numero = scanner.nextInt();

        System.out.print("El número modificado es: ");
        mostrarNumero(numero);
    }

    /**
     * Si numero es positivo se decrementa su valor, se multiplica por 2 y se escribe
     * Si es negativo se incrementa, se divide entre 2 y se escribe también
     */
    public static void mostrarNumero(int numero) {
        if (numero > 0) {
            numero = (numero - 1) * 2;
        } else if (numero < 0) {
            numero = (numero + 1) / 2;
        }
        System.out.println(numero);
    }
}
