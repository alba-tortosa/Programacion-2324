package ejercicios;

import classes.MaquinaExpendedoraMejorada;

/**
 * TODO: Ejercicio 3.16.
 * Clase MaquinaExpendedoraMejorada:
 * - Examina la clase y los métodos
 * Clase Ejercicio_3_16:
 * - Verifica el comportamiento de la máquina meorada creando varias instancias  y llamando al método insertarDinero()
 * con diferentes valores de parámetros actuales
 * - Verifica el valor del importe antes y después de llamar a insertarDinero()
 * - Prueba el método insertarDinero() introduciendo una cantidad negativa y/o 0. ¿Cambia el valor del importe?
 * Clase MaquinaExpendedoraMejorada:
 * - Analiza el código del método devolverCambio(). ¿Qué tipo de variable es la variable cambio?
 * - Modifica el código del método devolverCambio() incluyendo únicamente las sentencias:
 *       importe = 0; return importe;
 * - Comprueba qué ocurre
 * - Modifica el código del método devolverCambio() incluyendo únicamente las sentencias:
 *       return importe;importe = 0;
 * - Comprueba qué ocurre
 */

public class Ejercicio_3_16 {


    public static void main(String[] args) {
        MaquinaExpendedoraMejorada maquina = new MaquinaExpendedoraMejorada(250);
        System.out.println("importe antes de insertar: " + maquina.getImporte());
        maquina.insertarDinero(-50); //No modifica el importe porque no acepta valores negativos
        System.out.println("importe después de insertar -50: " + maquina.getImporte());
        maquina.insertarDinero(100);
        System.out.println("importe después de insertar 100: " + maquina.getImporte());
        maquina.imprimirTicket(); // No imprime el ticket porque falta dinero
        maquina.insertarDinero(200);
        maquina.imprimirTicket(); //Imprime el billete pero sobran 50 centimos
        System.out.println("importe después de imprimir el ticket: " + maquina.getImporte()); // El importe guarda el dinero a devolver
        maquina.devolverCambio(); //El importe se pone a 0
        System.out.println("importe después de devolver los cambios: " + maquina.getImporte());
    }

}
