package ejercicio24_Palabra;

import java.util.Arrays;

/**
 * Representa a una palabra
 */
public class Palabra {
    private static final char ASTERISCO = '*';
    private String palabra;

    /**
     * Constructor de la clase Palabra
     */
    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * Devuelve una palabra con guiones insertados
     *
     * @return la palabra con guiones
     */
    public String guionizar() {
        String palabraGuiones = "";
        for (int i = 0; i < palabra.length() ; i++) {
            if(i == palabra.length()-1){
                palabraGuiones += this.palabra.charAt(i);
            }else{
                palabraGuiones += this.palabra.charAt(i) + "-";
            }
        }
        return palabraGuiones;
    }


    /**
     * @return el numero de vocales de la palabra
     */
    public int contarVocales() {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (esVocal(palabra.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    private boolean esVocal(char car) {
        return "aeiouAEIOU".contains(String.valueOf(car));
//        return "aeiouAEIOU".indexOf(car) != -1;
//        return car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u'
//                || car == 'A' || car == 'E' || car == 'I' || car == 'O' || car == 'U';

    }

    /**
     * Compara la palabra actual con la recibida como paramtero
     *
     * @param palabra con la que comparar
     * @return true si son iguales, false en otro caso
     */
    public boolean mayorQue(String palabra) {
        if ( this.palabra.compareTo(palabra)>0){
            return true;
        }
        return false;
    }

    /**
     * Borrar las apariciones de str en palabra
     */
    public String borrarOcurrenciasDe(String str) {
        return this.palabra.replace(str, "");
    }

    public char[][] toArray2D() {
        char[][] output = new char[this.palabra.length()][this.palabra.length()];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output.length; j++) {
                output[i][j] = (j < i) ? '*' : this.palabra.charAt(j);
//                if (j < i) output[i][j] = '*';
//                else output[i][j] = this.palabra.charAt(j);
            }
        }
        return output;
    }

    public char[][] toArray2D_3() {
        String p = palabra;
        char[][] bidimensional = new char[palabra.length()][palabra.length()];
        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                bidimensional[i][j] = p.charAt(j);
            }
            p = p.replaceFirst(String.valueOf(p.charAt(i)), String.valueOf(ASTERISCO));
        }
        return bidimensional;
    }

    public char[][] toArray2D_v2() {
        char[][] array = new char[palabra.length()][palabra.length()];
        int aux=0;
        for (int i = 0; i < palabra.length(); i++) {
            array[i][aux] ='*';
            for (int j = 0; j < palabra.length(); j++) {
                array[i][j] = '*';
                for (int k = 0; k <palabra.length() ; k++) {
                    if (j==aux) {
                        array[k][j] = palabra.charAt(j);
                    }
                }
            }
            aux++;
        }
        return array;
    }

    public char[] toArray() {
        return palabra.toCharArray();
//        char[] array = new char[palabra.length()];
//        for (int i = 0; i < palabra.length(); i++) {
//            array[i] = palabra.charAt(i);
//        }
//        return array;
    }

    public void print() {
        for (char[] fila : toArray2D()) {
            System.out.println(Arrays.toString(fila));
        }

    }

}
