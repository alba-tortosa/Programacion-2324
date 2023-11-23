package ejercicios.ejercicioAD12_Exponenciales;

/**
 * La clase modela un numero exponencial y permite realizar operaciones
 * con exponenciales de la misma base (asumimos esto ultimo)
 */
public class Exponencial {
    // la clase almacena la base y el exponente del numero exponencial
    private int base;
    private int exponente;

    /**
     * constructor para los objetos de la clase Exponencial
     * Construtor de un numero exponecial a partir de una base y exponente
     *
     * @param base      la base del numero
     * @param exponente el exponente del numero
     */
    public Exponencial(int base, int exponente) {

    }

    /**
     * constructor para los objetos de la clase Exponencial
     * Constructor de un numero exponecial a partir de otro
     *
     * @param otro el numero exponencial con el que se construira el actual
     */
    public Exponencial(Exponencial otro) {

    }

    /**
     * Accesor para la base
     */
    public int getBase() {

        return 0;
    }

    /**
     * Accesor para el exponente
     */
    public int getExponente() {

        return 0;
    }

    /**
     * Mutador para la base
     */
    public void setBase(int base) {

    }

    /**
     * Mutador para el exponente
     */
    public void setExponente(int exponente) {

    }


    /**
     * @return el valor exponencial del numero
     * usando el metodo privado  portencia()
     */
    public double valorExponencial() {

        return 0;
    }

    /**
     * calcula a elevado a b
     * asumimos b >= 0
     */
    private int potencia(int a, int b) {

        return 0;
    }

    /**
     * Multiplica el actual numero exponencial por el que
     * se recibe como parametro (suponemos ambos con la misma
     * base)
     *
     * @param otro numero exponencial por el que se multiplica
     * @return el producto de dos numeros exponenciales
     */
    public Exponencial multiplicar(Exponencial otro) {

        return null;
    }

    /**
     * Divide el actual numero exponencial entre el que
     * se recibe como parametro  (suponemos ambos con la misma
     * base)
     *
     * @param otro numero exponencial entre el que se dividira
     * @return el cociente de dos numeros exponenciales
     */
    public Exponencial dividir(Exponencial otro) {

        return null;
    }

    /**
     * Eleva a una potencia un numero exponencial
     *
     * @param n potencia a la que se eleva el numero
     * @return nuevo numero exponencial elevado a n
     */
    public Exponencial elevar(int n) {

        return null;
    }

    /**
     * Representacion textual del numero
     */
    public String toString() {

        return "";
    }

}
