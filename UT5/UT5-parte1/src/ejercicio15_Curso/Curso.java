package ejercicio15_Curso;

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

    }

    /**
     * Inicializa el array con notas aleatorias entre 1 y 10 inclusive
     * Usaremos un generador
     */
    private void inicializar(int[][] notas) {

    }

    /**
     * Representación textual de las notas
     * Cada nota formateada a 4 posiciones
     */
    public String toString() {
        return null;
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

        return null;
    }

    /**
     * Calcular la nota media por asignatura
     * Recorrido por columnas
     */
    public double[] calcularMediasPorAsignatura() {

        return null;
    }

    /**
     * @param alumno nº de alumno (comienza en 1)
     */
    public int suspensosDelAlumno(int alumno) {
        if (alumno < 0 || alumno >= notas.length) {
            throw new IllegalArgumentException("Error en nº alumno");
        }

        return 0;
    }

    /**
     * @param asignatura nº de asignatura (comienza en 1)
     */
    public int aprobadosEnAsignatura(int asignatura) {
        if (asignatura < 0 || asignatura >= notas[0].length) {
            throw new IllegalArgumentException("Error en nº asignatura");
        }

        return 0;
    }
}
