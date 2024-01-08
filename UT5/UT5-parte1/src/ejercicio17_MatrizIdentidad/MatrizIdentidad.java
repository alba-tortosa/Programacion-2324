package ejercicio17_MatrizIdentidad;

public class MatrizIdentidad {

    public static void main(String[] args) {
        int[][] matriz = generarMatrizIdentidad(6);

        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.print(celda + "  ");
            }
            System.out.println();
        }

    }

    // Utiliza un bucle para rellenar los valores
    public static int[][] generarMatrizIdentidad(int dimension) {

        return null;
    }
}
