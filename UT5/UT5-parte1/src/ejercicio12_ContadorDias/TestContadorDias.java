package ejercicio12_ContadorDias;

public class TestContadorDias {

    public static void main(String[] args) {

        ContadorDias contador = new ContadorDias();
        System.out.println("30/01/2023: " + contador.contarDias(30, 1, 2023));
        System.out.println("28/02/2023: " + contador.contarDias(28, 2, 2023));
        System.out.println("29/02/2024: " + contador.contarDias(29, 2, 2024));
        System.out.println("01/03/2024: " + contador.contarDias(01, 3, 2024));
        System.out.println("01/03/2023: " + contador.contarDias(01, 3, 2023));


    }
}
