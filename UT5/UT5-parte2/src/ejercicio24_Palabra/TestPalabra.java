package ejercicio24_Palabra;

import java.util.Arrays;

public class TestPalabra {
    public static void main(String[] args) {

        Palabra palabra = new Palabra("prueba");
        printCabecera("GUIONIZAR");
        System.out.println(palabra.guionizar());
        System.out.println();

        printCabecera("CONTAR VOCALES");
        System.out.println(palabra.contarVocales());
        System.out.println();

        printCabecera("MAYOR QUE");
        System.out.println("Mayor que PRUEBAS? " + palabra.mayorQue("PRUEBAS"));
        System.out.println("Mayor que pruebas? " + palabra.mayorQue("pruebas"));
        System.out.println();

        printCabecera("BORRAR APARICIONES");
        palabra = new Palabra("dependiente");
        System.out.println(palabra.borrarOcurrenciasDe("en"));
        System.out.println();

        printCabecera("ARRAY 2D");
        palabra = new Palabra("patito");
        palabra.print();
        System.out.println();

        printCabecera("ARRAY 1D");
        System.out.println(Arrays.toString(palabra.toArray()));

    }

    private static void printCabecera(String mensaje) {
        System.out.println("*".repeat(30));
        System.out.printf("**** %-20s ****\n", mensaje);
        System.out.println("*".repeat(30));
    }
}
