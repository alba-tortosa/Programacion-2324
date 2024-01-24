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
        numeros = new int[MAX];
        this.total = 0;
    }

    /**
     * Constructor de la clase Calculadora
     */
    public Calculadora(int[] numeros) {
        int minLength = Math.min(numeros.length, MAX);
        this.numeros = new int[minLength];

        this.total = this.numeros.length;

        for (int i = 0; i < this.numeros.length; i++) {
            this.numeros[i] = numeros[i];
        }

//        this.numeros = Arrays.copyOf(numeros, minLength);
    }

    /**
     * Añadir un numero al final si es posible (es decir, si la calculadora no esta completa)
     */
    public void introducirNumero(int numero) {
        if (!estaLlena()){
            this.numeros[total] = numero;
            total++;
        }
    }

    /**
     * devuelve true si la calculadora esta completa
     */
    public boolean estaLlena() {
        return numeros.length == total;
//        if (numeros.length == total){
//            return true;
//        }else {
//            return false;
//        }
    }

    /**
     * Acessor para la cantidad de numeros en la calculadora
     */
    public int getTotal() {
        return total;
    }

    /**
     * Contar los numeros  mayores que uno dado
     */
    public int contarMayoresQue(int numero) {
        int cont = 0;
        for (int i = 0; i < total; i++) {
            if (numeros[i] > numero) {
                cont++;
            }
        }
        return cont;
    }

    /**
     * Intercambiar el valor de dos elementos del array
     *
     * @param i posicion del primer numero a intercambiar
     *          j posicion del segundo numero a intercambiar
     */
    public void intercambiar(int i, int j) {
        if(posicionCorrecta(i) && posicionCorrecta(j)){
            int auxPos = i;
            numeros[i]=j;
            numeros[j]=auxPos;
        }
    }

    /**
     * @param pos la posicion a comprobar
     * @return true si es correcta
     */
    private boolean posicionCorrecta(int pos) {
        return pos >= 0 && pos < total;
    }

    /**
     * @return true si la calculadora tiene algun numero
     */
    private boolean hayNumeros() {
        return total > 0;
    }

    /**
     * Dado un numero n indica si todos sus digitos estan en orden decreciente
     */
    private static boolean enOrdenDecreciente(int n) {
        int digito = n % 10;
        while (n >= 10) {
            n= n/10;
            if (digito >= n%10){
                return false;
            }
            digito = n%10;
        }
        return true;
    }

    /**
     * devuelve un array con los numeros de la calculadora
     * con todos sus digitos en orden decreciente
     * Usa el metodo privado enOrdenDecreciente()
     * Si numeros = {45, 6, 965, 123, 93, 489, 321}  devuelve {6, 965, 93, 321 }
     */
    public int[] todoDigitosDecreciente() {
        int[] result = new int[this.total];
        int contador = 0;

        for (int i = 0; i < this.total; i++) {
            if (enOrdenDecreciente(this.numeros[i])) {
                result[contador] = this.numeros[i];
                contador++;
            }
        }
        return Arrays.copyOf(result, contador);
    }

    /**
     * Borra el ultimo elemento del atributo numeros
     */
    public void borrarUltimoElemento() {
        if (hayNumeros()) {
            total--;
        }
    }

    /**
     * Vacia la calculadora
     */
    public void vaciar() {
        this.total = 0;
    }

    /**
     * Muestra los numeros guardados en la calculadora
     */
    public void escribirNumeros() {
        for (int i = 0; i < this.total; i++) {
            System.out.printf("%d: %d\n", i, this.numeros[i]);
        }
    }

    /**
     * @param n el numero a comprobar
     * @return true si n es par
     */
    private static boolean esPar(int n) {
        return n % 2 == 0;
    }

    /**
     * Borra los numeros de valor par
     */
    public void borrarPares() {
        for (int i = 0; i < total; i++) {
            if (esPar(numeros[i])){
                borrarUnNumero(i);
            }
        }
    }

    /**
     * Borra el valor de una determinada posicion
     *
     * @param pos la posicion del valor a borrar
     */
    private void borrarUnNumero(int pos) {
        if(posicionCorrecta(pos)) {
            for (int i = pos; i < total - 1; i++) {
                this.numeros[i] = this.numeros[i+1];
            }
            total--;
        }
    }

    /**
     * Inserta un numero en la posicion indicada
     *
     * @param numero el numero a insertar
     * @param pos    la poscion en la que se insertara
     */
    public void insertarEnPosicion(int numero, int pos) {
        if (pos < 0 || pos > total) {
            throw new IllegalArgumentException("Posición incorrecta");
        } else {
            for (int i = total; i > pos; i--) {
                this.numeros[i] = this.numeros[i-1];
            }
            this.numeros[pos] = numero;
            total++;
        }
    }

}
