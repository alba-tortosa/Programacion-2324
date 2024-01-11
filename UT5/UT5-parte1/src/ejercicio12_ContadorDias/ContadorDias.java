package ejercicio12_ContadorDias;

public class ContadorDias {
    private int[] diasMes;

    public ContadorDias() {
        diasMes = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
        int suma = 0;
        for (int i = 0; i < mes-1; i++) {
            suma += diasMes[i];
            if (i==1 && esBisiesto(año)) suma++;
        }
        suma+=dia;
        //if (mes > 2 && esBisiesto(año)) suma++;

        return suma;

    }

    /**
     * return true si año es bisiesto
     */
    private boolean esBisiesto(int año) {
        return ((año % 4 == 0 && (año % 100 != 0) || (año % 400 == 0)));
    }
}
