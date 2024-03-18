package AD07_FrecuenciaNumeros;
/**
 * La clase mantiene un map en el
 * que se registran las veces que
 * aparece cada uno de los numeros
 * de un fichero de texto
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FrecuenciaNumeros {


    /**
     * Constructor de la clase FrecuenciaNumeros
     */
    public FrecuenciaNumeros() {

    }

    /**
     *
     *
     * @param  numero el numero a añadir
     */
    public void anyadirNumero(int numero) {

    }


    /**
     * lee los numeros de un fichero de texto
     * Este metodo no hay que modificarlo
     *
     */
    public void cargarDeFichero() {
        try {
            Scanner sc = new Scanner(new File("numeros.txt"));
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

    }

}
