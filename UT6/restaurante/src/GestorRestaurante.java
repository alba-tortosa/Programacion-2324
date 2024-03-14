/**
 * El gestor del restaurante, interfaz de texto
 * para interactuar con el usaurio
 */

import java.util.Scanner;


public class GestorRestaurante {

    private final int RESERVAR = 1;
    private final int MOSTRAR_RESTAURANTE = 2;
    private final int LISTAR_RESERVAS = 3;
    private final int ELIMINAR_RESERVAS = 4;
    private final int SALIR = 5;

    private Restaurante r;
    private Scanner teclado;

    /**
     * El constructor del gestor
     * @param r el restautante a gestionar
     */

    public GestorRestaurante(Restaurante r) {
        this.r = r;
        teclado = new Scanner(System.in);

    }

    /**
     * Logica del interfaz
     */

    public void iniciar() {
        int opcion = menu();
        while (opcion != SALIR) {
            switch (opcion) {
                case RESERVAR:
                    reservar();
                    break;
                case MOSTRAR_RESTAURANTE:
                    mostrarRestaurante();
                    break;
                case LISTAR_RESERVAS:
                    listarReservas();
                    break;
                case ELIMINAR_RESERVAS:
                    eliminarReservas();
                    break;

            }
            opcion = menu();
        }
    }

    /**
     * Reserva de una mesa
     */
    private void reservar() {

    }

    /**
     * Mostrar reservas efectuadas
     */
    private void listarReservas() {

    }

    /**
     * Elimiar todas las reservas
     */
    private void eliminarReservas() {

    }

    /**
     * Visualizar el esatdo del restaurante
     */
    private void mostrarRestaurante() {

    }

    /**
     * Metodo de ayuda para presentar el menu
     */
    private int menu() {
        int opcion;
        System.out.println(" ****************************");
        System.out.println(" **    " + r.getNombre() + "  **");
        System.out.println(" ****************************");
        System.out.println();
        System.out.println(" 1.- Reservar");
        System.out.println(" 2.- Mostrar restaurante");
        System.out.println(" 3.- Listar reservas");
        System.out.println(" 4.- Eliminar reservas");
        System.out.println(" 5.- Salir");
        System.out.println(" Teclea opcion....");
        opcion = teclado.nextInt();
        return opcion;
    }

}
