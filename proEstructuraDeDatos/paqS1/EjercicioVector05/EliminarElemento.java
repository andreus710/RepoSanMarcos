package proEstructuraDeDatos.paqS1.EjercicioVector05;

import java.util.Arrays;

public class EliminarElemento {

    // Llena el vector con números aleatorios entre 1 y 20 e imprime el vector inicial
    public void almacenarDatos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 20 + 1);
        }
        System.out.println("Vector inicial: " + Arrays.toString(v));
    }

    // Encuentra el valor mínimo en el vector
    public int eliminaMenor(int[] v) {
        int min = Integer.MAX_VALUE;
        for (int num : v) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Número mínimo: " + min);
        return min;
    }

    // Elimina el valor mínimo desplazando los elementos posteriores hacia la izquierda
    public void eliminar(int[] v, int min) {
        boolean encontrado = false;

        for (int i = 0; i < v.length - 1; i++) {
            if (!encontrado && v[i] == min) {
                encontrado = true; // Marca el mínimo como encontrado
            }
            if (encontrado) {
                v[i] = v[i + 1]; // Desplaza el siguiente elemento hacia la izquierda
            }
        }

        // Reemplaza el último elemento con 0 tras el desplazamiento
        if (encontrado) {
            v[v.length - 1] = 0;
        }

        System.out.println("Vector después de eliminar el mínimo: " + Arrays.toString(v));
    }

    public static void main(String[] args) {
        EliminarElemento eliminar = new EliminarElemento();
        int[] v = new int[10];

        // Llenar el vector con datos aleatorios
        eliminar.almacenarDatos(v);

        // Encontrar el menor valor y eliminarlo
        int min = eliminar.eliminaMenor(v);
        eliminar.eliminar(v, min);
    }
}
