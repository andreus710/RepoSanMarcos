package proEstructuraDeDatos.paqSemana02.LES;


public class ListaEnlazada {
    Nodo cabeza; //Primer nodo de la lista

    public ListaEnlazada() {
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

    //insertar en una posicion
    public void insertar(int data, int posicion) {
        Nodo nuevo = new Nodo(data);

        if (posicion == 0) { // Inserción al inicio
            nuevo.next = cabeza;
            cabeza = nuevo;
        } else {
            Nodo temp = cabeza;
            int contador = 0;

            while (temp != null && contador < posicion - 1) { // Llegar a la posición anterior
                temp = temp.next;
                contador++;
            }

            if (temp == null) {
                System.out.println("La posición es mayor que el tamaño de la lista. Insertando al final.");
                agregar(data); // Agregar al final si la posición es mayor que el tamaño
            } else {
                nuevo.next = temp.next; // Inserta en la posición
                temp.next = nuevo;
            }
        }
    }

    public void eliminar(int dato) {
        if (cabeza == null){
            System.out.println("La lista esta vacia...");
        }

        if(cabeza.data == dato){
            cabeza = cabeza.next;
            System.out.println("El nodo con el dato " + dato + " ha sido eliminado");
        }

        Nodo temp = cabeza;

        while(temp.next != null && temp.next.data != dato){
            temp = temp.next;
        }

        if(temp.next != null){
            temp.next = temp.next.next;
            System.out.println("El nodo con dato " + dato + "  ha sido eliminado");
        }else {
            System.out.println("El nodo con dato " + dato + "  ha sido eliminado");
        }

    }


}
