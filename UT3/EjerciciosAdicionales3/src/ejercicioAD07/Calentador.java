package ejercicioAD07;

/**
 * Modela objetos Calentador que
 * registran la temperatura de algún lugar y permiten
 * calentar(aumentar) y enfriar(disminuir) esa
 * temperatura
 * 
 */
public class Calentador
{
 
    private double temperatura;
    private double minimo;
    private double maximo;
    private final double incremento = 0.5;

    /**
     * constructor para los objetos de la clase Calentador
     * Inicialmente la temperatura inicial es 15
     */
    public Calentador(double queMinimo, double queMaximo)    {
        this.temperatura = (queMinimo + queMaximo) / 2;
        this.minimo = queMinimo;
        this.maximo = queMaximo;
    }
    
    /**
     * Incrementa la temperatura en 5 grados (luego en incremento)
     * teniendo  en cuenta que no sobrepase el máximo
     */
    
    public void calentar()    {
        double nuevaTempe = temperatura + incremento;
        if (nuevaTempe <= maximo)  {
            temperatura = nuevaTempe;
        }
        else  {
            System.out.println("No se puede subir la temperatura por encima de la temperatura mínima del calentador.");
            temperatura = maximo;
        }
    }
    
    /**
     *  Decrementa la temperatura en 5 grados (luego el incremento), no hay que bajar
     *  del mínimo
     */
    public void enfriar()    {
        double nuevaTempe = temperatura - incremento;
        if (nuevaTempe >= minimo) {
            temperatura = nuevaTempe;
        }
        else {
            System.out.println("No se puede bajar la temperatura por debajo de la temperatura mínima del calentador.");
            temperatura = minimo;
        }
    }


    /**
     * Escribir información sobre el calentador
     */
    public void printInformacion() {
        System.out.println("Temperatura mínima y máxima: " + minimo + "ºC / " + maximo + "ºC");
        System.out.println("Temperatura actual: " + temperatura + "ºC");
    }

}
