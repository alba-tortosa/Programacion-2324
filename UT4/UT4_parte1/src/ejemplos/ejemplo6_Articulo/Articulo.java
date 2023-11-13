package ejemplos.ejemplo6_Articulo;

public class Articulo {
    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean masBaratoQue(Articulo a) {

        if (a == null) return false;

        boolean masbarato = this.precio < a.getPrecio();
        return masbarato;
    }

    public boolean equals(Articulo a) {
        if (a == null) return false;
       return this.nombre == a.getNombre()
               && this.precio == a.getPrecio();
    }
}
