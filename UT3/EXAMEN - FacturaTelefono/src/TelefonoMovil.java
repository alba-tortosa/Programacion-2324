public class TelefonoMovil {

    private long numero; // prefijo internacional + numero. Ej. 34666555444
    private long numero_frecuente;

    private int minutos_facturados_mes;

    //constantes
    private final int MINUTOS_GRATIS_MES = 100;
    private final double PRECIO_MINUTO_NACIONAL = 3.5;
    private final double PRECIO_MINUTO_INTERNACIONAL = 10.8;

    public TelefonoMovil(long numero, long numero_frecuente) {
        this.numero = numero;
        this.numero_frecuente = numero_frecuente;
    }

    public double hacerLlamada(long numeroDestino, int minutos) {
//        - depende de el pais de origen y destino, la tarifa/minutos
//        - primeros X minutos gratis
//        - el numero_frecuente es gratis

        double precio = 0.0;
        long prefijoOrigen = this.numero / 1000000000;
        long prefijoDestino = numeroDestino / 1000000000;

        int minutosGratisRestantes = this.MINUTOS_GRATIS_MES - minutos_facturados_mes;
        if (minutosGratisRestantes < 0) minutosGratisRestantes = 0;
        int minutosFacturar = minutos - minutosGratisRestantes;

        if (numeroDestino != this.numero_frecuente) {
            minutos_facturados_mes = minutos_facturados_mes + minutos;
            if (minutosFacturar > 0) {
                if (prefijoOrigen == prefijoDestino) {
                    precio = minutosFacturar * this.PRECIO_MINUTO_NACIONAL;
                } else {
                    precio = minutosFacturar * this.PRECIO_MINUTO_INTERNACIONAL;
                }
            }
        }

        return precio;
    }

    public void cambiarNumeroFrecuente(long nuevoNumeroFrecuente) {
        this.numero_frecuente = nuevoNumeroFrecuente;
    }

    public void cambiarMes() {
        this.minutos_facturados_mes = 0;
    }

    public long getNumero() {
        return numero;
    }

}
