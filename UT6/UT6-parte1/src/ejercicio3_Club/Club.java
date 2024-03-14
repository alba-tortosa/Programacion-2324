package ejercicio3_Club; /**
 * Almacena detalles del club de miembros
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Club {

    private ArrayList<Miembro> miembros;

    /**
     * Constructor para los objetos de la clase Club
     */
    public Club() {
        miembros = new ArrayList<>();
    }

    /**
     * Añadir un nuevo miembro a la lista de miembros
     * @param nuevoMiembro  El objeto Miembro a añadir
     */
    public void anyadir(Miembro nuevoMiembro) {
        miembros.add(nuevoMiembro);
    }

    /**
     * @return El numero de miembros del club
     */
    public int numeroMiembros() {
        return miembros.size();
    }

    /*
     * Determinar el numero de miembros que se unieron al
     * club en un mes dado
     * @param  mes  el mes en cuestion
     * @return el numero de miembros
     */
    public int incorporadosEnMes(int mes) {
        int contador = 0;
        if (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto");
        } else {
            for (Miembro miembro : miembros) {
                if (miembro.getMes() == mes){
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Borrar de la coleccion todos los miembros que se unieron
     * en un mes dado y devolverlos almacenados en una coleccion
     * separada
     * @param mes  El mes en que se unio el miembro
     * @param anyo  El año en que se unio el miembro
     * @return La nueva coleccion
     */
    public ArrayList<Miembro> borrar(int mes, int anyo) {
        ArrayList<Miembro> miembrosBorrados = new ArrayList<>();
        Iterator<Miembro> iterator = miembros.iterator();
        while (iterator.hasNext()) {
            Miembro miembro = iterator.next();
            if (miembro.getMes() == mes && miembro.getAnio() == anyo) {
                miembrosBorrados.add(miembro);
                iterator.remove();
            }
        }
        return miembrosBorrados;
    }

    public ArrayList<Miembro> borrarV2(int mes, int anyo) {
        ArrayList<Miembro> eliminados = new ArrayList<>();
        int pos = 0;
        if (mes >= 0 && mes <= 12) {
            while (pos < this.miembros.size()) {
                Miembro miembro = this.miembros.get(pos);
                if (miembro.getMes() == mes && miembro.getAnio() == anyo) {
                    eliminados.add(miembro);
                    this.miembros.remove(miembro);
                    pos--;
                }
                pos++;
            }
        }
        return eliminados;
    }

    public ArrayList<Miembro> borrarV3(int mes, int anyo) {
        ArrayList<Miembro> miembrosMes = new ArrayList<>();
        for (int i = 0; i < miembros.size(); i++) {
            if(miembros.get(i).getMes() == mes && miembros.get(i).getAnio() == anyo){
                miembrosMes.add(miembros.get(i));
                miembros.remove(i);
                i--;
            }
        }
        return miembrosMes;
    }

    public ArrayList<Miembro> borrarV4(int mes, int anyo) {
        ArrayList<Miembro> miembrosMes = new ArrayList<>();
        for (Miembro miembrosMe : miembros) {
            if(miembrosMe.getMes() == mes && miembrosMe.getAnio() == anyo){
                miembrosMes.add(miembrosMe);
                miembros.remove(miembrosMe);
            }
        }
        return miembrosMes;
    }

    /**
     *
     */
    public void listarClub() {
        for (Miembro miembrosMe : miembros) {
            System.out.println(miembrosMe);
        }

    }

}
