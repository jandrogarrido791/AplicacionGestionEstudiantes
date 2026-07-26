/**
 * Clase abstracta que representa un producto general del inventario.
 *
 * Esta clase contiene los atributos y métodos comunes que tendrán
 * todos los tipos de productos.
 */
public abstract class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    /**
     * Constructor de la clase Producto.
     */
    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Muestra la información general del producto.
     */
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad disponible: " + cantidad);
    }

    /**
     * Cada tipo de producto debe indicar su propio tipo.
     */
    public abstract void mostrarTipoProducto();
}
