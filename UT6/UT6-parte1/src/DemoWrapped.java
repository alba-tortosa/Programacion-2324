public class DemoWrapped {

    public static void main(String[] args) {
        // Convertir primitivo en Objeto
        Integer numero = new Integer(3); //Deprecated
        numero = Integer.valueOf(3);
        Double d = Double.valueOf(3);

        System.out.println(numero);
        System.out.println(d);

        //Convertir objeto en primitivo
        int primitivo = numero.intValue();
        double primitivo2 = d.doubleValue();

        Integer suma = numero + primitivo;
        int suma2 = numero + primitivo;
        System.out.println(suma);
        System.out.println(suma2);
    }


}
