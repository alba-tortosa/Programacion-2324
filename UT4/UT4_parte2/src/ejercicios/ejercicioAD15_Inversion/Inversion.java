package ejercicios.ejercicioAD15_Inversion;

/**
 * Los objetos de la clase Inversion monitorizan el
 * crecimiento de una cantidad invertida que acumula un
 * determinado tipo de interes anual
 */
public class Inversion {
    private double importeInicial;
    private double interes;  // interes anual en porcentaje 5%


    /**
     * Constructor de la clase Inversion
     *
     * @param importe cantidad inicial invertida
     * @param interes tipo de interes anual aplicado
     */
    public Inversion(double importe, double interes) {
        this.importeInicial = importe;
        this.interes = interes;
    }

    /**
     * Accesor para la cantidad inicial
     */
    public double getInicial() {
        return importeInicial;
    }

    /**
     * Accesor para el interes
     */
    public double getInteres() {
        return interes;
    }


    /**
     * Mutador para la cantidad inicial
     */
    public void setInicial(double inicial) {
        importeInicial = inicial;
    }


    /**
     * Calcula el valor de la nueva inversion con
     * los intereses acumulados al cabo de los años
     *
     * @param anyos el numero de años en el que se acumulan
     *           intereses
     */
    public double despuesDe(int anyos) {
        return 0;
    }


    /**
     * Calcular numero años que han de pasar hasta
     * conseguir un importe determinado
     *
     * @param importeObjetivo el importe a conseguir
     */
    public int anyosHastaObjetivo(double importeObjetivo) {

        return 0;
    }


    /**
     * Inversion año a año en formato texto
     */
    public String tablaDespuesDe(int anyos) {

        return "";
    }

}

