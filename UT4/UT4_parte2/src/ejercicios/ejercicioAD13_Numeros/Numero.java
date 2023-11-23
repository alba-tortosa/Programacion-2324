package ejercicios.ejercicioAD13_Numeros;

/**
 * Representa a un numero entero
 */
public class Numero {
    private int numero;

    /**
     * constructor por defecto para los objetos de la clase Numero
     */
    public Numero() {
        this.numero = 0;
    }

    /**
     * constructor para los objetos de la clase Numero
     */
    public Numero(int numero) {
        this.numero = numero;
    }

    /**
     * constructor para los objetos de la clase Numero
     * inicializa el atributo numero del objeto actual con el
     * que guarda el objeto recibido como parametro
     */
    public Numero(Numero otro) {

    }

    /**
     * accesor para el atributo
     */
    public int getNumero() {
        return numero;
    }

    /**
     * mutador para el atributo
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * calcula y devuelve el factorial del atributo numero con for
     * 6! = 6 * 5 * 4 * 3 * 2 * 1
     * 0! = 1
     */
    public int factorial() {
        //TODO

        return 0;
    }

    /**
     * detecta si un numero es primo o no
     */
    public boolean esPrimo() {
        //TODO

        return false;
    }

    /**
     * Dibuja un cuadrado relleno en la pantalla
     * con for
     * Si numero = 5
     * *****
     * *****
     * *****
     * *****
     * *****
     */
    public void escribirFigura() {
        //TODO

    }

    /**
     * @return la cantidad de cifras del numero
     */
    public int contarCifras() {
        //TODO

        return 0;
    }

    /**
     * @return true si numero es capicúa
     * Hay que usar inverso()
     */
    public boolean esCapicua() {
        //TODO

        return false;

    }

    /**
     * Calcula el inverso
     *
     * @param numero el numero del que se calculará el inverso
     * @return el inverso
     */
    private int inverso(int numero) {
        //TODO
        // hacer sin contar previamente las cifras 

        return 0;

    }

    /**
     * Convertir a base 8
     *
     * @return el numero convertido
     * Si numero = 17 devuelve 21
     * Si numero = 245 devuelve 365
     * Si numero = 6 devuelve 6
     * Si numero = 8 devuelve 10
     */
    public int aBase8() {
        //TODO

        return 0;

    }

    /**
     * devuelve true si cifra está en numero
     * Con ayuda del metodo privado estaCifra()
     */
    public boolean estaCifra(int cifra) {
        return estaCifra(cifra, this.numero);

    }

    /**
     * Detecta si está o no una cifra en el numero
     *
     * @param cifra la cifra a localizar
     * @return true si está la cifra
     */
    private boolean estaCifra(int cifra, int numero) {
        //TODO

        return true;

    }

    /**
     * Detecta si el atributo numero  tiene cifras repetidas
     * Usa el metodo privado anterior
     */
    public boolean hayCifrasRepetidas() {
        //TODO

        return true;

    }

    /**
     * Calcula y devuelve la representacion binario
     * del atributo numero (lo convierte a base 2)
     *
     * @return el numero convertido a base 2
     * <p>
     * Si numero = 15 devuelve 1111
     * Si numero = 252 devuelve 11111100
     * Si numero = 13 devuelve 1101
     */
    public int aBase2() {
        //TODO

        return 0;

    }
}
