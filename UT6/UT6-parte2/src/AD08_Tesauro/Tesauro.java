package AD08_Tesauro;

import java.util.HashSet;

/**
 * Modela un diccionario en el que cada palabra
 * tiene asociados una serie de sinonimos
 */


public class Tesauro {
    // a cada clave se le asocia un conjunto de sinonimos
    //los sinonimos no se repiten
//    private tesauro;

    /**
     * Constructor de la clase Tesauro
     */
    public Tesauro() {
//        tesauro =
    }

    /**
     * @param palabra la palabra a añadir
     * sinonimo el sinonimo de la palabra
     */
    public void anyadirSinonimo(String palabra, String sinonimo) {

    }

    /**
     * añade una palabra junto con todos sus sinonimos
     *
     * @param linea contiene la palabra y sus sinonimos
     * el separador entre palabras es el blanco
     * la primera palabra es la clave, el resto sinonimos
     */
    public void anyadirSinonimo(String linea) {

    }

    /**
     * @param sin el sinonimo a borrar de cada conjunto
     *            de sinonimos
     * @return el conjunto de claves en las que estaba
     * el sinonimo borrado. Si no se borro
     * ninguno devuelve el conjunto vacio
     */
    public HashSet<String> borrarSinonimo(String sin) {
        return null;
    }

    /**
     * @return
     */
    public String toString() {
        return null;
    }

    /**
     * Visualiza el tesauro
     */
    public void escribirTesauro() {

        System.out.println(toString());
    }

}
