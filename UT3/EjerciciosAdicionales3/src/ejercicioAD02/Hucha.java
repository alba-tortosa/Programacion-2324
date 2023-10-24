package ejercicioAD02;

/**
 * Modela una hucha en la que podemos meter
 * y sacar dinero
 *  
 */
public class Hucha  {
    private int dinero;

    /**
     * Constructor de objetos de la clase Hucha
     */
    public Hucha()    {
        dinero = 0;
    }

    /**
     * Accesor para el dinero que
     * hay en la hucha
     * @return  la cantidad de dinero
     */
    public int getDinero()   {
        return dinero;
    }
    
    /**
     * Mutador para añadir más dinero
     * a la hucha
     * @param  cuanto la cantidad a añadir
     */
    public void anyadir(int cuanto)   {
        if (cuanto >= 0) {
            dinero += cuanto;
        } else {
            System.out.println("No puede introducir una cantidad negativa en la hucha.");
        }

    }
    
     /**
     * Mutador para sacar dinero de la hucha
     * @param  cuanto la cantidad a sacar
     */
    public void sacar(int cuanto)   {
        if (cuanto <= dinero) {
            dinero -= cuanto;
        } else {
            System.out.println("No puede sacar más dinero del que hay en la hucha.");
        }
    }
    
    /**
     * Mostrar detalles de la hucha 
     */
    public void printDetalles()    {
        System.out.println("******** HUCHA **************");
        System.out.println("Hay " + dinero + " euros");
        System.out.println("*****************************");
    }
    
    
}
