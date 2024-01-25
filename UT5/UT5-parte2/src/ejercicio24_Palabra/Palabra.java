package ejercicio24_Palabra;

import java.util.Arrays;

/**
 * Representa a una palabra
 */
public class Palabra {
    private static final char ASTERISCO = '*';
    private String palabra;

    /**
     * Constructor de la clase Palabra
     */
    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * Devuelve una palabra con guiones insertados
     *
     * @return la palabra con guiones
     */
    public String guionizar() {
        return null;
    }


    /**
     * @return el numero de vocales de la palabra
     */
    public int contarVocales() {
        return 0;
    }

    private boolean esVocal(char car) {
        return false;
    }

    /**
     * Compara la palabra actual con la recibida como paramtero
     *
     * @param palabra con la que comparar
     * @return true si son iguales, false en otro caso
     */
    public boolean mayorQue(String palabra) {

        return false;
    }

    /**
     * Borrar las apariciones de str en palabra
     */
    public String borrarOcurrenciasDe(String str) {

        return null;
    }

    public char[][] toArray2D() {
        return null;
    }

    public char[] toArray() {
        return null;
    }

    public void print() {
        for (char[] fila : toArray2D()) {
            System.out.println(Arrays.toString(fila));
        }

    }

}
