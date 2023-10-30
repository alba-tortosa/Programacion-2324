package ejercicioAD12;


public class TestFecha {
    public static void main(String[] args) {

        Fecha fecha1 = new Fecha(2, 4, 2007);
        int mes = fecha1.diasMes();
        System.out.println(mes);

//        //Crea objetos para las siguientes fechas:
//        // 2/11/2007
//        // 30/11/2007
//        // 29/2/2008
//        // 31/1/1962
//        // 31/12/2000
//        // 30/2/2023
//        Fecha fecha1 = new Fecha(2, 11, 2007);
//        Fecha fecha2 = new Fecha(30, 11, 2007);
//        Fecha fecha3 = new Fecha(29, 2, 2008);
//        Fecha fecha4 = new Fecha(31, 1, 1962);
//        Fecha fecha5 = new Fecha(31, 12, 2000);
//        Fecha fecha6 = new Fecha(30, 2, 2023);
//
//        //Muestra de cada fecha:
//        // la fecha en formato corto y largo
//        // si el año es bisiesto o no
//        // cuantos días tiene el mes
//        // si la fecha es correcta o no
//        // si la fecha es correcta, avanza un día y vuelve a mostrar la fecha en formato corto
//        System.out.println("*".repeat(60));
//        accionesFecha(fecha1);
//        System.out.println("*".repeat(60));
//        accionesFecha(fecha2);
//        System.out.println("*".repeat(60));
//        accionesFecha(fecha3);
//        System.out.println("*".repeat(60));
//        accionesFecha(fecha4);
//        System.out.println("*".repeat(60));
//        accionesFecha(fecha5);
//        System.out.println("*".repeat(60));
//        accionesFecha(fecha6);
//        System.out.println("*".repeat(60));
//
//        //Muestra si tu primera fecha creada precede a la fecha 3/12/2007
//        boolean precede = fecha1.precedeA(3, 12, 2007);
//        System.out.println("¿Precede el 2/11/2007 al 3/12/2007? " + precede);
//
//        //Muestra si tu primera fecha creada precede a la fecha 1/10/2007
//        precede = fecha1.precedeA(1, 10, 2007);
//        System.out.println("¿Precede el 2/11/2007 al 1/10/2007? " + precede);

    }

    public static void accionesFecha(Fecha fecha) {
        fecha.printCorta();
        fecha.printLarga();
        if (fecha.esBisiesto()) System.out.println("Es año bisiesto.");
        else System.out.println("No es año bisiesto.");
        System.out.println("El mes tiene " + fecha.diasMes() + " dias.");
        if (fecha.esCorrecta()) {
            fecha.avanzarDia();
            fecha.printCorta();
        }
    }
}
