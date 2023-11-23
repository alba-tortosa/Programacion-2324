package ejemplos;

public class Ejemplo11 {


    public static void main(String[] args) {

        escribirTriangulo(6);
        escribirTriangulo(10);
    }

    public static void escribirTriangulo(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", i);
            }
            System.out.print("\n");
        }

    }
}
