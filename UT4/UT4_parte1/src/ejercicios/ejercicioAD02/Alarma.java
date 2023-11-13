package ejercicios.ejercicioAD02;

public class Alarma {

    private int hora;
    private int minutos;

    public Alarma() {
        this.hora = 7;
        this.minutos = 0;
    }

    public void setHoraAlarma(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public String getHoraAlarma() {
        //formato “XX:XX”
        String hora = "" + this.hora;
        String minutos = "" + this.minutos;

        if (this.hora < 10) {
            hora = "0" + hora;
        }

        if (this.minutos < 10) {
            minutos = "0" + minutos;
        }

        return hora + ":" + minutos;
    }

    public String getHoraAlarma2(){
        VisorReloj horaAlarma = new VisorReloj(this.hora,this.minutos);
        return horaAlarma.getHora();
    }


}
