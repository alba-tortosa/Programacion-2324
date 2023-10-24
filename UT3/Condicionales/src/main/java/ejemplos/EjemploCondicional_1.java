package ejemplos;

import java.util.Scanner;

/**
 * Esta clase muestra algunos métodos con ejemplos de la sentencia condicional if y switch
 */
public class EjemploCondicional_1 {
    // no incluimos atributos, ni constructor


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un nombre:");
        String nombre = scanner.next();
        System.out.println("Dime una edad:");
        int edad = scanner.nextInt();

        printDescripcion(edad, nombre);
        printDescripcionOtraVersion(edad, nombre);

    }

    /**
     * if con else completo (if anidado)
     */
    public static void printDescripcion(int edad, String nombre) {
        if (edad < 13) {
            System.out.println(nombre + " es un niño");
        } else {
            if (edad < 18) {
                System.out.println(nombre + " es un adolescente ");
            } else {
                System.out.println(nombre + "es un adulto");
            }
        }
    }

    /**
     * if anidado, if ... else if
     */
    public static void printDescripcionOtraVersion(int edad, String nombre) {
        if (edad < 13) {
            System.out.println(nombre + " es un niño");
        } else if (edad < 18) {
            System.out.println(nombre + " es un adolescente ");
        } else {
            System.out.println(nombre + " es un adulto");
        }
    }

}
