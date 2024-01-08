package ejercicio14_Diccionario;
/**
 * clase InterfazDiccionario
 */

import java.util.Scanner;

public class InterfazDiccionario {
    private static final int AÑADIR = 1;
    private static final int MOSTRAR = 2;
    private static final int TRADUCIR = 3;
    private static final int SALIR = 4;

    private Scanner teclado;
    private Diccionario diccionario;

    /**
     * Constructor de objetos de la clase InterfazDiccionario
     * Crea e inicializa adecuadamente los atributos
     */
    public InterfazDiccionario(Diccionario diccionario) {
        // TODO

    }

    /**
     * Incluye la logica de la aplicacion
     *
     */
    public void iniciar() {
        int opcion = menu();
        while (true) {


            opcion = menu();
        }
    }

    /**
     * Presenta el menu - pide una opcion y la valida
     *
     * @return la opcion seleccionada ya validada
     */
    private int menu() {
        System.out.println("********************************");
        System.out.println("Gestión de un diccionario\n");
        System.out.println("********************************");
        System.out.println("1. Añadir palabra");
        System.out.println("2. Mostrar diccionario");
        System.out.println("3. Traducir palabra");
        System.out.println("4. Salir");
        System.out.print("Teclea opción: ");
        int opcion = teclado.nextInt();
        while (!opcionValida(opcion)) {
            System.out.print("Opción incorrecta, Teclea opción: ");
            opcion = teclado.nextInt();
        }
        return opcion;

    }

    /**
     *  Valida una opcion recibida como parametro
     *  Devuelve true si la opcion es correcta, false en otro caso
     *   Sin if
     */
    private boolean opcionValida(int opcion) {
        return opcion >= AÑADIR && opcion <= SALIR;
    }

    /**
     * Añade una nueva palabra al diccioanrio
     */
    private void añadirPalabra() {
        teclado.nextLine(); //limpiar el buffer
        // TODO

    }

    /**
     * Mostrar el diccioanrio
     */
    private void mostrarDiccionario() {
        // TODO

    }

    /**
     * Traducir una  palabra al diccioanrio
     */
    private void traducirPalabra() {
        teclado.nextLine(); //limpiar el buffer
        // TODO

    }

}
