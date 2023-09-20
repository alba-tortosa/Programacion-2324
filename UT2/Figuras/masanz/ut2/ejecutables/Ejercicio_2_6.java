package masanz.ut2.ejecutables;

import masanz.ut2.clases.Circulo;

/**
 * Ejercicio 2.6
 *  - Crea un círculo e inspecciona su estado en modo Debug.
 *  - Cambia el estado del círculo con algún método.
 *  - Observa cómo han cambiado sus atributos en modo Debug.
 */
public class Ejercicio_2_6 {


    public static void main(String[] args)  {

        Circulo circulo = new Circulo();

        //Punto de interrupción
        circulo.cambiarColor("red");

        circulo.moverHorizontal(100);

        circulo.moverVertical(50);

        circulo.cambiarTamano(50);

        //Punto de interrupción
        circulo.hacerVisible();

    }
}
