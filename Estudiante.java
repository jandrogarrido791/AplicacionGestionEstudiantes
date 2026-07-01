// Clase que representa un estudiante
class Estudiante {

    // Atributos
    String nombre;
    String matricula;
    String carrera;

    // Constructor
    public Estudiante(String nombre, String matricula, String carrera){
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    // Método para mostrar información
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
    }
}
