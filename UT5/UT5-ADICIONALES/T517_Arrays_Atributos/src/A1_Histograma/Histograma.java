package A1_Histograma;

import java.util.Arrays;
import java.util.Random;

/**
 * La clase contiene un array que se inicializa
 * con una serie de valores y se utiliza para dibujar
 * un histograma
 */

public class Histograma {
    public static final int MAX = 10;
    public static final char ASTERISCO = '*';
    private int[] valores;

    /**
     * Constructor
     */
    public Histograma() {
        valores = new int[MAX];
        inicializar();
    }

    /**
     * inicializa el array con valores aleatorios
     */
    private void inicializar() {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = generarAleatorio();
        }
    }

    /**
     * genera y devuelve un aleatorio entre 5 y 50 inclusive
     */
    private int generarAleatorio() {
        Random random = new Random();
        return random.nextInt(5, 51);
    }

    /**
     * muestra el histograma
     */
    public void escribirHistograma() {
        for (int n : valores) {
            for (int i = 1; i <= n; i++) {
                System.out.print(ASTERISCO);
            }
            System.out.println();
        }
    }

    public void escribirHistograma2() {
        for (int guardarvalores : valores) {
            char[] asterisco = new char[guardarvalores];
            Arrays.fill(asterisco, ASTERISCO);
            System.out.println(asterisco);

        }
    }

    /**
     * devuelve una copia del array
     */
    public int[] getValoresV1() {
        int[] copia = new int[this.valores.length];
        System.arraycopy(this.valores, 0, copia, 0, this.valores.length);
        return copia;
    }

    /**
     * devuelve una copia del array
     */
    public int[] getValoresV2() {
        int[] copia = Arrays.copyOf(this.valores, this.valores.length);
        return copia;
    }

}
