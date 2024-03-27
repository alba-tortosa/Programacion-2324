package ejemplo_MultiMap;

import java.util.TreeSet;

/**
 * Clase que incluye un map que asocia nombre de personas con el conjunto de sus colores favoritos
 * Ejemplo de uso de un multimap, un map en el que cada clave tiene
 * asociado una colección de valores
 */


public class MultiMapColores {

//    private mapPersonas;

    /**
     * Constructor
     */
//    public MultiMapColores() {
//        mapPersonas =
//    }

    /**
     * Añade una nueva persona al map con su color favorito
     * Si la persona (clave) no existe se crea una nueva entrada con
     * un conjunto vacío y se añade el color al conjunto
     * Si la persona  (clave) existe se añade el color
     */
    public void addPersona(String nombre, String color) {

    }

    /**
     * Muestra el nombre de cada persona y sus colores favoritos
     * Con el conjunto de claves y un for mejorado
     */
    public void escribirPersonasColores() {

    }

    /**
     * devuelve el nº de personas a las que les gusta el color pasado como parámetro
     * Con el conjunto de entradas y un iterador
     */
    public int personasLesGustaColor(String color) {
        return 0;
    }

    /**
     * devuelve un conjunto ordenado con los nombres de las personas a las que les gusta
     * el color pasado como parámetro
     * Con el conjunto de claves y un for
     */
    public TreeSet<String> conjuntoPersonasLesGustaColor(String color) {
        return null;
    }

    /**
     * Borrar el color que le gusta a la persona indicada
     */
    public void borrarColor(String persona, String color) {

    }

}

