package proEstructuraDeDatos.paqTareasHuayna.Tarea01;

class ListaEstudiantes {
    private Estudiante cabeza;

    // a)
    public void agregarEstudiante(String codigo, String nombre, String apellidos, String correo, int nota) {
        Estudiante nuevoEstudiante = new Estudiante(codigo, nombre, apellidos, correo, nota);

        if (nota >= 11) { // Aprobado: insertar al inicio
            nuevoEstudiante.siguiente = cabeza;
            cabeza = nuevoEstudiante;
        } else { // Reprobado: insertar al final
            if (cabeza == null) {
                cabeza = nuevoEstudiante;
            } else {
                Estudiante actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevoEstudiante;
            }
        }
    }

    // b)
    public Estudiante buscarEstudiante(String codigo) {
        Estudiante actual = cabeza;
        while (actual != null) {
            if (actual.codigo.equals(codigo)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // c)
    public boolean eliminarEstudiante(String codigo) {
        if (cabeza == null) return false;

        if (cabeza.codigo.equals(codigo)) {
            cabeza = cabeza.siguiente;
            return true;
        }

        Estudiante actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.codigo.equals(codigo)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            return true;
        }

        return false;
    }

    // d)
    public int contarAprobados() {
        int contador = 0;
        Estudiante actual = cabeza;
        while (actual != null) {
            if (actual.nota >= 11) contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    // e)
    public int contarDesaprobados() {
        int contador = 0;
        Estudiante actual = cabeza;
        while (actual != null) {
            if (actual.nota < 11) contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void mostrarEstudiantes() {
        Estudiante actual = cabeza;
        while (actual != null) {
            System.out.println("Código: " + actual.codigo + ", Nombre: " + actual.nombre +
                    ", Apellidos: " + actual.apellidos + ", Correo: " + actual.correo +
                    ", Nota: " + actual.nota);
            actual = actual.siguiente;
        }
    }
}
