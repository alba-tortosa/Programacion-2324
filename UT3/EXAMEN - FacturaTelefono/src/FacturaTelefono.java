public class FacturaTelefono {

    private long numeroTelefono;
    private String nombreCliente;
    private int mes;
    private int anyo;
    private int cantidad_llamadas;
    private int minutos_gastados;
    private double precio_total;
    private String listado_llamadas;

    public FacturaTelefono(long numeroTelefono, String nombreCliente, int mes, int anyo) {
        this.numeroTelefono = numeroTelefono;
        this.nombreCliente = nombreCliente;
        this.mes = mes;
        this.anyo = anyo;
        listado_llamadas = "";
    }

    public void anyadirLlamada(long numeroDestino, String diaHora, double precio, int minutos) {
        this.cantidad_llamadas++;
        this.minutos_gastados+=minutos;
        this.precio_total+=precio;
        String llamada = diaHora + " -- " + numeroDestino + " -- " + minutos + "min -- " + precio/10 + "€";
        listado_llamadas = listado_llamadas + "\n" + llamada;
    }

    public String toString() {
        String factura = "Cliente:" + nombreCliente +
                "\nNúmero de teléfono:" + numeroTelefono +
                "\nFecha:" + mes + "/" + anyo +
                "\nCantidad de llamadas:" + cantidad_llamadas +
                "\nMinutos gastados:" + minutos_gastados +
                "\nPrecio total:" + precio_total/10 + "€" +
                "\nListado llamadas:" + listado_llamadas;
        return factura;
    }

}
