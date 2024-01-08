package ejercicio18_BusquedaLineal;

public class BusquedaLineal {
    public static void main(String[] args) {

    }

    public static boolean buscarLineal(int[] numeros, int valorBuscado) {
        boolean encontrado = false;
        int i = 0;
        while (i < numeros.length && !encontrado) {
            if (numeros[i] == valorBuscado) {
                encontrado = true;
            } else {
                i++;
            }

        }
        return encontrado;
    }
}
