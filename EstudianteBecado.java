// Clase derivada que hereda de la clase Estudiante
public class EstudianteBecado extends Estudiante {

    // Atributo exclusivo de la clase EstudianteBecado
    private String tipoBeca;

    // Constructor de la clase derivada
    public EstudianteBecado(String nombre, String matricula,
                            String carrera, String tipoBeca) {

        // Reutilización del constructor de la clase base
        super(nombre, matricula, carrera);

        this.tipoBeca = tipoBeca;
    }

    // Sobrescritura del método mostrarDatos()
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();

        System.out.println("Tipo de estudiante: Becado");
        System.out.println("Tipo de beca: " + tipoBeca);
    }

    // Método exclusivo de la clase EstudianteBecado
    public void mostrarBeneficio() {
        System.out.println(nombre + " cuenta con la beca: " + tipoBeca);
    }
}
