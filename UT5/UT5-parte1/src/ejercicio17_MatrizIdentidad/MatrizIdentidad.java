package ejercicio17_MatrizIdentidad;

public class MatrizIdentidad {

    public static final int NUMERO = 1;

    public static void main(String[] args) {
        int[][] matriz = generarMatrizIdentidad(8);

        for (int[] fila : matriz) {
            // fila = matriz[i]
            for (int celda : fila) {
                // celda = fila[j] = matriz[i][j]
                System.out.print(celda + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

    }

    // Utiliza un bucle para rellenar los valores
    public static int[][] generarMatrizIdentidad(int dimension) {
        int[][] longitudMatrix = new int[dimension][dimension];

        for (int i = 0; i < longitudMatrix.length ; i++) {
            for (int j = 0; j < longitudMatrix[0].length ; j++) {
                if(i == j) longitudMatrix[i][j] = NUMERO;
            }
        }
        return longitudMatrix;
    }
}
