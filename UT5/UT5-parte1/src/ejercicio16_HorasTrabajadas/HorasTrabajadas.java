package ejercicio16_HorasTrabajadas;

import java.util.Arrays;
import java.util.Random;

public class HorasTrabajadas {

    public static void main(String[] args) {

        // a) Define y crea (en un solo paso) un array bidimensional, horasTrabajadas, que permita almacenar las horas
        // que han trabajado en cada uno de los 7 días de la semana los 15 trabajadores de una empresa
        // (las filas son los días y las columnas los trabajadores)

        int[][] horasTrabajadas = new int[7][15];

        // b) Define un array de valores constantes con los nombres de los 7 días de la semana
        String diasSemana[] = {"LUNES","MARTES","MIÉRCOLES","JUEVES","VIERNES","SÁBADO","DOMINGO"};

        // c) Inicializa el array horasTrabajadas con valores aleatorios entre 8 y 12
        Random random = new Random();
        for (int i = 0; i < horasTrabajadas.length; i++) {
            for (int j = 0; j < horasTrabajadas[i].length; j++) {
                horasTrabajadas[i][j]=random.nextInt(8,13);
            }
        }

        // d) Calcula las horas trabajadas en cada día de la semana por todos los trabajadores
        // (necesitarás un array adicional)
        int cantidad = 0;
        int[] horasPorDia=new int[horasTrabajadas.length];
//        for (int i = 0; i < horasTrabajadas.length; i++) {//miramos dia
//            for (int j = 0; j < horasTrabajadas[i].length; j++) {//miramos cada celda de cada dia(fila)
//                cantidad+= horasTrabajadas[i][j];
//            }
//            horasPorDia[i]= cantidad;
//            cantidad = 0;
//        }

        for (int i = 0; i < horasTrabajadas.length; i++) {//miramos dia
            for (int j = 0; j < horasTrabajadas[i].length; j++) {//miramos cada celda de cada dia(fila)
                horasPorDia[i]+= horasTrabajadas[i][j];
            }
        }


        // e) Escribe el nombre del día de la semana y el total de horas trabajadas calculadas en el apartado anterior
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println(Arrays.toString(horasTrabajadas[i]));
            System.out.println(diasSemana[i] + "  " +horasPorDia[i]);
        }



    }
}
