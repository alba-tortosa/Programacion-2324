package ejercicio26_Directorio;

/**
 * Describe un fichero de un directorio
 */
public class Fichero {

    private String nombre;  //nombre que incluye la extension
    private int tam;  // en KBytes

    /**
     * Constructor
     * El nombre del fichero siempre se guarda en mayusculas
     *
     * @param nombre el nombre del fichero
     * @param tam    el    tamaño del fichero
     */

    public Fichero(String nombre, int tam) {

    }

    /**
     * @return accesor para el nombre
     * devuelve el nombre sin extension
     */
    public String getNombre() {

        return null;
    }

    /**
     * @return devuelve el nombre con extension
     */
    public String getNombreCompleto() {

        return nombre;
    }

    /**
     * mutador para el nombre
     * se cambia el nombre completo
     * Siempre se guarda en mayusculas
     *
     * @param nuevoNombre nombre nuevo
     */

    public void cambiarNombre(String nuevoNombre) {

    }

    /**
     * accesor para el tamaño del fichero
     *
     * @return el tamaño del fichero
     */
    public int getTamaño() {
        return tam;
    }

    /**
     * @return devuelve la extension sin incluir el punto
     */
    public String getExtension() {

        return null;

    }

    /**
     * representacion textual del fichero
     */
    public String toString() {
        return nombre + "   " + tam + "\n";
    }

}
