package ejemplos;

public class Ejemplo4 {

    //Lanza una moneda 30 veces o hasta que salga Cara
    public static void main(String[] args) {
        Moneda moneda = new Moneda();

        boolean salioCara = false; // es una variable que actúa como un switch o conmutador
        int tiradas = 1; //es una variable contador
        while (tiradas <= 30 && !salioCara) {
            moneda.tirar();
            System.out.println("Tirada " + tiradas + ": " + moneda.toString());
            if (moneda.esCara()) {
                salioCara = true;
            } else {
                tiradas++;
            }
        }
        System.out.println("Salió cara en la tirada " + tiradas);
    }
}
