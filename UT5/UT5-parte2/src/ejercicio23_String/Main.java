package ejercicio23_String;

public class Main {
    public static void main(String[] args) {
        String unaCadena = new String("Ejemplo");
        System.out.println(unaCadena);
        unaCadena = unaCadena.toUpperCase();
        System.out.println(unaCadena);

        String str = "Aprendiendo cadenas en Java";
        String resul = "cadena de ejemPLO";
        char caracter;
        int pos;

        //Asigna a resul y/o a carácter y/o a pos:
        // 1. la cadena str convertida a mayúsculas
        resul = str.toUpperCase();
        System.out.println("str="+ str + " resul="+resul);
        // 2. el carácter de la posición 6 de str
        caracter = str.charAt(6);
        System.out.println("el carácter de la posición 6 de str: " + caracter);
        // 3. el último carácter de la cadena str
        caracter = str.charAt(str.length()-1);
        System.out.println("el último carácter de la cadena str:" + caracter);
        // 4. compara str con la cadena resul sin tener en cuenta mayúsculas ni minúsculas
        System.out.println("son iguales sin tener en cuenta mayus/minus? " + str.equalsIgnoreCase(resul));
        System.out.println("son iguales teniendo en cuenta mayus/minus? " + str.equals(resul));
        // 5. pregunta si str empieza por “Ba”
        System.out.println("pregunta si str empieza por “Ba”? " + str.startsWith("Ba"));
        // 6. sustituye en str todas las 'e' por '*'
        resul = str.replace('e', '*');
        // 7. devuelve la primera aparición de la 'd' en str
        pos = str.indexOf("d");
        // 8. localiza la última aparición de la 'c' en str. Extrae , a partir de ahí, la subcadena existente hasta
        // el final.
        pos = str.lastIndexOf("c");
        resul = str.substring(pos);
        // 9. convierte a String el valor 66
        resul = String.valueOf(66);
        //10. pregunta si la cadena str es vacía
        System.out.println(resul.isEmpty());
        System.out.println(resul.equals(""));
        System.out.println(resul == null);
    }
}