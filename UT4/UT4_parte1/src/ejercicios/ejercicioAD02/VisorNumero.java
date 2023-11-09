package ejercicios.ejercicioAD02;

/**
 * La clase VisorNumero representa un visor digital que permite almacenar
 * valores entre 0 y un limite. El limite puede ser especificado cuando se crea
 * el visor. El rango de valores va de 0 a limite-1. Si se usa, por ejemplo, para
 * los segundos un reloj digital, el limite seria 60, resultando en este caso que
 * el visor mostraria valores entre 0 y 59. Al incrementarse, el visor da la vuelta
 * automaticamente y se pone a 0 al alcanzar el limite.
 */

public class VisorNumero {
    private int limite;
    private int valor;

    /**
     * Constructor para objetos de la clase VisorNumero
     */
    public VisorNumero(int limiteMaximo) {
        limite = limiteMaximo;
        valor = 0;
    }

    /**
     * Devuelve el valor actual
     */
    public int getValor() {
        return valor;
    }

    /**
     * Devuelve el valor del visor como una cadena de dos digitos
     * Si el valor es menor que 10 se le añade a la iquierda un 0
     */

    public String getValorVisor() {
        if (valor < 10) {
            return "0" + valor;
        } else {
            return "" + valor;
        }
    }

    /**
     * Pone el valor del visor al nuevo valor especificado. Si el
     * nuevo valor es menor que 0 o ssupera el limite no hace nada
     */

    public void setValor(int nuevoValor) {
        if ((nuevoValor >= 0) && (nuevoValor < limite)) {
            valor = nuevoValor;
        }
    }

    /**
     * Incrementa el valor del display en 1, dando la vuelta a cero
     * si se alcanza el limite
     */

    public void incrementar() {
        valor = (valor + 1) % limite;
    }
}