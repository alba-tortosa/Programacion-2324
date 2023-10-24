package ejercicios;

import classes.Factura;

public class Ejercicio_3_6 {

    /**
     * TODO: Ejercicio 3.6.
     * Clase Factura:
     * - Examina la clase y sus atributos
     * - Crea el constructor:
     *     - Recibe un parámetro llamado valorCompra que representa el valor total de una compra realizada
     *     - asigna a la variable de instancia valorCompra el valor recibido por parámetro
     *     - asigna a la variable de instancia totalFactura el valor de la compra con el incremento del 16% de IVA.
     * Clase Ejercicio_3_6:
     * - Crea varios objetos de tipo Factura y muestra su valor de compra y el total de su factura
     */

    public static void main(String[] args) {
        Factura factura = new Factura(100);
        System.out.println(factura.getTotalFactura());
    }

}
