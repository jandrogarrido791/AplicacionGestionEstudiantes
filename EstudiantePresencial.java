// Clase derivada que hereda de la clase Estudiante
public class EstudiantePresencial extends Estudiante {

    // Atributo exclusivo de la clase derivada
    private String aula;

    // Constructor de la clase derivada
    public EstudiantePresencial(String nombre, String matricula,
                                String carrera, String aula) {

        // Llamada al constructor de la clase base
        super(nombre, matricula, carrera);

        this.aula = aula;
    }

    // Método exclusivo de la clase derivada
    public void mostrarAula() {
        System.out.println("Aula asignada: " + aula);
    }

    // Sobrescritura del método de la clase base
    @Override
    public void mostrarDatos() {

        // Reutilización del método de la clase base
        super.mostrarDatos();

        System.out.println("Modalidad: Presencial");
        System.out.println("Aula: " + aula);
    }
}