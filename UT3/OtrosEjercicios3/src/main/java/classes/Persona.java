package classes;

/**
 * Usado en los ejercicios: 3.14
 */

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }

    public int getEdadDentroDe3Anyos(){
        return edad + 3;
    }

    public void sumaEdad(int valor){
        edad = edad + valor;
    }

    public int getEdad() {
        return edad;
    }

}
