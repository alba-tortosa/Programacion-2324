package ejercicio2_Curso;

/**
 * La clase mantiene informacion sobre un estudiante
 */

public class Estudiante {
    private String nombre;
    private int nota;

    private int edad;

    /**
     * constructor para los objetos de la clase Estudiante
     */
    public Estudiante(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Accesor para la nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * Mutador para la nota
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Representacion textual del estudiante
     */
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Nota: " + getNota() + "\n";

    }

}
