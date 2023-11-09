package ejemplos.ejemplo4_Pasajero;

public class TestPasajero {

    public static void main(String[] args) {

        Pasajero p1 = new Pasajero ("pepe" );
        Pasajero p2 = new Pasajero ("maria" , 1.83 );
        // Pasajero p3 = new Pasajero ("pepe" , 65.8 , 1.83 );
        Pasajero p4 = new Pasajero ("juan" , 69, 1.83 );

        Pasajero pasa1 ;
        Pasajero pasa2 ;
        pasa2 = new Pasajero ("Jose Luis" );
        pasa1 = pasa2 ;

    }
}
