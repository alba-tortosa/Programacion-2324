package ejercicio26_Directorio;
/**
 * clase InterfazDiccionario
 */

import java.util.Scanner;

public class InterfazDirectorio {
    private static final int AÑADIR = 1;
    private static final int EXISTE = 2;
    private static final int TAMAÑO = 3;
    private static final int MAYOR = 4;

    private static final int ORDENAR = 5;
    private static final int RENOMBRAR = 6;
    private static final int MOSTRAR = 7;
    private static final int SALIR = 8;

    private Scanner teclado;
    private Directorio directorio;

    /**
     * Constructor de objetos de la clase InterfazDiccionario
     * Crea e inicializa adecuadamente los atributos
     */
    public InterfazDirectorio(Directorio directorio) {
        teclado = new Scanner(System.in);
        this.directorio = directorio;
    }

    /**
     * Incluye la logica de la aplicacion
     */
    public void iniciar() {
        int opcion = menu();
        while (opcion != SALIR) {
            switch (opcion) {
                case AÑADIR -> añadirFichero();
                case EXISTE -> buscarFichero();
                case TAMAÑO -> mostrarTamañoDirectorio();
                case MAYOR -> mostrarFicherosMayorTamaño();
                case ORDENAR -> mostrarFicherosOrdenados();
                case RENOMBRAR -> renombrarFichero();
                case MOSTRAR -> mostrarDirectorio();
            }
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
        System.out.println("Gestión de un directorio\n");
        System.out.println("********************************");
        System.out.println("1. Añadir fichero");
        System.out.println("2. Buscar fichero");
        System.out.println("3. Tamaño del directorio");
        System.out.println("4. Ficheros de mayor tamaño");
        System.out.println("5. Ordenar ficheros por nombre");
        System.out.println("6. Renombrar fichero");
        System.out.println("7. Mostrar directorio");
        System.out.println("8. Salir");
        System.out.print("Teclea opción: ");
        int opcion = teclado.nextInt();
        while (!opcionValida(opcion)) {
            System.out.print("Opción incorrecta, Teclea opción: ");
            opcion = teclado.nextInt();
        }
        return opcion;

    }

    /**
     * Valida una opcion recibida como parametro
     * Devuelve true si la opcion es correcta, false en otro caso
     * Sin if
     */
    private boolean opcionValida(int opcion) {
        return opcion >= AÑADIR && opcion <= SALIR;
    }

    /**
     * Añade un nuevo fichero al directorio
     */
    private void añadirFichero() {

    }

    /**
     * Busca si un fichero existe
     */
    private void buscarFichero() {

    }

    /**
     * Muestra el tamaño total del directorio
     */
    private void mostrarTamañoDirectorio() {

    }

    /**
     * Muestra la lista de ficheros con mayor tamaño
     */
    private void mostrarFicherosMayorTamaño() {

    }

    /**
     * Muestra la lista de ficheros ordenados por nombre
     */
    private void mostrarFicherosOrdenados() {

    }

    /**
     * Renombra un fichero
     */
    private void renombrarFichero() {

    }

    /**
     * Mostrar el directorio
     */
    private void mostrarDirectorio() {

    }

}
