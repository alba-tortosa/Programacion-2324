package AD05_ListaNombres;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Clase de utilidades. Contiene solo metodos
 * estaticos
 */


public class UtilsString {
    /**
     * Dada una cadena obtiene y devuelve su conjunto de caracteres
     * Importa el orden en el conjunto
     */
    public static TreeSet<Character> getConjuntoCaracteres(String cadena) {
        TreeSet<Character> resultado = new TreeSet<>();
        for (int i = 0; i < cadena.length(); i++) {
            resultado.add(cadena.charAt(i));
        }
        return resultado;
    }

    public static TreeSet<Character> getConjuntoCaracteresV2(String cadena) {
        TreeSet<Character> caracteres = new TreeSet<>();
        for (char c : cadena.toCharArray()) {
            caracteres.add(c);
        }
        return caracteres;
    }

    /**
     * Dada una cadena obtiene su conjunto de caracteres numericos
     * No importa el orden en el conjunto
     * <p>
     * Usa algun metodo de la clase Character  para comprobar si un caracter es
     * numerico o no
     */
    public static HashSet<Character> getConjuntoDigitos(String cadena) {
        HashSet<Character> numero = new HashSet<>();
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))){
                numero.add(cadena.charAt(i));
            }
        }
        return numero;
    }

    /**
     * Dada una cadena obtiene su conjunto de letras mayusculas
     * en el orden en el que aparecen   en la cadena
     */
    public static LinkedHashSet<String> getConjuntoMayusculas(String cadena) {
        LinkedHashSet<String> tree = new LinkedHashSet<>();
        for (int i = 0; i < cadena.length(); i++) {
            String letra = String.valueOf(cadena.charAt(i));
            if (letra == letra.toUpperCase()) tree.add(letra);
//            if (Character.isUpperCase(cadena.charAt(i)))tree.add(letra);
        }
        return tree;
    }

}
