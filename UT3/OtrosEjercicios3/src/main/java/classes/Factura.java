package classes;

/**
 * Usado en los ejercicios: 3.6
 */

public class Factura {

    private double valorCompra;
    private double totalFactura;


    public Factura(double valorCompra) {
        this.valorCompra = valorCompra;
        this.totalFactura = valorCompra * 1.16;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(double totalFactura) {
        this.totalFactura = totalFactura;
    }
}
