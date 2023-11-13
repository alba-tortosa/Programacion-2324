package ejercicios.ejercicioAD02;

/**
 * Clase para testear el reloj digital
 *
 * @author
 */
public class TestRelojAlarma {
    public static void main(String[] args) {

        RelojAlarma miReloj = new RelojAlarma(18, 32);
        RelojAlarma tuReloj = new RelojAlarma(23, 58);
        miReloj.setAlarma(18, 35);
        System.out.println("miReloj Hora: " + miReloj.getHora());
        System.out.println("miReloj Alarma: " + miReloj.getAlarma());
        miReloj.emitirTic();
        miReloj.emitirTic();
        miReloj.emitirTic();

        // tuReloj.setAlarma(7, 0); /Innecesario, por defecto ya está establecida a las 7:00
        System.out.println("tuReloj Hora: " + tuReloj.getHora());
        System.out.println("tuReloj Alarma: " + tuReloj.getAlarma());
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        tuReloj.emitirTic();
        System.out.println("tuReloj Hora: " + tuReloj.getHora());


    }

}
