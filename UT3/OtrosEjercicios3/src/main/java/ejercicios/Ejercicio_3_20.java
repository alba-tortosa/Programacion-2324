package ejercicios;

import classes.Fecha;

/**
 * TODO: Ejercicio 3.20.
 * Clase Fecha:
 * - Implementa el método getDiasMes()
 * - Escribe una sentencia switch que analice el valor del atributo mes y devuelva
 * los días que tiene.
 * - Cuando se trate del mes 2 (febrero) habrá que tener en cuenta si el año (contenido en la variable anio) es o no
 * bisiesto (un año es bisiesto si es múltiplo de 4 y si es múltiplo de 400 pero no de 100) .
 * Clase Ejercicio_3_20:
 * - Prueba el método con diferentes meses y años. Prueba todas las posibilidades diferentes.
 */
public class Ejercicio_3_20 {

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(1, 2, 2020);
        System.out.println("Días del mes: " + fecha1.getDiasMes());
        Fecha fecha2 = new Fecha(1, 2, 2000);
        System.out.println("Días del mes: " + fecha2.getDiasMes());
        Fecha fecha3 = new Fecha(1, 2, 2023);
        System.out.println("Días del mes: " + fecha3.getDiasMes());
        Fecha fecha4 = new Fecha(1, 2, 2024);
        System.out.println("Días del mes: " + fecha4.getDiasMes());
        Fecha fecha5 = new Fecha(1, 1, 2024);
        System.out.println("Días del mes: " + fecha5.getDiasMes());
        Fecha fecha6 = new Fecha(1, 6, 2024);
        System.out.println("Días del mes: " + fecha6.getDiasMes());
        Fecha fecha7 = new Fecha(1, 7, 2024);
        System.out.println("Días del mes: " + fecha6.getDiasMes());
    }
}
