package classes;
/**
 * Esta clase representa un dibujo simple. Se puede realizar el dibujo
 * utilizando el método dibujar(). Como es un dibujo digital, puede cambiar.
 * Se puede ver en negro y blanco y en color
 * 
 * @author Michael K�lling y David.J. Barnes
 */

/**
 * Ejercicio 2.10.
 * - En el código fuente de la clase Dibujo localiza la parte que hace el dibujo.
 * Cámbialo para que el sol sea azul y no amarillo.
 * Añade un segundo sol al dibujo. Tendrás que añadir un nuevo atributo a la
 * clase: private Circulo sol2;
 * Escribe después el código apropiado para crear el segundo sol.
 */
public class Dibujo
{

    private Cuadrado pared;
    private Cuadrado ventana;
    private Triangulo tejado;
    private Circulo sol;
    private Circulo sol2;



    /**
     * Constructor para objetos de la clase classes.Dibujo
     */
    public Dibujo()    {
        // no se hace nada, las variables instancia son inicializadas
        // automáticamente a null
    }

    /**
     * Realizar el dibujo
     */

    public void dibujar()    {
        pared = new Cuadrado();
        pared.moverVertical(80);
        pared.cambiarTamano(100);
        pared.hacerVisible();

        ventana = new Cuadrado();
        ventana.cambiarColor("black");
        ventana.moverHorizontal(20);
        ventana.moverVertical(100);
        ventana.hacerVisible();

        tejado = new Triangulo();
        tejado.cambiarTamano(50, 140);
        tejado.moverHorizontal(60);
        tejado.moverVertical(70);
        tejado.hacerVisible();

        sol = new Circulo();
        sol.cambiarColor("yellow");
        sol.moverHorizontal(180);
        sol.moverVertical(-10);
        sol.cambiarTamano(60);
        sol.hacerVisible();

        sol2 = new Circulo();
        sol2.cambiarColor("black");
        sol2.moverHorizontal(200);
        sol2.moverVertical(-40);
        sol2.cambiarTamano(60);
        sol2.hacerVisible();
    }
    
    /**
     * Cambiar dibujo a negro/blanco
     */

    public void setNegroBlanco()    {
        // solo si está dibujado ya ....
        if (pared != null)  { 
            pared.cambiarColor("black");
            ventana.cambiarColor("white");
            tejado.cambiarColor("black");
            sol.cambiarColor("black");
        }
    }

    /**
     * Cambiar dibujo para ver en modo color
     */

    public void setColor()    {
        // solo si está dibujado ya ....
        if (pared != null)   {
            pared.cambiarColor("red");
            ventana.cambiarColor("black");
            tejado.cambiarColor("green");
            sol.cambiarColor("yellow");
        }
    }

}
