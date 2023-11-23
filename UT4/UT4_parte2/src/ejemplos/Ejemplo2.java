package ejemplos;

public class Ejemplo2 {

    //Lanza una moneda X veces y muestra qué sale en cada tirada
    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        int tiradas = 1; //contador de tiradas
        while (tiradas <= 10) {
            moneda.tirar();
            System.out.println("Tirada "+ tiradas + ": " + moneda.toString());
            tiradas++;
        }

    }
}
