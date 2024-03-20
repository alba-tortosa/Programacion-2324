package AD07_FrecuenciaNumeros;
/**
 * La clase mantiene un map en el
 * que se registran las veces que
 * aparece cada uno de los numeros
 * de un fichero de texto
 */

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class FrecuenciaNumeros {

    private HashMap<String, Contador> frecuencias;

    /**
     * Constructor de la clase FrecuenciaNumeros
     */
    public FrecuenciaNumeros() {
        frecuencias = new HashMap<>();
    }

    /**
     *
     *
     * @param  numero el numero a añadir
     */
    public void anyadirNumero(int numero) {
        String key = String.valueOf(numero);
        if (!frecuencias.containsKey(key)){
            frecuencias.put(key, new Contador());
        }
        frecuencias.get(key).incrementar();
    }

    public void anyadirNumeroV2(int numero) {
        String key = String.valueOf(numero);
        if (!frecuencias.containsKey(key)){
            frecuencias.put(key, new Contador(1));
        } else {
            frecuencias.get(key).incrementar();
        }
    }


    /**
     * lee los numeros de un fichero de texto
     * Este metodo no hay que modificarlo
     *
     */
    public void cargarDeFichero() {
        try {
            Scanner sc = new Scanner(new File("src/AD07_FrecuenciaNumeros/numeros.txt"));
            while (sc.hasNext()) {
                anyadirNumero(sc.nextInt());
            } sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * Listar cada numero aparecido y su frecuencia
     * Se utiliza Map.Entry
     */
    public void listarFrecuencias() {
        System.out.printf("| %-10s | %-30s\n", "Número", "Frecuencia");
        Set<String> lista = this.frecuencias.keySet();
        for (String key : lista) {
            System.out.printf("| %-10s | %-30s\n", key, this.frecuencias.get(key));
        }
    }

    /**
     *
     * Muestra cuantos numeros diferentes han aparecido
     * y la relacion de todos ellos
     *
     * Se utiliza la "vista" sobre las claves
     * y un for each
     */
    public void listarNumeros() {
        System.out.println("Numeros aparecidos "+ frecuencias.size());
        for (String s : frecuencias.keySet()) {
            System.out.print(s +"  ");
        }
    }

}
