package A1_Arrays_1;

import java.util.Arrays;

/**
 * @author
 */
public class TestArray2D {


    public static void main(String[] args) {
        Array2D uno = new Array2D();  // lo creamos usando el primer constructor
        Array2D dos = new Array2D(4, 5);  // lo creamos usando el segundo constructor e inicializando
        dos.inicializar();

        demoSumarFila(uno);
        System.out.println("******************************");

        demoSumarColumna(uno);
        System.out.println("******************************");

        demoSumarFilas(dos);
        System.out.println("******************************");

        demoSumarColumnas(dos);
        System.out.println("******************************");

        demoSumarDiagonalPrincipal(uno);
        System.out.println("******************************");

        demoSumarDiagonalSecundaria(uno);
        System.out.println("******************************");

        demoTraspuesta(dos);
        System.out.println("******************************");

        demoColumnaSumaMaxima(dos);
        System.out.println("******************************");

        demoArrayRagged(dos);
        System.out.println("******************************");

        demoEscribirConLlaves(uno);
        System.out.println("******************************");

        demoContarImpares(uno);
        System.out.println("******************************");

        demoSubArray(dos);

    }

    /**
     *
     */
    public static void demoSumarFila(Array2D array) {
        int filaAleatoria = (int) (Math.random() * array.getFilas());
        int suma = array.sumarFila(filaAleatoria);
        array.escribir();
        System.out.println("La suma de la fila " + filaAleatoria + " es " + suma);
    }

    /**
     *
     */
    public static void demoSumarColumna(Array2D array) {
        int columnaAleatoria = (int) (Math.random() * array.getColumnas());
        int suma = array.sumarColumna(columnaAleatoria);
        array.escribir();
        System.out.println("La suma de la columna " + columnaAleatoria + " es " + suma);
    }

    /**
     *
     */
    public static void demoSumarFilas(Array2D array) {
        array.escribir();
        int[] suma = array.sumarFilas();
        System.out.println("\n" + Arrays.toString(suma));
    }

    /**
     *
     */
    public static void demoSumarColumnas(Array2D array) {
        array.escribir();
        int[] suma = array.sumarColumnas();
        System.out.println("\n" + Arrays.toString(suma));
    }

    /**
     *
     */
    public static void demoSumarDiagonalPrincipal(Array2D array) {
        array.escribir();
        int suma = array.sumarDiagonalPrincipal();
        System.out.println("La suma de la diagonal principal es " + suma);
    }

    /**
     *
     */
    public static void demoSumarDiagonalSecundaria(Array2D array) {
        array.escribir();
        int suma = array.sumarDiagonalSecundaria();
        System.out.println("La suma de la diagonal secundaria  es " + suma);
    }

    /**
     *
     */
    public static void demoTraspuesta(Array2D array) {
        array.escribir();
        int[][] traspuesta = array.traspuesta();
        System.out.println("Traspuesta\n ");
        for (int f = 0; f < traspuesta.length; f++) {
            System.out.println(Arrays.toString(traspuesta[f]));
        }
    }

    /**
     *
     */
    public static void demoColumnaSumaMaxima(Array2D array) {
        array.escribir();
        System.out.println("Posición columna suma máxima " + array.columnaSumaMaxima());

    }

    /**
     *
     */
    public static void demoIntercambiar(Array2D array) {
        demoColumnaSumaMaxima(array);
        array.intercambiar();
        System.out.println("Después del intercambio\n ");
        array.escribir();

    }

    /**
     *
     */
    public static void demoArrayRagged(Array2D array) {
        array.escribir();
        int[][] ragged = array.arrayRagged();
        for (int f = 0; f < ragged.length; f++) {
            System.out.println(Arrays.toString(ragged[f]));
        }
    }

    /**
     *
     */
    public static void demoEscribirConLlaves(Array2D array) {
        array.escribirConLlaves();
    }

    /**
     *
     */
    public static void demoContarImpares(Array2D array) {
        array.escribirConLlaves();
        System.out.println("Total impares " + array.contarImpares());
        array.inicializar();
        array.escribirConLlaves();
        System.out.println("Total impares " + array.contarImpares());

    }

    /**
     *
     */
    public static void demoSubArray(Array2D array) {
        array.escribir();
        System.out.println("Subarray desde filas  1 a  3 y columnas 2 a 3");
        int[][] sub = array.obtenerSubArray(1, 3, 2, 3);
        for (int f = 0; f < sub.length; f++) {
            System.out.println(Arrays.toString(sub[f]));
        }

    }

}
