package ejercicios.ejercicioAD03;

/**
 * Prueba de la clasePunto
 */
public class TestPunto {

    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(3.2, new Punto(3, 5));

        Punto punto1 = new Punto(4, 7);
        Circulo circulo2 = new Circulo(3.2, punto1);

        Circulo circulo3 = new Circulo(3.2, null);

        circulo1.printCirculo();
        circulo2.printCirculo();
        circulo3.printCirculo();

        System.out.println(Math.abs(12));
        System.out.println(Math.abs(-12));
        System.out.println(Math.ceil(4.2));
        System.out.println(Math.floor(4.2));
        System.out.println(Math.max(4.7, 34));


        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(9));



    }
}
