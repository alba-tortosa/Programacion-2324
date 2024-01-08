package ejercicio14_Diccionario;

/**
 * Modela una palabra de un diccionario ingles - castellano
 *
 * @author
 */
public class Palabra {

    private String castellano;
    private String ingles;

    /**
     * Constructor de la clase Palabra
     */
    public Palabra(String castellano, String ingles) {
        this.castellano = castellano;
        this.ingles = ingles;
    }

    /**
     * @return la palaba en castellano
     */
    public String getCastellano() {
        return castellano;
    }

    /**
     * @return la palaba en ingles
     */
    public String getIngles() {
        return ingles;
    }

    /**
     * @return la representacion textual
     * de la palabra
     */
    public String toString() {
        return castellano + " - " + ingles + "\n";
    }
}
