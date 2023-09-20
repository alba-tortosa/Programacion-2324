package masanz.ut2.ejecutables;

import masanz.ut2.clases.Canvas;
import masanz.ut2.clases.Circulo;

/**
 * Ejercicio 2.4
 * Crea un círculo y hazlo visible. Después de cada acción utiliza el método esperar() para que se vea los cambios.
 * - Llama al método cambiarColor() y cambia el color a “red”. Prueba con otros colores, “green”, “yellow”.
 * - Prueba con un color desconocido (“rojo”).
 * - Cambia el tamaño del círculo a 100.
 * - Invoca el mismo método sin especificar ningún parámetro. ¿Qué ocurre?
 * - Prueba ahora a llamar al método pero especificando el color sin “”. ¿Qué obtienes?
 */
public class Ejercicio_2_4 {

    public static void main(String[] args)  {

        Circulo circulo1 = new Circulo();
        circulo1.hacerVisible();
        esperar();

        circulo1.cambiarColor("red");
        esperar();

        circulo1.cambiarColor("green");
        esperar();

        circulo1.cambiarColor("yellow");
        esperar();

        // El valor "rojo" es un color desconocido.
        // Comprueba los colores definidos en el método setFondoColor de la clase Canvas
        circulo1.cambiarColor("rojo");
        esperar();

        circulo1.cambiarTamano(100);
        esperar();

        // No se puede cambiar el color a un color desconocido.
        //circulo1.cambiarColor();

        // Como tal red no es una variable definida todavía, entre comillas es un valor literal.
        //circulo1.cambiarColor(red);


    }

    private static void esperar()    {
        Canvas canvas = Canvas.getCanvas();
        canvas.esperar(1000);
    }
}
