package ejercicioAD01;

public class TestLibro {

    public static void main(String[] args) {

        System.out.println("*".repeat(60));
        Libro libro1 = new Libro("Brandon Sanderson", "El imperio final", 688);
        libro1.printDetalles();

        System.out.println("*".repeat(60));
        libro1.setReferencia("9788498726138");
        libro1.printDetalles();

        System.out.println("*".repeat(60));
        libro1.prestar();
        libro1.prestar();
        libro1.printDetalles();
        System.out.println("*".repeat(60));
    }
}
