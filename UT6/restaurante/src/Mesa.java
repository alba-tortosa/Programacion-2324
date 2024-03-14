/**
 * Clase Mesa - decribe las características de la
 * mesa del restaurante
 */
public class Mesa {

    private String id;
    private int capacidad;
    private boolean libre;

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
        this.libre = true;
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

    /**
     * Indica si está o no libre la mesa
     *
     * @return si la mesa está libre
     */
    public boolean estaLibre() {
        return libre;
    }

    /**
     * Modifica el estado de la mesa
     *
     * @param l el nuevo estado
     */
    public void setLibre(boolean l) {
        this.libre = l;
    }

    /**
     * Representación textual de la mesa
     *
     */
    public String toString() {
        return "Mesa: " + id + "\t" + "Capacidad: " + capacidad + "\t" + "Libre: " + libre + "\n";
    }
}
