package ejercicios.ejercicioAD03;

/**
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 *
 * @author
 */
public class Circulo {
    private final double PI = Math.PI;
    private double radio;

    private Punto centro;

    /**
     * constructor para los objetos de la clase Circulo
     */
    public Circulo(double radio, Punto punto) {
        this.radio = radio;
        this.centro = punto;
    }

    public Circulo (double radio) {
        this.radio = radio;
        this.centro = new Punto(0,0);

    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentroX(int x) {
        centro.setX(x);
    }

    public void setCentroY(int y) {
        centro.setY(y);
    }

    /**
     * @return devuelve el radio del círculo
     */
    public double getRadio() {
        return radio;
    }


    /**
     * @param nuevoRadio El nuevo valor del radio
     */
    public void setRadio(int nuevoRadio) {
        radio = nuevoRadio;
    }

    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea() {
        return 2 * PI * radio * radio;
    }

    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerímetro() {
        return 2 * PI * radio;
    }

    public String toString () {
        String texto = "Radio: " + this.radio;
        if (this.centro == null) {
            texto += "\n Centro: vacío";
        } else {
            texto += "\n" + centro.toString();
        }
        return texto;
    }

    public void printCirculo() {
        System.out.println(toString());
    }


}