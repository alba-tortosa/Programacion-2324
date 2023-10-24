package ejercicios;


import java.util.Scanner;

public class EjercicioSwitch_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime una letra y te diré si es una vocal o una consonante mayúscula o minúscula:");
        char letra = scanner.next().charAt(0);

        detectarTipoLetra(letra);
    }

    /**
     * si no es una letra mensaje error
     * si letra vocal mayúscula escribir "vocal mayúscula"
     * si letra vocal minúscula escribir "vocal minúscula"
     * En cualquier otro caso, mostrar "no es una vocal"
     */
    public static void detectarTipoLetra(char letra) {
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vocal minúscula");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("vocal mayúscula");
                break;
            default:
                System.out.println("no es una vocal");
        }
    }
}
