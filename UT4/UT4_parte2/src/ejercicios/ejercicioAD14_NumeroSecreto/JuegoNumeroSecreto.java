package ejercicios.ejercicioAD14_NumeroSecreto;

import java.util.Random;

/**
 * La clase JuegoNumeroSecreto modela las reglas del
 * juego
 */

public class JuegoNumeroSecreto {
    private static final int MAX_INTENTOS = 5;
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
        this.intentos = new Contador();
        this.generador = new Random();
        //resetJuego();
    }

    /**
     * Prepara todo para empezar a jugar,
     * genera un numero secreto, el contador de intentos se pone otra vez a 0
     * etc, .......
     */
    public void resetJuego() {
        intentos.reset();
        this.terminado = false;
        this.numeroSecreto = generador.nextInt(1, 101);
        this.resultado = "";
    }

    /**
     * Accesor para el numero de intentos
     */
    public int getIntentos() {
        return intentos.getContador();
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
        intentos.incrementar();
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
        incrementarIntentos();

        if (getIntentos() == MAX_INTENTOS || intentado == this.numeroSecreto) {
            this.terminado = true;
            if (intentado == this.numeroSecreto) {
                this.resultado = "Has acertado el numero";
            } else {
                this.resultado = "Lo siento, has agotado los " + MAX_INTENTOS + " intentos";
            }
        } else {
            if (intentado > this.numeroSecreto) {
                this.resultado = "Más bajo";
            } else if (intentado < this.numeroSecreto) {
                this.resultado = "Más alto";
            }
        }
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
