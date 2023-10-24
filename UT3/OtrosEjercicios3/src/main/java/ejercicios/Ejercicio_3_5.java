package ejercicios;

import classes.Circulo;

public class Ejercicio_3_5 {

    private int radio;
    private double perimetro;
    private double area;

    /**
     * TODO: Ejercicio 3.5.
     * Clase Circulo:
     * - Examina la clase y sus atributos: radio, perimetro y area
     * - Implementa el método constructor:
     *    - asigna al radio el valor recibido por parámetro
     *    - suponiendo que radio representa el radio de un círculo, asigna a perimetro el perímetro de dicho circulo
     *    - asigna a area el área del circulo
     *  Clase Ejercicio_3_5:
     *  - Crea varios circulos con diferente radio y muestra por pantalla su area y su perimetro.
     */

    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        System.out.println(circulo.getRadio());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimetro());
    }

}
