package ejemplos.ejemplo6_Articulo;

public class TestArticulo {

    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("Rotulador", 1.23);
//        Articulo articulo2 = new Articulo("Rotulador", 1.26);
//
//        boolean esMasBarto = articulo1.masBaratoQue(articulo2);
//        System.out.println(esMasBarto);
//
//        esMasBarto = articulo2.masBaratoQue(articulo1);
//        System.out.println(esMasBarto);
//
//        Articulo articulo3 = null;
//        esMasBarto = articulo1.masBaratoQue(articulo3);
//        System.out.println(esMasBarto);

        Articulo articulo4 = new Articulo("Rotulador", 1.23);
        boolean sonElMismo = articulo4 == articulo1;
        boolean sonIguales = articulo4.equals(articulo1);
        System.out.println(sonElMismo);
        System.out.println(sonIguales);

        Articulo articulo5 = articulo1;
        sonElMismo = articulo5 == articulo1;
        System.out.println(sonElMismo);
    }

}
