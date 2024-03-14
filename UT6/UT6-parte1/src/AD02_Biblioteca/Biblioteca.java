package AD02_Biblioteca;
/**
 * Modela una clase Biblioteca
 *  
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Biblioteca
{

    private String nombre;
    private ArrayList<Libro> libros;

    /**
     * Constructor de la clase Biblioteca
     */
    public Biblioteca(String nombre)    {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    /**
     * Accesor para el nombre
     * 
     */
    public String getNombre()    {
        return nombre;
    }

    /**
     * @return la cantidad de libros en la biblioteca
     * 
     */
    public int  numeroLibros()    {
        return libros.size();
    }

    /**
     * Añade un nuevo libro
     * @param libro el libro a añadir
     */
    public void addLibro(Libro libro)    {
        if (libro != null)   {
            Libro l = localizarLibro(libro.getTitulo());
            if (l == null)    {                
                libros.add(libro);
            }
        }
    }

    /**
     * Localizar un libro dado su titulo
     * @return el libro buscado o null si no
     * se encuentra
     */
    public Libro localizarLibro(String titulo)    {
        Iterator<Libro> it = libros.iterator();
        while (it.hasNext())        {
            Libro libro = it.next();
            if (libro.getTitulo().equalsIgnoreCase(titulo))      {
               return libro;
            }
        }       
        return null;

    }

    /**
     * @param autor el autor a buscar
     * @return true si hay en la biblioteca libros
     * del autor dado
     */    
    public boolean hayLibrosDe(String autor)    {
        int i = 0;
        while (i < libros.size())      {
            Libro libro = libros.get(i);
            if (libro.getAutor().compareToIgnoreCase(autor) == 0)   {
                return true;
            }
            else   {
                i++;
            }
        }
        return false;

    }

    /**
     * Borrar los libros de un determinado autor
     * @param autor el autor cuyos libros se borraran
     */
    public void borrarLibrosDe(String autor)    {

        boolean encontrado = false;
        int i = 0;
        while (i < libros.size())    {
            Libro libro = libros.get(i);
            if (libro.getAutor().compareToIgnoreCase(autor) == 0) {
                encontrado = true;
                libros.remove(i);
            }
            else   {
                i++;
            }
        }
        if (!encontrado)  {
            System.out.println("No habia libros del autor");
        }

    }

    /**
     * Mostrar libros prestados
     *   
     */
    public void listarPrestados()   {
        for (Libro libro: libros)  {
            if (libro.estaPrestado())  {
                System.out.println(libro.toString());
            }
        }

    }

    /**
     * Prestar un libro de un determinado titulo
     */
    public void prestarTitulo(String titulo)    {
        Libro libro = localizarLibro(titulo);
        if (libro == null)        {
            System.out.println("El libro " + titulo + 
                    " no esta en la biblioteca");
        }
        else if (libro.estaPrestado())     {
            System.out.println("El libro " + titulo + " ya esta prestado");
        }
        else   {
            libro.prestar();
        }

    }

    /**
     *  Representacion textual de la biblioteca
     */
    public String toString()    {
        StringBuilder sb = new StringBuilder("Biblioteca " + this.nombre + "\n\n");
        for (Libro libro: libros)     {
           sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }

}
