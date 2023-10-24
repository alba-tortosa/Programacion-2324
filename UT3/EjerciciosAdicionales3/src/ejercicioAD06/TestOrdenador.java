package ejercicioAD06;

public class TestOrdenador {

    public static void main(String[] args) {

        Ordenador pc1 = new Ordenador(4000);
        Ordenador pc2 = new Ordenador(-2000);

        System.out.println("*".repeat(60));
        System.out.println("Memoria máxima PC1 --> " + pc1.getMaxMemoria());

        if(!pc1.instalarMemoria(5000)) {
            System.out.println("PC1 -- no se ha podido instalar la cantidad de memoria especificada");
        }
        if (pc1.instalar1000MB()) {
            System.out.println("PC1 -- se han instalado 1000MB. La memoria disponible es: " + pc1.obtenerMemoriaDisponible());
        }
        pc1.printInformacion();

        System.out.println("*".repeat(60));
        System.out.println("Memoria máxima PC2 --> " + pc2.getMaxMemoria());

        if (pc2.instalarMemoria(16000)) {
            System.out.println("PC2 -- La memoria ha sido instalada. La memoria disponible es: " + pc2.obtenerMemoriaDisponible());
        }
        if (!pc2.instalar1000MB()) {
            System.out.println("PC2 -- no se ha podido instalar la cantidad de memoria especificada");
        }
        pc2.vaciarMemoria();
        pc2.printInformacion();

        System.out.println("*".repeat(60));

    }
}
