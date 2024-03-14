package AD03_FusionInterseccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Secuencia {
    private ArrayList<Integer> lista;

    /**
     * Construye una secuencia a partir de la coleccion
     * recibida
     */
    public Secuencia(ArrayList<Integer> otra) {
        if (otra == null) {
            throw new IllegalArgumentException("Coleccion vacia");
        }
        lista = new ArrayList<>();
        lista.addAll(otra);
        Collections.sort(lista); //se puede porque Integer implementa el interfaz Comparable
    }

    /**
     * accesor para la secuencia ArrayList almacenada
     */

    public ArrayList<Integer> getSecuencia() {
        ArrayList<Integer> copia = new ArrayList<>();
        copia.addAll(lista);
        return copia;
    }

    /**
     * Obtiene la fusion (la union) de dos listas
     * de numeros ordenadas, la representada por el atributo lista y
     * la representada por el parametro otra
     */
    public ArrayList<Integer> fusionarCon(ArrayList<Integer> otra) {
        if (otra == null) {
            throw new IllegalArgumentException("Coleccion nula");
        }
        ArrayList<Integer> copia = getSecuencia();
        copia.addAll(otra);
        Collections.sort(copia);
        return copia;
    }

    /**
     * Obtiene la interseccion de lista y el parametro otra. La interseccion
     * contiene los elementos comunes y no repetidos de ambas (en orden)
     */
    public ArrayList<Integer> interseccionCon(ArrayList<Integer> otra) {
        if (otra == null) {
            throw new IllegalArgumentException("Coleccion nula");
        }
        ArrayList<Integer> interseccion = new ArrayList<>();
        interseccion.addAll(lista);
        interseccion.retainAll(otra);
        return eliminarDuplicados(interseccion);

    }

    /**
     * Elimina los duplicados de una lista
     */
    private ArrayList<Integer> eliminarDuplicados(ArrayList<Integer> lista) {
        HashSet<Integer> conjunto = new HashSet<>(lista);
        lista.clear();
        lista.addAll(conjunto);
        return lista;

    }

    /**
     * Representacion textual de la secuencia guardada
     * por el objeto actual
     */
    public String toString() {
        return lista.toString();
    }

}
