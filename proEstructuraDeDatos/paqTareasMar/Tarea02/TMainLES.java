package proEstructuraDeDatos.paqTareasMar.Tarea02;


public class TMainLES {
    public static void main(String[] args){
        ListaSimple lista = new ListaSimple();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        int n = lista.contarElementos();

        lista.mostrar();
        System.out.println("Lista Elemento : " +n);


    }
}
