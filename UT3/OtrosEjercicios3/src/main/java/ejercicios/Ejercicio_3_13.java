package ejercicios;

import classes.MaquinaExpendedora;

/**
 * TODO: Ejercicio 3.13.
 * Clase MaquinaExpededora:
 * - Añade un método llamado mostrarPrecio(). El método no tiene parámetros, no devuelve
 * nada y escribe en pantalla: “El precio total del ticket es XXXX cents.” donde XXXX será el valor del atributo precio.
 * Clase Ejercicio_3_13:
 * - Crea un objeto de la clase MaquinaExpendedora y utiliza los métodos mostrarPrecio() y getPrecio() para mostrar la
 * misma información.
 */
public class Ejercicio_3_13 {


    public static void main(String[] args) {
        MaquinaExpendedora maquinaExpendedora1 = new MaquinaExpendedora(20);
        maquinaExpendedora1.mostrarPrecio();
        System.out.println("El precio total del ticket es " + maquinaExpendedora1.getPrecio() + " cents.");

    }

}
