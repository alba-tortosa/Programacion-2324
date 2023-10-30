package ejercicioAD13;



public class TestTresNumeros {
    public static void main(String[] args) {

        //Crea objetos para los siguientes grupos de numeros:
        // 24, 12, 4
        // 12, 5, 34
        // 15, 15, 3
        // -5, -5, -5
        TresNumeros trio1 = new TresNumeros(24, 12, 4);
        TresNumeros trio2 = new TresNumeros(12, 5, 34);
        TresNumeros trio3 = new TresNumeros(15, 15, 3);
        TresNumeros trio4 = new TresNumeros(-5, -5, -5);


        //Muestra, para cada objeto:
        //La información de los números (toString)
        //El valor máximo, mínimo y la media
        //Si son todos iguales o no
        //Cuántos acaban en 5
        //Ordena los números y vuelve a mostrarlos
        System.out.println("*".repeat(60));
        acciones(trio1);
        System.out.println("*".repeat(60));
        acciones(trio2);
        System.out.println("*".repeat(60));
        acciones(trio3);
        System.out.println("*".repeat(60));
        acciones(trio4);
        System.out.println("*".repeat(60));

    }

    public static void acciones(TresNumeros trio) {
        System.out.println(trio.toString());
        System.out.println("Maximo: " + trio.getMaximo());
        System.out.println("Mínimo: " + trio.getMinimo());
        System.out.println("¿Son todos iguales?: " + trio.sonIguales());
        System.out.println("¿Cuántos acaban en 5?: " + trio.cuantosAcabanEn5());
        trio.ordenar();
        System.out.println("Números ordenados: " + trio.toString());
    }
}
