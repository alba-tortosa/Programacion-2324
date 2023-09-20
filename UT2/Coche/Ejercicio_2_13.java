/** Ejercicio 2.13
 * Crea un objeto de nombre miCoche de color azul, modelo Ford Focus y del año 2004.
 *  Llama a los métodos getAño(), getModelo() y getColor() y guarda el resultado en 3 variables.
 *  Muestra los valores obtenidos en el paso anterior en la consola usando una sola instrucción.
 *  Llama al método setColor() y cambia el color del coche.
 *  Llama al método print().
 *  Accede al código de la clase Coche y añade un nuevo atributo, numeroPuertas, de tipo entero.
 *  Añade un nuevo método getNumeroPuertas() que devuelve el valor de este atributo (hazlo viendo cómo está codificado, por ej. el método getColor())
 *  Añade un nuevo método setNumeroPuertas() que modifique el valor de este atributo (hazlo viendo cómo está codificado, por ej. el método setColor())
 *  Modifica el método print() para que muestre el número de puertas del coche
 *  Crea otro objeto tuCoche proporcionando como parámetros los valores de atributos de tu coche favorito.
 *  Utiliza los métodos setNumeroPuertas(), getNumeroPuertas() y print() en el objeto tuCoche
 */

public class Ejercicio_2_13 {


    public static void main(String[] args) {

        Coche coche1 = new Coche("Ford Focus", "azul", 2004);
        int anyo = coche1.getAnyo();
        String modelo = coche1.getModelo();
        String color = coche1.getColor();
        System.out.println("Año: " + anyo + " Modelo: " + modelo + " Color: " + color);

        coche1.setColor("blanco");
        coche1.print();

        Coche tuCoche = new Coche("Renault Megane", "blanco", 2018);
        tuCoche.setNumeroPuertas(5);
        int numeroPuertas = tuCoche.getNumeroPuertas();
        tuCoche.print();






    }


}
