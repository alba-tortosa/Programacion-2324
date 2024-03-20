package AD05_ListaNombres;
/**
 * la clase ListaNombres guarda en una lista ordenada
 * de nombres en mayusculas
 * <p>
 * Ejercicio AD06
 */

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ListaNombres {

    private ArrayList<String> lista;

    /**
     * Constructor de la clase ListaNombres
     */
    public ListaNombres() {
        lista = new ArrayList<String>();
    }

    /**
     * Añade un nuevo nombre en la posicion que
     * le corresponde.  Indiferente mayusculas o minusculas al ordenar
     * @param  nombre el nombre a añadir
     *
     */
    public void anyadirNombre(String nombre) {
        lista.add(nombre);
        Collections.sort(lista);
    }

    /**
     * @return la posicion en la que hay que insertar
     * el nombre - Importan mayusculas / minusculas al insertar en orden
     */
    private int buscarPosicion(String nombre) {
        return 0;
    }

    /**
     * Obtiene y devuelve el conjunto de caracteres del nombre de la posicion indicada
     * @throws IllegalArgumentException si el argumento recibido es incorrecto
     *
     */
    public TreeSet<Character> obtenerConjuntoDeCaracteres(int pos) {
        return UtilsString.getConjuntoCaracteres(lista.get(pos));
    }

    /**
     * Obtiene y devuelve el conjunto de digitos numericos del nombre de la posicion indicada
     * @throws IllegalArgumentException si el argumento recibido es incorrecto
     *
     */
    public HashSet<Character> obtenerConjuntoDeDigitos(int pos) {
        return UtilsString.getConjuntoDigitos(lista.get(pos));
    }

    /**
     * Obtiene y devuelve el conjunto de letras mayusculas del nombre de la posicion indicada
     * @throws IllegalArgumentException si el argumento recibido es incorrecto
     *
     */
    public LinkedHashSet<String> obtenerConjuntoMayusculas(int pos) {
        return UtilsString.getConjuntoMayusculas(lista.get(pos));
    }


    /**
     * Representacion textual de la lista de nombres
     * de la forma          Nombre  [conjunto de caracteres ]  [conjunto digitos]  [conjunt de letras mayusculas]
     */
    public String toString() {
        String tabla = "";
        tabla+=String.format("| %-15s | %-30s | %-10s | %-20s |%n", "Nombre", "Caracteres", "Dígitos", "Mayúsculas");
        for (int i = 0; i < lista.size(); i++) {
            tabla+=String.format("| %-15s | %-30s | %-10s | %-20s |%n", lista.get(i), obtenerConjuntoDeCaracteres(i), obtenerConjuntoDeDigitos(i), obtenerConjuntoMayusculas(i));
        }
        return tabla;
    }

    /**
     *
     *
     */
    public void printLista() {
        System.out.println(this.toString());
    }

    /**
     * lee los nombres de un fichero de texto 
     *
     */
    public void leerDeFichero() {
        try {
            Scanner sc = new Scanner(new File("src/AD05_ListaNombres/nombres.txt"));
            while (sc.hasNextLine()) {
                anyadirNombre(sc.nextLine());
            } sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
