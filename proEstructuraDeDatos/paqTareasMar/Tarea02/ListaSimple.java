package proEstructuraDeDatos.paqTareasMar.Tarea02;


public class ListaSimple {
    Nodo cabeza; //Primer nodo de la lista

    public ListaSimple() {
        this.cabeza = cabeza; // la lista inicialmente esta vacia
    }

    //Agregar un nuevo nodo al fianl de la lista
    public void agregar(int data){
        Nodo nuevo = new Nodo(data);
        if(cabeza == null){ // si la lista empieza vacia
            cabeza = nuevo;
        }else { // si no lo esta
            Nodo temp  = cabeza;
            while(temp.next != null){
                temp = temp.next; // recorre la lista hasta el ultimo
            }
            temp.next = nuevo; // agregar al nuevo nodo al final
        }
    }

    //Metodo para mostrar la lista
    public  void mostrar(){
       Nodo temp = cabeza;
        while(temp != null){
            System.out.print (temp.data + " -> ");
            temp = temp.next;  // pasar al siguiente nodo
        }
        System.out.println("null"); // fin de la lista poner nulo
    }


    public int contarElementos() {
        int contador = 0;
        Nodo temp = cabeza;
        while (temp != null) {
            contador++;
            temp = temp.next;
        }
        return contador;
    }
}
