package ejercicios.ejercicioAD05;


/**
 * La clase modela un nº racional, una fracción
 * representada por su numerador y denominador
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    /**
     * Constructor
     */
    public Fraccion() {
        numerador = 0;
        denominador = 0;
    }

    /**
     * constructor para los objetos de la clase Fraccion
     */
    public Fraccion(int numerador, int denominador) {

    }


    /**
     * Accesor para el numerador
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Accesor para el denominador
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Mutador para el numerador
     */
    public void setNumerador(int numerador) {

    }

    /**
     * Mutador para el denominador
     */
    public void setDenominador(int denominador) {

    }

    /**
     * Suma la fracción actual por la que
     * se recibe como parámetro
     *
     * @param otra fraccion con la que sumar
     * @return la suma de dos  fracciones
     */
    public Fraccion sumar(Fraccion otra) {

        return null;
    }

    /**
     * Resta la fracción actual por la que
     * se recibe como parámetro
     *
     * @param otra fracción con la que se resta
     * @return la resta  de dos fracciones
     */
    public Fraccion restar(Fraccion otra) {

        return null;
    }

    /**
     * Multiplica la fracción actual por la que
     * se recibe como parámetro
     *
     * @param otra fraccion por la que se multiplica
     * @return el producto de dos fracciones
     */
    public Fraccion multiplicar(Fraccion otra) {

        return null;
    }

    /**
     * Divide la fracción actual entre la que
     * se pasa como parámetro
     *
     * @param otra fraccion entre la que se dividirá
     * @return el cociente de dos fracciones
     */
    public Fraccion dividir(Fraccion otra) {

        return null;
    }

    /**
     * Compara dos fracciones, la actual y
     * la recibida como parámetro
     *
     * @param otra la fracción con la que comparar
     * @return true si son iguales
     */
    public boolean igualQue(Fraccion otra) {

        return false;
    }

    /**
     * Compara dos fracciones, la actual y
     * la recibida como parámetro
     *
     * @param otra la fracción con la que comparar
     * @return true si la fraccióna actual es
     * menor que la recibida como parámetro
     */
    public boolean menorQue(Fraccion otra) {

        return false;
    }

    /**
     * @return la fracción actual clonada
     */
    public Fraccion clonar() {

        return null;
    }

    /**
     * Representación textual de la fracción
     */

    public String toString() {
        String tmp = numerador + " / " + denominador;
        return tmp;
    }

}
