package ejercicios;

import classes.Puntuacion;

public class Ejercicio_3_11_y_3_12 {

    /**
     * TODO: Ejercicio 3.11.
     * Clase Puntuacion:
     * - Completa el cuerpo del método incrementar e indica si es un mutador o un accesor.
     * - El método debe incrementar el atributo puntuación en la cantidad de puntos dados
     * Clase Ejercicio_3_11_y_3_12:
     * - Comprueba que el nuevo método funciona correctamente
     */

    /**
     * TODO: Ejercicio 3.12.
     * Clase Puntuacion:
     * - Completa el cuerpo del método reduce.
     * - El método reduce el atributo total en la cantidad dada
     * Clase Ejercicio_3_11_y_3_12:
     * - Comprueba que el nuevo método funciona correctamente
     */


    public static void main(String[] args) {
        Puntuacion puntuacion = new Puntuacion();
        puntuacion.incrementar(10);
        System.out.println(puntuacion.getPuntos());
        puntuacion.descontar(5);
        System.out.println(puntuacion.getPuntos());
    }

}
