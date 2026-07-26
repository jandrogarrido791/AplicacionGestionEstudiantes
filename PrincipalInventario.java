/**
 * Clase principal del sistema de gestión de inventarios.
 *
 * En este programa se demuestra el polimorfismo,
 * ya que una variable de tipo Producto puede almacenar
 * objetos de diferentes clases derivadas.
 */
public class PrincipalInventario {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" SISTEMA DE GESTIÓN DE INVENTARIOS");
        System.out.println("======================================");

        // Polimorfismo:
        // Una referencia de tipo Producto puede almacenar
        // objetos de Electronico, Alimento y Ropa.

        Producto producto1 = new Electronico(
                1,
                "Laptop Lenovo",
                15000,
                5,
                12
        );

        Producto producto2 = new Alimento(
                2,
                "Café soluble",
                120,
                30,
                "31/12/2026"
        );

        Producto producto3 = new Ropa(
                3,
                "Playera deportiva",
                350,
                20,
                "Mediana"
        );

        // Arreglo de productos utilizando polimorfismo
        Producto[] inventario = {
                producto1,
                producto2,
                producto3
        };

        System.out.println("\n========== INFORMACIÓN DEL INVENTARIO ==========");

        for (Producto producto : inventario) {

            System.out.println("\n--------------------------------------");

            producto.mostrarInformacion();

            producto.mostrarTipoProducto();
        }

        System.out.println("\n========== PRUEBA DE DESCUENTOS ==========");

        Descontable electronico = new Electronico(
                4,
                "Monitor",
                5000,
                10,
                24
        );

        double precioFinal = electronico.aplicarDescuento(10);

        System.out.println(
                "Precio del monitor con 10% de descuento: $"
                + precioFinal
        );

        System.out.println("\n======================================");
        System.out.println(" PRUEBAS FINALIZADAS CORRECTAMENTE");
        System.out.println("======================================");
    }
}
