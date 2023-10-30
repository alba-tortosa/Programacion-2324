package ejercicioAD11;

public class TestHora {
    public static void main(String[] args) {

        System.out.println("*".repeat(60));
        //Primera prueba
        //Crea un objeto con la hora 14:30:45
        //Muestra la cantidad de segundos y la hora creada
        //Avanza un segundo y vuelve a mostrar la hora
        Hora hora1 = new Hora(14, 30, 45);
        String texto = hora1.toString();
        System.out.println(texto);

        int segundos = hora1.aSegundos();
        texto = segundos + " segundos";
        System.out.println(texto);

        hora1.avanzarSegundo();
        System.out.println(hora1.toString());

        System.out.println("*".repeat(60));
        //Segunda prueba
        //Crea un objeto con la hora 23:59:59 y muestra la hora en formato AM/PM
        //Avanza un segundo y vuelve a mostrar la hora en formato AM/PM
        Hora hora2 = new Hora(23, 59, 59);
        System.out.println(hora2.enFormatoAmPm());
        hora2.avanzarSegundo();
        System.out.println(hora2.enFormatoAmPm());

        System.out.println("*".repeat(60));
        //Tercera prueba
        //Crea un objeto con la hora 00:0:01 y muestra la hora
        //Atrasa tres segundos y vuelve a mostrar la hora
        Hora hora3 = new Hora(0, 0, 1);
        System.out.println(hora3.toString());
        hora3.retrasarSegundo();
        hora3.retrasarSegundo();
        hora3.retrasarSegundo();
        System.out.println(hora3.toString());
        System.out.println("*".repeat(60));

    }
}
