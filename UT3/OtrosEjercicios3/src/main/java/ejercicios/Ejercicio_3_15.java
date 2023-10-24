package ejercicios;

import classes.Intercambio;

/**
 * TODO: Ejercicio 3.15.
 * Clase Intercambio:
 * - Define dos atributos de tipo entero, a y b.
 * Incluye el constructor de la clase que tendrá dos parámetros, los que van a permitir inicializar los atributos.
 * - Añade un método intercambiar() cuya responsabilidad será intercambiar el valor de los dos atributos (deberás
 * utilizar una
 * variable local para efectuar el intercambio).
 * - Añade un método escribir() que permita visualizar en pantalla el estado de un objeto de la clase Intercambio de
 * la forma:
 *     Atributo a = XXX
 *     Atributo b = XXX
 * - Añade dos métodos más, promptAntes() que visualiza la cadena “Antes del intercambio” y promptDespues() que
 * visualiza la cadena “Después del intercambio “.
 * - Incluye comentarios aclaratorios en los métodos y en el constructor.
 * Clase Ejercicio_3_15:
 * Crea un objeto de tipo Intercambio y llama en el orden adecuado a los métodos de forma que obtengan en la ventana
 * del terminal lo que se muestra en la imagen de la teoría
 */
public class Ejercicio_3_15 {


    public static void main(String[] args) {
        Intercambio ejemplo = new Intercambio(12, 33);
        ejemplo.promtAntes();
        ejemplo.intercambiar();
        ejemplo.promtDespues();
    }

}
