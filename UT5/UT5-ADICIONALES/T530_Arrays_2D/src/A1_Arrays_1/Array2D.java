package A1_Arrays_1;

import java.util.Arrays;
import java.util.Random;

/**
 * Clase que guarda un array bidimensional
 * y permite hacer ciertas operaciones sobre él
 */
public class Array2D {
    public static final char LLAVE_APERTURA = '{';
    public static final char LLAVE_CIERRE = '}';
    private int[][] matriz;

    /**
     * Constructor
     */
    public Array2D() {
        matriz = new int[][]{{1, 2, 3, 4},
                {14, 5, 26, 7},
                {17, 8, 19, 10},
                {10, 11, 12, 13}};
    }

    /**
     * Constructor  - crea
     *
     * @param filas    nº de filas del array
     * @param columnas nº de columnas del array
     */
    public Array2D(int filas, int columnas) {
        if (filas < 1 && columnas < 1) {
            throw new IllegalArgumentException("La matriz debe tener mínimo 2 filas y dos columnas");
        }
        matriz = new int[filas][columnas];
        inicializar();
    }

    /**
     * Inicializa la matriz con valores aleatorios entre 3 y 30 inclusive
     * Usa el mutador setValor
     */
    public void inicializar() {
        Random r = new Random();
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                setValor(i, j, r.nextInt(3,31));
            }
        }
    }

    /**
     * deja un valor en la fila y columna indicadas como parámetro
     * asumimos f y c correctos
     */
    private void setValor(int f, int c, int valor) {
        matriz[f][c] = valor;
    }

    /**
     * @return el nº total de filas de la matriz
     */
    public int getFilas() {
        return matriz.length;
    }

    /**
     * @return el nº total de columnas de la matriz
     */
    public int getColumnas() {
        return matriz[0].length;
    }

    /**
     * Representación textual de la matriz
     */
    public String toString() {
        String texto = "";
        for (int i = 0; i < getFilas() ; i++) {
            for (int j = 0; j <getColumnas() ; j++) {
                texto += String.format( "%4d", matriz[i][j]);
            }
            texto += "\n";
        }
        return texto;
    }

    /**
     * Escribir la matriz bidimensional en pantalla
     */
    public void escribir() {
        System.out.println(this.toString());
    }

    /**
     * @param f la fila cuyos valores hay que sumar
     *          suponemos f correcto
     */
    public int sumarFila(int f) {
        int suma = 0;
        for (int j = 0; j < getColumnas(); j++) {
            suma+=matriz[f][j];
        }
        return suma;
    }

    /**
     * Calcula y devuelve un array en el que
     * cada elemento es la suma de las filas de matriz
     */
    public int[] sumarFilas() {
        int[] suma = new int[getFilas()];
        for (int i = 0; i < getFilas(); i++) {
            suma[i] = sumarFila(i);
        }
        return suma;
    }

    /**
     * @param c la columna cuyos valores hay que sumar
     *          suponemos c correcto
     */
    public int sumarColumna(int c) {
        int suma = 0;
        for (int i = 0; i < getFilas(); i++) {
            suma += matriz[i][c];
        }
        return suma;
    }


    /**
     * Calcula y devuelve un array en el que
     * cada elemento es la suma de las columnas de matriz
     */
    public int[] sumarColumnas() {
        int[] columnas = new int [getColumnas()];
        for (int j = 0; j < getColumnas(); j++) {
            columnas[j] = sumarColumna(j);
        }
        return columnas;
    }

    /**
     * @return calcula y devuelve la suma de la diagonal principal (suponiendo la
     * matriz cuadrada)
     */
    public int sumarDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j){
                    suma += matriz[i][j];
                }
            }
        }
        return suma;
    }

    public int sumarDiagonalPrincipal2() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    /**
     * @return calcula y devuelve la suma de la diagonal secundaria (suponiendo la
     * matriz cuadrada)
     */
    public int sumarDiagonalSecundaria() {
        int suma = 0;
        for (int i = 0; i < getFilas(); i++) {
            suma += matriz[i][getColumnas()-1-i];
        }
        return suma;
    }

    /**
     * 1  22  3   44
     * 3  7   5   11
     * 4  5   6   9
     * La traspuesta es
     * 1   3   4
     * 22  7   5
     * 3   5   6
     * 44  11   9
     */
    public int[][] traspuesta() {
        int[][] traspuesta = new int[getColumnas()][getFilas()];
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas() ; j++) {
                traspuesta[j][i]= matriz[i][j];
            }
        }
        return traspuesta;
    }

    /**
     * Calcula y devuelve la posición de la columna con suma máxima
     * Puedes ayudarte del método sumarColumna()
     */
    public int columnaSumaMaxima() {
        int maximo = 0;
        int posicion = 0;
        for (int j = 0; j < getColumnas(); j++) {
            if (sumarColumna(j) > maximo){
                maximo = sumarColumna(j);
                posicion = j;
            }
        }
        return posicion;
    }

    /**
     * Intercambia la columna de suma máxima con la primera columna
     * Si son la misma no hace falta el intercambio
     */
    public void intercambiar() {
        int colMaxima = columnaSumaMaxima();
        if (colMaxima != 0){
            for (int i = 0; i < matriz.length; i++) {
                int aux = matriz[i][0];
                matriz[i][0] = matriz[i][colMaxima];
                matriz[i][colMaxima] = aux;
            }
        }
    }


//    public void intercambiar() {
//        int[] aux = new int[getFilas()];
//        int colMaxima = columnaSumaMaxima();
//        if (colMaxima != 0){
//            for (int i = 0; i < this.matriz.length; i++) {
//                aux[i] = this.matriz[i][0];
//                this.matriz[i][0] = this.matriz[i][colMaxima];
//                this.matriz[i][colMaxima] = aux[i];
//            }
//        }
//    }

    /**
     * Devuelve un ragged array donde la 1ª fila
     * contiene el primer elemento de la 1ª fila de matriz,
     * la 2ª fila los 2 primeros elementos de la 2ª fila de matriz,
     * la 3ª fila los 3 primeros elementos de la 3ª fila de matriz, ...
     * 1   2   3   4
     * 14  5   26  7
     * 17  8   19  10
     * 10  11  12  13
     * Resultado
     * [1]
     * [14, 5]
     * [17, 8, 19]
     * [10, 11, 12, 13]
     */
    public int[][] arrayRagged() {
        return null;
    }

    /**
     * Muestra el array pero de la forma indicada. Cada nº formateado a 5 posiciones.
     * Usa las constantes definidas en la clase
     * <p>
     * {   {    1,     2,     3,     4    }
     * {   14,     5,    26,     7    }
     * {   17,     8,    19,    10    }
     * {   10,    11,    12,    13    }    }
     */
    public void escribirConLlaves() {

    }

    /**
     * Calcula y devuelve el total de impares en el array
     * Hay que hacer uso del método contarImpares(int[], int n)
     */
    public int contarImpares() {
        int impares = 0;
        for (int i = 0; i < getFilas(); i++) {
            impares += contarImpares(matriz[i]);
        }
        return impares;
    }

    /**
     * Cuenta los impares en el array unidimensional array
     */
    private int contarImpares(int[] array) {
        int impares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }

    /**
     * Devuelve el subarray obtenido a partir de matriz entre las filas fila1 y fila2
     * y columnas col1 y col2 (ambas inclusive)
     * Asumimos todos los valores correctos
     * 13  20  30  25  16
     * 12  27  24  17  27
     * 3   12  11  28  29
     * 21  11  20  25  8
     * <p>
     * Subarray desde filas  1 a  3 y columnas 2 a 3
     * [24, 17]
     * [11, 28]
     * [20, 25]
     */
    public int[][] obtenerSubArray(int fila1, int fila2, int col1, int col2) {
        int[][] sub = new int[fila2 - fila1 + 1][col2 - col1 + 1];
        int fila = 0;
        int columna = 0;

        for (int i = fila1; i <= fila2; i++) {
            for (int j = col1; j <= col2; j++) {
                sub[fila][columna] = matriz[i][j];
                columna++;
            }
            fila++;
            columna = 0;
        }
        return sub;
    }

    public int[][] obtenerSubArray2(int fila1, int fila2, int col1, int col2) {
        int[][] subarray = new int[(fila2 - fila1) + 1][(col2 - col1) + 1];
        for (int i = 0; i < subarray.length; i++) {
            for (int j = 0; j < subarray[0].length; j++) {
                subarray[i][j] = matriz[fila1 + i][col1 + j];
            }
        }
        return subarray;
    }


}
