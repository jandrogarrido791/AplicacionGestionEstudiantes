/**
 * Interfaz que define el comportamiento de los productos
 * que pueden recibir un descuento.
 */
public interface Descontable {

    /**
     * Calcula el precio final aplicando un descuento.
     *
     * @param porcentaje Porcentaje de descuento.
     * @return Precio final con descuento.
     */
    double aplicarDescuento(double porcentaje);
}
