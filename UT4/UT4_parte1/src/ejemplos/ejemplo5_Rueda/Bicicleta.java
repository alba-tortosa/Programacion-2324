package ejemplos.ejemplo5_Rueda;

public class Bicicleta {

    private Rueda delantera;
    private Rueda trasera;

    public Bicicleta() {
        delantera = new Rueda(0);
        trasera = new Rueda(0);
    }

    public void verificar() {
        boolean estadoD = delantera.estaDesinflada();
        boolean estadoT = trasera.estaDesinflada();

        if (estadoD) {
            delantera.inflar();
            delantera.inflar();
            delantera.inflar();
        }
        if (estadoT) {
            trasera.inflar();
            trasera.inflar();
            trasera.inflar();
        }

    }

    @Override
    public String toString() {
//        String texto = "Presion delantera: " + delantera.getPresion();
//        texto += "\nPresion trasera: " + trasera.getPresion();
//        return texto;
        String texto = delantera.toString() + "\n" + trasera.toString();
        return texto;

    }
}
