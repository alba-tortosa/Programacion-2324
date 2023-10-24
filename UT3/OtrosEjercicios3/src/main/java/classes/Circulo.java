package classes;

/**
 * Usado en los ejercicios: 3.5
 */

public class Circulo {
    
    private int radio;
    private double perimetro;
    private double area;

    public Circulo(int radio) {
        this.radio = radio;
        this.perimetro = 2 * Math.PI * radio;
        this.area = Math.PI * Math.pow(radio, 2);
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
