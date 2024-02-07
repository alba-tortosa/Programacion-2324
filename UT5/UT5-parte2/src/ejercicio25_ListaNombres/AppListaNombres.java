package ejercicio25_ListaNombres;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Pide al usuario el tamaño maximo de la lista y:
 * - se llama al metodo cargarDeFichero()
 * - se muestra la lista
 * - se muestra el nombre mas largo
 * - se borran los que empiezan por 'r'
 * - se muestra la lista
 * - se muestra cuantos empiezan por 'aL'
 * - se muestran los nombres que empiezan por "a"
 */
public class AppListaNombres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad máxima de nombres a guardar:");
        int n = scanner.nextInt();
        ListaNombres lista = new ListaNombres(n);
        lista.cargarDeFichero();
        System.out.println("Despues de insertar");
        System.out.println(lista.toString());
        System.out.println("Nombre mas largo: " + lista.nombreMasLargo());
        lista.borrarLetra('j');
        System.out.println("Despues de borrar nombres que comienzan por 'j': " + lista.toString());
        System.out.println("Cuantos nombres empiezan por \"lu\":" + lista.empiezanPor("lu"));
        System.out.println("Lista de nombres que empiezan por 'a':" + Arrays.toString(lista.empiezanPorLetra('a')));


    }
}
