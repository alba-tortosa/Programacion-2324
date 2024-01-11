package A3_Calculadora;

import java.util.Arrays;

/**
 * clase Calculadora
 */
public class Calculadora {
    public static final int MAX = 15;
    private int[] numeros;
    private int total;

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora() {

    }

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora(int[] numeros) {


    }

    /**
     * Añadir un numero al final si es posible (es decir, si la calculadora no esta completa)
     */
    public void introducirNumero(int numero) {

    }

    /**
     * devuelve true si la calculadora esta completa
     */
    public boolean estaLlena() {
        return false;
    }

    /**
     * Acessor para la cantidad de numeros en la calculadora
     */
    public int getTotal() {
        return 0;
    }

    /**
     * Contar los numeros  mayores que uno dado
     */
    public int contarMayoresQue(int numero) {
        return 0;
    }

    /**
     * Intercambiar el valor de dos elementos del array
     *
     * @param i posicion del primer numero a intercambiar
     *          j posicion del segundo numero a intercambiar
     */
    public void intercambiar(int i, int j) {

    }

    /**
     * @param pos la posicion a comprobar
     * @return true si es correcta
     */
    private boolean posicionCorrecta(int pos) {
        return false;
    }

    /**
     * @return true si la calculadora tiene algun numero
     */
    private boolean hayNumeros() {
        return false;
    }

    /**
     * Dado un numero n indica si todos sus digitos estan en orden decreciente
     */
    private static boolean enOrdenDecreciente(int n) {

        return false;

    }

    /**
     * devuelve un array con los numeros de la calculadora
     * con todos sus digitos en orden decreciente
     * Usa el metodo privado enOrdenDecreciente()
     * Si numeros = {45, 6, 965, 123, 93, 489, 321}  devuelve {6, 965, 93, 321 }
     */
    public int[] todoDigitosDecreciente() {
        return null;
    }

    /**
     * Borra el ultimo elemento del atributo numeros
     */
    public void borrarUltimoElemento() {

    }

    /**
     * Vacia la calculadora
     */
    public void vaciar() {

    }

    /**
     * Muestra los numeros guardados en la calculadora
     */
    public void escribirNumeros() {

    }

    /**
     * @param n el numero a comprobar
     * @return true si n es par
     */
    private static boolean esPar(int n) {
        return false;
    }

    /**
     * Borra los numeros de valor par
     */
    public void borrarPares() {

    }

    /**
     * Borra el valor de una determinada posicion
     *
     * @param pos la posicion del valor a borrar
     */
    private void borrarUnPar(int pos) {

    }

    /**
     * Inserta un numero en la posicion indicada
     *
     * @param numero el numero a insertar
     * @param pos    la poscion en la que se insertara
     */
    public void insertarEnPosicion(int numero, int pos) {


    }

}
