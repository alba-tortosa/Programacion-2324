package ejercicio15_Curso;

import java.util.Random;

/**
 * Guarda las notas que han sacado una serie
 * de estudiantes en varias asignaturas
 */
public class Curso {
    private static final int MAX_ESTUDIANTES = 10;
    private static final int MAX_ASIGNATURAS = 6;
    private int[][] notas;

    /**
     * Constructor
     */
    public Curso() {
        notas = new int[MAX_ESTUDIANTES][MAX_ASIGNATURAS];
        inicializar(notas);
    }

    /**
     * Inicializa el array con notas aleatorias entre 1 y 10 inclusive
     * Usaremos un generador
     */
    private void inicializar(int[][] notas) {
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = random.nextInt(1, 11);
            }
        }
    }

    /**
     * Representación textual de las notas
     * Cada nota formateada a 4 posiciones
     */
    public String toString() {
        String texto = "";
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                texto += String.format("%4d", notas[i][j]);
            }
            texto += "\n";
        }
        return texto;
    }

    /**
     * Muestra en pantalla el array 2D
     */
    public void escribir() {
        System.out.println(this.toString());

    }

    /**
     * Calcular la nota media por estudiante
     * Recorrido por filas
     */
    public double[] calcularMediaPorEstudiante() {
        double[] notasMedias = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            notasMedias[i] = suma / notas[i].length;
        }
        return notasMedias;
    }

    /**
     * Calcular la nota media por asignatura
     * Recorrido por columnas
     */
    public double[] calcularMediasPorAsignaturaColumnas() {
        double[] media = new double[notas[0].length];
        for (int j = 0; j < notas[0].length ; j++) {
            double suma=0;
            for (int i = 0; i <notas.length ; i++) {
                suma += notas[i][j];
            }
            media[j]=suma/notas.length;
        }
        return media;
    }

    public double[] calcularMediasPorAsignaturaFilas() {
        double[] medias = new double[notas[0].length];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                medias[j] += notas[i][j];
                if(i == notas.length -1){
                    medias[j] /= notas.length;
                }
            }
        }
        return medias;
    }

    /**
     * @param alumno nº de alumno (comienza en 1)
     */
    public int suspensosDelAlumno(int alumno) {
        if (alumno <= 0 || alumno > notas.length) {
            throw new IllegalArgumentException("Error en nº alumno");
        }
        int[] notasEstudiante = notas[alumno-1];
        int suspensos = 0;
        for (int nota : notasEstudiante) {
            if (nota < 5) suspensos++;
        }
        return suspensos;
    }

    /**
     * @param asignatura nº de asignatura (comienza en 1)
     */
    public int aprobadosEnAsignatura(int asignatura) {
        if (asignatura <= 0 || asignatura > notas[0].length) {
            throw new IllegalArgumentException("Error en nº asignatura");
        }
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i][asignatura-1] >= 5) aprobados++;
        }
        return aprobados;
    }
}
