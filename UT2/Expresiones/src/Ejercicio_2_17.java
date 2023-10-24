/** Ejercicio 2.17
 * Rellena la variable resultado para que evalúe la expresión que se pide en cada caso
 * El resultado para la persona1 debe ser: true, false, false, false, false, false, true, false, false
 * El resultado para la persona2 debe ser: true, true, true, true, false, false, true, true, false
 */


public class Ejercicio_2_17 {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Ainara", false, 1981, 'C', 36000);
        Persona persona2 = new Persona("Asier", true, 2000, 'S', 25000);

        evaluarExpresiones(persona1);
        evaluarExpresiones(persona2);



    }

    private static void evaluarExpresiones(Persona persona) {
        boolean resultado = 2023 - persona.getAnyo_nacimiento() >= 18;
        System.out.println("Es mayor de edad? " + resultado);

        resultado = 2023 - persona.getAnyo_nacimiento() >= 18 && 2023 - persona.getAnyo_nacimiento() <=25;
        System.out.println("Tiene entre 18 y 25 años? " + resultado);

        resultado = persona.getAnyo_nacimiento()%2 == 0;
        System.out.println("Ha nacido en un año par? " + resultado);

        // (es multiplo de 4, pero no es multiplo de 100 a menos que sea multiplo de 400)?
        resultado = persona.getAnyo_nacimiento()%4 == 0 && (persona.getAnyo_nacimiento()%100 != 0 || persona.getAnyo_nacimiento()%400 == 0);
        System.out.println("Ha nacido en un año bisiesto? " + resultado);

        resultado = persona.isEsDesempleado() && 2023 - persona.getAnyo_nacimiento() < 18;
        System.out.println("Es un desempleado menor de 18 años? " + resultado);

        resultado = persona.isEsDesempleado() && persona.getEstadoCivil() == 'C';
        System.out.println("Está desempleado y casado? " + resultado);

        resultado = persona.getEstadoCivil() == 'C' || persona.isEsDesempleado() && persona.getEstadoCivil() == 'S';
        System.out.println("Está casado o está desempleado y soltero? " + resultado);

        resultado = persona.getIngresos() * 0.1 <= 3000;
        System.out.println(" El 10% de sus ingresos es 3000 o menos? " + resultado);

        resultado = persona.getIngresos() / 2 > 15000 && persona.getEstadoCivil() == 'V';
        System.out.println("La mitad de sus ingresos es superior a 15000€ y está viudo? " + resultado);
    }

}