package proEstructuraDeDatos.paqTareasHuayna.Parcial.Pregunta03;


public class TMainLES {
    public static void main(String[] args){
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        lista.mostrar();

        lista.eliminarPenultimo();

        lista.mostrar();
    }
}
