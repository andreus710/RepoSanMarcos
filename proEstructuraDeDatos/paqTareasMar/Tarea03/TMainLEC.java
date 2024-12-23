package proEstructuraDeDatos.paqTareasMar.Tarea03;

public class TMainLEC {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        lista.agregar(5);
        lista.agregar(3);
        lista.agregar(8);
        lista.agregar(1);
        lista.agregar(7);

        System.out.println("Lista antes de ordenar:");
        lista.mostrar();
        lista.ordenarPorIntercambio();
        System.out.println("Lista después de ordenar:");
        lista.mostrar();
    }
}

