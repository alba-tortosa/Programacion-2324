package controller;

import model.Baraja;
import model.Carta;

/**
 * Modela las reglas del juego "7 y medio"
 */
public class Juego {
    public static final double SIETE_Y_MEDIO = 7.5;
    private Baraja baraja;
    private double puntosAcumulados; //puntos que el jugador ha acumulado hasta el momento
    private Carta cartaSacada; //ultima carta mostrada


    /**
     * Constructor
     */
    public Juego() {
        reset();
    }

    /**
     * Inicializa todo para empezar a jugar
     * Crea la baraja, baraja las cartas, establece
     * los puntos acumulados a 0 y la carta sacada a null
     */
    public void reset() {


    }

    /**
     * Saca una carta
     *
     * @return la carta sacada
     */
    public Carta sacarCarta() {

        return null;

    }


    /**
     * Detecta si ya se ha llegado a las siete y media
     */
    public boolean esSieteYMedia() {
        return puntosAcumulados == SIETE_Y_MEDIO;
    }

    /**
     * Devuelve los puntos acumulados en el juego
     */
    public double getPuntosAcumulados() {
        return puntosAcumulados;
    }

    /**
     * Detecta si ya se ha pasado de las siete y media
     */
    public boolean seHaPasado() {
        return puntosAcumulados > SIETE_Y_MEDIO;
    }

    /**
     * Devuelve un String indicando la carta ultima sacada y los puntos
     * que se llevan acumulados
     */
    public String getEstadoJuego() {
        return "model.Carta sacada " + cartaSacada.toString() + "\nPuntos acumulados " + puntosAcumulados;

    }

    /**
     * Mostrar la baraja
     */
    public String mostrarBaraja() {
        return baraja.toString();
    }
}