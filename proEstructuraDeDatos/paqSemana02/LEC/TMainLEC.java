package proEstructuraDeDatos.paqSemana02.LEC;

public class TMainLEC {
    public static void main(String[] args) {
        ListaEnlazadaCircular lista = new ListaEnlazadaCircular();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.agregar(50);
        lista.agregar(60);
        lista.agregar(70);

        lista.mostrar();
    }
}
