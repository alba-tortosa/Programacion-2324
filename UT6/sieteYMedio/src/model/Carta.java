package model; /**
 * Modela una carta de la baraja española
 */

import javax.swing.*;

public class Carta {
    public static final String[] VALORES = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo"
            , "rey"};
    private String palo;
    private int valor;
    private String imgFichero;

    /**
     * constructor para los objetos de la clase Carta
     */
    public Carta(int valor, String palo, String imgFichero) {
        this.palo = palo;
        this.valor = valor;
        this.imgFichero = imgFichero;
    }


    /**
     * Accesor para el palo
     *
     * @return el palo de la carta
     */
    public String getPalo() {
        return palo;
    }

    /**
     * Accesor para el valor de la carta en formato String
     *
     * @return el valor  de la carta
     */
    public String getValorString() {
        return null;
    }

    /**
     * Accesor para el valor
     *
     * @return el valor de la carta
     */
    public int getValor() {
        return valor;
    }

    /**
     * Accesor para el nombre del fichero
     * que guarda la imagen grafica asociada a la carta
     *
     * @return el nombre del fichero
     */
    public String getFichero() {
        return imgFichero;
    }

    /**
     *  Accesor para los puntos que representa la
     *  carta en este juego
     *
     * @return el valor de la carta si no es una figura
     *          0.5 si es una figura
     */
    public double getPuntosCarta() {
        return 0;
    }

    /**
     * Representacion textual de la carta
     *
     * @return un String de la forma
     *          "as de OROS", o bien "tres de BASTOS"
     */
    public String toString() {
        return null;
    }

    /**
     * Accesor para la imagen grafica asociada a la carta
     * de la baraja
     * @return un objeto IageIcon con la imagen de la carta
     */
    public ImageIcon getImagen() {
        ImageIcon imagen = null;
        java.net.URL imgURL = getClass().getClassLoader().getResource(imgFichero);
        if (imgURL != null)
            imagen = new ImageIcon(imgURL);
        return imagen;
    }

}   
