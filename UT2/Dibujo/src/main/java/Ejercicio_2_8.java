import classes.Canvas;
import classes.Dibujo;

/**
 * Ejercicio 2.8.
 * Crea una instancia de la clase Dibujo
 * Invoca al método dibujar()
 * Llama a los métodos setNegroBlanco() y setColor()
 * Usa el método esperar() para ver los cambios
 */

/**
 * Ejercicio 2.9.
 * Examina el código fuente de la clase Dibujo y de las clases Circulo, Cuadrado y Triangulo.
 * ¿Cómo crees que la clase Dibujo efectúa el dibujo?
 * ¿Qué hace el método setNegroBlanco()?
 * ¿Qué hace el método setColor()?
 */

public class Ejercicio_2_8 {

    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();

        dibujo.dibujar();
        esperar();

        dibujo.setNegroBlanco();
        esperar();
        dibujo.setColor();
        esperar();
    }

    private static void esperar()    {
        Canvas canvas = Canvas.getCanvas();
        canvas.esperar(1000);
    }
}
