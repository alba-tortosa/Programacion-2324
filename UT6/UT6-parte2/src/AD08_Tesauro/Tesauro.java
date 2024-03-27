package AD08_Tesauro;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Modela un diccionario en el que cada palabra
 * tiene asociados una serie de sinonimos
 */


public class Tesauro {
    // a cada clave se le asocia un conjunto de sinonimos
    //los sinonimos no se repiten
    private HashMap<String, HashSet<String>> tesauro;

    /**
     * Constructor de la clase Tesauro
     */
    public Tesauro() {
        tesauro = new HashMap<>();
    }

    /**
     * @param palabra la palabra a añadir
     * sinonimo el sinonimo de la palabra
     */
    public void anyadirSinonimo(String palabra, String sinonimo) {
        if (tesauro.containsKey(palabra)) {
            tesauro.get(palabra).add(sinonimo);
        } else {
            HashSet<String> sinonimos = new HashSet<>();
            sinonimos.add(sinonimo);
            tesauro.put(palabra, sinonimos);
        }
    }

    public void anyadirSinonimoV2(String palabra, String sinonimo) {
        if (!tesauro.containsKey(palabra)) {
            tesauro.put(palabra, new HashSet<>());
        }
        tesauro.get(palabra).add(sinonimo);
    }

    /**
     * añade una palabra junto con todos sus sinonimos
     *
     * @param linea contiene la palabra y sus sinonimos
     * el separador entre palabras es el blanco
     * la primera palabra es la clave, el resto sinonimos
     */
    public void anyadirSinonimo(String linea) {
        // El split divide la línea en palabras.
        String[] palabras = linea.split(" ");
        for (int i = 1; i < palabras.length; i++) {
            anyadirSinonimo(palabras[0], palabras[i]);
        }
    }

    /**
     * @param sin el sinonimo a borrar de cada conjunto
     *            de sinonimos
     * @return el conjunto de claves en las que estaba
     * el sinonimo borrado. Si no se borro
     * ninguno devuelve el conjunto vacio
     */
    public HashSet<String> borrarSinonimo(String sin) {
        HashSet<String> borrados = new HashSet<>();
        Set<String> keys = tesauro.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            HashSet<String> sinonimosKeys = tesauro.get(key);
            Iterator<String> it2 = sinonimosKeys.iterator();
            while (it2.hasNext()) {
                String sinonimo = it2.next();
                if(sinonimo.equalsIgnoreCase(sin)){
                    it2.remove();
                    borrados.add(sinonimo);
                }
            }
        }
        return borrados;
    }

    /**
     * @return
     */
    public String toString() {
        String texto = "";
        texto += String.format("%-15s %-50s", "PALABRA", "SINONIMOS");
        for (String key : tesauro.keySet()) {
            texto += "\n";
            texto += String.format("%-15s %-50s", key, tesauro.get(key));
        }
        return texto;
    }

    /**
     * Visualiza el tesauro
     */
    public void escribirTesauro() {

        System.out.println(toString());
    }

}
