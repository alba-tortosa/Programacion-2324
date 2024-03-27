package AD08_Tesauro;


/**
 * Clase AppTesauro -  incluye el metodo main()
 * Arranca la aplicacion
 */
public class AppTesauro {

    /**
     *
     */
    public static void main(String[] args) {
        Tesauro tesauro = new Tesauro();
        tesauro.anyadirSinonimo("obeso gordo");
        tesauro.anyadirSinonimo("delgado enjuto fino flaco");
        tesauro.anyadirSinonimo("delegar encargar encomendar facultar");
        tesauro.anyadirSinonimo("excelente brillante colosal exquisito estupendo soberbio");
        tesauro.anyadirSinonimo("estupendo maravilloso superior magnífico");
        tesauro.anyadirSinonimo("maravilloso estupendo magnífico excelente soberbio");
        tesauro.escribirTesauro();
        System.out.println();

        tesauro.borrarSinonimo("magnífico");
        tesauro.escribirTesauro();
    }
}
