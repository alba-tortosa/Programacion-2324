package ejercicio5_ColeccionEnteros;

import java.sql.Array;
import java.util.*;
// import java.util.LinkedList;

/**
 * Boxing / Unboxing (envolver - desenvolver) se hace cuando se asigna,
 * en la correspondencia de par�metros, en valores de retorno pero NO al comparar
 * <p>
 * if (lista1.get(0) == lista2.get(0)) // aqui se comparan referencias
 * <p>
 * Integer x = new Integer(7);
 * Integer y = new Integer(7);
 * System.out.println(x == y);  // devuelve false
 * <p>
 * <p>
 * Integer x = 7;
 * Integer y = 7;
 * System.out.println(x == y);  // devuelve true, Java aqui guarda en realidad un solo objeto en la cache
 */
public class ColeccionEnteros {
    private ArrayList<Integer> miLista;

    /**
     * Constructor
     * llamamos a inicializarColeccion()
     */
    public ColeccionEnteros() {
        miLista = new ArrayList<>();
        inicializarColeccion();
    }


    /**
     * inicializa la coleccion con valores aleatorios  entre 0 y 20 (inclusive)
     * Parar cuando sale el 0 o se han generado 10 valores
     */
    private void inicializarColeccion() {
        Random random = new Random();
        int numAux = random.nextInt(0,21);
        int contador =0;
        while (numAux != 0 && contador<10){
            add(numAux);
            numAux = random.nextInt(0,21);
            contador++;
        }
    }

    private void inicializarColeccionV2() {
        Random random = new Random();
        int numero = random.nextInt(0,21);
        for (int i = 0; i < 10; i++) {
            if (numero !=0) add(numero);
            else break;
            numero = random.nextInt(0,21);
        }
    }

    /**
     * Añade el valor siempre al principio
     */
    public void add(int valor) {
        miLista.add(0,valor);
    }

    /**
     * Suma los elementos de la coleccion
     * Con iterador
     */
    public int sumar() {
        int suma = 0;
        Iterator<Integer> it = miLista.iterator();
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }

    /**
     * Suma los elementos de la coleccion
     * Con for mejorado
     */
    public int sumarV2() {
        int suma = 0;
        for (int valor : miLista) {
            suma += valor;
        }
        return suma;
    }


    /**
     * Devuelve la coleccion ordenada, no se modifica el original
     * Utilizaremos utilidades de la clase Collections
     */
    public ArrayList<Integer> ordenar() {
        miLista.set(1, 2);
        ArrayList<Integer> listaOrdenada = new ArrayList<>(miLista);
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public ArrayList<Integer> ordenarV2() {
        ArrayList<Integer> ordenado = new ArrayList<>();
        for (Integer i : miLista) {
            ordenado.add(i);
        }
        Collections.sort(ordenado);
        return ordenado;
    }

    /**
     * Representacion textual de la coleccion
     */
    public String toString() {
        return Arrays.toString(miLista.toArray());
    }

}
