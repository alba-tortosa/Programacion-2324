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
        tesauro.escribirTesauro();
    }
}
