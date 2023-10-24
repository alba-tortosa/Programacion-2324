package ejemplos;

import java.util.Scanner;

/**
 *  Esta clase muestra algunos métodos con ejemplos de la sentencia condicional if y switch
 *  
 */
public class EjemploCondicional_2
{
    // no incluimos atributos, ni constructor

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        int numero = scanner.nextInt();

        System.out.println(esPositivoPar(numero));

    }

    /**
     * 
     */
    public static boolean  esPositivoPar(int numero)
    {    
        if   ( (numero  > 0)  && (numero % 2 ==  0))    {
            return true;
        }
        return false;   
    }

}
