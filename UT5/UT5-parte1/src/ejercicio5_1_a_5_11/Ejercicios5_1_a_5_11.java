package ejercicio5_1_a_5_11;

import java.util.Arrays;
import java.util.Random;

public class Ejercicios5_1_a_5_11 {

    public static final int MAX_ALUMNOS = 25;


    public static void main(String[] args) {

        // 5.1
        // un array precios que almacene los precios de los diferentes artículos de una tienda
        double[] precios;
        // un array plazasParking que indica si las plazas de un parking están libres o no
        boolean[] plazasParking;
        // un array que almacene los nombres de una serie de estudiantes
        String[] nombres;
        // un array que guarde la cantidad de lluvia caída en cada uno de los días del mes de noviembre en una determinada ciudad
        int[] diasLluviaNoviembre;


        // 5.2
        // un array para guardar los precios de 20 artículos
        precios = new double[20];
        System.out.println(Arrays.toString(precios));
        // un array para las n plazas de un parking (n es una variable entera)
        int n = 200;
        plazasParking = new boolean[n];
        // un array para almacenar los nombres de MAX alumnos (MAX es una constante de valor 25)
        nombres = new String[MAX_ALUMNOS];
        System.out.println(Arrays.toString(nombres));
        // un array que guarde la cantidad de lluvia caída en cada uno de los días del mes de noviembre
        diasLluviaNoviembre = new int[30];

        System.out.println("Tamño de plazasParking:" + plazasParking.length);

        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 2 * i;
        }
        System.out.println(Arrays.toString(numeros));

        // 5.3
        // Asigna a la variable numeroElementos el tamaño del array diasMes
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(diasMes[1]); // Dias del mes de febrero
        int diasFebrero = diasMes[1];
        // Suponiendo que el año es bisiesto asigna a febrero 29 días
        diasMes[1] = 29;
        System.out.println(diasMes[1]);


        escribirArray();
        escribirArrayV2();

        System.out.println(encontrarNombreDia(3));
        System.out.println(encontrarNombreDia(7));
        System.out.println(encontrarNombreDia(8));

        double[] notasEstudiantes = {3.3, 5.8, 9.1, 4.2, 6.4};
        double notaMedia = calcularMedia(notasEstudiantes);
        System.out.println("Nota Media: " + notaMedia);

        int[] enteros = {11, 4, 6, 55, 34};
        System.out.println("Antes enteros: " + Arrays.toString(enteros));
        rotarDerechaV2(enteros);
        System.out.println("Despues enteros: " + Arrays.toString(enteros));

        int[] enteros2 = {11, 4, 6, 55, 34};
        System.out.println("Antes enteros2: " + Arrays.toString(enteros2));
        int[] enteros3 = rotarDerechaV1(enteros2);
        System.out.println("Despues enteros2: " + Arrays.toString(enteros2));
        System.out.println("Despues enteros3: " + Arrays.toString(enteros3));

        int[] numeros2 = {2, 3, 4, 5, 6};
        int[] expandida = expandir(numeros2);
        System.out.println(Arrays.toString(expandida));

        System.out.println(Arrays.toString(calcularFrecuencias()));
    }

    /* 5.4.
     * Declara dentro del método un array local de 10 elementos enteros e inicialízalo con
     * los valores 1, 2, 3, …., 10 (declara e inicializa a la vez).
     * Escribe luego el contenido del array en pantalla.
     */
    public static void escribirArray() {
        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(valores));
    }

    public static void escribirArrayV2() {
        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%3d", valores[i]);
        }
    }

    public static void escribirArrayV3() {
        int[] valores = {1,2,3,4,5,6,7,8,9,10};
        for (int numero : valores) {
            System.out.printf("%3d", numero);
        }
    }

    /**
     * 5.5
     * * devolver el nombre del día de la
     * semana  correspondiente   al   parámetro   que  se  pasa  al   método
     * Si  el  valor  del parámetro es incorrecto se devolverá la cadena “Día incorrecto”;
     * @param diaSemana valor entre 1 y 7
     */

    public static String encontrarNombreDia(int diaSemana) {
        // declarar e inicializar un array con los nombres de los días de la semana
        String[] dias = {"Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        if (diaSemana < 1 || diaSemana > 7) return "Dia Incorrecto";
        return dias[diaSemana-1];
    }

    /**
     * 5.6
     * Calcular la media de los valores del array recibido como argumento
     * @param notas lista de valores decimales entre 0 y 10
     */
    public static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    /**
     * 5.7
     * Calcular y devolver el máximo
     * @param enteros lista de valores enteros
     */
    public static int calcularMaximo(int[] enteros) {
        int max= 0;
        for (int actual: enteros) {
            if (actual > max){
                max=actual;
            }
        }
        return max;
    }

    /**
     * 5.8
     * devolver otro array con los valores pares encontrados en el original
     * V1 - Contamos primeros los pares, creamos un array con
     * longitud la cantidad de pares, dejamos los pares y lo devolvemos
     * @param enteros lista de valores enteros
     */
    public static int[] buscarParesV1(int[] enteros) {
        //contamos cuantos numeros pares hay
        int cont = 0;
//        for (int numero : enteros) {
//            if (numero % 2 == 0) {
//                cont++;
//            }
//        }
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                cont++;
            }
        }

        int[] pares = new int[cont];
        int nuevoarray = 0;
//        for (int numero : enteros) {
//            if (numero % 2 == 0) {
//                pares[nuevoarray] = numero;
//                nuevoarray++;
//            }
//
//        }

        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                pares[nuevoarray] = enteros[i];
                nuevoarray++;
            }
        }
        return pares;
    }



    /**
     * 5.9
     * rotar una posición a la derecha el array numeros
     * Rotar sobre un nuevo array
     * Si numeros = {11, 4, 6, 55, 34} el array devuelto será {0, 11, 4, 6, 55}
     * @param numeros lista de valores enteros
     */
    public static int[] rotarDerechaV1(int[] numeros) {
        int[] nuevaLista = new int[numeros.length];
        for (int i = 0; i < numeros.length-1; i++) {
            nuevaLista[i+1] = numeros[i];
        }
        nuevaLista[0] = 0; //No es necesario porque al inicializar la lista todos los valores son 0
        return nuevaLista;
    }

    /**
     * 5.9
     * rotar una posición a la derecha el array numeros
     * Rotar sobre el mismo array
     * Si numeros = {11, 4, 6, 55, 34} el array devuelto será {0, 11, 4, 6, 55}
     * @param numeros lista de valores enteros
     */
    public static void rotarDerechaV2(int[] numeros) {
        for (int i = numeros.length - 1; i > 0; i--){
            numeros[i] = numeros[i - 1];
        }
        numeros[0] = 0;
    }

//    public static void rotarDerechaV3(int[] numeros) {
//        int aux;
//        for (int i = 1; i < numeros.length; i++) {
//            aux = numeros[i];
//            numeros[i] = numeros[i-1];
//        }
//    }

    /**
     * 5.10
     * crea un nuevo array con el doble de tamaño que el original
     * guarda en el nuevo array cada elemento del original copiado dos veces
     * Si numeros = {2, 3, 4, 5, 6} el array expandido será {2, 2, 3, 3, 4, 4, 5, 5, 6, 6}
     * @param numeros lista de valores enteros
     */
    public static int[] expandir(int[] numeros) {

        int[] expandida = new int[numeros.length*2];
        for (int i = 0; i < numeros.length; i++) {
            expandida[2*i] = numeros[i];
            expandida[2*i+1] = numeros[i];
        }
        return expandida;
    }

    public static int[] expandirV2(int[] numeros) {
        int[] expandida = new int[numeros.length*2];
        int index = 0;
        for (int numero : numeros) {
            expandida[index] = numero;
            expandida[index+1] =  numero;
            index+=2;
        }

        return expandida;
    }

    /**
     * 5.11
     * generar 100 aleatorios entre 1 y 9 y devolver la frecuencia de aparición del
     * valor 1, del valor 2, del valor 3, …
     */
    public static int[] calcularFrecuencias() {
       int[] frecuencias = new int[9];
       Random random = new Random();
        for (int i = 1; i <= 100 ; i++) {
            int numero = random.nextInt(1, 10);
            frecuencias[numero-1]++;
        }
        return frecuencias;
    }

}
