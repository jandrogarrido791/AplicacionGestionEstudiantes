/**
 * Clase derivada de Producto que representa
 * productos alimenticios.
 */
public class Alimento extends Producto implements Descontable {

    private String fechaCaducidad;

    /**
     * Constructor de la clase Alimento.
     */
    public Alimento(int id, String nombre, double precio,
                    int cantidad, String fechaCaducidad) {

        super(id, nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Implementación del método abstracto.
     */
    @Override
    public void mostrarTipoProducto() {
        System.out.println("Tipo de producto: Alimento");
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }

    /**
     * Implementación de la interfaz Descontable.
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return getPrecio() - (getPrecio() * porcentaje / 100);
    }
}
