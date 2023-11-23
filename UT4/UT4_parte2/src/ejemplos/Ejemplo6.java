package ejemplos;

public class Ejemplo6 {

    /* Suma de pares entre 1 y 100 y producto de impares entre 1 y 100 */
    public static void main(String[] args) {
        Moneda moneda = new Moneda();

        int sumaPar = 0; // es un acumulador
        long productoImpar = 1; //es un acumulador

        int numero = 1; //es un contador
        while (numero <= 100) {
            if (numero%2 == 0) {
                sumaPar += numero;
            } else {
                productoImpar *= numero;
            }
            numero++;
        }

        System.out.println("Suma pares=" + sumaPar);
        System.out.println("Producto impares=" + productoImpar);
    }
}
