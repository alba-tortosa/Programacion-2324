package ejercicios.ejercicioAD09_Formatos;

import java.util.Scanner;

public class TestFormatos {

    public static void main(String[] args) {

        //formato1();
        formato2();


    }

    private static void formato1() {
        // | CATEGORIA | NOMBRE | BITS |
        //--------------------------------
        System.out.printf("%s\n", "-".repeat(32));
        System.out.printf("   %s\n", "Tipos Primitivos en Java");
        System.out.printf(" %s\n", "(ejemplo de tabla con printf)");
        System.out.printf("%s\n", "-".repeat(32));
        System.out.printf("| %10s | %-8s | %4s |\n", "CATEGORIA", "NOMBRE", "BITS");
        System.out.printf("%s\n", "-".repeat(32));
        System.out.printf("| %-10s | %-8s | %04d |\n", "Decimal", "double", 64);
    }

    private static void formato2() {

        Scanner scanner = new Scanner(System.in);

        String linea = "+----+------------+-----------+------+--------+\n";
        String tabla = linea;
        tabla += String.format("| %2s | %-10S | %9S | %-4s | %6s |\n", "ID", "NOMBRE", "APELLIDO", "EDAD", "ALTURA");
        tabla += linea;
        for (int i = 0; i < 5; i++) {
            //Pide al usuario un nombre, un apellido, una edad y una altura
            System.out.printf("%10s","Nombre:");
            String nombre = scanner.nextLine();
            System.out.printf("%10s","Apellidos:");
            String apellido = scanner.nextLine();
            System.out.printf("%10s","Edad:");
            int edad = scanner.nextInt();
            System.out.printf("%10s","Altura:");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            //| 1 | MARIA | MARTÍNEZ | 34 | 1,67 |
            tabla +=String.format("| %2d | %-10S | %9S | %-4d | %6.2f |\n", i+1, nombre, apellido, edad, altura);

        }
        tabla += linea;
        System.out.println(tabla);

    }

    private static void ejemplos() {
        int contador = 2;
        System.out.printf("El valor es %d\n", contador);
        System.out.printf("Color %s, Número %d, Decimal %.2f Caracter %c Booleano %b\n", "rojo", 23, 4.567, 'A', contador==2);

        System.out.printf("| %d |\n", contador);
        System.out.printf("| %5d |\n", contador);
        System.out.printf("|%7d|\n", contador);
        System.out.printf("| %05d |\n", contador);
        System.out.printf("| %-5d |\n", contador);
        System.out.printf("| %-+5d |\n", contador);


        System.out.printf ("1.0/3.0 = %5.3f %n", 70.0/3.0);
        System.out.printf ("1.0/3.0 = %7.5f %n", 1.0/3.0);
        System.out.printf ("1.0/2.0 = %09.3f %n", 1.0/2.0);
        System.out.printf ("pi = %5.3f, e = %5.4f %n", Math.PI, Math.E);
    }




}
