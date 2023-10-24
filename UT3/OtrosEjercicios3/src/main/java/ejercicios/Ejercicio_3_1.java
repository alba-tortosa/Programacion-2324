package ejercicios;

import classes.MaquinaExpendedora;

public class Ejercicio_3_1 {

    /**
     * TODO: Ejercicio 3.1.
     * Clase Ejercicio_3_1:
     * - Crea un objeto miMaquina de la clase MaquinaExpendedora
     * - Llama al método getPrecio() y recoge el precio en una variable llamada precio que imprimirás por consola
     * - Llama al método insertarDinero() que simula la inserción de dinero en la máquina varias veces
     * - Invoca al método getImporte() para verificar que la máquina registra el dinero insertado
     * - Inserta varias cantidades de dinero y cuando haya suficiente llama al método imprimirTicket()
     * - Examina el balance (importe) de la máquina después de emitir el billete
     */
    public static void main(String[] args) {
        //Crea un objeto miMaquina de la clase MaquinaExpendedora
        MaquinaExpendedora miMaquina = new MaquinaExpendedora(100);
        //Llama al método getPrecio() y recoje el precio en una variable llamada precio que imprimirás
        int precio = miMaquina.getPrecio();
        System.out.println("El precio es: " + precio);
        // Llama al método insertarDinero() que simula la inserción de dinero en la máquina
        miMaquina.insertarDinero(100);
        miMaquina.insertarDinero(50);
        //Invoca al método getImporte() para verificar que la máquina registra el dinero insertado
        int importe = miMaquina.getImporte();
        System.out.println("El importe es: " + importe);
        //Inserta varias cantidades de dinero
        miMaquina.insertarDinero(25);
        //cuando haya suficiente llama al método imprimirTicket()
        miMaquina.imprimirTicket();
        //Examina el balance (importe) de la máquina después de emitir el billete
        importe = miMaquina.getImporte();
        System.out.println("El importe es: " + importe);
    }

}
