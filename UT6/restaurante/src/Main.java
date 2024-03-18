import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Restaurante restaurante = new Restaurante("Paco",100);
        GestorRestaurante gestor = new GestorRestaurante(restaurante);
        gestor.iniciar();



    }


}
