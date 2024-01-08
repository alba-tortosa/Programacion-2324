package ejercicio14_Diccionario;

/**
 *  la clase Diccionario representa a un diccionario
 *  de palabras
 * 
 */

public class Diccionario
{
    private static final int MAX_PALABRAS = 10;
    private Palabra[] listaPalabras;
    private int pos;

    /**
     * Constructor de la clase Diccionario
     * @param numPalabras la cantidad de palabras maxima
     * que guardara el diccionario
     */
    public Diccionario(int numPalabras)   {

    }

    /**
     * 
     * @param nuevaPalabra la palabra a añadir
     */
    public void insertarPalabra(Palabra nuevaPalabra)   {

    }
    /**
     * @param posicion la posicion de la palabra
     *        a devolver. A partir de 1.
     * @return la palabra de posicion
     */
    public Palabra obtenerPalabra(int posicion)   {

        return null;
    }

    /**
     * @param posicion la posicion de la palabra
     *        a traducir. A partir de 1.
     * @return la traduccion al ingles de la palabra
     *          de posicion
     */
    public String traducirPalabra(int posicion)   {
        return null;
    }

    /**
     * Mostrar el diccionario
     */
    public void escribirDiccionario()   {
        System.out.println(toString());
    }

    /**
     * Representacion textual del diccionario
     */
    public String toString()   {

        return null;
    }

}
