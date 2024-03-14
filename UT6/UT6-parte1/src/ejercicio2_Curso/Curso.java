package ejercicio2_Curso;
/**
 * Un objeto de esta clase mantiene
 * una coleccion ArrayList de objetos Estudiante
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Curso {

    private ArrayList<Estudiante> curso;

    /**
     * Constructor
     */
    public Curso() {
        curso = new ArrayList<>();
    }

    /**
     * A�ade un estudiante a la coleccion
     */
    public void añadirEstudiante(String nombre, int nota) {
        Estudiante e = new Estudiante(nombre, nota);
        curso.add(e);
    }

    /**
     * numero de alumnos en el curso
     */
    public int cuantosAlumnos() {
        return curso.size();
    }

    /**
     * Representacion en formato texto del curso
     */
    public String toString() {
        String texto = "";
        for (int i = 0; i < curso.size(); i++) {
            Estudiante estudiante = curso.get(i);
            texto += estudiante + "\n";
        }

        for (Estudiante estudiante : curso) {
            texto += estudiante + "\n";
        }

        return texto;
    }

    /**
     * Calcula la media de notas del curso. Utiliza for mejorado
     */
    public double getMedia() {
        double media = 0;
        int nota = 0;
        for (int i = 0; i < curso.size(); i++) {
            nota = curso.get(i).getNota();
            media += nota;
        }
        return media/curso.size();
    }

    /**
     * Nombre del alumno con nota maxima. Utiliza un iterador
     */
    public String alumnoNotaMaxima() {
        int notaMax = 0;
        String nombre = "";

        Iterator<Estudiante> it = curso.iterator();
        while (it.hasNext()) {
            Estudiante estudiante = it.next(); // get(i) + i++
            if (notaMax < estudiante.getNota()) {
                notaMax = estudiante.getNota();
                nombre = estudiante.getNombre();
            }
        }
        return nombre;
    }

    public String alumnoNotaMaximaFor() {
        int notaMax = 0;
        String nombre = "";
        for (Estudiante estudiante : curso) {
            if (notaMax < estudiante.getNota()) {
                notaMax = estudiante.getNota();
                nombre = estudiante.getNombre();
            }
        }
        return nombre;
    }

    /**
     * Borrar el primer estudiante de la coleccion. Esta no puede estar vacia
     */
    public void borrarPrimero() {
        if (!curso.isEmpty()) curso.remove(0);
    }

    /**
     * Borrar los alumnos que han suspendido. Con un interador
     */
    public void borrarSuspensos() {
        //ESTO DA ERROR
//        for (Estudiante estudiante : curso) {
//            if (estudiante.getNota() < 5) curso.remove(estudiante);
//        }

        //ESTO DA ERROR

//        for (int i = 0; i < curso.size(); i++) {
//            Estudiante estudiante = curso.get(i);
//            if (estudiante.getNota() < 5) curso.remove(estudiante);
//        }

        Iterator<Estudiante> it = curso.iterator();
        while (it.hasNext()) {
            Estudiante estudiante = it.next(); // get(i) + i++
            if (estudiante.getNota() < 5) it.remove();
        }
    }

    /**
     * Devuelve true si hay algun notable. Con for mejorado
     * Notable = 7-8
     */
    public boolean hayAlgunNotable() {
        for (int i = 0; i < curso.size(); i++) {
            if (curso.get(i).getNota() == 7 || curso.get(i).getNota() == 8) return true;
        }
        return false;
    }

    /**
     * cuantos estudiantes tienen un nombre que empieza por la cadena indicada
     */
    public int empiezanPor(String str) {
        int cuantos = 0;
        for (Estudiante estudiante : curso) {
            if (estudiante.getNombre().startsWith(str)) cuantos++;
        }
        return cuantos;
    }

    /**
     * Devuelve el suspenso mas alto del curso
     */
    public int suspensoMasAlto() {
        int suspensoMasAlto = 0;
        for (Estudiante estudiante : curso) {
            if (estudiante.getNota() < 5 && suspensoMasAlto < estudiante.getNota())
                suspensoMasAlto = estudiante.getNota();
        }
        return suspensoMasAlto;
    }

    /**
     * Calcula y devuelve como un string las dos notas mas altas del curso.
     * Con un while normal.
     */
    public String dosNotasMasAltas() {
        int contador = 0;
        int notamasAlta = 0;
        int segundaMasAlta = 0;

        while( contador < curso.size() ){
            Estudiante estudiante = curso.get(contador);
            if( curso.get(contador).getNota() > notamasAlta ){
                notamasAlta = curso.get(contador).getNota();
            } else if(curso.get(contador).getNota() > segundaMasAlta && curso.get(contador).getNota() <= notamasAlta){
                segundaMasAlta = curso.get(contador).getNota();
            }

//            if( estudiante.getNota() > notamasAlta ){
//                segundaMasAlta = notamasAlta;
//                notamasAlta = estudiante.getNota();
//            }
            contador++;

        }

        return "la nota más alta es: " + notamasAlta + " y la segunda más alta es: " + segundaMasAlta;
    }

    /**
     * Borra los estudiantes menores de edad Con un iterador.
     */
    public void borrarMenoresDeEdadV1() {
        Iterator<Estudiante> it = curso.iterator();
        while (it.hasNext()) {
            Estudiante estudiante = it.next();
            if (estudiante.getEdad() < 18) {
                it.remove();
            }
        }
    }

    /**
     * Borra los estudiantes menores de edad Con un while.
     */
    public void borrarMenoresDeEdadV2() {


    }

}
