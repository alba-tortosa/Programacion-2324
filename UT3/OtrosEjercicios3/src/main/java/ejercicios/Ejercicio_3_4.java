package ejercicios;

import classes.MaquinaExpendedora;
import classes.MaquinaExpendedora2;

/**
 * TODO: Ejercicio 3.4.
 * Clase MaquinaExpendedora2:
 * - Examina el constructor.
 * - ¿Qué hay diferente en relación al constructor de la clase MaquinaExpendedora?
 * Clase Ejercicio_3_4:
 * - Crea un objeto de la clase MaquinaExpendedora2 y muestra el valor del atributo precio.
 * - ¿Qué ha ocurrido?
 */
public class Ejercicio_3_4 {


    public static void main(String[] args) {
        MaquinaExpendedora2 maquinaExpendedora1 = new MaquinaExpendedora2(20);
        System.out.println(maquinaExpendedora1.getPrecio());
        MaquinaExpendedora2 maquinaExpendedora2 = new MaquinaExpendedora2(50);
        System.out.println(maquinaExpendedora2.getPrecio());
    }
}
