/**
 * Clase derivada de Producto que representa
 * productos de ropa.
 */
public class Ropa extends Producto implements Descontable {

    private String talla;

    /**
     * Constructor de la clase Ropa.
     */
    public Ropa(int id, String nombre, double precio,
                int cantidad, String talla) {

        super(id, nombre, precio, cantidad);
        this.talla = talla;
    }

    /**
     * Implementación del método abstracto.
     */
    @Override
    public void mostrarTipoProducto() {
        System.out.println("Tipo de producto: Ropa");
        System.out.println("Talla: " + talla);
    }

    /**
     * Implementación de la interfaz Descontable.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }
}
