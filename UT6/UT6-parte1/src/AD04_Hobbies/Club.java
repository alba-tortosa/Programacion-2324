package AD04_Hobbies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Club {

    private ArrayList<Persona> personas;

    /**
     * Constructor de la clase Club
     */
    public Club() {
        personas = new ArrayList<>();
    }

    /**
     * @param nombre el nombre de la persona que se añade
     * @param hob    el conjunto de hobbies de la persona a añadir
     */
    public void addPersona(String nombre, HashSet<String> hob) {
        Persona persona = new Persona(nombre);
        for (String h : hob) {
            persona.addHobbie(h);
        }
        personas.add(persona);
    }

    /**
     * @param cual el hobbie a comprobar
     * @return el numero de personas del club que tienen ese hobbie
     */
    public int personasConHobbie(String cual) {
        int cuantas = 0;
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona persona = it.next();
            if (persona.tieneHobbie(cual)) {
                cuantas++;
            }
        }
        return cuantas;

    }

    /**
     * visualiza la lista de personas
     */

    public void printClub() {
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

    }

    /**
     * Borra de la lista las personas con un determinado hobbie
     * y las añade en el conjunto a devolver (añade su nombre)
     *
     * @param cual el hobbie a comprobar
     * @return el conjunto de nombres de personas con ese hobbie
     */

    public HashSet<String> borrarPersonasConHobbie(String cual) {
        HashSet<String> resul = new HashSet<String>();
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.tieneHobbie(cual)) {
                resul.add(p.getNombre());
                it.remove();
            }
        }
        return resul;

    }
}
