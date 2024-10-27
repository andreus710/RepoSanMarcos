package proEstructuraDeDatos.paqSemana02.LEC;

import java.util.List;

public class ListaEnlazadaCircular {
    Nodo cabeza;
    Nodo cola;

    public ListaEnlazadaCircular() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar(int data){
        Nodo nuevo = new Nodo(data);
        if(cabeza == null){
            cabeza = nuevo;
            cola = nuevo ;

            cola.next = cabeza ;
        }else{
            cola.next = nuevo;
            cola = nuevo ;
            cola.next = cabeza ;

        }
    }

    public void mostrar(){
        if(cabeza == null){
            System.out.println("No se encontro el cabeza");
            return;
        }

        Nodo temp = cabeza;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }while(temp != cabeza);
        System.out.println("(de nuevo a la cabeza)");
    }
}
