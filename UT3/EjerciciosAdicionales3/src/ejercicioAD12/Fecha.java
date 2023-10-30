package ejercicioAD12;

/**
 * Clase Fecha que representa a fechas
 * Ejercicio 12
 *  
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int anyo;

    /**
     * constructor parametrizado 
     * para los objetos de la clase Fecha
     */
    public Fecha(int queDia, int queMes, int queAnio)    {
        dia = queDia;
        mes = queMes;
        anyo = queAnio;
    }   

    /**
     * Comprobar si el año es bisiesto
     * Es m�ltiplo de 4 pero no de 100 o bien múltiplo de 400
     * 
     * @return devuelve true si es bisiesto, false en otro caso
     */
    public boolean esBisiesto()    {
        return anyo % 4 == 0  && anyo % 100 != 0 || anyo % 400 == 0;
    }

    public boolean esBisiestoIf()    {
        if (anyo % 4 == 0  && anyo % 100 != 0 || anyo % 400 == 0) {
            return true;
        }
        return false;
    }

    /**
     * Devolver el nº de días del mes de la fecha en cuestión dependiendo del año
     * @return devuelve los días del mes
     */
    public int diasMes()    {
        int num = 31;

        switch (mes)   {
            case 4, 6, 9, 11:
                num = 30;
                break;
            case 2:
                if (esBisiesto())  {
                    num = 29;
                }
                else     {
                    num = 28;
                }
            break;
        } 
        return num;
    }

    public int diasMes2(){
        switch (mes) {
            case 2:
                if (esBisiesto()){
                    return 29;
                }else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    /**
     * Escribir la fecha en formato corto
     */
    public void printCorta()    {
        System.out.println(dia + " - " + mes + " - " + anyo);
    }

    /**
     * Escribir la fecha en formato largo
     */
    public void printLarga()    {
        String nombre = "" + dia + " de ";

        switch (mes)      {
            case 1: nombre = nombre + "enero";
            break;
            case 2: nombre += "febrero";
            break;
            case 3: nombre += "marzo";
            break;
            case 4: nombre += "abril";
            break;
            case 5: nombre += "mayo";
            break;
            case 6: nombre += "junio";
            break;
            case 7: nombre += "julio";
            break;
            case 8: nombre += "agosto";
            break;
            case 9: nombre += "septiembre";
            break;
            case 10: nombre += "octubre";
            break;
            case 11: nombre = "noviembre";
            break;
            case 12: nombre = "diciembre";
            break;
        }
        nombre += " de " + anyo;
        System.out.println(nombre);

    }

    /**
     * Comprobar si la fecha almacenada es correcta
     */
    public boolean esCorrecta() {
        boolean correcta = true;      

        if (dia < 1 || dia > 31)    {
            correcta = false;
        }
        else if (mes < 1 || mes > 12)    {
            correcta = false;
        }
        else {
            switch (mes) {
                case 4, 6, 9, 11:
                    if ( dia > 30) correcta = false;
                    break;
                case 2:
                    if (anyo % 4 == 0  && anyo % 100 != 0 || anyo % 400 == 0 )   {
                        if (dia > 29) correcta = false;
                    }
                    else {
                        if (dia > 28) correcta = false;
                    }
            }
        }

        return correcta;
    }

    public boolean esCorrecta2(){
        boolean comprendidoEntre1y31;
        boolean mesEntre1y12;
        boolean numeroDiasCorrecto;

        if ((dia>=1) && (dia<=31)){
            comprendidoEntre1y31 =true;
        } else comprendidoEntre1y31 =false;
        if ((mes>=1) && (mes<=12)){
            mesEntre1y12 = true;
        } else mesEntre1y12=false;
        //enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 días
        //abril, junio, septiembre y noviembre, 30
        // febrero solo 28
        if ( ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) && comprendidoEntre1y31 ){
            numeroDiasCorrecto=true;
        }else if ( ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) && ((dia<=30) && (dia>=1)) ){
            numeroDiasCorrecto=true;
        }else if ( mes==2 && (!esBisiesto() && (((dia<=28) && (dia>=1))) )){
            numeroDiasCorrecto=true;
        }else if ( mes==2 && (esBisiesto() && ((dia<=29)&&(dia>=1)) )){
            numeroDiasCorrecto=true;
        }else numeroDiasCorrecto= false;
        //Cada cuatro años, febrero tiene 29 días

        return (comprendidoEntre1y31 && mesEntre1y12 && numeroDiasCorrecto);
    }

    /**
     *  Comprueba si la fecha preceda a otra
     *  recibida como parámetro
     *
     *  Suponemos los argumentos recibidos todos correctos
     */
    public boolean precedeA(int queDia, int queMes, int queAnyo)    {
        return (anyo < queAnyo) ||
        (anyo == queAnyo && (mes < queMes || (mes == queMes &&  dia < queDia)));

    }

    /**
     *  Comprueba si la fecha preceda a otra
     *  recibida como parámetro
     *
     *  Suponemos los argumentos recibidos todos correctos
     */
    public boolean precedeAV2(int queDia, int queMes, int queAnyo)
    {
        boolean precede;
        if (anyo< queAnyo)    {
            precede = true;
        }
        else if (anyo > queAnyo)  {
            precede = false;
        }
        else  if (mes < queMes)    {
            precede = true;
        }
        else if (mes > queMes)  {
            precede = false;
        }
        else  if (dia < queDia)  {
            precede = true;
        }
        else if (dia > queDia)  {
            precede = false;
        }
        else   {
            precede = false;
        }
        return precede;
    }

    /**
     *  Avanza un día la fecha
     *
     */
    public void avanzarDia()
    {
        int diasMes = diasMes();

        dia++;
        if (dia > diasMes)  {
            dia = 1;
            mes++;
            if (mes > 12)  {
                mes = 1;
                anyo++;
            }
        }
    }

    public void avanzaDia2(){
        this.dia=dia+1;
        if (!this.esCorrecta()){
            this.dia=1;
            this.mes=mes+1;
            if (mes>12){
                this.mes=1;
                this.anyo=anyo+1;
            }
        }
    }

    public void avanzarDia3() {
        if (esCorrecta()) {
            dia++;
        }
        if (dia > diasMes()) {
            dia = 1;
            mes++;
        }

        if (mes > 12) {
            mes = 1;
            anyo++;
        }

    }

}

