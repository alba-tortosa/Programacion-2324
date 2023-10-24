public class Persona {

    private String nombre;
    private boolean esDesempleado;
    private int anyo_nacimiento;
    private char estadoCivil; //(‘S’, ‘C’, ‘V’, ‘D’)
    private double ingresos;

    public Persona(String nombre, boolean esDesempleado, int anyo_nacimiento, char estadoCivil, double ingresos) {
        this.nombre = nombre;
        this.esDesempleado = esDesempleado;
        this.anyo_nacimiento = anyo_nacimiento;
        this.estadoCivil = estadoCivil;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsDesempleado() {
        return esDesempleado;
    }

    public void setEsDesempleado(boolean esDesempleado) {
        this.esDesempleado = esDesempleado;
    }

    public int getAnyo_nacimiento() {
        return anyo_nacimiento;
    }

    public void setAnyo_nacimiento(int anyo_nacimiento) {
        this.anyo_nacimiento = anyo_nacimiento;
    }

    public char getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(char estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

}
