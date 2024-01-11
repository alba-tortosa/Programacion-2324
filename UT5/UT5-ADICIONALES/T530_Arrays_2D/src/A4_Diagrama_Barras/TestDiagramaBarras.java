package A4_Diagrama_Barras;

import java.util.Arrays;

/**
 * @author
 */
public class TestDiagramaBarras {

    /**
     *
     */
    public static void main(String[] args) {
        System.out.println("Demo escribirBarraHorizontal()");
        DiagramaBarras demo = new DiagramaBarras();
        demo.inicializarEnRango(-20, 20);
        demo.escribirArray();
        System.out.println();
        demo.escribirBarraHorizontal();
        System.out.println("----------------------------------------------\n");

        System.out.println("Demo escribirBarraVertical()");
        demo.inicializarEnRango(1, 20);
        demo.escribirArray();
        System.out.println();
        demo.escribirBarraVertical();
        System.out.println("----------------------------------------------\n");

        System.out.println("Demo aDosDimensiones()");
        demo.escribirArray();
        System.out.println();
        int[][] resul = demo.aDosDimensiones(4);
        for (int i = 0; i < resul.length; i++)       {
            System.out.println(Arrays.toString(resul[i]));
        }

    }

}
