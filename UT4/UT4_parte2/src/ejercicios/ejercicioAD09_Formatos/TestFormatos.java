package ejercicios.ejercicioAD09_Formatos;

public class TestFormatos {

    public static void main(String[] args) {

        formato1();


    }
    
    private static void formato1() {
        // | CATEGORIA | NOMBRE | BITS |
        System.out.printf("| %10s | %-8s | %4s |", "CATEGORIA", "NOMBRE", "BITS");
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
