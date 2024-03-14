package AD03_FusionInterseccion;

import java.util.ArrayList;
import java.util.Arrays;

public class TestSecuencia {

    public static void main(String[] args) {

        ArrayList<Integer> lis1 = new ArrayList<>();
        lis1.addAll(Arrays.asList(3, 4, 4, 5, 7, 8, 9, 9, 14));
        Secuencia secuencia1 = new Secuencia(lis1);
        System.out.println("Secuencia 1 \n" + secuencia1.toString());

        ArrayList<Integer> lis2 = new ArrayList<>();
        lis2.addAll(Arrays.asList(1, 3, 3, 4, 12));
        Secuencia secuencia2 = new Secuencia(lis2);
        System.out.println("Secuencia 2 \n" + secuencia2.toString());

        ArrayList<Integer> fusion = secuencia1.fusionarCon(secuencia2.getSecuencia());
        System.out.println("Fusion\n" + fusion.toString());

        ArrayList<Integer> interseccion = secuencia1.interseccionCon(secuencia2.getSecuencia());
        System.out.println("Interseccion\n" + interseccion.toString());

    }
}
