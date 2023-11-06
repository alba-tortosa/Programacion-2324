public class Main {
    public static void main(String[] args) {

        long tuNumero = 34699888777L; //rellena aquí tu número de teléfono
        long numeroFrecuente = 34666555444L; //número frecuente
        long numeroNacional = 34611222333L; //número nacional
        long numeroInternacional = 45611222333L; //número internacional

        //Crea un telefono movil con tu numero de telefono y numero frecuente: 666555444
        TelefonoMovil movil1 = new TelefonoMovil(tuNumero, numeroFrecuente);

        //Crea una factura con tu número, tu nombre, y la fecha 11/2023
        FacturaTelefono facturaNoviembre = new FacturaTelefono(tuNumero, "María Pérez", 11, 2023);

        //Haz una llamada al numero frecuente con duracion 20 minutos y añádela a la factura
        //Esta llamada es gratis por llamar al numero frecuente, minutos gratis restantes tras la llamada = 100
        double precioLlamada = movil1.hacerLlamada(numeroFrecuente, 20);
        facturaNoviembre.anyadirLlamada( numeroFrecuente, "04/11 09:34", precioLlamada, 20);

        //Haz una llamada al numero 2 con duracion 45 minutos y añádela a la factura
        //Esta llamada  es gratis porque quedan minutos gratis, minutos gratis restantes tras la llamada = 60
        precioLlamada = movil1.hacerLlamada(numeroNacional, 40);
        facturaNoviembre.anyadirLlamada(numeroNacional, "04/11 12:03", precioLlamada, 40);

        //Haz una llamada al numero 3 con duracion 30 minutos y añádela a la factura
        //Esta llamada es gratis porque quedan minutos gratis, minutos gratis restantes tras la llamada = 30
        precioLlamada = movil1.hacerLlamada(numeroInternacional, 30);
        facturaNoviembre.anyadirLlamada(numeroInternacional, "04/11 12:03", precioLlamada, 30);

        //Haz una llamada al numero frecuente con duracion 50 minutos y añádela a la factura
        //Esta llamda es gratis por llamar al número frecuente, minutos gratis restantes = 30
        precioLlamada = movil1.hacerLlamada(numeroFrecuente, 50);
        facturaNoviembre.anyadirLlamada(numeroFrecuente, "04/11 12:03", precioLlamada, 50);

        //Haz una llamada al numero nacional con duracion 35 minutos y añádela a la factura
        //En esta llamda los primeros 30 minutos son gratis, los 5 minutos siguientes son de pago, minutos gratis restantes = 0
        precioLlamada = movil1.hacerLlamada(numeroNacional, 35);
        facturaNoviembre.anyadirLlamada(numeroNacional, "04/11 12:03", precioLlamada, 35);

        //Haz una llamada al numero internacional con duracion 15 minutos y añádela a la factura
        //Ya no quedan minutos gratis, se cobran 15 minutos, minutos gratis restantes = 0
        precioLlamada = movil1.hacerLlamada(numeroInternacional, 15);
        facturaNoviembre.anyadirLlamada(numeroInternacional, "04/11 12:03", precioLlamada, 15);

        //Muestra la factura de noviembre y cambiar el mes del teléfono
        System.out.println(facturaNoviembre.toString());
        movil1.cambiarMes();




    }
}