/**
 * Modela un dado de de 6 caras
 */

import java.util.Random;

public class Dado {
    private int cara;

    public final int NUM_CARAS;

    /**
     * Constructor de la clase Dado
     */
    public Dado() {
        cara = 1;
        int num_caras = Util.generarAleatorio(4, 20);
        while (!validarNumeroCaras(num_caras)) {
            num_caras = Util.generarAleatorio(4, 20);
        }
        NUM_CARAS = num_caras;
    }

    /**
     * Accesor
     *
     * @return el valor actual de la cara del dado
     */
    public int getCara() {

        return cara;
    }


    /**
     * Simula el lanzamiento del dado
     */

    public void tirarDado() {
        cara = Util.generarAleatorio(1, NUM_CARAS);
    }

    private boolean validarNumeroCaras(int numero) {
        switch(numero){
            case 4,6,8,10,12,20: return true;
            default: return false;
        }
    }

}
