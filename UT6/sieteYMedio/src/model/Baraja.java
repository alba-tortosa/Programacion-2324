package model;

/**
 * Representa una baraja española de 40 cartas
 */


public class Baraja {
    private static final String DIRECTORIO = "img/"; //directorio en el que estan las imagenes
    private static String[] palos = new String[] {"OROS", "COPAS", "ESPADAS", "BASTOS"}; // los diferentes palos de la baraja
    private static final int NUM_VALORES = 10;

//    private baraja;

    /**
     * constructor para los objetos de la clase Baraja
     */
    public Baraja() {

    }

    /**
     * Inicializa la baraja de cartas
     */
    private void inicializarBaraja() {

    }

    /**
     * Obtiene el nombre del fichero que contiene la
     * imagen asociada a la carta de la baraja.
     * Si el palo es OROS y el valor 3 obtiene "img/oros_3.jpg",
     * si el palo es BASTOS y el valor 10 obtiene "img/bastos_10.jpg"
     *
     * @param palo el palo de la carta
     * @return valor el valor de la carta
     * @return un String con el nombre del fichero
     */
    private String obtenerNombreFichero(String palo, int valor) {
        return null;
    }
    
    /**
     * Representacion textual de toda la baraja de cartas
     * El String se forma en grupos de 5 cartas, cada grupo en una linea.
     */
    public String toString() {
        return null;
    }

    /**
     * Barajar la baraja de cartas
     * Utilzia el metodo shuffle de la clase Collections
     */
    public void barajar() {

    }

    /**
     * Saca una carta de la baraja devolviendola
     * La carta sacada ya no estara en la baraja
     *
     * @return devuelve la carta sacada, siempre es la ultima
     * null si ya no quedan cartas
     */
    public Carta sacarCarta() {
        return null;
    }
}
