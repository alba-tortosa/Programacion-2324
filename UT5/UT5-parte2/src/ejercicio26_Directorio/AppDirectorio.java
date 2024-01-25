package ejercicio26_Directorio;

/**
 * Ejercicio 5.26 UT5
 */
public class AppDirectorio {

    public static void main(String[] args) {
        InterfazDirectorio id = new InterfazDirectorio(new Directorio());
        id.iniciar();

    }
}
