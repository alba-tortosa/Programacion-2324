package ejemplos.ejemplo3_visorDigital;

/**
 *
 */
public class TestVisorReloj {


    public static void main(String[] args) {
        VisorReloj miReloj = new VisorReloj();

        System.out.println(miReloj.getHora()); //00:00:00
        miReloj.emitirTic();
        miReloj.emitirTic();
        System.out.println(miReloj.getHora()); //00:00:02

        miReloj.ponerEnHora(3, 59, 59);
        System.out.println(miReloj.getHora()); //03:59:59
        miReloj.emitirTic();
        System.out.println(miReloj.getHora()); //04:00:00
        miReloj.emitirTic();
        System.out.println(miReloj.getHora()); //04:00:01



    }


}
