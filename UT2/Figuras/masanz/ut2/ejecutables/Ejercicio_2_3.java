package masanz.ut2.ejecutables;

import masanz.ut2.clases.Canvas;
import masanz.ut2.clases.Circulo;
import masanz.ut2.clases.Cuadrado;
import masanz.ut2.clases.Triangulo;

/**
 * Ejercicio 2.3.
 * Muestra un triángulo que se mueva hasta el centro inferior usando los métodos:
 * - moverHorizontal(int distancia)
 * - moverVertical(int distancia)
 * - esperar()
 * Muestra un cuadrado que se mueva hasta el centro derecha usando los métodos:
 * - moverDespacioVertical(int distancia)
 * - moverDespacioHorizontal(int distancia)
 */
public class Ejercicio_2_3 {

    public static void main(String[] args) {

        Triangulo triangulo1 = new Triangulo();
        triangulo1.hacerVisible();
        esperar();
        triangulo1.moverHorizontal(100);
        esperar();
        triangulo1.moverVertical(250);


        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.hacerVisible();
        cuadrado1.moverDespacioHorizontal(200);
        cuadrado1.moverDespacioVertical(80);

    }

    private static void esperar()    {
        Canvas canvas = Canvas.getCanvas();
        canvas.esperar(1000);
    }
}
