package ejercicio12_ContadorDias;

public class ContadorDias {
    private int[] diasMes;

    public ContadorDias() {

    }

    /**
     * Cuenta el nº de días desde el inicio de año
     *
     * @param mes mes actual entre 1 y 12
     * @param dia actual  entre 1 y 31
     * @param año actual
     * @return la cantidad de días desde el comienzo de año
     */

    public int contarDias(int dia, int mes, int año) {

        return 0;

    }

    /**
     * return true si año es bisiesto
     */
    private boolean esBisiesto(int año) {
        return ((año % 4 == 0 && (año % 100 != 0) || (año % 400 == 0)));
    }
}
