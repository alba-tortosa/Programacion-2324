package classes;

/**
 * Usado en los ejercicios: 3.20
 */

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDiasMes() {
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Si el año es bisiesto, febrero tiene 29 días, si no, 28
                // Un año es bisiesto si es múltiplo de 4, pero no es múltiplo de 100 !!!
                if (anio % 4 == 0 && anio % 100!=0 || anio % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
