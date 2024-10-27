package proEstructuraDeDatos.paqTareasHuayna.Tarea01;

class Estudiante {
    String codigo;
    String nombre;
    String apellidos;
    String correo;
    int nota;
    Estudiante siguiente;

    public Estudiante(String codigo, String nombre, String apellidos, String correo, int nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.nota = nota;
        this.siguiente = null;
    }

    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Estudiante getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Estudiante siguiente) {
        this.siguiente = siguiente;
    }

}

