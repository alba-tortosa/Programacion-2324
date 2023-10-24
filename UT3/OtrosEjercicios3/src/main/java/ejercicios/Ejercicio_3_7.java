package ejercicios;

import java.util.Scanner;

public class Ejercicio_3_7 {

    /**
     * TODO: Ejercicio 3.7.
     * Clase Ejercicio_3_7:
     * - Declara una variable edad de tipo entero y una variable lógica esAdulto.
     * - Utiliza la librería Scanner para solicitar al usuario su edad utilizando el texto "Ingrese su edad:"
     * - Asigna a la variable esAdulto una expresión booleana que devuelva true si la
     * edad corresponde a una persona mayor de edad
     * - Muestra el resultado por consola precedido del texto: "¿Es mayor de edad? (true/false):"
     * - Declara una variable teclaPulsada de tipo carácter y una variable lógica teclaCorrecta
     * - Utiliza la librería Scanner para solicitar al usuario un carácter utilizando el texto "Ingrese un carácter:"
     * - Asigna a la variable teclaCorrecta el valor de una expresión lógica que se evalúe a true
     * si la tecla pulsada es una ‘S’, una ‘s’, una ‘N’ o una ‘n’.
     * - Muestra el resultado por consola precedido del texto: "¿Es la tecla correcta? (true/false):"
     */
    public static void main(String[] args) {
        //Declara una variable edad de tipo entero y una variable lógica esAdulto.
        int edad;
        boolean esAdulto;
        //Declara una variable teclaPulsada de tipo carácter y una variable lógica teclaCorrecta
        char teclaPulsada;
        boolean  teclaCorrecta;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();

        //Asigna a la variable esAdulto una expresión booleana que devuelva true
        //si la edad corresponde a una persona mayor de edad
        esAdulto = edad >= 18;

        System.out.println("Es adulto, cierto (S/N): " + esAdulto);

        System.out.println("Ingrese un carácter: ");
        teclaPulsada = scanner.next().charAt(0);

        //Asigna a la variable teclaCorrecta el valor de una expresión lógica que se evalúe
        //a true si la tecla pulsada es correcta, es decir, si es una ‘S’ o una ‘s’ o una ‘N’ o una ‘n’.
        teclaCorrecta = teclaPulsada == 'S' || teclaPulsada == 'N' || teclaPulsada == 's' || teclaPulsada == 'n';

        System.out.println("¿Es la tecla correcta? (true/false): " + teclaCorrecta);

    }


}
