/**
 * Clase derivada de Producto que representa
 * productos electrónicos.
 *
 * Utiliza herencia al extender la clase Producto
 * e implementa la interfaz Descontable.
 */
public class Electronico extends Producto implements Descontable {

    private int garantiaMeses;

    /**
     * Constructor de la clase Electronico.
     */
    public Electronico(int id, String nombre, double precio,
                       int cantidad, int garantiaMeses) {

        super(id, nombre, precio, cantidad);
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * Implementación del método abstracto.
     */
    @Override
    public void mostrarTipoProducto() {
        System.out.println("Tipo de producto: Electrónico");
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }

    /**
     * Implementación de la interfaz Descontable.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }
}
