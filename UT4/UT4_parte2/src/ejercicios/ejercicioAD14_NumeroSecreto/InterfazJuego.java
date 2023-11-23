package ejercicios.ejercicioAD14_NumeroSecreto;

import java.util.Scanner;

/**
 * Modela la interfaz con el usuario
 */

public class InterfazJuego {
    private Scanner teclado;
    private JuegoNumeroSecreto juego;

    /**
     * Constructor de la clase InterfazJuego
     */
    public InterfazJuego() {

    }


    /**
     * Controla la logica del juego, se le pregunta al usuario si desea jugar,
     * si es asi se hace una presentacion del juego y se prepara este para empezar
     * a jugar. Se le solicitan diferentes numeros al usuario
     * hasta que lo adivina o se le agotan los
     * intentos, es decir, hasta que acaba el juego
     * Cuando el juego termina se da la posibilidad de jugar de nuevo.
     * Asi hasta que el usuario dice que no quiere continuar
     */
    public void jugar() {

    }

    /**
     * Solicitar al usuario un numero
     *
     * @return el numero tecleado
     */
    private int leerNumero() {

        return 0;
    }

    /**
     * Mensaje de bienvenida al juego
     */
    private void presentacionJuego() {
        borrarPantalla();
        System.out.println("*************************************************************");
        System.out.println("     Para jugar piensa un numero entre 1 y 100   ");
        System.out.println("     Has de adivinar un numero secreto en  " + juego.getMaximoIntentos() + " intentos    " +
                "    " + "  ");
        System.out.println("*************************************************************");
    }

    /**
     * Borrar la pantalla
     */
    private void borrarPantalla() {
        System.out.print('\u000C');
    }

    /**
     * Indicar al usuario si desea jugar otra vez
     * Devuelve la respuesta del usuario
     *
     * @return un caracter solicitado al usuario
     */
    private char seguirJugando(String mensaje) {
        return 0;
    }
}
