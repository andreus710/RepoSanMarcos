package proEstructuraDeDatos.paqTareasHuayna.Tarea01;

public class TRegistroEstudiante {
    public static void main(String[] args) {

        ListaEstudiantes lista = new ListaEstudiantes();

        // Agregar estudiantes
        lista.agregarEstudiante("001", "Juan", "Perez", "juan.perez@example.com", 14);
        lista.agregarEstudiante("002", "Ana", "Lopez", "ana.lopez@example.com", 9);
        lista.agregarEstudiante("003", "Luis", "Garcia", "luis.garcia@example.com", 12);

        // Buscar estudiante
        Estudiante estudiante = lista.buscarEstudiante("002");
        if (estudiante != null) {
            System.out.println("Estudiante encontrado: " + estudiante.nombre + " " + estudiante.apellidos);
        } else {
            System.out.println("Estudiante no encontrado");
        }

        // Eliminar estudiante
        if (lista.eliminarEstudiante("003")) {
            System.out.println("Estudiante eliminado");
        } else {
            System.out.println("Estudiante no encontrado para eliminar");
        }

        // Contar aprobados y desaprobados
        System.out.println("Total de aprobados: " + lista.contarAprobados());
        System.out.println("Total de desaprobados: " + lista.contarDesaprobados());

        // Mostrar todos los estudiantes
        System.out.println("Lista de estudiantes:");
        lista.mostrarEstudiantes();


    }
}
