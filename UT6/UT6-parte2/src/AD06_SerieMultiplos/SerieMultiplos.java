package AD06_SerieMultiplos;

import java.util.*;

/**
 * Multimap - Un objeto de esta clase guarda
 * en un map claves String que representan numeros
 * y multiplos asociados a esas claves

 */

public class SerieMultiplos {

    private HashMap<Integer, ArrayList<Integer>> mapMultiplos;

    /**
     * Constructor de la clase SeriePotencias
     */
    public SerieMultiplos() {
        mapMultiplos = new HashMap<>();
    }

    /**
     * @param num el numero que sera la clave String
     */
    public void anyadirEntrada(int num) {
        mapMultiplos.put(num, generarMultiplos(num));
    }

    /**
     * @param num el numero del que se generearan los multiplos
     * @return una coleccion ArrayLIst con los multiplos generados
     */
    private ArrayList<Integer> generarMultiplos(int num) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            multiplos.add(num * i);
        }
        return multiplos;
    }

    /**
     * @param num el numero del que se obtendran los multiplos
     * @return la coleccion asociada en el map
     */
    public ArrayList<Integer> obtenerMultiplosDe(int num) {
        return mapMultiplos.get(num);
    }


    /**
     * Visualiza el map (claves y valores asociados)
     */
    public void escribirMap() {
        System.out.printf("| %-10s | %-30s\n", "Clave", "Multiplos");
        Set<Integer> lista = this.mapMultiplos.keySet();
        for (int key : lista) {
            System.out.printf("| %-10s | %-30s\n", key, this.mapMultiplos.get(key));
        }
    }

    /**
     * borrar del map (de todas las entradas) el multiplo indicado
     * y devuelve el total de multiplos borrados
     * Con Map.Entry y un iterador
     */
    public int borrarMultiplo(int multi) {
        int cont = 0;
        ArrayList<Integer> nuevosMultiplos;
        Set<Map.Entry < Integer, ArrayList<Integer>>> entries = this.mapMultiplos.entrySet();
        for (Map.Entry < Integer, ArrayList<Integer>> entry : entries) {
            nuevosMultiplos = entry.getValue();
            Iterator<Integer> it = nuevosMultiplos.iterator();
            while (it.hasNext()){
                if (it.next() == multi){
                    it.remove();
                    cont ++;
                }
            }
        }
        return cont;
    }

}
