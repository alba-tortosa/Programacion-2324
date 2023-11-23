package ejercicios.ejercicioAD14_NumeroSecreto;

/**
 * Modela un contador.
 * Los objetos de esta clase incrementan, decrementan un valor
 */
public class Contador {

    private int valor;

    /**
     * Constructor
     */
    public Contador() {
        valor = 0;
    }

    /**
     * Constructor
     */
    public Contador(int valor) {
        this.valor = valor;
    }

    /**
     * Accesor para el valor del contador
     */

    public int getContador() {
        return valor;
    }

    /**
     * Mutador
     */
    public void setContador(int valor) {
        this.valor = valor;
    }

    /**
     * Mutador, incrementa en 1 el contador
     */
    public void incrementar() {
        valor++;
    }

    /**
     * Mutador, decrementa en 1 el contador
     */
    public void decrementar() {
        valor--;
    }

    /**
     * Representacion textual del contador
     */
    public String toString() {
        return "Valor del contador: " + getContador();
    }

    /**
     * Mutador, pone el contador a 0
     */
    public void reset() {
        valor = 0;
    }

}
