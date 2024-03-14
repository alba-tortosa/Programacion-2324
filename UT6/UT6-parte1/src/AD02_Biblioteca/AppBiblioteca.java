package AD02_Biblioteca;

/**
 * Prueba de la aplicacion
 */
public class AppBiblioteca {

    public static void main(String[] args) {

        Libro[] libros = {new Libro("La colmena", "Camilo Jose Cela", 150), new Libro("Madame Bovary", "Gustave " +
                "Flaubert", 400), new Libro("Anna Karenina", "Tolstoi", 1000), new Libro("Mi vida querida",
                "Alice Munro", 336), new Libro("Escapada", "Alice Munro", 336)};

        Biblioteca biblioteca = new Biblioteca("Biblioteca pública de Pamplona");
        for (Libro libro : libros) {
            biblioteca.addLibro(libro);
        }

        System.out.println("Despues de añadir varios libros\n" + biblioteca.toString());

        biblioteca.prestarTitulo("La Colmena");
        biblioteca.prestarTitulo("Mi vida querida");
        biblioteca.prestarTitulo("Piel de lobo");
        System.out.println("\nDespues de prestar varios libros\n" + biblioteca.toString());

        String autor = "Dolores Redondo";
        if (!biblioteca.hayLibrosDe(autor)) {
            System.out.println("No hay libros de " + autor);
        }
        System.out.println();
        autor = "Alice Munro";
        biblioteca.borrarLibrosDe(autor);
        System.out.println("Despues de borrar los libros de " + autor + " \n" + biblioteca.toString());
    }

}
