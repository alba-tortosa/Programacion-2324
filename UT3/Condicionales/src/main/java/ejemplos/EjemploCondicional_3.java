package ejemplos;

import java.util.Scanner;

/**
 *  Esta clase muestra algunos métodos con ejemplos de la sentencia condicional if y switch
 *  
 */
public class EjemploCondicional_3
{
    // no incluimos atributos, ni constructor

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero entero:");
        int numero = scanner.nextInt();

        System.out.println(metodoMisterioV1(numero));
        System.out.println(metodoMisterioV2(numero));
        System.out.println(metodoMisterioV3(numero));

    }

    /**
     * 
     */
    public static boolean  metodoMisterioV1(int valor)
    {        
        if   (valor  >= 0)   {
            return true;
        }
        return false;   
    }

    /**
     * Uso de una variable local para devolver el valor después con return
     */
    public static boolean  metodoMisterioV2(int valor)
    {
        boolean resul = false;
        if   (valor  >= 0)     {
            resul = true;
        }
        return resul;   
    }

    /**
     * El método anterior con expresión booleana
     */
    public static boolean  metodoMisterioV3(int valor)
    {
        return (valor >= 0);
    }


}
