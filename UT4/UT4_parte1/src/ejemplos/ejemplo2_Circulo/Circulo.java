package ejemplos.ejemplo2_Circulo;

/**
 * La clase representa a circulos con un centro
 * y un valor determinado de radio
 *
 * @author
 */
public class Circulo {
    private double radio;

    private Punto centro;

    /**
     * constructor para los objetos de la clase Circulo
     */
    public Circulo(double radio, int x, int y) {
        this.radio = radio;
        this.centro = new Punto(x, y);
    }

    public Circulo(double radio, Punto punto) {
        this.radio = radio;
        this.centro = punto;
    }

    public Circulo(double radio, int y) {
        this.radio = radio;
        this.centro = new Punto(0, y);
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }


}
