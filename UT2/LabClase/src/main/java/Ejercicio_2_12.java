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


/** Ejercicio 2.12.
 * - Vuelve a crear los mismos estudiantes y el mismo laboratorio que en el ejercicio 2.11
 * - Llama al método matricularEstudiante() de la clase Laboratorio y proporciona como parámetro alguno de los estudiantes creados
 * - Haz lo mismo con dos o tres estudiantes más (matricúlalos en el laboratorio)
 * - Envía el mensaje numeroEstudiantes() al objeto de la clase Laboratorio que acabas de crear y muestra el resultado por pantalla. ¿Qué devuelve?
 * - Llama al método escribirLista() de la clase Laboratorio. Verás la lista de estudiantes matriculados en la ventana de Terminal
 * - Con el inspector de objetos (modo Debug) examina los atributos del objeto de la clase Laboratorio
 * */
public class Ejercicio_2_12 {

    public static void main(String[] args) throws InterruptedException {

        Estudiante  estudiante1 = new Estudiante("Juan", "1234567");
        Estudiante  estudiante2 = new Estudiante("Maite", "1234568");
        Estudiante  estudiante3 = new Estudiante("Laura", "1234569");
        Estudiante  estudiante4 = new Estudiante("Ion", "1234570");

        Laboratorio laboratorio = new Laboratorio(30);

        laboratorio.matricularEstudiante(estudiante1);
        laboratorio.matricularEstudiante(estudiante3);
        System.out.println("Número de estudiantes: " + laboratorio.numeroEstudiantes());
        laboratorio.escribirLista();
    }
}
