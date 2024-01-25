package A2_MapaTesoro;

import java.util.Random;

/**
 * Guarda mediante un array bidimensional de valores boolean
 * un mapa del tesoro indicando si en una determinada fila,columna
 * hay o no un tesoro (la posicion del array guarda true o false)
 */
public class MapaTesoro {
    private static final char CARACTER = '\u0024';
    private static final char PUNTO = '.';
    private Random generador;

    private boolean[][] mapa;

    /**
     * construye el mapa de las dimensiones indicadas
     * y lo inicializa a valores boolean aleatorios
     */
    public MapaTesoro(int filas, int columnas) {
        mapa = new boolean[filas][columnas];
        generador = new Random();
        inicializar();
    }

    /**
     * inicializa el array mapa a valores aleatorios true / false
     */
    private void inicializar() {
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                mapa[i][j] = generador.nextBoolean();
            }
        }
    }

    /**
     * @return el numero de filas del mapa
     */
    public int getFilas() {
        return mapa.length;
    }

    /**
     * @return el numero de columnas del mapa
     */
    public int getColumnas() {
        return mapa[0].length;
    }


    /**
     * representacion textual del mapa
     * (leer enunciado)
     */
    public String toString() {
        String texto = "";
        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
//                String aux = ".";
//                if(hayTesoro(i, j)) {
//                    aux = "$";
//                }
                char aux = hayTesoro(i, j) ? CARACTER : PUNTO;
                texto += String.format(" %2s ",aux);
            }
            texto += "\n";
        }
        return texto;
    }


    /**
     * devuelve true si en la posicion indicada hay un tesoro
     * false si la posicion (f,c) no esta dentro de los limites del mapa
     * o no hay un tesoro en esa posicion
     * Para saber si una posicion esta dentro de los limites
     * del mapa del tesoro se usara dentroLimites()
     */
    public boolean hayTesoro(int f, int c) {
        return dentroLimites(f, c) ? mapa[f][c] : false;
    }

    public boolean hayTesoro2(int f, int c) {
        return dentroLimites(f, c) && mapa[f][c];
        //return mapa[f][c] && dentroLimites(f, c); // ERROR
    }

    public boolean hayTesoro3(int f, int c) {
        if (dentroLimites(f, c)) return mapa[f][c];
        return false;
    }

    /**
     * devuelve true si f,c esta dentro de los limites, false en otro caso
     */
    private boolean dentroLimites(int f, int c) {
//        if (f >= getFilas() || f<0 || c<0 || c >= getColumnas() ) {
//            return false;
//        }
//        return true;

//        return !(f >= getFilas() || f<0 || c<0 || c >= getColumnas() );

        return f < getFilas() && f >= 0 && c >= 0 && c < getColumnas();
    }

    /**
     * devuelve el numero de tesoros  adyacentes a una posicion dada f,c
     * Las posiciones adyacentes en el mapa a f,c son las ocho celdas (posiciones)
     * que la bordean (horizontal, vertical y diagonalmente)
     * Un tesoro en la posicion dada f,c  no cuenta como adyacente.
     * El numero de tesoros adyacentes en una posicion fuera de los limites es 0.
     */
    public int calcularNumeroTesorosAdyacentes(int f, int c) {
        int numTesoros = 0;
        if(dentroLimites(f,c)) {
            for (int i = f - 1; i <= f + 1; i++) {
                for (int j = c - 1; j <= c + 1; j++) {
                    //if (hayTesoro(i,j) && !(i==f && j ==c)) {
                    if (hayTesoro(i,j) && (i!=f || j != c)) {
                        numTesoros++;
                    }
                }
            }
        }
        return numTesoros;
    }

    public int calcularNumeroTesorosAdyacentes2(int f, int c) {
        int cont = 0;
        if (dentroLimites(f, c)) {
            if (hayTesoro(f - 1, c)) {
                cont++;
            } else if (hayTesoro(f + 1, c)) {
                cont++;
            } else if (hayTesoro(f, c + 1)) {
                cont++;
            } else if (hayTesoro(f, c - 1)) {
                cont++;
            } else if (hayTesoro(f - 1, c + 1)) {
                cont++;
            } else if (hayTesoro(f - 1, c - 1)) {
                cont++;
            } else if (hayTesoro(f + 1, c - 1)) {
                cont++;
            } else if (hayTesoro(f + 1, c + 1)) {
                cont++;
            }
        }
        return cont;
    }


    /**
     * Crea y devuelve un array bidimensional de enteros
     * En este nuevo array se asignara un 9 en la posicion
     * f,c si hay un tesoro
     * Si no lo hay se asignara el numero de tesoros adyacentes
     * a la posicion f,c
     */
    public int[][] calcularTesoros() {
        int[][] matriz = new int[getFilas()][getColumnas()];

        for (int i = 0; i < getFilas(); i++) {
            for (int j = 0; j < getColumnas(); j++) {
                if (mapa[i][j]) {
                    matriz[i][j] = 9;
                } else {
                    matriz[i][j] = calcularNumeroTesorosAdyacentes(i,j);
                }
            }
        }
        return matriz;
    }

}
