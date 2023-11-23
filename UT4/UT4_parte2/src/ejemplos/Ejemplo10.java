package ejemplos;

public class Ejemplo10 {


    public static void main(String[] args) {

        escribirCuadrado(6);
        escribirCuadrado(10);
    }

    public static void escribirCuadrado(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d", i);
            }
            System.out.print("\n");
        }

    }
}
