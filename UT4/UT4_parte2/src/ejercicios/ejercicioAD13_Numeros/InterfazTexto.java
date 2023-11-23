package ejercicios.ejercicioAD13_Numeros;

import java.util.Scanner;

public class InterfazTexto {
    private final int NUEVO_NUMERO = 1;
    private final int FACTORIAL = 2;
    private final int PRIMO = 3;
    private final int FIGURA = 4;
    private final int CONTAR_CIFRAS = 5;
    private final int ES_CAPICUA = 6;
    private final int A_BASE8 = 7;
    private final int ESTA_CIFRA = 8;
    private final int CIFRAS_REPETIDAS = 9;
    private final int A_BASE2 = 10;
    private final int SALIR = 11;
    private Numero numero;
    private Scanner teclado;

    /**
     * Constructor de la clase InterfazUsuario
     */
    public InterfazTexto() {
        teclado = new Scanner(System.in);
        numero = null;

    }

    /**
     * Controla la logica del objeto InterfazTexto
     * Se presenta un menu al usuario. Este selecciona una opcion.
     * Para cada opcion seleccionada hay un metodo privado que realiza
     * la tarea que representa
     */
    public void iniciar() {
        int opcion = menu();
        while (opcion != SALIR) {
            if (opcion >= FACTORIAL && opcion <= A_BASE2) {
                if (numero == null) {
                    System.out.println("Ejecute la opcion 1 para crear un numero");
                } else {
                    switch (opcion) {

                        case FACTORIAL:
                            factorial();
                            break;
                        case PRIMO:
                            primo();
                            break;
                        case FIGURA:
                            escribirFigura();
                            break;
                        case CONTAR_CIFRAS:
                            contarCifras();
                            break;
                        case ES_CAPICUA:
                            esCapicua();
                            break;
                        case A_BASE8:
                            aBase8();
                            break;
                        case CIFRAS_REPETIDAS:
                            hayCifrasRepetidas();
                            break;
                        case A_BASE2:
                            aBase2();
                            break;
                        case ESTA_CIFRA:
                            estaCifra();
                            break;
                    }
                }
            } else {
                numero = crearNumero();

            }

            opcion = menu();
        }
        System.out.println("¡¡¡ FIN de la aplicacion !!!");

    }

    /**
     * pide un n� y lo devuelve
     */
    private Numero crearNumero() {
        System.out.println("Introduzca un numero");
        int num = teclado.nextInt();
        if (numero == null) {
            numero = new Numero(num);
        } else {
            numero.setNumero(num);
        }
        return numero;
    }

    /**
     * Presenta un menu en la pantalla
     * para que el usuario pueda elegir su opcion
     *
     * @return devuelve la opcion seleccionada
     */
    private int menu() {

        System.out.println(" ..........................................................");
        System.out.println(" Elige una opcion ......");
        System.out.println(" ..........................................................");
        System.out.println(" 1.- Solicitar nuevo numero");
        System.out.println(" 2.- Factorial");
        System.out.println(" 3.- Primo");
        System.out.println(" 4.- Escribir figura");
        System.out.println(" 5.- Contar cifras");
        System.out.println(" 6.- Comprobar capicúa");
        System.out.println(" 7.- A base 8");
        System.out.println(" 8.- Está cifra");
        System.out.println(" 9.- Hay cifras repetidas");
        System.out.println(" 10.- A base 2");
        System.out.println(" 11.- Salir");

        //TODO
        // leer opcion y validarla usando leerOpcion() y opcionValida()
        //
        // leer opcion
        // mientras no sea valida
        //   volver a leer opcion

        return 0;
    }

    /**
     * lee una opcion y la devuelve
     */
    private int leerOpcion() {
        // TODO

        return 0;

    }

    /**
     * devuelve true si una opcion es valida, false en otro caso
     */
    private boolean opcionValida(int opcion) {
        // TODO

        return true;

    }

    /**
     * mostrar el factorial
     */
    private void factorial() {
        borrarPantalla();
        System.out.println("El factorial de " + numero.getNumero() + " es " + numero.factorial());

    }

    /**
     * indicar si es primo
     */
    private void primo() {
        borrarPantalla();
        // TODO

    }

    /**
     * escribir figura
     */
    private void escribirFigura() {
        borrarPantalla();
        // TOCO

    }

    /**
     * contarCifras
     */
    private void contarCifras() {
        borrarPantalla();
        // TODO

    }

    /**
     * Mostrar si es o no capicúa
     */
    private void esCapicua() {
        borrarPantalla();
        // TODO

    }

    /**
     * muestra el numero en base 8
     */
    private void aBase8() {
        borrarPantalla();
        // TODO

    }

    /**
     * muestra el numero en base 2
     */
    private void aBase2() {
        borrarPantalla();
        // TODO

    }

    /**
     * Muestra si hay o no cifras repetidas en el numero
     */
    public void hayCifrasRepetidas() {
        borrarPantalla();
        // TODO

    }

    /**
     * Pide una cifra e indica si está o no en el numero
     */
    public void estaCifra() {
        borrarPantalla();
        // TODO

    }

    /**
     * Borrar la pantalla
     */
    private void borrarPantalla() {
        System.out.print('\u000C');
    }

}

