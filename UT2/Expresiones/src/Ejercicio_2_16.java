/** Ejercicio 2.16
 * Evalúa las siguientes expresiones lógicas, suponiendo x con valor 7:
 * (true)  &&  (3  >  4)
 * (true)  &&  (x  >  4)
 * x  != 3
 * (x  >  0)  ||  (x  <  0)
 * 25 >  20  &&  13  >  5
 * 10  +  4  <  15  -  3  ||  2  *  5  +  1  >  14  -  2  *  2
 * 4  *  2  <=  8  ||  2  *  2  <  5  &&   4    >  3  +  1
 */


public class Ejercicio_2_16 {
    public static void main(String[] args) {

        int x = 3;
        System.out.println((true) && (3 > 4));
        System.out.println((true) && (x > 4));
        System.out.println(x != 3);
        System.out.println((x > 0) || (x < 0));
        System.out.println(25 > 20 && 13 > 5);
        System.out.println(10 + 4 < 15 - 3 || 2 * 5 + 1 > 14 - 2 * 2);
        System.out.println(4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1);

    }



}