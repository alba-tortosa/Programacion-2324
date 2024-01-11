package A3_Arrays2;

/**
 * Clase App2D -  incluye el m?todo main()
 * Arranca la aplicaci?n
 */
public class TestArrays2D {

    /**
     *
     */
    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {2, 4, 5, 6, 7}};
        Arrays2D demo = new Arrays2D();
        demo.escribirConBordes(m1);

        int[][] m2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        demo.escribirConBordes(m2);
        int[][] m3 = demo.girarIzquierda(m2);
        demo.escribirConBordes(m3);

        demo.escribirConBordes(m2);
        int[][] m4 = demo.girarDerecha(m2);
        demo.escribirConBordes(m4);
    }
}
