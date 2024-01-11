package A1_CD;

import java.util.Arrays;

/**
 * Representa a un CD
 */
public class CD {
    private String titulo;
    private String artista;
    private int pos; // total canciones en el CD

    /**
     * Constructor
     */
    public CD(int n, String titulo, String artista) {

    }

    /**
     * añade una canción al CD  solo si no está completo
     *
     * @param c la canción a añadir
     */
    public void addCancion(Cancion c) {

    }

    /**
     * añade una canción al CD  solo si no está completo
     *
     * @param titulo   el título de  la canción a añadir
     * @param duracion la duración de  la canción a añadir
     */
    public void addCancion(String titulo, double duracion) {

    }

    /**
     * devuelve true si el cd está lleno
     */
    public boolean estaCompleto() {
        return false;
    }

    /**
     * devuelve el total de canciones en el CD
     */
    public int totalCanciones() {
        return 0;
    }

    /**
     * Duración total del CD
     */
    public double duracionTotal() {
        return 0;
    }

    /**
     * Devuelve una canción aleatoria del CD
     */
    public Cancion getAleatoria() {
        return null;
    }

    /**
     * Devuelve un  array con los títulos de las canciones en mayúsculas
     */
    public String[] getTitulos() {
        return null;

    }

    /**
     * Devuelve cuántas canciones contienen en el título una cadena
     */
    public int cancionesQueContienen(String str) {
        return 0;
    }

    /**
     * Borra las canciones que empiezan por una cadena devolviendo los títulos
     * que se han borrado. Si no hay ninguna se devuelve null
     */
    public String[] borrarCancionesQueEmpiezan(String str) {
        return null;

    }

    /**
     * Borra una canción, la que está en la posición p
     */
    private void borrarCancion(int p) {

    }

    /**
     * Obtener un array con las canciones ordenadas por título
     * Método de selección directa
     */
    public Cancion[] cancionesOrdenadasPorTitulo() {
        return null;

    }

    /**
     * Crea  y devuelve un nuevo CD con las canciones ordenadas por título
     */
    public CD crearNuevoCD() {
        return null;
    }

    /**
     * Representación textual del CD
     */
    public String toString() {
        return null;
    }
}
