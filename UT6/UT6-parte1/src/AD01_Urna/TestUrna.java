package AD01_Urna;

import java.util.Scanner;

/**
 *
 */

public class TestUrna {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("¿cuántas bolas habrá en la urna?");
        int cuantasBolas = scanner.nextInt();
        Urna urna = new Urna();
        for (int i = 1; i <= cuantasBolas; i++) {
            urna.meterBola(new Bola());
        }
        System.out.println("Despues de añadir " + cuantasBolas + " bolas");
        urna.mostrarUrna();
        System.out.println("Hay " + urna.cuantasBlancas() + " bolas blancas");
        System.out.println("Hay " + urna.cuantasNegras() + " bolas negras");

        urna.borrarBlancas();
        System.out.println("Despues de borrar las bolas blancas ");
        urna.mostrarUrna();

    }

}
