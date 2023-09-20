package classes;

import java.awt.geom.*;

/**
 * Un c�rculo que puede ser manipulado y que se 
 * dibuja a s� mismo en el canvas
 * 
 * @author  Michael Kolling y David J. Barnes
 */

public class Circulo 
{
    private int diametro;
    private int xPosicion;
    private int yPosicion;
    private String color;
    private boolean esVisible;

    /**
     * Crear un c�rculo en la posici�n por defecto y
     * con el color por defecto
     */
    public Circulo()    {
        diametro = 30;
        xPosicion = 20;
        yPosicion = 60;
        color = "blue";
        esVisible = false;
    }
   

    /**
     * Hacer el c�rculo visible, si ya lo est� no pasa nada
     */
    public void hacerVisible()    {
        esVisible = true;
        dibujar();
    }

    /**
     * Hacer el c�rculo invisible, si ya lo est� no pasa nada
     */
    public void hacerInvisible()
    {
        borrar();
        esVisible = false;
    }

    /**
     * Mover el c�rculo unos cuanto p�xeles a la derecha
     */
    public void moverDerecha()    {
        moverHorizontal(20);
    }

    /**
     * Mover el c�rculo unos cuanto p�xeles a la izquierda
     */
    public void moverIzquierda()    {
        moverHorizontal(-20);
    }

    /**
     * Mover el c�rculo unos cuanto p�xeles hacia arriba
     */
    public void moverArriba()    {
        moverVertical(-20);
    }

    /**
     * Mover el c�rculo unos cuanto p�xeles hacia abajo
     */
    public void moverAbajo()    {
        moverVertical(20);
    }

    /**
     * Mover el c�rculo horizontalmente
     */
    public void moverHorizontal(int distancia)    {
        borrar();
        xPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el c�rculo verticalmente
     */
    public void moverVertical(int distancia)    {
        borrar();
        yPosicion += distancia;
        dibujar();
    }

    /**
     * Mover el c�rculo despacio horizontalmente
     */
    public void despacioMoverHorizontal(int distancia)    {
        int delta;

        if (distancia < 0)         {
            delta = -1;
            distancia = -distancia;
        }
        else      {
            delta = 1;
        }

        for (int i = 0; i < distancia; i++)    {
            xPosicion += delta;
            dibujar();
        }
    }

    /**
     * Mover el c�rculo despacio verticalmente
     */
    public void despacioMoverVertical(int distancia)    {
        int delta;

        if (distancia < 0)    {
            delta = -1;
            distancia = -distancia;
        }
        else    {
            delta = 1;
        }

        for (int i = 0; i < distancia; i++)    {
            yPosicion += delta;
            dibujar();
        }
    }

    /**
     * Cambiar el tama�o al nuevo tama�o (en pixeles). Debe ser >= 0.
     */
    public void cambiarTamano(int nuevoDiametro)    {
        borrar();
        diametro = nuevoDiametro;
        dibujar();
    }

    /**
     * Cambiar el color. Colores v�lidos son "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void cambiarColor(String nuevoColor)    {
        color = nuevoColor;
        dibujar();
    }

    /**
     * Dibujar el c�rculo con las especificaciones actuales en la pantalla
     */

    private void dibujar()    {
        if (esVisible)    {
            Canvas canvas = Canvas.getCanvas();
            canvas.dibujar(this, color, new Ellipse2D.Double(xPosicion, yPosicion, 
                    diametro, diametro));
            canvas.esperar(10);
        }
    }

    /**
     * Borra el c�rculo de la pantalla
     */
    private void borrar()    {
        if (esVisible)     {
            Canvas canvas = Canvas.getCanvas();
            canvas.borrar(this);
        }
    }
}
