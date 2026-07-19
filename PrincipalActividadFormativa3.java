// Clase principal del programa
public class PrincipalActividadFormativa3 {

    public static void main(String[] args) {

        // Creación de un estudiante en línea
        EstudianteEnLinea estudianteEnLinea = new EstudianteEnLinea(
                "Jesús Alejandro de la Cruz Garrido",
                "12345",
                "Ingeniería en Desarrollo de Software",
                "Plataforma Virtual UCNL"
        );

        // Creación de un estudiante presencial
        EstudiantePresencial estudiantePresencial = new EstudiantePresencial(
                "Carlos López Martínez",
                "67890",
                "Ingeniería en Desarrollo de Software",
                "Aula 204"
        );

        // Mostrar datos del estudiante en línea
        System.out.println("===== ESTUDIANTE EN LÍNEA =====");
        estudianteEnLinea.mostrarDatos();
        estudianteEnLinea.mostrarPlataforma();

        System.out.println();

        // Mostrar datos del estudiante presencial
        System.out.println("===== ESTUDIANTE PRESENCIAL =====");
        estudiantePresencial.mostrarDatos();
        estudiantePresencial.mostrarAula();
    }
}
