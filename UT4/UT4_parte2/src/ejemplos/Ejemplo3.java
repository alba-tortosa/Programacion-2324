package ejemplos;

public class Ejemplo3 {

    //Lanza una moneda 30 veces y cuenta cuántas veces sale cara y cuantas veces sale cruz
    public static void main(String[] args) {
        Moneda moneda = new Moneda();

        int caras = 0; //es una variable contador
        int cruz = 0; //es una variable contador
        int tiradas = 1; //es una variable contador
        while (tiradas <= 30) {
            moneda.tirar();
            if (moneda.esCara()) {
                caras++;
            } else {
                cruz++;
            }
            System.out.println("Tirada "+ tiradas + ": " + moneda.toString());
            tiradas++;
        }

        System.out.println("*".repeat(60));
        System.out.println("Caras: " + caras);
        System.out.println("Cruces: " + cruz);

    }
}
