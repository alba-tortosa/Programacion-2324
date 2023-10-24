package ejercicioAD07;

public class TestCalentador {

    public static void main(String[] args) {

        System.out.println("*".repeat(60));
        System.out.println("Calentador 1");
        System.out.println("*".repeat(60));
        Calentador calentador1 = new Calentador(-10, 20);
        calentador1.printInformacion();
        System.out.println("-".repeat(60));
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.calentar();
        calentador1.printInformacion();
        System.out.println("-".repeat(60));
        calentador1.calentar();
        calentador1.printInformacion();


        System.out.println("*".repeat(60));
        System.out.println("Calentador 2");
        System.out.println("*".repeat(60));
        Calentador calentador2 = new Calentador(5, 10);
        calentador2.printInformacion();
        System.out.println("-".repeat(60));
        calentador2.enfriar();
        calentador2.enfriar();
        calentador2.enfriar();
        calentador2.enfriar();
        calentador2.enfriar();

        calentador2.printInformacion();
        System.out.println("-".repeat(60));
        calentador2.enfriar();
        calentador2.printInformacion();

    }
}
