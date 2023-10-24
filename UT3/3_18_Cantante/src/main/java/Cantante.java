/**
 * TODO: Ejercicio 3.18.
 * - Esta clase tiene un atributo feliz de tipo booleano.
 * - Los objetos de esta clase están inicialmente felices. Indica esto en el constructor.
 * - Añade los siguientes métodos y pruébalos. Indica si son accesores o mutadores.
 * - public void cantar() - cuando se le envía el mensaje cantar() al objeto
 * se examina su estado de ánimo. Si está feliz se emite el mensaje
 * “Cantando bajo la lluvia”, si está triste se escribe “No tiene ánimo
 * para cantar”
 * - public boolean estaTriste() – haz dos versiones de este método , una
 * con la sentencia if y otra sin utilizar dicha sentencia
 * - public void cambiarEstadoAnimo() – si esta triste se pone feliz y
 * viceversa. Hazlo sin if.
 */
public class Cantante {

    private boolean feliz;

    public Cantante() {
        feliz = true;
    }

    public void cantar() {
        if (feliz) {
            System.out.println("Cantando bajo la lluvia");
        } else {
            System.out.println("No tiene ánimo para cantar");
        }
    }

    public boolean estaTriste() {
        return !feliz;
    }

    public void cambiarEstadoAnimo() {
        feliz = !feliz;
    }

    public static void main(String[] args) {
        Cantante cantante = new Cantante();
        cantante.cantar();
        cantante.cambiarEstadoAnimo();
        cantante.cantar();
    }

}
