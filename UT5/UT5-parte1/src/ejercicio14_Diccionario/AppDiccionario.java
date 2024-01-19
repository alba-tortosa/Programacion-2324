package ejercicio14_Diccionario;

/**
 * 
 *  
 */
public class AppDiccionario
{

    /**
     *   crea el diccionario
     *   crea e inicia el interfaz
     *  
     */
    public static void main(String[] args)   {
          Diccionario diccionario =  new Diccionario(4);
          InterfazDiccionario interfaz = new InterfazDiccionario(diccionario);
          interfaz.iniciar();
    }
}
