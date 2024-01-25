package ejercicio26_Directorio;

/**
 * Describe un directorio de un fichero
 */
public class Directorio {
    public static final int MAX_FICHEROS = 10;
    public static final int LLENO = 1;
    public static final int REPETIDO = 2;
    public static final int EXITO = 3;
    private Fichero[] ficheros;
    private int siguiente;

    /**
     * Constructor de un directorio
     */
    public Directorio() {
        ficheros = new Fichero[MAX_FICHEROS];
        siguiente = 0;
    }

    /**
     * añade un nuevo fichero al directorio al final del mismo
     *
     * @param queNombre el nombre del fichero a añadir
     * @param queTamaño el tamaño del fichero a añadir
     * @return devuelve LLENO, EXITO o REPETIDO dependiendo
     * de la situacion del directorio al añadir
     */
    public int añadirFichero(String queNombre, int queTamaño) {

        return 0;
    }


    /**
     * @return devuelve true si directorio lleno
     */
    private boolean estaLLeno() {

        return true;

    }

    /**
     * detecta si un fichero esta o no en un directorio
     *
     * @param nombre del fichero completo a buscar
     * @return devuelve -1 si no esta o la posicion
     * en la que se encuentra
     */

    private int existeFichero(String nombre) {

        return 0;

    }

    /**
     * @return devuelve el tamaño total del directorio
     */

    public int getTamañoDirectorio() {

        return 0;

    }

    /**
     * @return devuelve la relacion de ficheros
     * con el mayor tamaño dentro del directorio
     * @return un array de strings con los nombres
     * de los ficheros
     */
    public String[] getFicheroMayor() {

        return null;
    }

    /**
     * devuelve un array de ficheros ordenados por nombre
     * La ordenacion se hace en base al nombre sin extension
     *
     * @return devuelve un array de strings con los nombres sin extension
     * de los ficheros
     */
    public Fichero[] ordenarPorNombre() {

        return null;
    }

    /**
     * Cambia el nombre a un fichero que debe existir y no
     * haber otro con el nuevo nombre
     *
     * @return true si se ha podido renombrar, false en otro caso
     */
    public boolean renombrarFichero(String queNombre, String nuevoNombre) {

        return true;
    }

    /**
     * Repesentacion textual del directorio
     * Utilizando StringBuilder como objeto de apoyo
     */

    public String toString() {

        return null;

    }

}
