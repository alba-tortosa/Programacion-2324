package ejemplos;

public class Ejemplo5 {

    // Calcula la y producto de los numeros del 1 al 20
    public static void main(String[] args) {
        int suma = 0; //es una variable acumulador
        long producto = 1; //es una variable acumulador
        int contador = 1; //es una variable contador
        while (contador <= 20) {
            suma = suma + contador;
            producto = producto * contador;
            System.out.println("Contador " + contador + " - Suma=" + suma + " -  Producto=" + producto);
            contador = contador + 1;
        }

        System.out.println("*".repeat(60));
        System.out.println("Suma: " + suma);
        System.out.println("Producto:" + producto);
    }
}
