package ejemplo_Map;

import java.util.*;

/**
 * Una colección HashMap que asocia países con sus capitales
 */

public class MapPaises {

    private HashMap<String, String> mapPaises;

    /**
     * Constructor
     */
    public MapPaises() {
        this.mapPaises = new HashMap<>();
    }

    /**
     * Añadir una nueva entrada al map, la clave es el país, el
     * valor asociado la capital
     */
    public void addPais(String pais, String capital) {
        this.mapPaises.put(pais, capital);
    }

    /**
     * Dado un país obtener su capital
     */
    public String capitalDe(String pais) {
        return this.mapPaises.get(pais);
    }

    /**
     * detecta si existe o no una clave en el map
     */
    public boolean estaPais(String pais) {
        return this.mapPaises.containsKey(pais);
    }

    /**
     * Dado un país elimina la entrada correspondiente a esa clave
     */
    public void borrarPais(String pais) {
        this.mapPaises.remove(pais);
    }

    /**
     * detecta si existe o no un valor en el map
     */
    public boolean estaCapital(String capital) {
        return this.mapPaises.containsValue(capital);
    }


    /**
     * nº de elementos del map
     */
    public int totalPaises() {
        return this.mapPaises.size();
    }

    /**
     * Mostrar cada país junto con su capital
     * Recorremos el map obteniendo el conjunto de claves (keySet)
     * Con for mejorado
     */
    public void mostrarPaisesV1() {
        Set<String> keys = this.mapPaises.keySet();
        for (String key : keys) {
            System.out.println(key + " " + this.mapPaises.get(key));
        }
    }

    /**
     * Mostrar cada país junto con su capital
     * Recorremos el map obteniendo el conjunto de claves (keySet)
     * Con iterador
     */
    public void mostrarPaisesV2() {
        Set<String> keys = this.mapPaises.keySet();
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + " " + this.mapPaises.get(key));
        }
    }

    /**
     * Mostrar cada país junto con su capital
     * Recorremos el map obteniendo el conjunto de entradas (entrySet)
     * Con for mejorado
     */
    public void mostrarPaisesV3() {
        Set<Map.Entry<String, String>> entries = this.mapPaises.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    /**
     * Mostrar cada país junto con su capital
     * Recorremos el map obteniendo el conjunto de entradas (entrySet) y recorriéndolas
     * con un iterador
     */
    public void mostrarPaisesV4() {

    }

    /**
     * Devuelve la colección de capitales presentes en el map
     */
    public Collection<String> grupoCapitales() {
        return this.mapPaises.values();
    }
}
