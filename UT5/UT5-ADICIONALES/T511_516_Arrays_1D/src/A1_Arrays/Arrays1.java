package A1_Arrays;

import java.util.Arrays;

/**
 *
 */
public class Arrays1 {

    /**
     * 1. Escribir un array desde el final hasta el principio
     * (no hay que invertir el array)
     */
    public static void escribirInvertido(int[] numeros) {
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }

    /**
     * 2. Dado un nº devuelve la suma de sus cifras
     */
    private static int sumarCifras(int n) {
        int auxiliar = 0;
        while (n!=0) {
            auxiliar += n%10;
            n /= 10;
        }
        return auxiliar;
    }

    /**
     * 3. Escribe el array recibido como argumento desde el final hasta el principio
     * y en cada línea de la pantalla muestra el valor del elemento del array
     * junto a la suma de sus cifras
     * Si el array recibido es {2034, 12, 223, 5432, 9999}
     * se mostrará en pantalla:
     * 9999 - 36
     * 5432 - 14
     * 223 - 7
     * 12 - 3
     * 2034 - 9
     * Hay que usar el método privado sumarCifras()
     */
    public static void sumarCifrasLista(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int suma = sumarCifras(numeros[i]);
            System.out.printf("%d - %d\n", numeros[i], suma);
        }
    }

    public static void sumarCifrasListaV2(int[] numeros) {
        for (int numero : numeros) {
            int suma = sumarCifras(numero);
            System.out.printf("%d - %d\n", numero, suma);
        }
    }


    /**
     * 4. Sustituir cada elemento del array numeros por el cuadrado del que está a su derecha
     * El último se sustituye por el cuadrado del primero
     * Si el array recibido es {2, 5, 7, 12, 9, 3}
     * al final queda {25, 49, 144, 81, 9, 4}
     */
    public static void listadoAlCuadrado(int[] numeros) {
        int f=numeros[0];
        for (int i =0; i <= numeros.length-1; i++) {
            numeros[i]=numeros[i+1]*numeros[i+1];
        }
        numeros[numeros.length-1]=f*f;
        System.out.println(Arrays.toString(numeros));
    }

    public static void listadoAlCuadradoV2(int[] numeros) {
        int f=numeros[0];
        for (int i =1; i < numeros.length; i++) {
            numeros[i-1]= (int) Math.pow(numeros[i],2);
        }
        numeros[numeros.length-1]=f*f;
        System.out.println(Arrays.toString(numeros));
    }

    /**
     * 5. Usando solo métodos de la clase Arrays (fill, copyOfRange, sort)
     * devuelve una copia ordenada del rango de valores que están en el intervalo
     * de posiciones [a, b] (ambos inclusive) dentro de numeros
     * Si alguno de los parámetros a o b son incorrectos se devuelve como copia
     * un array de valores -1 de la misma longitud que numeros
     * Si el array recibido es {2, 15, 7, 12, 9, 3} y llamamos a sublistaOrdenada(numeros, 1, 4)
     * se devuelve {7, 9, 12, 15}
     * Si el array recibido es {2, 15, 7, 12, 9, 3} y llamamos a sublistaOrdenada(numeros, 4, 5)
     * se devuelve {3, 9}
     * Si el array recibido es {2, 15, 7, 12, 9, 3} y llamamos a sublistaOrdenada(numeros, 1, 14)
     * se devuelve {-1, -1, -1, -1, -1, -1}
     */
    public static int[] sublistaOrdenada(int[] numeros, int a, int b) {
        if (a < 0 || b >= numeros.length || a > b) {
            int[] incorrecto = new int[numeros.length];
            Arrays.fill(incorrecto, -1);
            return incorrecto;
        }
        int[] lista = Arrays.copyOfRange(numeros, a, b + 1);
        Arrays.sort(lista);
        return lista;
    }
}
