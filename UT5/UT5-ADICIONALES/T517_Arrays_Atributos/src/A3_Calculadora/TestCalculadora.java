package A3_Calculadora;

import java.util.Arrays;

/**
 *
 */
public class TestCalculadora {

    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        Calculadora tuCalculadora = new Calculadora();
        testUno(miCalculadora);
        testDos(tuCalculadora);
        testTres(tuCalculadora);
    }

    public static void testUno(Calculadora miCalculadora) {
        int[] lista = {45, 6, 765, 123, 93, 489, 321};
        for (int i = 0; i < lista.length; i++) {
            miCalculadora.introducirNumero(lista[i]);
        }

        miCalculadora.escribirNumeros();

        int[] decrecientes = miCalculadora.todoDigitosDecreciente();

        System.out.println(Arrays.toString(decrecientes));

        miCalculadora.borrarUltimoElemento();
        miCalculadora.escribirNumeros();
        miCalculadora.borrarPares();
        miCalculadora.escribirNumeros();

    }

    public static void testDos(Calculadora tuCalculadora) {
        for (int valor = 1; valor <= 8; valor++) {
            tuCalculadora.introducirNumero(valor * 2);
        }
        tuCalculadora.escribirNumeros();

        int mayores = tuCalculadora.contarMayoresQue(6);
        System.out.println("Hay " + mayores + " numeros mayores que " + 8);

        tuCalculadora.escribirNumeros();
        tuCalculadora.borrarUltimoElemento();
        tuCalculadora.borrarUltimoElemento();
        tuCalculadora.borrarUltimoElemento();
        tuCalculadora.escribirNumeros();

        System.out.println("Hay actualmente " + tuCalculadora.getTotal() + " numeros en la calculadora");

        tuCalculadora.vaciar();
        System.out.println("Hay actualmente " + tuCalculadora.getTotal() + " numeros en la calculadora");

    }

    public static void testTres(Calculadora miCalculadora) {
        miCalculadora.insertarEnPosicion(212, 0);
        miCalculadora.insertarEnPosicion(222, 1);
        miCalculadora.insertarEnPosicion(244, 2);
        miCalculadora.escribirNumeros();
        miCalculadora.insertarEnPosicion(212, 22); // la ejecucion de esta instruccion dara error y se generara una
        // excepcion

    }
}