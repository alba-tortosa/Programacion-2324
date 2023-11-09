package ejemplos.ejemplo4_Pasajero;

public class Pasajero {
    private String nombre;
    private int peso;
    private double altura;

    public Pasajero(String n) {
        nombre = n;
        peso = 78;
        altura = 1.80;
    }
    public Pasajero(String n, int p) {
        nombre = n;
        peso = p;
        altura = 1.80;
    }
    public Pasajero(String n, double a) {
        nombre = n;
        peso = 73;
        altura = a;
    }
    public Pasajero(String n, int p, double a) {
        nombre = n;
        peso = p;
        altura = a;
    }
}
