package ejercicioAD04;

import java.util.Scanner;

public class TestFacturaLuz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el valor de la última lectura del contador:");
        int ultima = scanner.nextInt();
        System.out.println("Introduzca el valor de la lectura actual del contador:");
        int actual = scanner.nextInt();

        if (actual < ultima) {
            System.out.println("El valor de la lectura actual no puede ser inferior al valor de la última lectura.");
        } else {
            FacturaLuz factura1 = new FacturaLuz(ultima, actual);
            System.out.println("El consumo de la factura 1 es: " + factura1.obtenerConsumo());
            System.out.println("El importe total de la factura 1 es: " + factura1.obtenerImporteTotal());
        }
    }
}
