package A2_Arrays;

import java.util.Arrays;

/**
 *
 */
public class TestArrays2 {

    /**
     *
     */
    public static void main(String[] args) {

        int[] numeros;

        System.out.println("\n----------- colapsar() ---------------");
        numeros = new int[]{7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        System.out.println("Original: " + Arrays.toString(numeros));
        System.out.println("Colapsado:" + Arrays.toString(Arrays2.colapsar(numeros)));
        numeros = new int[]{1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(numeros));
        System.out.println("Colapsado:" + Arrays.toString(Arrays2.colapsar(numeros)));

        separador();

        System.out.println("\n----------- reorganizarParesImpares ---------------");
        numeros = new int[]{1, 0, 1, 0, 0, 1, 1};
        System.out.println("Antes: " + Arrays.toString(numeros));
        Arrays2.reorganizarParesImpares(numeros);
        System.out.println("Después:" + Arrays.toString(numeros));

        numeros = new int[]{3, 3, 2};
        System.out.println("Antes: " + Arrays.toString(numeros));
        Arrays2.reorganizarParesImpares(numeros);
        System.out.println("Después:" + Arrays.toString(numeros));

        numeros = new int[]{2, 2, 2};
        System.out.println("Antes: " + Arrays.toString(numeros));
        Arrays2.reorganizarParesImpares(numeros);
        System.out.println("Después:" + Arrays.toString(numeros));

        numeros = new int[]{7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        System.out.println("Antes: " + Arrays.toString(numeros));
        Arrays2.reorganizarParesImpares(numeros);
        System.out.println("Después:" + Arrays.toString(numeros));

        separador();

        int[] a = {2, 4, 6, 8, 10, 12};
        int[] b = {1, 1, 1};
        int[] resul = Arrays2.insertMiddle(a, b);
        System.out.println(Arrays.toString(resul));

        a = new int[]{42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
        b = new int[]{42, 2222, 9};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        Arrays2.banish(a, b);

        System.out.println(Arrays.toString(a));

        a = new int[]{2, 3, 4, 5, 6, 7};
        b = new int[]{5, 6, 7};
        System.out.println("Contenido? " + Arrays2.contains(a, b));

    }

    public static void separador() {
        System.out.println("*************************************");

    }

}
