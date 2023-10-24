package ejercicioAD02;

public class TestHucha {

    public static void main(String[] args) {

        Hucha hucha = new Hucha();
        System.out.println("-".repeat(60));
        hucha.anyadir(20);
        hucha.printDetalles();

        System.out.println("-".repeat(60));
        hucha.anyadir(-30);
        hucha.printDetalles();

        System.out.println("-".repeat(60));
        hucha.sacar(25);
        hucha.printDetalles();

        System.out.println("-".repeat(60));
        hucha.sacar(15);
        hucha.printDetalles();
        System.out.println("-".repeat(60));

    }
}
