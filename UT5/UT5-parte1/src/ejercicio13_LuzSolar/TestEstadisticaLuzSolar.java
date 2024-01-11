package ejercicio13_LuzSolar;

public class TestEstadisticaLuzSolar {
    public static void main(String[] args) {
        EstadisticaLuzSolar estadistica = new EstadisticaLuzSolar();
        System.out.printf("Media de sol: %.2f", estadistica.getMediaSol());
        System.out.println("Mes mas soleado: " + estadistica.mesMasSoleado());
        System.out.println("Mes menos soleado: " + estadistica.mesMenosSoleado());
    }
}
