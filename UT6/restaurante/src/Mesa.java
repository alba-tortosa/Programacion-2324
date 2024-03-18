import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Clase Mesa - decribe las caracter�sticas de la
 * mesa del restaurante
 */
public class Mesa {

    private String id;
    private int capacidad;
//    private boolean libre;
    ArrayList<Reserva> reservas;

    /**
     * Constructor de la clase Mesa
     *
     * @param i   identificador entero de la mesa
     * @param cap capacidad de la mesa
     */
    public Mesa(int i, int cap) {
        this.id = String.valueOf(i);
//        this.id = "" + i;
        this.capacidad = cap;
//        this.libre = true;
        reservas = new ArrayList<>();
    }

    /**
     * Devuelve el identificador de la mesa
     *
     * @return el identificador de la mesa
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve la capacidad de la mesa
     *
     * @return la capcadidad de la mesa
     */
    public int getCapacidad() {
        return capacidad;
    }

    public void addReserva(Reserva r) {
        reservas.add(r);
    }

    public boolean estaLibre(LocalDate fecha) {
        for (Reserva reserva : reservas) {
            if (reserva.getFecha().equals(fecha)) return false;
        }
        return true;
    }

    public void eliminarReservas() {
        reservas.clear();
    }

    /**
     * Representaci�n textual de la mesa
     *
     */
    public String toString() {
        return "Mesa: " + id + "\t" + "Capacidad: " + capacidad + "\t" + "\n";
    }
}
