package masanz.ut2.ejecutables;

import masanz.ut2.clases.Circulo;
import masanz.ut2.clases.Cuadrado;
import masanz.ut2.clases.Triangulo;

/**
 * A partir del proyecto Figuras crea una imagen similar a la que se muestra en la teoría.
 * Anota los pasos que sigues para conseguirlo.
 *  – Necesitarás un círculo amarillo, 2 cuadrados (uno rojo y uno negro) y un triángulo verde.
 */
public class Ejercicio_2_7 {

    public static void main(String[] args) {
        Circulo circuloAmarillo = new Circulo();
        circuloAmarillo.cambiarColor("yellow");
        circuloAmarillo.cambiarTamano(60);
        circuloAmarillo.moverHorizontal(180);
        circuloAmarillo.hacerVisible();

        Cuadrado cuadradoRojo = new Cuadrado();
        cuadradoRojo.cambiarColor("red");
        cuadradoRojo.moverHorizontal(-10);
        cuadradoRojo.moverVertical(100);
        cuadradoRojo.cambiarTamano(100);
        cuadradoRojo.hacerVisible();

        Cuadrado cuadradoNegro = new Cuadrado();
        cuadradoNegro.cambiarColor("negro");
        cuadradoNegro.moverHorizontal(10);
        cuadradoNegro.moverVertical(120);
        cuadradoNegro.hacerVisible();

        Triangulo trianguloVerde = new Triangulo();
        trianguloVerde.cambiarColor("green");
        trianguloVerde.cambiarTamano(40, 140);
        trianguloVerde.moverHorizontal(50);
        trianguloVerde.moverVertical(100);
        trianguloVerde.hacerVisible();

    }
}
