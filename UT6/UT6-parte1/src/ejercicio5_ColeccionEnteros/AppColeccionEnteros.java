package ejercicio5_ColeccionEnteros;

import java.util.ArrayList;
import java.util.Arrays;

public class AppColeccionEnteros {

    public static void main(String[] args) {
        ColeccionEnteros coleccion = new ColeccionEnteros();



        System.out.println("Lista original: " + coleccion.toString());
        System.out.println("----------------");

        ArrayList<Integer> ordenada = coleccion.ordenar();
        System.out.println("Lista original: " + coleccion);
        System.out.println("Lista ordenada: \t " + ordenada);

        System.out.println("----------------");

    }

}
