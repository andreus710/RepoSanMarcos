package proEstructuraDeDatos.paqTareasHuayna.Parcial.Pregunta04;

public class Nodo {
    int sala;// dato del nodo
    int hora;
    String dia;
    Nodo next; //referencia al siguiente nodo


    public Nodo(int sala , int hora, String dia) {
        this.sala = sala;
        this.hora = hora;
        this.dia = dia;
        this.next = null; // inciar la cabeza con nulo
    }
}
