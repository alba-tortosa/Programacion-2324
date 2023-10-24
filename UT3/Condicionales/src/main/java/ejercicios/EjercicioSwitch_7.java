package ejercicios;


import java.util.Scanner;

public class EjercicioSwitch_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un día de la semana:");
        String diaSemana = scanner.next();

        diaLaborable(diaSemana);
    }

    /**
     * Demo de la sentencia switch
     * Escribe día laborable / No laborable (domingo)
     */
    public static void diaLaborable(String dia) {
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
            case "sabado":
                System.out.println("día laborable");
                break;
            case "domingo":
                System.out.println("día NO laborable");
                break;
            default:
                System.out.println("No has introducido un día de la semana.");
        }
    }
}
