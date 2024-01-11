package A2_AmigoInvisible;

import java.util.Arrays;
import java.util.Random;

public class JuegoAmigoInvisible {
    private static final int MAX_PARTICIPANTES = 50;
    private Random generador;
    private Participante[] participantes;
    private int pos;

    /**
     * crea la "bolsa" de participantes al tamaño maximo
     */
    public JuegoAmigoInvisible() {

    }

    /**
     * Añade un participante al final de la bolsa si no esta llena
	 * se asume que el participante no existe
     */
    public void add(Participante participante) {


    }

    /**
     * devuelve el total de participantes
     */
    public int totalParticipantes() {
        return 0;

    }

    /**
     * devuelve una copia con el numero real de participantes
     */
    public Participante[] getParticipantes() {
        return null;

    }

    /**
     * dado un nombre de participante devuelve la posicion donde se encuentra o -1 si
     * no esta
     * Nota -  para comparar cadenas haremos cadena1.equalsIgnoreCase(cadena2) 
     * que devuelve true si cadena1 es igual a cadena2 
     * (sin importar mayusculas o minusculas)
     */
    private int buscarParticipante(String nombre) {

        return 0;
    }

    /**
     *  dado un nombre de participante indica si esta ya en la bolsa
     */
    public boolean estaParticipante(String nombre) {
        return false;

    }

    /**
     * dado un nombre de participante devuelve el objeto asociado a el
     *  
     */
    public Participante datosDe(String nombre) {

        return null;
    }

    /**
     * Representacion textual de todos los participantes
     *  
     */
    public String toString() {
        return null;
    }

    /**
     * "Revuelve" la bolsa de participantes. 
     * Se puede hacer de forma sencilla
     * intercambiando un numero determinado de veces pares de elementos
     * del array participantes de posiciones aleatorias
     * 
     */
    public void revolverParticipantes() {

    }

    /**
     * Elimina todas las asignaciones de emisor y receptor
     * de todos los participantes
     */
    public void reset() {

    }

    /**
     * Realiza la asignacion a cada participante del amigo invisible
     * previo "barajeo" de la bolsa inicial
     */
    public void asignarAmigos() {


    }

    /**
     * dado un participante lo borra. Se devuelve true si la operacion ha tenido exito
     * (estaba el participante) o false si no ha habido exito (el participante no existia)
     * Cada vez que se borra un participante hay que eliminar 
     * todas las asignaciones de emisor y receptor
     */
    public boolean borrarParticipante(String nombre) {
        return false;
    }

    /**
     * borra todos los participantes
     */
    public void borrarTodos() {

    }


}
