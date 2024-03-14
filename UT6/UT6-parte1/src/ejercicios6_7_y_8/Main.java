package ejercicios6_7_y_8;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Ejer 6.6
        Integer unEntero = Integer.valueOf(2);
        Integer[] arrayEnteros = {1, 2, 3};

        // Ejer 6.7
        char c = 'a';
        if (Character.isLetter(c)) {
            // c es de tipo char
        }
        if (Character.isLowerCase(c)) {
            // c está en minúsculas
        }

        //Ejer 6.8ç
        TextField txtNumero = new TextField(25);
        String strNumero = txtNumero.getText();
        int numero = Integer.valueOf(strNumero).intValue();
    }
}
