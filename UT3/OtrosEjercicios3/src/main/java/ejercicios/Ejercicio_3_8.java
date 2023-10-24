package ejercicios;

public class Ejercicio_3_8 {

    /**
     * Ejercicio 3.8.
     * Prueba a declar las variables y a realizar las asignaciones que se muestran en la teoría.
     * ¿Cuáles son válidas y cuáles no? ¿Por qué?
     */
    public static void main(String[] args) {

        int precio1;
        double precio2;
        int texto;
        float precio3;
        double tasa;
        int pago;
        double cambio;

        // precio1 = 35.0; // No se puede asignar un valor decimal en una variable de tipo entero (int)
        precio2 = 6;
        // texto = "hola"; // No se puede asignar un valor de texto en una variable de tipo entero (int)
        precio3 = 34.56f;
        // tasa = precio1 * 0.07; // No se puede utilizar una variable (precio1) que no tiene valor asignado
        pago = 50;
        // cambio = pago - precio3 - tasa; // No se puede utilizar na variable (tasa) que no existe


    }
}
