package ejercicios.ejercicioAD08_Dado;
/**
 * Modela un dado de de 6 caras
 */

import java.util.Random;

public class Dado {
    private int cara;
    private Random generador;

    private final int NUM_CARAS;

    /**
     * Constructor de la clase Dado
     */
    public Dado() {
        this.cara = 1;
        this.generador = new Random();
        this.NUM_CARAS = 6;
    }

    public Dado(int numCaras) {
        this.cara = 1;
        this.generador = new Random();
        this.NUM_CARAS = numCaras;
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
        this.cara = generador.nextInt(NUM_CARAS)+1;
    }

}
