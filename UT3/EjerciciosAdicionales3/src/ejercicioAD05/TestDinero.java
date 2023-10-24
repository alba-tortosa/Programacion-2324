package ejercicioAD05;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestDinero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cantidad de € no superior a 100€:");
        int cantidad = scanner.nextInt();
        if (cantidad < 0 || cantidad > 100) {
            System.out.println("No ha introducido una cantidad positiva no superior a 100€");
        } else {
            Dinero dinero = new Dinero(cantidad);
            dinero.printDescomposicionMonedas();
        }
    }


}
