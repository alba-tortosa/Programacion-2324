package AD07_FrecuenciaNumeros;

public class TestFrecuenciaNumeros {

    public static void main(String[] args) {
        FrecuenciaNumeros fn = new FrecuenciaNumeros();
        fn.cargarDeFichero();

        fn.listarFrecuencias();
        fn.listarNumeros();
    }
}
