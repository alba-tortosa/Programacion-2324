package A2_Arrays;

import java.util.Arrays;

/**
 *
 */
public class Arrays2 {


    /**
     * 1. Calcula y devuelve un array resultado de reemplazar cada par de elementos del original por la suma del par.
     * Si el array guarda los valores {7, 2, 8, 9, 4, 13, 7, 1, 9, 10}  la llamada a colapsar() devuelve el nuevo
     * array {9, 17, 17, 8, 19}
     * El primer par del original se colapsa en 9 (7 + 2), el segundo par  en 17 (8 + 9)
     * Si el array guarda un nº impar de valores el último elemento no se colapsa {1, 2, 3, 4, 5} obtiene al
     * colapasar {3, 7, 5}
     * No hay que modificar el array pasado como parámetro.
     *
     * @param valores
     * @return
     */
    public static int[] colapsar(int[] valores) {

        return null;
    }

    /**
     * Modifica el array recibido reorganizándolo de forma que los pares van al principio y los impares al final.
     * No importa el orden en que queden los pares y los impares.
     * reorganizarParesImpares({1, 0, 1, 0, 0, 1, 1}) → {0, 0, 0, 1, 1, 1, 1}
     * reorganizarParesImpares({3, 3, 2}) → {2, 3, 3}
     * reorganizarParesImpares({2, 2, 2}) → {2, 2, 2}
     * reorganizarParesImpares({7, 2, 8, 9, 4, 13, 7, 1, 9, 10}) → {2, 8, 4, 10, 7, 13, 7, 1, 9, 9}
     *
     * @param numeros
     */
    public static void reorganizarParesImpares(int[] numeros) {


    }

    /**
     * un nuevo array insertando entre cada par de valores la diferencia del par
     * {3, 8, 6} devuelve  {3, 5, 8, -2, 6}
     * {4, 5} --> {4, 1, 5}
     * {2, 4, 6, 8} devuelve  {2, 2, 4, 2, 6, 2, 8}
     * {2, 4, 6} devuelve  {2, 2, 4, 2, 6}
     */
    public static int[] delta(int[] array) {

        return null;
    }

    /**
     * devuelve true si todos los valores en el array son unicos
     * 4 2 45 1 23 1 2 67 --> false
     * 4 2 45 1 23 1 9 67 --> true
     */
    public static boolean isUnique(int[] array) {

        return false;
    }

    /**
     * devuelve un array que en cada posicion contiene la suma de su posicion y la anterior
     * {2, 4, 6, 8} --> {2, 6, 10, 14}
     */
    public static int[] runningSum(int[] array) {
        int[] result = new int[array.length];
        if (array.length > 0) {
            result[0] = array[0];
            for (int i = 1; i < array.length; i++) {
                result[i] = array[i] + result[i - 1];
            }
        }
        return result;
    }

    /**
     * Invierte parejas de posiciones
     * a b c d --> b a d c
     * {10,20,30,40,50} --> {20,10,40,30,50}
     */
    public static void swapPairs(int[] array) {

    }

    /**
     * {2, 2, 3, 3, 4} false
     * {2, 2, 3, 3} true
     */
    public static boolean isAllPairs(int[] array) {

        return false;
    }

    /**
     * devuelve un nuevo array conteniendo los elementos de la primera mitad de la lista "a",
     * seguidos de todos los elementos de la lista "b" y seguido de los elementos de la segunda mitad de la lista "a"
     * int[] a = {2, 4, 6, 8, 10};
     * int[] b = {1, 1, 1};
     * La llamada insertMiddle(a, b); debe devolver:   {2, 4, 1, 1, 1, 6, 8, 10}
     * Si tiene una longitud impar, la mitad más corta va primero.
     */
    public static int[] insertMiddle(int[] a, int[] b) {


        return null;
    }

    /**
     * borra todas las ocuurencias de los valores de lista "a2" en la lista "a1".
     * int[] a1 = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
     * int[] a2 = {42, 2222, 9};
     * banish(a1, a2);
     * El contenido de la lista "a1" tras la ejecución será:
     * {3, 0, 17, 8, 4, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
     */
    public static void banish(int[] a1, int[] a2) {

    }

    /**
     * Devuelve true si la lista "a1" contiene la lista "a2"
     * a = new int[]{2, 3, 4, 5, 6, 7};
     * b = new int[]{5, 6, 7};
     * contains(a,b) --> true
     * a = new int[]{2, 3, 4, 5, 6, 7};
     * b = new int[]{4, 6, 7};
     * contains(a,b) --> false
     */
    public static boolean contains(int[] a1, int[] a2) {

        return false;
    }
}
