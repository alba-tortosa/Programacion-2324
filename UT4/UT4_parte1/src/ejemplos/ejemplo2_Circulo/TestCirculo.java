package ejemplos.ejemplo2_Circulo;

public class TestCirculo {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(5.4, 13, 19);

        Punto punto1 = new Punto(10, 15);
        Circulo circulo2 = new Circulo(2.3, punto1);

        Circulo circulo3 = new Circulo(9, 25);

        circulo1.setCentro(punto1);

        circulo3.setCentro(new Punto(10, 15));

        Circulo circulo4 = circulo3;

        circulo4.setCentro(punto1);

        circulo1.setCentro(null);
        circulo2.setCentro(null);
        circulo3.setCentro(null);

        circulo4.setCentro(punto1);

        circulo3 = null;
        circulo3 = circulo2;



    }
}
