package ejercicios.ejercicioAD14_NumeroSecreto;

import java.util.Random;

/**
 * La clase JuegoNumeroSecreto modela las reglas del
 * juego
 */

public class JuegoNumeroSecreto {
    private final int MAX_INTENTOS = 5;
    private int numeroSecreto;
    private Contador intentos;
    private boolean terminado;
    private String resultado; // aquí se deja el mensaje "Más alto", "Más bajo", "Has adivinado el numero", ......
    private Random generador;

    /**
     * Constructor de la clase JuegoNumeroSecreto
     * crea el generador y el contador de intentos y prepara
     * el juego para empeazr a jugar (llama a resrJuego())
     */
    public JuegoNumeroSecreto() {

    }

    /**
     * Prepara todo para empezar a jugar,
     * genera un numero secreto, el contador de intentos se pone otra vez a 0
     * etc, .......
     */
    public void resetJuego() {

    }

    /**
     * Accesor para el numero de intentos
     */
    public int getIntentos() {
        return 0;
    }


    /**
     * Devuelve el maximo numero de intentos permitidos
     */
    public int getMaximoIntentos() {
        return MAX_INTENTOS;
    }


    /**
     * Aumenta el numero de intentos por parte del usuario
     */

    public void incrementarIntentos() {

    }

    /**
     * Simula una unica jugada
     * <p>
     * Cada nueva jugada es un intento mas. Habra que comprobar si
     * ha acertado o no y si ha consumido todos sus intentos actualizando el estado
     * del juego adecuadamente. El resultado "Más alto", "Más bajo", .... se deja
     * en resultado
     *
     * @param intentado el numero intentado
     */
    public void realizarJugada(int intentado) {

    }

    /**
     * Accesor que devuelve el valor del atributo terminado
     */
    public boolean haTerminado() {
        return terminado;
    }

    /**
     * Accesor para el resultado obtenido
     */
    public String getResultado() {
        return resultado;
    }

}
