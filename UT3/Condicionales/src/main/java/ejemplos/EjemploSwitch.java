package ejemplos;

import java.util.Scanner;

/**
 *  Esta clase muestra algunos métodos con ejemplos de la sentencia condicional if y switch
 *  
 */
public class EjemploSwitch
{
    // no incluimos atributos, ni constructor

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero de día de la semana:");
        int numero = scanner.nextInt();

        System.out.println(diaSemana(numero));


    }

    /**
     * Demo de la sentencia switch
     */
    public static String diaSemana(int dia)
    {
        String nombreDia;
        switch    (dia)    {
            case 1:    nombreDia = "Lunes";
            break;
            case 2:    nombreDia = "Martes";
            break;
            case 3:    nombreDia = "Miércoles";
            break;
            case 4:    nombreDia = "Jueves";
            break;
            case 5:    nombreDia = "Viernes";
            break;
            case 6:    nombreDia = "Sábado";
            break;
            case 7:    nombreDia = "Domingo";
            break;
            default:  nombreDia = "Incorrecto";
            break;
        }
        return nombreDia;
    }

}
