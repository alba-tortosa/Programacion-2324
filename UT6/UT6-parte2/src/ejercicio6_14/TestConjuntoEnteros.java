package ejercicio6_14;

import java.util.Collections;
import java.util.HashSet;

public class TestConjuntoEnteros {

    public static void main(String[] args) {
        ConjuntoEnteros ce = new ConjuntoEnteros(20);
        ce.printConjunto();
        System.out.println();

        HashSet<Integer> pares = ce.getPares();
        System.out.println(pares.toString());

        ce.addNumero(4);
        ce.addNumero(22);

        ce.printConjunto();
        System.out.println();

        ce.borrarPares();
        ce.printConjunto();



    }

}
