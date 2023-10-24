package classes;

/**
 * Usado en los ejercicios: 3.4
 */

public class MaquinaExpendedora2 {

    private int precio;
    private int importe;
    private int total;

    public MaquinaExpendedora2(int precioTicket)
    {
        int precio = precioTicket;
        importe = 0;
        total = 0;
    }

    public int getPrecio() {
        return precio;
    }


}
