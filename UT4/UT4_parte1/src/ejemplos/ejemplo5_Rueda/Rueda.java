package ejemplos.ejemplo5_Rueda;

public class Rueda {
    private double presion;

    public Rueda(double p) {
        presion = p;
    }

    public void inflar() {
        presion += 0.5;
    }

    public void desinflar() {
        presion -= 0.5;
    }

    public boolean estaDesinflada() {
        return (presion == 0.0);
    }
}
