import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

/**
 * Clase Restaurante - representa a un restaurante que
 * tiene una serie demesas y mantine la lista de reservas
 * de las personas que van a comer a él
 */


public class Restaurante {

    private ArrayList<Mesa> mesas;
    private ArrayList<Reserva> reservas;

    private String nombre;
    private int maxComensales;

    /**
     * Constructor de la clase Restaurante
     *
     * @param nombre el nombre del restaurante
     * @param cuantas la cantidad de personas que van a comer
     */
    public Restaurante(String nombre, int cuantas) {
        this.nombre = nombre;
        this.maxComensales = cuantas;
        this.mesas = new ArrayList<>();
        this.reservas = new ArrayList<>();
        inicializarMesas();
    }

    /**
     * Inicializar las mesas con un identificador
     * y una capacidad aleatoria entre 2 y 16
     */
    private void inicializarMesas() {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            mesas.add(new Mesa(i,random.nextInt(2,17)));
        }
    }

    /**
     * Accesor para el nombre del restaurante
     *
     * @return el nombre del restaurante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Reserva de una mesa
     *
     * @param nombre     el nombre de quien hace la reserva
     * @param comensales el nº de comensales
     * @return true si se ha podido efectuar la reserva
     */
    public boolean reservarMesa(String nombre, int comensales, LocalDate fecha) {
        int posibleMesa = asignarMesa(comensales, fecha);
        if (posibleMesa != -1) {
            Reserva reserva = new Reserva(nombre, comensales, posibleMesa, fecha);
            this.reservas.add(reserva);
            for (Mesa mesa : mesas) {
                if (mesa.getId().equals(String.valueOf(posibleMesa)))
                    mesa.addReserva(reserva);
            }
            return true;
        }
        return false;
    }

    /**
     * @return la última reserva efectuada
     */
    public Reserva ultimaReserva() {
        return reservas.isEmpty() ? null : reservas.get(reservas.size()-1);
    }

    /**
     * Asigna una mesa a los comensales
     *
     * @param comensales el nº de personas que irán a comer
     * @return -1 si no hay mesa posible
     */
    private int asignarMesa(int comensales, LocalDate fecha) {
        Iterator<Mesa> it = this.mesas.iterator();
        int numMesa = -1;
        int capacidadMinima = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Mesa mesa = it.next();
            if (mesa.estaLibre(fecha) && mesa.getCapacidad() >= comensales) {
                if (mesa.getCapacidad() < capacidadMinima) {
                    numMesa = Integer.valueOf(mesa.getId());
                    capacidadMinima = mesa.getCapacidad();
                }
            }
        }
        return numMesa;
    }

    private boolean mesaLibre(String mesa, LocalDate fecha) {
        for (Reserva reserva : reservas) {
            if (reserva.getMesaAsignada() == Integer.valueOf(mesa) && reserva.getFecha().equals(fecha))
                return false;
        }
        return true;
    }

    /**
     * Muestra las reservas que tiene el restaurante
     */
    public void mostrarReservas() {
        System.out.println(this.reservasToString());
    }

    /**
     * Representación textual de las reservas
     *
     * @return la cadena que representa las reservas efectuadas
     */
    public String reservasToString() {
//        return reservas.toString();

        String result="";
        Collections.sort(this.reservas);
        Iterator<Reserva> it = this.reservas.iterator();
        while (it.hasNext()) {
            Reserva reserva = it.next();
            result += String.format("Nombre: %15s | Comensales: %2d | Mesa: %2d \n", reserva.getNombre(), reserva.getComensales(), reserva.getMesaAsignada());
            result += String.format("********************************************\n");
        }
        return result;
    }

    /**
     * Mostrar la situación del restaurante
     */
    public void mostrarRestaurante() {
        System.out.println(this.toString());
    }

    /**
     * Representación textual del restaurante
     *
     * @return la cadena que representa el restaurante
     */
    public String toString() {
        String texto = this.nombre + "\n";
        texto += mesas.toString();
        return texto;
    }

    /**
     * Borra todas las reservas efectuadas
     * Las mesas del restaurante vuelven a estar libres
     */
    public void eliminarReservas() {
        reservas.clear();
//        reservas = new ArrayList<>();
    }

    /**
     * Pone todas las mesas libres
     */
    private void actualizarMesas() {
        for (Mesa mesa : mesas) {
            mesa.eliminarReservas();
        }
    }

}
