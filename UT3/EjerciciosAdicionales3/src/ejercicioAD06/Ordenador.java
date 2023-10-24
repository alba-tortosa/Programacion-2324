package ejercicioAD06;

/**
 * Representa a objetos Ordenador
 */
public class Ordenador {
    // máxima cantidad de memoria en MB que puede tener instalada
    private int maxMemoria;
    // memoria actualmente instalada en MB
    private int memoriaInstalada;

    /**
     * constructor para los objetos de la clase Ordenador
     *
     * @param maximaMemoria la memoria máxima que va a ser instalada
     */
    public Ordenador(int maximaMemoria) {
        if (maximaMemoria <= 0) {
            maxMemoria = 16000;
        } else {
            maxMemoria = maximaMemoria;
        }
        memoriaInstalada = 0;
    }

    /**
     * devolver la máxima memoria que puede tener instalada
     *
     * @return la máxima cantidad de memoria que puede tener
     * el ordenador
     */
    public int getMaxMemoria() {
        return maxMemoria;
    }

    /**
     * Devolver la memoria que puede ser instalada todavía
     *
     * @return la memoria disponible
     */
    public int obtenerMemoriaDisponible() {
        return (maxMemoria - memoriaInstalada);
    }

    /**
     * vaciar la memoria, método mutador
     */
    public void vaciarMemoria() {
        memoriaInstalada = 0;
    }

    /**
     * Escribir información sobre el ordenador
     */
    public void printInformacion() {
        System.out.println("El ordenador puede tener como máximo " + maxMemoria + " MB instalados");
        System.out.println("El ordenador tiene instalados " + memoriaInstalada + " MB ");
        System.out.println("Se puede instalar todavía " + (maxMemoria - memoriaInstalada) + " MB instalados");
    }

    /**
     * Instalar 1000 MB de memoria
     *
     * @return true si la memoria se ha instalado
     * false en otro caso
     */
    public boolean instalar1000MB() {
        boolean exito;
        if ((maxMemoria - memoriaInstalada) >= 1000) {
            memoriaInstalada += 1000;
            exito = true;
        } else {
            exito = false;
        }
        return exito;
    }

    /**
     * Instalar la cantidad de memoria que se pasa como
     * argumento (en MB) si es posible
     *
     * @param cuanta la cantidad de memoria a instalar
     * @return true si la memoria se ha instalado
     * false en otro caso
     */
    public boolean instalarMemoria(int cuanta) {
        boolean exito;
        if (cuanta > 0 && (maxMemoria - memoriaInstalada) >= cuanta) {
            memoriaInstalada += cuanta;
            exito = true;
        } else {
            exito = false;
        }
        return exito;
    }

}

