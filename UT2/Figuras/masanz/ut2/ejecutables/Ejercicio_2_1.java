package masanz.ut2.ejecutables;

import masanz.ut2.clases.Canvas;
import masanz.ut2.clases.Circulo;
import masanz.ut2.clases.Cuadrado;
import masanz.ut2.clases.Triangulo;

import java.awt.geom.Ellipse2D;

/**
 * Ejercicio 2.1.
 * - Crea un círculo.
 * - Crea un cuadrado.
 * - Crea un triángulo.
 */
public class Ejercicio_2_1 {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.hacerVisible();

        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.hacerVisible();

        Triangulo triangulo1 = new Triangulo();
        triangulo1.hacerVisible();


    }

    private static void esperar()    {
        Canvas canvas = Canvas.getCanvas();
        canvas.esperar(1000);
    }
}
