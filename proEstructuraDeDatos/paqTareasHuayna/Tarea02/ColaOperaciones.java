package proEstructuraDeDatos.paqTareasHuayna.Tarea02;

import java.util.LinkedList;
import java.util.Scanner;

public class ColaOperaciones {

    static LinkedList<Integer> bicola = new LinkedList<>(); // Bicola
    static LinkedList<Integer> colaIntRestringida = new LinkedList<>(); // Cola con entrada restringida
    static LinkedList<Integer> colaOutRestringida = new LinkedList<>(); // Cola con salida restringida

    public static void operacionBicola() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operaciones de Bicola:");
        System.out.println("1. Insertar en el frente");
        System.out.println("2. Insertar al final");
        System.out.println("3. Eliminar del frente");
        System.out.println("4. Eliminar del final");
        System.out.println("5. Mostrar la Bicola");
        System.out.println("0. Salir");
        int opcion = sc.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar en el frente: ");
                    int elemFrente = sc.nextInt();
                    bicola.addFirst(elemFrente);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a insertar al final: ");
                    int elemFinal = sc.nextInt();
                    bicola.addLast(elemFinal);
                    break;
                case 3:
                    if (!bicola.isEmpty()) {
                        System.out.println("Elemento eliminado del frente: " + bicola.removeFirst());
                    } else {
                        System.out.println("La bicola está vacía.");
                    }
                    break;
                case 4:
                    if (!bicola.isEmpty()) {
                        System.out.println("Elemento eliminado del final: " + bicola.removeLast());
                    } else {
                        System.out.println("La bicola está vacía.");
                    }
                    break;
                case 5:
                    System.out.print ("Contenido de la Bicola: " + bicola);
                    break;
                case 0:
                    System.out.print("saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println("\nSeleccione otra opción:");
            opcion = sc.nextInt();
        }
    }

    public static void operacionColaEntradaRestringida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operaciones de Cola con Entrada Restringida:");
        System.out.println("1. Insertar al final");
        System.out.println("2. Eliminar del frente");
        System.out.println("3. Mostrar la Cola");
        System.out.println("0. Salir");
        int opcion = sc.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.print ("Ingrese el elemento a insertar al final: ");
                    int elemCola = sc.nextInt();
                    colaIntRestringida.addLast(elemCola);
                    break;
                case 2:
                    if (!colaIntRestringida.isEmpty()) {
                        System.out.println("Elemento eliminado del frente: " + colaIntRestringida.removeFirst());
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Contenido de la Cola: " + colaIntRestringida);
                    break;
                case 0:
                    System.out.print("saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println("\nSeleccione otra opción:");
            opcion = sc.nextInt();
        }
    }

    // Método para la Cola con salida restringida (Solo insertar al frente)
    public static void operacionColaSalidaRestringida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Operaciones de Cola con Salida Restringida:");
        System.out.println("1. Insertar al frente");
        System.out.println("2. Eliminar del frente");
        System.out.println("3. Eliminar del final");
        System.out.println("4. Mostrar la Cola");
        System.out.println("0. Salir");
        int opcion = sc.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.print ("Ingrese el elemento a insertar al frente: ");
                    int elemColaFrente = sc.nextInt();
                    colaOutRestringida.addFirst(elemColaFrente);
                    break;
                case 2:
                    if (!colaOutRestringida.isEmpty()) {
                        System.out.println("Elemento eliminado del frente: " + colaOutRestringida.removeFirst());
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 3:
                    if (!colaOutRestringida.isEmpty()) {
                        System.out.println("Elemento eliminado del final: " + colaOutRestringida.removeLast());
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 4:
                    System.out.println("Contenido de la Cola: " + colaOutRestringida);
                    break;
                case 0:
                    System.out.print("saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println("\nSeleccione otra opción:");
            opcion = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Bicola");
            System.out.println("2. Cola con entrada restringida");
            System.out.println("3. Cola con salida restringida");
            System.out.println("0. Salir");
            System.out.println("--------------------------------");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    operacionBicola();
                    break;
                case 2:
                    operacionColaEntradaRestringida();
                    break;
                case 3:
                    operacionColaSalidaRestringida();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}

