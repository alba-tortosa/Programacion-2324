package ejemplos;

public class Ejemplo9 {

    //Lanza una moneda 30 veces y cuenta cuántas veces sale cara y cuantas veces sale cruz
    public static void main(String[] args) {
        Moneda moneda = new Moneda();

        int ncaras = 0;
        int ncruz = 0;
        for (int tiradas = 1; tiradas <= 30; tiradas++) {
            moneda.tirar();
            if (moneda.esCara()) {
                ncaras++;
            } else {
                ncruz++;
            }
            System.out.println("Tirada "+ tiradas + ": " + moneda.toString());
        }

        System.out.println("*".repeat(60));
        System.out.println("Caras: " + ncaras);
        System.out.println("Cruces: " + ncruz);
    }
}
