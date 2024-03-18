/**
 * Modela una reserva realizada en el restaurante
 */
public class Reserva implements Comparable {

        private String quienReserva;
        private int comensales;
        private int mesa;

    /**
     * Constructor de la clase Reserva
     *
     * @param quien      el nombre de la persona que hace la reserva
     * @param comensales numero de personas que van a comer
     * @param mesa       la mesa que se les ha asignado
     */
    public Reserva(String quien, int comensales, int mesa) {
        this.quienReserva = quien;
        this.comensales = comensales;
        this.mesa = mesa;
    }

    /**
     * Accesor para el nombre de la persona que hizo la reserva
     *
     * @return el nombre del que reserva
     */
    public String getNombre() {
        return quienReserva;
    }

    /**
     * Accesor para el numero de comensales
     *
     * @return el numero de personas que van a comer
     */
    public int getComensales() {
        return comensales;
    }

    /**
     * Accesor para la mesa asignada
     *
     * @return el numero entero que representa la mesa asignada
     */
    public int getMesaAsignada() {
        return mesa;
    }

    /**
     * Rerepsentacion textual de la reserva
     *
     * @return la cadena que representa la reserva
     */
    public String toString() {
        return "Nombre: " + quienReserva + "\n" + "Comensales: " + comensales + "\n" + "Mesa asignada: " + mesa + "\n";

    }

    @Override
    public int compareTo(Object o) {
        Reserva otra = (Reserva) o;
        int devolver=0;
        if (this.mesa>otra.mesa) devolver= 1;
        else if (this.mesa<otra.mesa) devolver= -1;
        else devolver= 0;
        return devolver;
    }
}
