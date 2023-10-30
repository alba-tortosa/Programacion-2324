package ejercicioAD10;

/**
 * Modela a objetos Calculadora que registran una serie de números y
 * calculan la media, el máximo y el mínimo
 * 
 *  
 */
public class Calculadora
{
    private int cantidad; // cantidad de números introducidos
    private double suma; // suma de todos los números
    private int maximo; // el valor máximo de los números introducidos
    private int minimo;  // el valor mínimo de los números introducidos

    /**
     * constructor para los objetos de la clase Calculadora
     */
    public Calculadora()
    {
        cantidad = 0;
        suma = 0;
        maximo = Integer.MIN_VALUE;
        minimo = Integer.MAX_VALUE;
    }

    /**
     * añade un número a la calculadora
     * 
     * @param numero el número a añadir
     */
    public void addNumero(int numero)
    {
        suma += numero;
        cantidad++;
        if (numero > maximo)  {
            maximo = numero;
        }
        if (numero < minimo)  {
            minimo = numero;
        }

    }

    public double getMedia()
    {
        if (cantidad != 0) {
            return ( (double) suma / cantidad );
        }
        return 0;
    }

    /**
     * Escribir las estadísticas
     */
    public void printEstadisticas()
    {
        if (cantidad != 0) {
            System.out.println("Estadística final ");
            System.out.println("Cantidad total de números introducidos: " + cantidad);
            System.out.println("Suma total de los  números introducidos: " + suma);
            System.out.println("Valor máximo: " + maximo);
            System.out.println("Valor mínimo: " + minimo);
            System.out.println("Media de todos los números: " + getMedia());

        }
        else {
            System.out.println("No han llegado números a la calculadora ");
        }

    }
}
