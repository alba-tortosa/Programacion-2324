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
        listaPalabras=new Palabra[Math.min(numPalabras, MAX_PALABRAS)];
        pos = 0;
//        if (numPalabras>MAX_PALABRAS){
//            listaPalabras=new Palabra[MAX_PALABRAS];
//        }else listaPalabras= new Palabra[numPalabras];
    }

    /**
     *
     * @param nuevaPalabra la palabra a añadir
     */
    public void insertarPalabra(Palabra nuevaPalabra)   {
        if (pos<listaPalabras.length){
            listaPalabras[pos]=nuevaPalabra;
            pos++;
        } else {
            System.out.println("No caben más palabras en el diccionario.");
        }
    }
    /**
     * @param posicion la posicion de la palabra
     *        a devolver. A partir de 1.
     * @return la palabra de posicion
     */
    public Palabra obtenerPalabra(int posicion)   {
        if (posicion>0 && posicion<=pos){
            Palabra palabra = listaPalabras[posicion-1];
            return palabra;
        }else{
            return null;
        }
    }

    /**
     * @param posicion la posicion de la palabra
     *        a traducir. A partir de 1.
     * @return la traduccion al ingles de la palabra
     *          de posicion
     */
    public String traducirPalabra(int posicion)   {
        String resultado = "";
        if (posicion>0 && posicion<=pos) {
            Palabra palabra = listaPalabras[posicion-1];
            resultado = palabra.getIngles();
        } else {
            resultado = "No hay ninguna palabra en esa posición.";
        }
        return resultado;
    }

    public String traducirPalabra2(int posicion)   {
        String resultado = "";
        Palabra palabra = obtenerPalabra(posicion);
        if (palabra != null) {
            resultado = palabra.getIngles();
        }
        return resultado;
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
        String toString="-".repeat(27) + "\n";
        toString += String.format("| %10s | %10s |\n", "CASTELLANO", "INGLÉS");
        for (Palabra listaPalabra : listaPalabras) {
            if (listaPalabra != null) {
                toString += "-".repeat(27) + "\n";
                toString += String.format("| %10s | %10s |\n", listaPalabra.getCastellano(), listaPalabra.getIngles());
            }
        }
        toString += "-".repeat(27) + "\n";
        return toString;
    }

    public String toString2()   {
        String toString="-".repeat(27) + "\n";
        toString += String.format("| %10s | %10s |\n", "CASTELLANO", "INGLÉS");
        for (int i = 0; i < pos; i++) {
            toString += "-".repeat(27) + "\n";
            toString += String.format("| %10s | %10s |\n", listaPalabras[i].getCastellano(), listaPalabras[i].getIngles());
        }
        toString += "-".repeat(27) + "\n";
        return toString;
    }

}
