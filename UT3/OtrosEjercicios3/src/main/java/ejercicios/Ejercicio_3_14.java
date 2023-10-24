package ejercicios;

import classes.Persona;

/**
 * TODO: Ejercicio 3.14.
 * Clase Persona:
 * - Examina la clase y sus atributos
 * - Escribe un método saludar() que muestre en pantalla el mensaje “Hola, me llamo
 * XXXX y tengo XXXX años”
 * - Escribe el accesor getEdad
 * - Escribe un metodo getEdadDentrode3Anyos
 * - Escribe un metodo sumaEdad que modifique el atributo edad añadiéndole el número de años que se proporcione como
 * parámetro
 * Clase Ejercicio_3_14:
 * - Crea varios objetos de tipo Persona y comprueba que los métodos creados funcionan
 */
public class Ejercicio_3_14 {


    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 2);
        persona.saludar();
        System.out.println("Dentro de 3 años tendré: " + persona.getEdadDentroDe3Anyos());
        System.out.println("Suma 5 años a mi edad");
        persona.sumaEdad(5);
        System.out.println("La edad que tengo es " + persona.getEdad());
    }
}
