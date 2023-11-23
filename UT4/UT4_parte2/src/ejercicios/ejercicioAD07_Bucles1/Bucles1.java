package ejercicios.ejercicioAD07_Bucles1;

import java.util.Random;

public class Bucles1 {

    public final static int TOTAL = 30;

    //A. Escribe los números que están comprendidos entre el parámetro desde y el parámetro hasta.
    //Si desde = 10 y hasta =30, escribe 10, 11, 12, ….. ,30
    public static void escribirNumero(int desde, int hasta) {
        while (desde <= hasta) {
            System.out.println(desde);
            desde = desde + 1;
        }
    }

    //B. Visualiza en la ventana de terminal los números pares entre 2 y 50.
    public static void mostrarPares() {

        int numero = 2;
        while (numero <= 50) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }

        //C. Genera y escribe números aleatorios entre 1 y 100 parando el proceso cuando se generan 30
        // o bien cuando salga un 99. El método cuenta también las veces que sale el 12 y devuelve este valor.
        public static int generarAleatorios() {
            //Para generar un nº aleatorio entre  1 y 100
            Random r = new Random();
            int contador = 1;
            int contador12 = 0;
            int numero = 0;
            while (contador <=30 && numero != 99){
                numero = r.nextInt(100);
                System.out.println(numero);
                if (numero == 12) contador12++;
                contador++;
            }
            return contador12;
        }

    public static int generarAleatorios2() {
        //Para generar un nº aleatorio entre  1 y 100
        Random r = new Random();
        int numero = 0;
        int doce = 0;
        int veces = 0;
        while (veces < 30 && numero != 99) {
            numero = r.nextInt(100);
            veces ++;
            if(numero == 12) {
                doce++;
            }
            System.out.println(numero);
        }
        System.out.println("veces de 12: " + doce);
        return doce;
    }

        //D. Calcula y devuelve la suma de la serie 1/1 + 1/2 + 1/3 + ... + 1/n
        public static double sumarSerie(int n) {
            double resultado = 0.0;
            int denominador = 1;

            while (denominador <= n) {
                resultado += 1.0 / denominador;
                denominador++;
            }
            return resultado;
        }

        //E. Calcula y devuelve la suma de los divisores de numero
        public static int sumarDivisores(int numero) {
            int divisor = 1;
            int total = 0;
            while (divisor <= numero){
                if(numero % divisor == 0){
                    total += divisor;
                }
                divisor += 1;
            }
            return total;
        }

        //F. Calcula y devuelve la suma de los dígitos de numero
        public static int sumarDigitos(int numero) {
            int n = numero;
            int suma = 0;
            while (n > 0){
                suma += n % 10;
                n = n / 10;
            }
            return suma;
        }

        //G. Devuelve true si numero es primo, false en otro caso
        // Un nº es primo si únicamente tiene como divisores él mismo y la unidad
        public static boolean esPrimo(int numero) {
            int divisor = 1;
            int divisores = 0;
            boolean esprimo=false;

            while (divisor <= numero) {
                if (numero % divisor == 0) {
                    divisores++;
                }
                divisor++;
            }
            if (divisores == 2) {
                esprimo=true;
            }
            return esprimo;
        }

        public static boolean esPrimo2(int numero) {
            if (sumarDivisores(numero)== (numero+1)){
                return true;
            }
            return false;
        }

    public static boolean esPrimo3(int numero) {

        int divisor = 2;
        while (divisor < numero) {
            if (numero % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

        //H. Genera 20 nºs aleatorios comprendidos entre 1 y 50 y cuenta los pares e impares generados escribiendo al
        // final esta cuenta. USA FOR
        public static void contarParesImpares() {
            int totalPares = 0;
            int totalmpares = 0;
            Random r = new Random();
            for (int generados = 1;generados <= 20;generados++){

                int numero = r.nextInt(50) + 1;
                if(numero % 2 == 0){
                    totalPares++;
                }
                if (numero % 2 != 0){
                    totalmpares++;
                }
            }
            System.out.println("El numero total de pares es: " + totalPares + "\nEl numero total de impares es: " + totalmpares);
        }

        //I. Calcula y devuelve el máximo de una secuencia de valores (tantos como indique cuantos) aleatorios
        // comprendidos entre 1 y 100. USA FOR
        public static int maximo ( int cuantos){

            Random r = new Random();
            int maximo = 0;
            for (int i = 1; i <= cuantos; i++) {
                int numero = r.nextInt(100) + 1;
                if (numero > maximo) maximo = numero;

            }
            return maximo;
        }

        // J. Genera  TOTAL notas aleatorias (comprendidas entre 1 y 10) y escribe la siguiente estadística:  media de
        // las notas, nota máxima, nota mínima, cuántas veces ha aparecido la nota máxima y cuántas la nota mínima.
        // TOTAL es una constante de valor 30. USA FOR
        public static void escribirEstadisticas () {

            double suma = 0;
            Random r = new Random();
            int numero = r.nextInt(10) + 1;
            int notaMax = numero;
            int notaMin = numero;
            int vecesNotaMax = 1;
            int vecesNotaMin = 1;

            for (int i = 1; i < TOTAL; i++) {
                //generamos numero aleatorio
                numero = r.nextInt(10) + 1;
                //sumamos el numero para calcular la media
                suma += numero;

                //comprobar si cambia la nota maxima
                if (numero > notaMax) {
                    notaMax = numero;
                    vecesNotaMax = 1;
                } else if (numero == notaMax) {
                    vecesNotaMax++;
                }
                //comprobar si cambia la nota minima
                if (numero < notaMin) {
                    notaMin = numero;
                    vecesNotaMin = 1;
                } else if (numero == notaMin) {
                    vecesNotaMin++;
                }

            }

            System.out.println("Nota max:" + notaMax + " veces:" + vecesNotaMax);
            System.out.println("Nota min:" + notaMin + " veces:" + vecesNotaMin);
            System.out.printf("Media: %.2f", suma / TOTAL);


        }

    }
