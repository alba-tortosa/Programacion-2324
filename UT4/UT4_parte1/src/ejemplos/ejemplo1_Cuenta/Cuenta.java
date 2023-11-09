package ejemplos.ejemplo1_Cuenta;

/**
 * Modela una cuenta bancaria
 * 
 *
 */
public class Cuenta
{
    private String identificador;
    private double saldo;

    private Persona titular;

    public Cuenta(String identificador, double saldo, String nombreTitular) {
        this.identificador = identificador;
        this.saldo = saldo;
        this.titular = new Persona(nombreTitular);

    }
    
}
