package ejercicios.ejercicioAD03;

/**
 * Representa a un punto en el espacio bidimensional
 *
 * @author
 */
public class Punto {
    private int x;
    private int y;

    /**
     * Constructor de la clase Punto
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Accesor para el atributo x
     *
     * @return El valor de la coordenada x
     */
    public int getX() {
        return x;
    }

    /**
     * Accesor para el atributo y
     *
     * @return El valor de la coordenada y
     */
    public int getY() {
        return y;
    }

    /**
     * Mutador para la coordenada x
     *
     * @param x es el nuevo valor de x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Mutador para la coordenada y
     *
     * @param y es el nuevo de y
     */
    public void setY(int y) {
        this.y = y;
    }


    /**
     * @return Devuelve una cadena con la representación del
     * punto
     */
    public String toString() {
        String str = "";
        str = str + "Valor de x = " + x + "\n" + "Valor de y = " + y + "\n";
        return str;
    }

    public double getDistanciaDesdeOrigen(){
        double resultado= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return resultado;
    }

    public double getDistanciaDesdeOrigen2(){
        double resultado = Math.pow(x,2)+Math.pow(y,2);
        resultado= Math.sqrt(resultado);
        return resultado;
    }
    public double getDistanciaDesdePunto(Punto p){
        int x2=p.getX();
        int y2=p.getY();
        double aux1 = Math.pow(this.x - x2, 2);
        double aux2 = Math.pow(this.y - y2, 2);

        double resultado= Math.sqrt(aux1 + aux2);
        return resultado;
    }

}
