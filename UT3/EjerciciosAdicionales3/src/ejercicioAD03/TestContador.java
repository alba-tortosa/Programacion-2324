package ejercicioAD03;

public class TestContador {

    public static void main(String[] args) {
        //Creo un contador y muestro su valor inicial
        Contador contador = new Contador();
        contador.printContador();

        //Incremento 3 veces el contador y muestro su valor
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        contador.printContador();

        // Reseteo el contador y muestro su valor
        contador.reset();
        contador.printContador();

        // Decremento 1 vez el contador y muestro su valor
        contador.decrementar();
        contador.printContador();

    }
}
