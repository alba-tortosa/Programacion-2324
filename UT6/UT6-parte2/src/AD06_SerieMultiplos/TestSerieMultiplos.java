package AD06_SerieMultiplos;

public class TestSerieMultiplos {

    public static void main(String[] args) {
        SerieMultiplos sm = new SerieMultiplos();
        sm.anyadirEntrada(3);
        sm.anyadirEntrada(5);
        sm.anyadirEntrada(9);

        sm.escribirMap();

        sm.borrarMultiplo(15);
        sm.escribirMap();

    }
}
