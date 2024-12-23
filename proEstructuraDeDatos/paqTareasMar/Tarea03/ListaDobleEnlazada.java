package proEstructuraDeDatos.paqTareasMar.Tarea03;


public class ListaDobleEnlazada {
        Nodo cabeza;
        Nodo cola;

        // Clase Nodo
        class Nodo {
            int data;
            Nodo prev;
            Nodo next;

            public Nodo(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        public void agregar(int data) {
            Nodo nuevo = new Nodo(data);
            if (cabeza == null) { // Lista vacía
                cabeza = nuevo;
                cola = nuevo;
            } else {
                cola.next = nuevo;
                nuevo.prev = cola;
                cola = nuevo;
            }
        }

        public void mostrar() {
            if (cabeza == null) {
                System.out.println("La lista está vacía.");
                return;
            }

            Nodo temp = cabeza;
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void ordenarPorIntercambio() {
            if (cabeza == null || cabeza.next == null) {
                System.out.println("No hay elementos suficientes para ordenar.");
                return;
            }

            boolean cambiado;
            do {
                cambiado = false;
                Nodo actual = cabeza;

                while (actual.next != null) {
                    if (actual.data > actual.next.data) {
                        int temp = actual.data;
                        actual.data = actual.next.data;
                        actual.next.data = temp;

                        cambiado = true;
                    }
                    actual = actual.next;
                }
            } while (cambiado);
        }
    }

