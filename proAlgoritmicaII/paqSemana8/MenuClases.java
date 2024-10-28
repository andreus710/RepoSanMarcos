/**
* nombreClase: MenuClases.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public class MenuClases {

    public MenuClases() {
    }

    public int menu() {
        int n;
        System.out.println("\n----------MENU--------");
        System.out.println("1. AÑADIR");
        System.out.println("2. MOSTRAR");
        System.out.println("3. BUSCAR");
        System.out.println("4. ORDENAR");
        System.out.println("0. SALIR");

        System.out.print("Ingrese su opcion ---> ");
        n = Leer.dInt();
        return n;
    }

    public int menuTipoCarro() {
        int n;
        System.out.println("\n----------MENU CARROS--------");
        System.out.println("1. DEPORTIVO");
        System.out.println("2. TURISMO");
        System.out.println("3. SUV");
        System.out.println("4. CAMION");
        System.out.println("5. TRACTOCAMION");
        System.out.println("0. CANCELAR");

        System.out.print("Ingrese su opcion ---> ");
        n = Leer.dInt();
        return n;
    }

    public int menuOrden() {
        int n;
        System.out.println("\n-----ORDENAR POR-----");
        System.out.println("1. Código");
        System.out.println("2. Marca");
        System.out.println("3. Placa");
        System.out.print("Ingrese la opción de ordenamiento: ");
        n = Leer.dInt();
        return n;
    }
}
