/**
* nombreClase: TVehiculo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TVehiculo {
	
	//Me falto nomas implementar los get y set en la clase auto para que se muestre 
	
    public static void main(String args[]) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        MenuClases menu = new MenuClases();
        int opcion;

        do {
            opcion = menu.menu();
            switch (opcion) {
                case 1: // Añadir vehículos
                    int tipo = menu.menuTipoCarro();
                    Vehiculo nuevoVehiculo = null;

                    switch (tipo) {
                        case 1:
                            nuevoVehiculo = new Deportivo().leer(); // Crear un vehículo tipo Deportivo
                            break;
                        case 2:
                            nuevoVehiculo = new Turismo().leer(); // Crear un vehículo tipo Turismo
                            break;
                        case 3:
                            nuevoVehiculo = new SUV().leer(); // Crear un vehículo tipo SUV
                            break;
                        case 4:
                            nuevoVehiculo = new Camion().leer(); // Crear un vehículo tipo Camion
                            break;
                        case 5:
                            nuevoVehiculo = new TractoCamion().leer(); // Crear un vehículo tipo TractoCamion
                            break;
                        case 0:
                            System.out.println("Operación cancelada.");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }

                    if (nuevoVehiculo != null) {
                        vehiculos.add(nuevoVehiculo); // Agregar el nuevo vehículo a la lista
                        System.out.println("Vehículo añadido correctamente.");
                    }
                    break;

                case 2: // Mostrar todos los vehículos
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos en la lista.");
                    } else {
                        for (Vehiculo v : vehiculos) {
                            v.mostrar();
                        }
                    }
                    break;

                case 3: // Buscar vehículo por código
                    System.out.print("Ingrese el código del vehículo a buscar: ");
                    String codigo = Leer.dato();
                    Vehiculo encontrado = buscarPorCodigo(vehiculos, codigo);

                    if (encontrado != null) {
                        encontrado.mostrar();
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 4: // Ordenar vehículos
                    int tipoOrden = menu.menuOrden();

                    switch (tipoOrden) {
                        case 1:
                            Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getCodigo));
                            System.out.println("Vehículos ordenados por Código correctamente.");
                            break;
                        case 2:
                            Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getMarca));
                            System.out.println("Vehículos ordenados por Marca correctamente.");
                            break;
                        case 3:
                            Collections.sort(vehiculos, Comparator.comparing(Vehiculo::getPlaca));
                            System.out.println("Vehículos ordenados por Placa correctamente.");
                            break;
                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 0: // Salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }

    // Método para buscar un vehículo por su código
    public static Vehiculo buscarPorCodigo(ArrayList<Vehiculo> vehiculos, String codigo) {
        for (Vehiculo v : vehiculos) {
            if (v.getCodigo().equalsIgnoreCase(codigo)) {
                return v;
            }
        }
        return null;
    }
}
