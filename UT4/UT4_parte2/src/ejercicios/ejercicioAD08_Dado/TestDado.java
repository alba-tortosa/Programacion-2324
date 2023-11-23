package ejercicios.ejercicioAD08_Dado;

/**
 * Clase que prueba la clase Dado
 */
public class TestDado {
    private static final int TOTAL = 10;

    public static void main(String[] args) {
        //Crea dos dados, uno de 6 caras y otro de 20.
        Dado dado6 = new Dado();
        Dado dado20 = new Dado(20);

        //Simula el lanzamiento del primer dado TOTAL veces (TOTAL es una constante) y cuenta y
        //visualice las apariciones del 1 y del 6 en esos lanzamientos.
        int contador1 = 0;
        int contador6 = 0;
        for (int i = 0; i < TOTAL; i++) {
            dado6.tirarDado();
            System.out.println("Tirada " + (i+1) +":" + dado6.getCara());
            if (dado6.getCara() == 1) contador1++;
            else if (dado6.getCara() == 6) contador6++;
        }

        System.out.println("1s:" + contador1 + "  6s:" + contador6);

        System.out.println("*".repeat(60));
        //- Simula el lanzamiento del segundo dado hasta que salga el 4 o el 5 contando las veces que se ha
        //    tirado el dado. Visualiza lo que va saliendo en cada tirada.
        int contador = 0;
        while (dado20.getCara() != 4 && dado20.getCara() != 5) {
            dado20.tirarDado();
            //System.out.println("Tirada "+ contador + " - " + dado20.getCara());
            contador++;
        }
        System.out.println("tiradas=" + contador);


    //    - Simula el lanzamiento de los dos dados mientras la suma de las tiradas no supere el valor 42.
    //    Visualiza lo que vale la suma de tiradas después de cada tirada
        int suma = 0;
        while (suma <= 42) {
            dado6.tirarDado();
            dado20.tirarDado();
            suma += dado6.getCara() + dado20.getCara();
            System.out.println("suma=" +suma);
        }

    }

}
