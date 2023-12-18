package ejercicios.ejercicioAD11_Bucles2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 */
public class Bucles2 {
    private static final char ASTERISCO = '*';
    private static final char CRUZ = 'X';
    private static final char ALMOHADILLA = '#';
    private static final char GUION = '-';
    private static Scanner teclado = new Scanner(System.in);


    /**
     * A. Escribe los impares entre 1 y 100 (con un for)
     * (con for) - escribe en cada línea 8 números
     */
    public static void impares1a100() {

        int contadorLinea = 1;
        for (int i = 1; i <= 100; i+=2) {
            System.out.printf("%3d", i);
            //System.out.print(i);
            if(contadorLinea == 8) {
                System.out.printf("\n");
                contadorLinea = 0;
            }
            contadorLinea++;
        }
    }

    /**
     * B. Escribe los 10 primeros múltiplos de n
     * (con for) -
     */
    public static void multiplos(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n*i);
        }
    }

    /**
     * C. Detecta si n es un nº primo
     * Hazlo con un while. En cuanto detectes que el
     * nº no es primo sal del bucle con un return
     * El 1 no es un nº primo
     */
    public static boolean esPrimo(int n) {
        if (n == 1) return false;
        int divisor = 2;
        while (divisor < n) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

    /**
     * D. Calcula y devuelve el primo más cercano a n
     * Si n = 12 el primo más cercano es 11
     * S n = 15 el primo más cercano es 13
     * Utiliza el método anterior para detectar si un nº es primo o no
     * Con while
     */
    public static int primoCercano(int n) {
        int primoAbajo = n;
        int primoArriba = n;
        while (!esPrimo(primoAbajo)){
            primoAbajo--;
        }
        while (!esPrimo(primoArriba)){
            primoArriba++;
        }
        int diferenciaAbajo = n - primoAbajo;
        int diferenciaArriba = primoArriba - n;

        if (diferenciaAbajo < diferenciaArriba) return primoAbajo;
        else return primoArriba;

    }

    /**
     * E. Escribe los n primeros números primos
     * Si n = 7 entonces  2   3   5   7   11   13   17
     * <p>
     * Con while
     */
    public static void primos(int n) {

        int numero = 2;
        int contadorPrimos = 0;
        while(contadorPrimos < n) {
            if (esPrimo(numero)) {
                //System.out.println(numero);
                System.out.printf("%3d", numero);
                contadorPrimos++;
            }
            numero++;
        }
    }

    /**
     * F. Genera aleatorios entre 0 y 50 y por cada aleatorio escribe tantas X
     * como indique el nº.  El final del proceso termina con el 0
     * <p>
     * Hay que hacer un bucle anidado (un while y dentro un for)
     * <p>
     * Posible resultado
     * XXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXXXX
     * XXXXXXXXXXXXXXXX
     */
    public static void grafico() {

        Random generador = new Random();
        int numero = generador.nextInt(51);
        while (numero != 0) {
//            System.out.print(numero);
            for (int i = 0; i < numero; i++) {
                System.out.print("X");
            }
            System.out.println();
            numero = generador.nextInt(51);
        }
    }

    /**
     * G. Escribe los números entre ALTO y BAJO que
     * son múltiplos de 4 pero no de 5 (con for)
     */
    void multiplos() {
        final int ALTO = 40;
        final int BAJO = 2;

        for (int i = BAJO; i <= ALTO; i++) {
            if(i%4 == 0 && i%5 != 0){
                System.out.println(i);
            }

//            if(i%4 == 0 && !(i%5 == 0)){
//                System.out.println(i);
//            }
        }

    }

    /**
     * H. Escribe la siguiente figura para 10 filas y 8 columnas (con for)
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     * ########
     */
    public static void figura1() {
        for (int i = 0; i <10 ; i++) {
//            for (int j = 0; j <8 ; j++) {
//                System.out.print(ALMOHADILLA);
//            }
//            System.out.println();

            System.out.println("#".repeat(8));
        }
    }

    /**
     * I. Cuenta y devuelve las apariciones de cifra en numero
     * (con while)
     */
    public static int contarApariciones(int numero, int cifra) {
        int apariciones=0;
        while (numero!=0){
            if (numero%10 ==cifra) {
                apariciones++;
            }
            numero=numero/10;

        }
        return apariciones;

    }

    /**
     * J. escribe n guiones en la misma línea
     * (con for) - Usa la constante adecuada
     */
    public static void escribirGuiones(int n) {
        for (int i = 0; i < n ; i++) {
            System.out.print(GUION);
        }
    }

    /**
     * K. Escribe la siguiente figura
     * (con for) - utiliza el método escribirGuiones()
     * usa las constantes adecuadas
     * *
     * -*
     * --*
     * ---*
     * ----*
     * -----*
     */
    public static void figura2(int filas) {
        for (int i = 0; i < filas; i++) {
            escribirGuiones(i);
            System.out.println(ASTERISCO);
        }
    }

    /**
     * L. Calcula y escribe las 10 primeras potencias de 2 (con for)
     * Utiliza Math.pow() - Con for
     * <p>
     * 2 elevado a 0 es 1
     * 2 elevado a 1 es 2
     * 2 elevado a 2 es 4
     * 2 elevado a 3 es 8
     * 2 elevado a 4 es 16
     * 2 elevado a 5 es 32
     * 2 elevado a 6 es 64
     * 2 elevado a 7 es 128
     * 2 elevado a 8 es 256
     * 2 elevado a 9 es 512
     * 2 elevado a 10 es 1024
     */
    public static void potencias() {
        for (int i = 0; i <= 10; i++){
            int numeroPotenciado = (int) Math.pow(2,i);
//            long numeroPotenciado = Math.round(Math.pow(2,i));
            System.out.printf("2 elevado a %d es %d\n", i, numeroPotenciado);
        }
    }

    /**
     * M. Escribe la siguiente figura donde inicio marca el primer valor
     * en la primera fila del cuadrado y fin el primer valor en la última fila del cuadrado
     * Con for
     * <p>
     * El ejemplo es para la llamada  printCuadrado(3, 8);
     * <p>
     * 3   4   5   6   7   8
     * 4   5   6   7   8   3
     * 5   6   7   8   3   4
     * 6   7   8   3   4   5
     * 7   8   3   4   5   6
     * 8   3   4   5   6   7
     */
    public static void printCuadrado(int inicio, int fin) {

//        for (int i = inicio; i <= fin; i++) {
//            System.out.println(i);
//            for (int j = i; j < ; j++) {
//
//            }
//        }

    }

    /* N. Eescribe la siguiente figura, si n = 6 (por ej.)
            1
            1   2
            1   2   3
            1   2   3   4
            1   2   3   4   5
            1   2   3   4   5   6

     */

    public static void printTriangulo(int n) {

    }


    // O. Escribe la tabla de multiplicar de l 1, del 2, del 3, .... hasta la tabla de "numero"
    public static void escribirTablasMultiplicar(int numero) {

    }

    /**
     * P. Escribe la siguiente figura
     * <p>
     * 00
     * 10  11
     * 20  21  22
     * 30  31  32  33
     * 40  41  42  43  44
     * 50  51  52  53  54  55
     * 60  61  62  63  64  65  66
     * 70  71  72  73  74  75  76  77
     * 80  81  82  83  84  85  86  87  88
     * 90  91  92  93  94  95  96  97  98  99
     */
    public static void figura4() {

    }


    /**
     * Hacer una pausa en la pantalla
     */
    public static void hacerPausa() {
        System.out.println("Pulse Intro para continuar");
        teclado.nextLine();

    }

}
