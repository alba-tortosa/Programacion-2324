package ejemplos;

public class Ejemplo8 {

    //Lanza una moneda X veces y muestra qué sale en cada tirada
    public static void main(String[] args) {
        Moneda moneda = new Moneda();
        for (int tiradas = 1; tiradas <= 10; tiradas++) {
            moneda.tirar();
            System.out.println("Tirada "+ tiradas + ": " + moneda.toString());
        }
    }
}
