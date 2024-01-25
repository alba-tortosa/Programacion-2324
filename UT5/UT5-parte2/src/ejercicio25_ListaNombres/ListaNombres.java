package ejercicio25_ListaNombres;
/**
 * La clase mantiene una lista de nombres
 * en orden lexicografico
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class ListaNombres {
    private String[] lista;
    private int pos;

    /**
     * Constructor de la clase ListaNombres
     * n es el tamaño maximo de la lista
     */
    public ListaNombres(int n) {

    }

    /**
     * @return true si la lista esta vacia
     */
    public boolean listaVacia() {

        return false;
    }

    /**
     * @return true si la lista esta llena
     */
    public boolean listaLlena() {

        return false;
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
    public boolean insertarNombre(String nombre) {

        return false;
    }

    /**
     *  Busca un nombre en la lista
     *  Puesto que la lista esta en todo momento ordenada
     *  se hace una busqueda binaria
     *  @param  nombre el nombre a buscar
     *  @return true si ya existe el nombre en la lista
     */
    private boolean estaNombre(String nombre) {

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

        return null;
    }

    /**
     * Borra de la lista los nombres que empiezan por
     * una letra determinada (si importan mayusculas y minusculas)
     * No es lo mismo borrarLetra('A') que borrarLetra('a')
     * @param letra la letra por la que han de empezar los nombres
     */
    public void borrarLetra(char letra) {

    }

    /**
     * Borra un nombre de la posicion indicada
     * @param  p posicion del nombre a borrar
     */
    private void borrarDePosicion(int p) {

    }


    /**
     * Cuenta cuantos nombres empiezan por una determinada
     * cadena sin importar mayusculas o minusculas
     * @param inicio cadena de comienzo
     * @return la cantidad de nombres calculados
     */
    public int empiezanPor(String inicio) {

        return 0;
    }

    /**
     *
     * Devuelve un array con los  nombres que empiezan por una determinada
     * letra sin importar si es mayuscula o minuscula
     * @param letra letra de comienzo
     * @return la cantidad de nombres encontrados con esa letra
     */
    public String[] empiezanPorLetra(char letra) {

        return null;
    }

    /**
     * Representacion textual de la cadena
     * @return la cadena resultante
     */
    public String toString() {
        return null;
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
            sc = new Scanner(new File("nombres.txt"));
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
