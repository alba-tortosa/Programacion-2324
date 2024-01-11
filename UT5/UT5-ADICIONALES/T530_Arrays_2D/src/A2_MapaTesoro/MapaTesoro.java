package A2_MapaTesoro;

import java.util.Random;

/**
 * Guarda mediante un array bidimensional de valores boolean
 * un mapa del tesoro indicando si en una determinada fila,columna
 * hay o no un tesoro (la posicion del array guarda true o false)
 */
public class MapaTesoro {
    private static final char CARACTER = '\u0024';
    private static final char PUNTO = '.';
    private Random generador;

    /**
     * construye el mapa de las dimensiones indicadas
     * y lo inicializa a valores boolean aleatorios
     */
    public MapaTesoro(int filas, int columnas) {


    }

    /**
     * inicializa el array mapa a valores aleatorios true / false
     */
    private void inicializar() {

    }

    /**
     * @return el numero de filas del mapa
     */
    public int getFilas() {
        return 0;

    }

    /**
     * @return el numero de columnas del mapa
     */
    public int getColumnas() {
        return 0;

    }


    /**
     * representacion textual del mapa
     * (leer enunciado)
     */
    public String toString() {
        return null;
    }


    /**
     * devuelve true si en la posicion indicada hay un tesoro
     * false si la posicion (f,c) no esta dentro de los limites del mapa
     * o no hay un tesoro en esa posicion
     * <p>
     * Para saber si una posicion esta dentro de los limites
     * del mapa del tesoro se usara dentroLimites()
     */
    public boolean hayTesoro(int f, int c) {
        return false;
    }

    /**
     * devuelve true si f,c esta dentro de los limites, false en otro caso
     */
    private boolean dentroLimites(int f, int c) {
        return false;
    }

    /**
     * devuelve el numero de tesoros  adyacentes a una posicion dada f,c
     * Las posiciones adyacentes en el mapa a f,c son las ocho celdas (posiciones)
     * que la bordean (horizontal, vertical y diagonalmente)
     * Un tesoro en la posicion dada f,c  no cuenta como adyacente.
     * El numero de tesoros adyacentes en una posicion fuera de los limites es 0.
     */
    public int calcularNumeroTesorosAdyacentes(int f, int c) {
        return 0;
    }

    /**
     * Crea y devuelve un array bidimensional de enteros
     * En este nuevo array se asignara un 9 en la posicion
     * f,c si hay un tesoro
     * Si no lo hay se asignara el numero de tesoros adyacentes
     * a la posicion f,c
     */
    public int[][] calcularTesoros() {
        return null;
    }

}
