package masanz.ut2.ejecutables;

import masanz.ut2.clases.Canvas;
import masanz.ut2.clases.Circulo;
import masanz.ut2.clases.Cuadrado;

/**
 * Ejercicio 2.2.
 * Muestra un círculo en la esquina inferior derecha
 * Utiliza los métodos:
 * - hacerVisible()
 * - moverDerecha() varias veces
 * - moverAbajo() varias veces
 */
public class Ejercicio_2_2 {

    public static void main(String[] args)  {

        Circulo circulo1 = new Circulo();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();
        circulo1.moverDerecha();

        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();
        circulo1.moverAbajo();

        circulo1.hacerVisible();


    }

    private static void esperar()    {
        Canvas canvas = Canvas.getCanvas();
        canvas.esperar(1000);
    }
}
