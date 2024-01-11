package ejercicio13_LuzSolar;

/**
 * Clase que cuenta las horas de sol en el año
 */
public class EstadisticaLuzSolar {
    // define una constante MESES que es un array con los nombres de los meses
    private static final String[] MESES= {"ENERO", "FEBRERO", "MARZO", "ABRIL" , "MAYO" , "JUNIO","JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE" , "NOVIEMBRE" , "DICIEMBRE"};

    // define un array horas
    private int[] horas;

    /**
     * crea e inicializa el array horas
     */
    public EstadisticaLuzSolar() {
        horas = new int[]{100, 90, 120, 150, 210, 250, 300, 310, 280, 230, 160, 120};
    }

    /**
     * Calcula la media de horas de sol
     *
     * @return la media de horas de sol
     */
    public double getMediaSol() {
        double suma = 0;

        for (double h : horas) {
            suma += h;
        }
        return suma / horas.length;

    }

    /**
     * devuelve el nombre del mes con más horas de sol
     *
     * @return el nombre del mes
     */
    public String mesMasSoleado() {
        int max = Integer.MIN_VALUE;
        String masSoleado = "";
        for (int i = 0; i < horas.length; i++) {
            if(max < horas[i]){
                max = horas[i];
                masSoleado = MESES[i];
            }
        }
        return masSoleado;
    }

    /**
     * mes con menos horas de sol
     *
     * @return el nombre del mes
     */
    public String mesMenosSoleado() {
        int min = Integer.MAX_VALUE;
        String menosSoleado = "";
        for (int i = 0; i < horas.length; i++) {
            if(min > horas[i]){
                min = horas[i];
                menosSoleado = MESES[i];
            }
        }
        return menosSoleado;
    }
}