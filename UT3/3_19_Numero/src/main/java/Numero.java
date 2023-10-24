/**
 * TODO: Ejercicio 3.19.
 * - Los objetos de la clase Numero permiten almacenar un nº y nos indican si
 * ese nº que contienen es menor, mayor o igual que otro que reciben.
 * La clase incluye un único atributo entero, numero y exhibe el siguiente comportamiento:
 * - el constructor tiene un parámetro que permite inicializar el atributo numero
 * - public boolean esMayorQue(int otroNumero) - si el valor que guarda el
 * objeto es mayor que el nº pasado como parámetro devuelve true, en caso contrario false
 * - public boolean esMenorQue(int otroNumero) - si el valor que guarda el
 * objeto es menor que el nº pasado como parámetro devuelve true,en caso contrario false
 * - public boolean esIgualQue(int otroNumero) - si el nº que se pasa como
 * parámetro es igual que el atributo del objeto devuelve true, en caso contrario false
 * - public String comprobar(int otroNumero) - si el atributo es mayor que el
 * nº que se pasa como parámetro devuelve la cadena “Más grande”,
 * si es menor devuelve la cadena “Es menor”, si son iguales devuelve “Son iguales”
 */
public class Numero {
private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    public boolean esMayorQue(int otroNumero) {
        return this.numero > otroNumero;
    }

    public boolean esMenorQue(int otroNumero) {
        return this.numero < otroNumero;
    }

    public boolean esIgualQue(int otroNumero) {
        return this.numero == otroNumero;
    }

    public String comprobar(int otroNumero) {
        if (this.esMayorQue(otroNumero)) {
            return "Más grande";
        } else if (this.esMenorQue(otroNumero)) {
            return "Es menor";
        } else {
            return "Son iguales";
        }
    }

    public static void main(String[] args) {
        Numero numero = new Numero(5);
        System.out.println(numero.comprobar(5));
        System.out.println(numero.comprobar(4));
        System.out.println(numero.comprobar(6));
    }

}
