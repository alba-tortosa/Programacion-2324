package A1_Arrays;

import java.util.Arrays;

/**
 *
 */
public class TestArrays1 {

    /**
     *
     */
    public static void main(String[] args) {

        int[] numeros;

        System.out.println("\n----------- escribirInvertido() ---------------");
        numeros = new int[]{2034, 12, 223, 5432, 9999};
        System.out.println(Arrays.toString(numeros));
        Arrays1.escribirInvertido(numeros);

        separador();

        System.out.println("\n----------- sumarCifrasLista() ---------------");
        numeros = new int[]{2034, 12, 223, 5432, 9999};
        System.out.println(Arrays.toString(numeros));
        Arrays1.sumarCifrasLista(numeros);

        separador();

        System.out.println("\n----------- listadoAlCuadrado() ---------------");
        numeros = new int[]{2, 5, 7, 12, 9, 3};
        Arrays1.listadoAlCuadradoV2(numeros);

        separador();

        System.out.println("\n----------- sublistaOrdenada() ---------------");
        numeros = new int[]{2, 15, 7, 12, 9, 3};
        System.out.println(Arrays.toString(numeros));
        int a = 1;
        int b = 4;
        System.out.println("Copia ordenada en el intervalo [" + a + ", " + b + "]\n" + Arrays.toString(Arrays1.sublistaOrdenada(numeros, a, b)));
        a = 4;
        b = 5;
        System.out.println("Copia ordenada en el intervalo [" + a + ", " + b + "]\n" + Arrays.toString(Arrays1.sublistaOrdenada(numeros, a, b)));
        a = 1;
        b = 14;
        System.out.println("Copia ordenada en el intervalo [" + a + ", " + b + "]\n" + Arrays.toString(Arrays1.sublistaOrdenada(numeros, a, b)));
        Arrays.toString(Arrays1.sublistaOrdenada(numeros, a, b));

    }

    public static void separador() {
        System.out.println("*************************************");

    }

}
