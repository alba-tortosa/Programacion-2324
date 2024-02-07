package ejercicio25_ListaNombres;
/**
 * La clase mantiene una lista de nombres
 * en orden lexicografico
 */

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class ListaNombres {
    private String[] lista;
    private int pos;

    /**
     * Constructor de la clase ListaNombres
     * n es el tamaño maximo de la lista
     */
    public ListaNombres(int n) {
        lista = new String[n];
        pos = 0;
    }

    /**
     * @return true si la lista esta vacia
     */
    public boolean listaVacia() {
        return pos == 0;
    }

    /**
     * @return true si la lista esta llena
     */
    public boolean listaLlena() {
        return pos == lista.length;
    }

    /**
     * Inserta un nombre en la lista unicamente
     * si no esta y la lista no esta llena. La insercion se hace de tal
     * manera que el nombre queda colocado en el
     * lugar que le corresponde manteniendo el orden de la lista
     * * Importan mayusculas y minusculas
     *
     * @param nombre el nombre a insertar
     * @return true si la insercion se hace con exito
     */
    public boolean insertarNombreV2(String nombre) {
        if (estaNombre(nombre)) return false;
        if (listaLlena()) return false;

        if (listaVacia()){
            lista[0] = nombre;
            pos++;
            return true;
        }

        for (int i = 0; i < pos; i++) {
            if (lista[i].compareTo(nombre) > 0){
                for (int j = pos; j > i ; j--) {
                    lista[j] = lista[j - 1];
                }
                lista[i] = nombre;
                pos++;
                return true;
            }
        }
        lista[pos + 1] = nombre;
        return true;

    }

    public boolean insertarNombre(String nombre) {
        if (estaNombre(nombre) || listaLlena()) return false;
        lista[pos] = nombre;
        pos++;
        Arrays.sort(lista, 0, pos);
        return true;
    }

    /**
     *  Busca un nombre en la lista
     *  Puesto que la lista esta en todo momento ordenada
     *  @param  nombre el nombre a buscar
     *  @return true si ya existe el nombre en la lista
     */
    private boolean estaNombre(String nombre) {
        for (int i = 0; i < pos; i++) {
            if (lista[i].equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    /**
     *  Busca y devuelve el nombre de mayor longitud
     *  en la lista. Si hay varios devuelve el
     *  primero encontrado
     *  Si la lista esta vacia devuelve null
     *  @return el nombre mas largo
     */
    public String nombreMasLargo() {
        String nombrelargo = "";
        for (int i = 0; i < pos; i++) {
            if(lista[i].length() > nombrelargo.length()){
                nombrelargo = lista[i];
            }
        }
        return nombrelargo;
    }

    /**
     * Borra de la lista los nombres que empiezan por
     * una letra determinada (si importan mayusculas y minusculas)
     * No es lo mismo borrarLetra('A') que borrarLetra('a')
     * @param letra la letra por la que han de empezar los nombres
     */
    public void borrarLetra(char letra) {
        for (int i = 0; i < pos; i++) {
            if (lista[i].startsWith(String.valueOf(letra))){
                borrarDePosicion(i);
                i--;
            }
        }
    }

    public void borrarLetraV2(char letra) {
        int i = 0;
        while (i < pos) {
            if (lista[i].startsWith(String.valueOf(letra))){
                borrarDePosicion(i);
            } else i++;
        }
    }

    /**
     * Borra un nombre de la posicion indicada
     * @param  p posicion del nombre a borrar
     */
    private void borrarDePosicion(int p) {
        for (int i = p; i < pos-1; i++) {
            lista[i] = lista[i + 1];// movemos a la izquierda los nombres siguientes
        }
        lista[pos-1] = null;
        pos--;
    }


    /**
     * Cuenta cuantos nombres empiezan por una determinada
     * cadena sin importar mayusculas o minusculas
     * @param inicio cadena de comienzo
     * @return la cantidad de nombres calculados
     */
    public int empiezanPor(String inicio) {
        int cuantosHay = 0;
        for (int i = 0; i < pos; i++) {
            if(lista[i].toLowerCase().startsWith(inicio.toLowerCase())) cuantosHay++;
        }
        return cuantosHay;
    }

    /**
     *
     * Devuelve un array con los  nombres que empiezan por una determinada
     * letra sin importar si es mayuscula o minuscula
     * @param letra letra de comienzo
     * @return la cantidad de nombres encontrados con esa letra
     */
    public String[] empiezanPorLetra(char letra) {

        int count = 0;
        String aux = String.valueOf(letra);
        int cantidad = empiezanPor(aux);

        String[] palabras = new String[cantidad];
        for (int i = 0; i < pos; i++) {
            if(String.valueOf(this.lista[i].charAt(0)).equalsIgnoreCase(aux)){
                palabras[count] = lista[i];
                count++;
            }
        }
        return palabras;
    }

    /**
     * Representacion textual de la cadena
     * @return la cadena resultante
     */
    public String toString() {
        return Arrays.toString(this.lista);
    }

    /**
     *  Mostrar la lista en pantalla
     */
    public void printLista() {
        System.out.println(this.toString());
    }

    /**
     * Lee de un fichero de texto una serie
     * de nombres con ayuda de un objeto de la
     * clase Scanner y los almacena en la lista
     */
    public void cargarDeFichero() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("./src/ejercicio25_ListaNombres/nombres.txt"));
            while (sc.hasNextLine() && !listaLlena()) {
                insertarNombre(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
    }
}
