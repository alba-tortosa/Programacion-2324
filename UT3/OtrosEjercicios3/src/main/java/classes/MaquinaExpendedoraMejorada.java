package classes;

/**
 * Usado en los ejercicios: 3.16, 3.17
 */

/**
 * Este proyecto modela una sencilla máquina expendedora de billetes.
 * El precio del ticket se especifica via el constructor.
 * Los objetos verifican que un usuario solo introduce cantidades positivas de dinero y solo
 * emiten un ticket si se ha introducido suficiente dinero
 */
public class MaquinaExpendedoraMejorada {
    // El precio de un ticket en esta máquina
    private int precio;
    // Cantidad de dinero introducida por el usuario hasta ahora
    private int importe;
    // Cantidad total de dinero recogida por la máquina
    private int total;

    /**
     * Crear una máquina que emite tickets de un determinado precio
     * El precio ha de ser mayor que 0 y no hay verificación de esto
     */

    public MaquinaExpendedoraMejorada(int precioTicket) {
        precio = precioTicket;
        importe = 0;
        total = 0;
    }

    /**
     * Devolver el precio de un billete
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Devolver la cantidad de dinero insertada hasta el momento
     * para el billete
     */
    public int getImporte() {
        return importe;
    }

    /**
     * Recibir una cantidad de dinero de un usuario
     * Verificar que la cantidad es positiva
     */

    public void insertarDinero(int cantidad) {
        if (cantidad > 0) {
            importe = importe + cantidad;
        } else {
            System.out.println("Introduzca una cantidad positiva: " + cantidad);
        }
    }

    public int vaciarMaquina() {
        int aux = total;
        total = 0;
        return aux;
    }

    public void imprimirTicket() {
        int cantidadPendiente = precio - importe;

        if (cantidadPendiente <= 0) {
            // Simula impresión de un billete
            System.out.println("##################");
            System.out.println("# Máquina expendedora IntelliJ");
            System.out.println("# Billete:");
            System.out.println("# " + precio + " cents.");
            System.out.println("##################");
            System.out.println();
            // Actualizar el total recogido por la máquina con el precio
            total = total + precio;
            // decrementar el importe con el precio
            importe = importe - precio;
        } else {
            System.out.println("# Debe insertar al menos: " + cantidadPendiente + " céntimos más ");
        }

    }

    /**
     * Devolver el dinero del importe y poner el importe a 0
     */
    public int devolverCambio() {
        int cambio;
        cambio = importe;
        importe = 0;
        return cambio;
//        importe = 0;
    }

}

