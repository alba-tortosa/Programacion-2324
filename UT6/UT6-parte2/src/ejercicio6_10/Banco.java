package ejercicio6_10;

import java.util.HashMap;

public class Banco {

    HashMap<String, Cuenta> cuentasBancarias = new HashMap<String, Cuenta>();
    // la clave es el identificador de un cliente, el valor la cuenta asociada

    // añade una nueva cuenta a la colección
    public void addCuenta(String nombre, int numCuenta, int balance) {

    }

    //devuelve la cuente del cliente cuyo identificador proporciona como parámetro
    public Cuenta getCuenta(String nombre) {
        return null;
    }

    // lista en pantalla los identificadores de los clientes del banco
    // (para ello obtiene un conjunto – set - de todas las claves en el map)
    public void listarClientes() {

    }

}
