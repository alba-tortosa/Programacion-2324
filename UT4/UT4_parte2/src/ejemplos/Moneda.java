package ejemplos;

import java.util.Random;

public class Moneda {

    private final int CARA = 0;
    private final int CRUZ = 1;

    private int cara_actual;

    //-----------------------------------------------------------------
    //  Lanza la moneda.
    //-----------------------------------------------------------------
    public void tirar() {
        Random r = new Random();
        cara_actual = r.nextInt(2);
    }

    //-----------------------------------------------------------------
    //  Devuelve true si la cara actual es CARA.
    //-----------------------------------------------------------------
    public boolean esCara() {
        return (cara_actual == CARA);
    }

    //-----------------------------------------------------------------
    //  Devuelve la cara actual como texto.
    //-----------------------------------------------------------------
    public String toString() {
        String nombreCara;

        if (cara_actual == CARA)
            nombreCara = "Cara";
        else
            nombreCara = "Cruz";

        return nombreCara;
    }

}
