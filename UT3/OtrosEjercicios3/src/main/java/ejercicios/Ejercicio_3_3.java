package ejercicios;

import classes.Mascota;

/**
 * TODO: Ejercicio 3.3.
 * Clase Mascota:
 * - Examina la clase y sus atributos.
 * - Implementa el constructor con una sentencia de asignación que inicialice el atributo con el valor proporcionado.
 * Clase Ejercicio_3_3:
 * - Crea varios objetos de tipo Mascota y muestra su nombre por consola
 */
public class Ejercicio_3_3 {

        public static void main(String[] args) {
            Mascota mascota = new Mascota("Toby");
            System.out.println(mascota.getNombre());
        }
}
