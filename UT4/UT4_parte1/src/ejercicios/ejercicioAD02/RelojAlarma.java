package ejercicios.ejercicioAD02;

public class RelojAlarma {
    private VisorReloj reloj;
    private Alarma alarma;

    public RelojAlarma() {
        reloj = new VisorReloj();
        alarma = new Alarma();
    }

    public RelojAlarma(int horas, int minutos) {
        reloj = new VisorReloj(horas, minutos);
        alarma = new Alarma();
    }

    public void emitirTic() {
        reloj.emitirTic();
        if (esHoraAlarma()) {
            System.out.println("RRRRIIIIINNNNNGGGGG");
        }
    }

    private boolean esHoraAlarma() {
       return getHora().equals(getAlarma());
    }

    private boolean esHoraAlarma2(){
        boolean esHora;
        String hora =getHora();
        String alarma=getAlarma();
        if(hora.equals(alarma)){
            esHora=true;
        }else {
            esHora=false;
        }
        return esHora;
    }

    public String getHora(){
        return reloj.getHora();
    }

    public String getAlarma() {
        return alarma.getHoraAlarma();
    }

    public void ponerEnHora(int hora, int minutos) {
        reloj.ponerEnHora(hora, minutos);
    }

    public void setAlarma(int hora, int minutos) {
        alarma.setHoraAlarma(hora, minutos);
    }

}
