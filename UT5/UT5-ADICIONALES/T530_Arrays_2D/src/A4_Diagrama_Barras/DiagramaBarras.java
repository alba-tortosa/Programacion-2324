package A4_Diagrama_Barras;

import java.util.Arrays;

/**
 * Clase DemoArrays 1D avanzados
 */
public class DiagramaBarras {
    private static final int MAX = 12;
    private final char CARACTER = '#';
    private final char BLANCO = ' ';
    private int[] valores;

    /**
     * Constructor de la clase DemoArrays
     */
    public DiagramaBarras() {
        valores = new int[MAX];

    }

    /**
     *  Inicializar el array con valores aleatorios en el rango indicado
     */
    public void inicializarEnRango(int desde, int hasta) {

    }


    /**
     *  muestra en pantalla una barra tal como se muestra en la figura (ver Moodle)
     *  Cuando hay valores negativos la barra se muestra a la izquierda
     * y cuando son positivos a la derecha.
     *  La longitud de cada barra está determinada por los valores del array
     *  Si el array es
     *  {  4   -13   13   13   -7   8   -17   10   -12   14   -10   15   }
     el resultado será

                      |  4|####
         #############|-13|
                      | 13|#############
                      | 13|#############
               #######| -7|
                      |  8|########
     #################|-17|
                      | 10|##########
          ############|-12|
                      | 14|##############
            ##########|-10|
                      | 15|###############
     *
     *
     */
    public void escribirBarraHorizontal() {

    }

    /**
     *  Mostrar el valor del array enmarcado
     *
     */
    public void mostrarValor(int valor) {
        System.out.printf("|%3d|", valor);
    }

    /**
     *  Mostrar el caracter indicado n veces
     *
     */
    public void mostrarCaracter(char caracter, int n) {

    }




    /**
     * Suponiendo solo valores positivos para el  array el método muestra en pantalla
     * una barra vertical. La altura de la barra está determinada por los valores del array.
     * Cada barra en la figura tiene un ancho de 2 caracteres.
     * No se puede modificar el array original
     *
     * Si el array es {  17   1   2   1   11   8   4   8   4   7   }
     * la salida será
     * 17|##
     * 16|##
     * 15|##
     * 14|##
     * 13|##
     * 12|##
     * 11|##          ##
     * 10|##          ##
     *  9|##          ##
     *  8|##          ## ##    ##
     *  7|##          ## ##    ##    ##
     *  6|##          ## ##    ##    ##
     *  5|##          ## ##    ##    ##
     *  4|##          ## ## ## ## ## ##
     *  3|##          ## ## ## ## ## ##
     *  2|##    ##    ## ## ## ## ## ##
     *  1|## ## ## ## ## ## ## ## ## ##

     *
     */
    public void escribirBarraVertical() {

    }

    /**
     *  devuelve a partir del array de una dimensión un array de dos dimensiones de m filas y n columnas.
     *  Los primeros n números se copiarán en la primera fila,
     *  los siguientes n en la segunda y así sucesivamente.
     *  Si la longitud del array valores no es divisible entre n se lanza una excepción
     *  IllegalArgumentException y no se hace nada.
     *
     */
    public int[][] aDosDimensiones(int n) {

        return null;
    }

    /**
     *  Mostrar en pantalla el array
     *
     */
    public void escribirArray() {
        System.out.println(toString());
    }

    /**
     *  Representación textual del array
     *
     */
    public String toString() {
        String str = "{  ";
        for (int i = 0; i < valores.length; i++) {
            str += valores[i] + "   " ;
        }
        return str +  "}";
    }

}