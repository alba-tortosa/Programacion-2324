package classes;

/**
 * Usado en los ejercicios: 3.15
 */

public class Intercambio {

    private int a;
    private int b;

    public Intercambio(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void intercambiar() {
        int aux = a;
        a = b;
        b = aux;
    }

    public void escribir() {
        System.out.println("Atributo a = " + a);
        System.out.println("Atributo b = " + b);
    }

    public void promtAntes() {
        System.out.println("Antes del intercambio");
        escribir();
    }

    public void promtDespues() {
        System.out.println("Después del intercambio");
        escribir();
    }

}
