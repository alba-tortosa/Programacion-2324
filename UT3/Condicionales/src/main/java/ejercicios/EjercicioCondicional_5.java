package ejercicios;


import java.util.Scanner;

public class EjercicioCondicional_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime en qué curso está el estudiante (1/2): ");
        int curso = scanner.nextInt();
        System.out.println("Dime si ha aprobado todos los módulos (true/false): " );
        boolean aprobado = scanner.nextBoolean();

        hacerFct(curso, aprobado);
    }

    /**
     * Escribir "El estudiante hará la FCT" si es del curso segundo '' / 's' y ha
     * aprobado todos los módulos
     * En cualquier caso mostrar el mensaje "El estudiante NO hará la FCT"
     */
    public static void hacerFct(int curso, boolean haAprobado) {
        if (curso == 2 && haAprobado) {
            System.out.println("El estudiante hará la FCT");
        } else {
            System.out.println("El estudiante NO hará la FCT");
        }
    }
}
