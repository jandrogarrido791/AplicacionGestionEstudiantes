// Clase derivada que hereda de la clase Estudiante
public class EstudianteEnLinea extends Estudiante {

    private String plataforma;

    public EstudianteEnLinea(String nombre, String matricula,
                             String carrera, String plataforma) {

        super(nombre, matricula, carrera);

        this.plataforma = plataforma;
    }

    public void mostrarPlataforma() {
        System.out.println("Plataforma utilizada: " + plataforma);
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Modalidad: En línea");
        System.out.println("Plataforma: " + plataforma);
    }
}
