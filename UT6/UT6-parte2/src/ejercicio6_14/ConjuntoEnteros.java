package ejercicio6_14;

import java.util.HashSet;
import java.util.Iterator;

public class ConjuntoEnteros {
// atributo enteros que es un HashSet de objetos Integer
    HashSet<Integer> enteros;


//    constructor
//    tamaño es la cantidad de números a añadir.
//    El constructor crea el conjunto y añade los números enteros del 1 al valor de tamaño
    public ConjuntoEnteros(int tamanyo) {
        enteros = new HashSet<>();
        for (int i = 1; i <= tamanyo; i++) {
            enteros.add(i);
        }
    }

    //  devuelve el conjunto de números pares.
    //  Utiliza un iterador para recorrer el set.
    public HashSet<Integer> getPares() {
        HashSet<Integer> pares = new HashSet<>();
        Iterator<Integer> it = enteros.iterator();
        while(it.hasNext()){
            Integer par = it.next();
            if(par % 2 == 0) pares.add(par);
        }
        return pares;
    }

    // añade un nuevo nº entero al conjunto
    public void addNumero(int n) {
        boolean exito = enteros.add(n);
        System.out.println(exito ? "Se ha añadido el numero" : "El numero ya estaba");
    }

    // escribe los valores del conjunto utilizando un for genérico
    public void printConjunto() {
//        for (Integer entero : enteros) {
//            System.out.println(entero);
//        }
        System.out.println(enteros.toString());

    }

    // borra los números pares del conjunto utilizando un iterador
    public void borrarPares() {
        Iterator<Integer> it = enteros.iterator();
        while (it.hasNext()){
            Integer numero = it.next();
            if (numero % 2 == 0){
                it.remove();
            }
        }
    }

    public void borrarParesv2() {
        Iterator<Integer> it = enteros.iterator();
        while (it.hasNext()) {
            if (getPares().contains(it.next())) it.remove();
        }
    }


}
