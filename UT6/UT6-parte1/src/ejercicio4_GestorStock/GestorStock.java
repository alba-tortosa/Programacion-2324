package ejercicio4_GestorStock;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Gestiona el stock del negocio
 * El stock es descrito por 0 o mas productos
 */
public class GestorStock {

    private ArrayList<Producto> productos;

    /**
     * Inicializar el gestor de stock
     */
    public GestorStock() {
        productos = new ArrayList<>();
    }

    /**
     * A�adir un producto a la lista
     *
     * @param producto El producto a añadir
     */
    public void añadirProducto(Producto producto) {
        Producto p = localizarProducto(producto.getID());
        if (p == null) productos.add(producto);
        producto.incrementarCantidad(1);
    }

    /**
     * Intenta encontrar el producto con el id dado
     *
     * @param id El identificador del producto a buscar
     * @return El productos si se encuentra, o null
     * si no se encuentra
     */
    public Producto localizarProducto(int id) {
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()){
            Producto producto = it.next();
            if (producto.getID() == id){
                return producto;
            }
        }
        return null;
    }

    /**
     * Recibir una entrega de un producto particular
     * Incrementar la cantidad del producto en la cantidad indicada.
     *
     * @param id     El id del producto
     * @param cuanto La cantidad en que se incrementara el producto
     */
    public void recibirProducto(int id, int cuanto) {
        Producto producto = localizarProducto(id);
        if (producto!=null) {
            producto.incrementarCantidad(cuanto);
        } else {
            System.out.println("ID de producto fuera de rango");
        }
    }

    /**
     * Intenta encontrar el producto a partir de su nombre
     *
     * @param nombre El nombre del producto a buscar
     * @return El producto si se encuentra, o null
     * si no se encuentra
     */
    public Producto localizarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) return producto;
        }
        return null;
    }

    /**
     * Localiza un producto de id dado, y devuelve cuanto hay en stock.
     * Si el id no existe devuelve -1
     *
     * @param id El id del producto
     * @return La cantidad en stock del producto localizado
     */
    public int cantidadEnStock(int id) {
        Producto p = localizarProducto(id);
        if(p != null ){
            return p.getCantidad();
        }
        return -1;
    }

    /**
     * Escribir detalles del producto con iterador
     */
    public void escribirDetallesProductosV1() {

        System.out.println("DETALLES DE LOS PRODUCTOS");
        Iterator<Producto> it = productos.iterator();
        while (it.hasNext()) {
            Producto producto = it.next();
            System.out.println(producto);
        }
    }

    /**
     * Escribir detalles del producto con for mejorado
     */
    public void escribirDetallesProductosV2() {
        System.out.println("DETALLES DE LOS PRODUCTOS");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    /**
     * Escribir detalles del producto
     */
    public void escribirDetallesProductosV3() {
        System.out.println("DETALLES DE LOS PRODUCTOS");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }
    }

    /**
     * Escribir productos cuyo stock esta
     * por debajo de un cierto nivel que se
     * pasa como parametro
     */
    public void escribirMenorQue(int valor) {
        for (Producto pr: productos) {
            if (pr.getCantidad() < valor) {
                System.out.println(pr);
            }
        }
    }

}
