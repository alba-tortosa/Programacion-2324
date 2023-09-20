package masanz.ut2.ejecutables;

import masanz.ut2.clases.Canvas;
import masanz.ut2.clases.Circulo;
import masanz.ut2.clases.Cuadrado;
import masanz.ut2.clases.Triangulo;

/**
 * Ejercicio 2.5.
 * - Crea tres círculos de diferentes colores: rojo, azul y magenta
 * - Hazlos visibles
 * - Muévelos alrededor de la pantalla a distintas coordenadas
 * - Haz un círculo más grande y amarillo
 * - Ahora haz otro más pequeño y verde
 * - Prueba con otras figuras. Cambia sus posiciones, tamaño y colores
 */
public class Ejercicio_2_5 {

    public static void main(String[] args) {
        Circulo circuloRojo = new Circulo();
        Circulo circuloAzul = new Circulo();
        Circulo circuloMagenta = new Circulo();

        circuloRojo.cambiarColor("red");
        circuloAzul.cambiarColor("blue");
        circuloMagenta.cambiarColor("magenta");

        circuloRojo.hacerVisible();
        circuloAzul.hacerVisible();
        circuloMagenta.hacerVisible();

        circuloRojo.moverAbajo();
        circuloRojo.moverAbajo();
        circuloRojo.moverDerecha();
        circuloRojo.moverDerecha();
        circuloAzul.moverHorizontal(100);
        circuloMagenta.moverVertical(100);

        Circulo circuloAmarillo = new Circulo();
        circuloAmarillo.cambiarTamano(100);
        circuloAmarillo.cambiarColor("yellow");
        circuloAmarillo.moverHorizontal(200);
        circuloAmarillo.hacerVisible();

        Circulo circuloVerde = new Circulo();
        circuloVerde.cambiarTamano(50);
        circuloVerde.cambiarColor("green");
        circuloVerde.hacerVisible();

        Cuadrado cuadradoRojo = new Cuadrado();
        cuadradoRojo.cambiarColor("red");
        cuadradoRojo.hacerVisible();

        Cuadrado cuadradoAzul = new Cuadrado();
        cuadradoAzul.cambiarColor("blue");
        cuadradoAzul.hacerVisible();
        cuadradoAzul.moverHorizontal(100);
        cuadradoAzul.moverVertical(100);

        Cuadrado cuadradoVerde = new Cuadrado();
        cuadradoVerde.cambiarColor("green");
        cuadradoVerde.hacerVisible();
        cuadradoVerde.moverHorizontal(200);
        cuadradoVerde.moverVertical(200);

        Triangulo trianguloRojo = new Triangulo();
        trianguloRojo.cambiarColor("red");
        trianguloRojo.hacerVisible();
        trianguloRojo.moverHorizontal(100);
        trianguloRojo.moverVertical(200);

        Triangulo trianguloMagenta = new Triangulo();
        trianguloMagenta.cambiarColor("magenta");
        trianguloMagenta.hacerVisible();
        trianguloMagenta.moverHorizontal(200);
        trianguloMagenta.moverVertical(100);

    }

    private static void esperar()    {
        Canvas canvas = Canvas.getCanvas();
        canvas.esperar(1000);
    }
}
