package proEstructuraDeDatos.paqTareasMar.Tarea02;

public class Nodo {
    int data; // dato del nodo
    Nodo next; //referencia al siguiente nodo


    public Nodo(int data) {
        this.data = data ;
        this.next = null; // inciar la cabeza con nulo
    }
}

