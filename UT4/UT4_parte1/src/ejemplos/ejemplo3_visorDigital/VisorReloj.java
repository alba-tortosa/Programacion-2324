package ejemplos.ejemplo3_visorDigital;

/**
 * La clase VisorReloj implementa un panel de un reloj digital para un reloj
 * estilo 24 horas europeo. El reloj muestra horas, minutos y segundos. El rango del reloj es
 * 00:00:00 (medianoche) a 23:59:59 (un minuto antes de medianoche)
 * <p>
 * El reloj recibe "ticks" (via metodo emitirTicReloj) cada minuto y reacciona
 * incrementando el visor. Esto se hace de la manera habitual: la hora se incrementa
 * cuando los minutos alcanzan de nuevo el valor cero.
 */

public class VisorReloj {
    private VisorNumero horas;
    private VisorNumero minutos;
    private VisorNumero segundos;
    private String visorString; // simula el visor actual

    /**
     * Constructor de objetos VisorReloj. Este constructor crea un nuevo
     * reloj puesto en hora a las 00:00:00
     */

    public VisorReloj() {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        segundos = new VisorNumero(60);
        actualizarReloj();

    }


    /**
     * Constructor de objetos VisorReloj. Este constructor crea un nuevo
     * reloj puesto en hora a partir de los parametros pasados
     * al constructor
     */

    public VisorReloj(int hora, int minuto, int segundo) {
        horas = new VisorNumero(24);
        minutos = new VisorNumero(60);
        segundos = new VisorNumero(60);
        ponerEnHora(hora, minuto, segundo);

    }

    /**
     * Este metodo deberia llamarse una vez cada segundo -
     * permite que el reloj avance un segundo
     */

    public void emitirTic() {
        segundos.incrementar();
        if (segundos.getValor() == 0) {
            minutos.incrementar();
            if (minutos.getValor() == 0) {  // se da la vuelta
                horas.incrementar();
            }
        }
        actualizarReloj();
    }

    /**
     * Pone la hora en el visor a un deternminado valor de hora, minuto y segundo
     */

    public void ponerEnHora(int hora, int minuto, int segundo) {
        horas.setValor(hora);
        minutos.setValor(minuto);
        segundos.setValor(segundo);
        actualizarReloj();
    }

    /**
     * Devuelve la hora actual en el formato HH:MM.
     */
    public String getHora() {
        return visorString;
    }

    /**
     * Actualiza la cadena interna que representa el visor
     */
    private void actualizarReloj() {
        visorString = horas.getValorVisor()
                + ":" + minutos.getValorVisor()
                + ":" + segundos.getValorVisor();
    }

}