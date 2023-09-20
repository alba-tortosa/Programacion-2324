/**
 * Ejercicio 2.11.
 * - El proyecto LabClase está diseñado para llevar el control de estudiantes
 * inscritos en un laboratorio y escribir la lista de todos ellos.
 * - Crea varios objetos de la clase Estudiante.
 * - Llama al método getNombre() de cada estudiante mostrando el resultado por pantalla. ¿Qué ocurre?
 * - Crea un objeto de la clase Laboratorio. Indica el máximo número de estudiantes que
 * tendrá el laboratorio
 * Envía el mensaje numeroEstudiantes() al objeto de la clase Laboratorio que acabas de crear y muestra el resultado por pantalla. ¿Qué devuelve?
 */

public class Ejercicio_2_11 {

    public static void main(String[] args) throws InterruptedException {

        Estudiante  estudiante1 = new Estudiante("Juan", "1234567");
        Estudiante  estudiante2 = new Estudiante("Maite", "1234568");
        Estudiante  estudiante3 = new Estudiante("Laura", "1234569");
        Estudiante  estudiante4 = new Estudiante("Ion", "1234570");

        String nombre1 = estudiante1.getNombre();
        String nombre2 = estudiante2.getNombre();
        String nombre3 = estudiante3.getNombre();
        String nombre4 = estudiante4.getNombre();

        System.out.println("Nombre del estudiante 1: " + nombre1);
        System.out.println("Nombre del estudiante 2: " + nombre2);
        System.out.println("Nombre del estudiante 3: " + nombre3);
        System.out.println("Nombre del estudiante 4: " + nombre4);

        Laboratorio laboratorio = new Laboratorio(30);
        int n = laboratorio.numeroEstudiantes();
        System.out.println("Número de estudiantes: " + n);

    }
}
