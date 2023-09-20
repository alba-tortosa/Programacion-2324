/**
 * Una clase que representa autom�viles.
 */
public class Coche {
    private String modelo; // Ford Focus, Citroen X-Sara, ...
    private String color;
    private int anyo;
    private int numeroPuertas;

    /**
     * Constructor para los objetos de la clase Coche.
     *
     * @param queModelo el modelo del coche
     * @param queColor  el color del coche
     * @param queAnyo    el a�o de fabricaci�n del coche
     */
    public Coche(String queModelo, String queColor, int queAnyo) {
        modelo = queModelo;
        color = queColor;
        anyo = queAnyo;
    }

    /**
     * cambiar el modelo del coche
     */
    public void setModelo(String queModelo) {
        modelo = queModelo;
    }

    /**
     * cambiar el color del coche
     */
    public void setColor(String queColor) {
        color = queColor;
    }

    /**
     * cambiar el a�o del coche
     */
    public void setAnyo(int queAnyo) {
        anyo = queAnyo;
    }

    public void setNumeroPuertas(int queNumeroPuertas) {
        numeroPuertas = queNumeroPuertas;
    }

    /**
     * devolver el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * devolver el color del coche
     */
    public String getColor() {
        return color;
    }

    /**
     * devolver el a�o del coche
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * devolver el numero de puertas del coche
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    /**
     * Visualizar la informaci�n del coche
     */
    public void print() {
        System.out.println("Modelo " + modelo + "\nA�o " + anyo +
                "\nColor " + color + "\nNumero puertas " + numeroPuertas);
    }
}
