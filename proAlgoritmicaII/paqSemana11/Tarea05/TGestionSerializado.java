/**
 * @(#)TGestionSerializado.java
 *		Testea diferentes clases objetos (users)
 *
 *	Para gestionar los archivos debemos hacerlo con la clase:
 *  GestionSerializado <TD> y archivo correspodiente: Ej Profesor.
 *
 *    GestionSerializado<Profesor> gsp=new GestionSerializado ("profesores.dat");
 *		metodos:
 *		- Recuperar datos		gsp.recuperarDatos()
 *		- Salvar datos 			gsp.salvarDato(TD elemento)
 *		- Mostrar datos			gsp.mostrarDatos()
 *		- Existe dato  			gsp.existeDato(TD elemento)
 *		- Eliminar dato  		gsp.eliminarDato(TD elemento)
 *
 *				Actividdes de laboratorio
 *
 *	0.	Analice el codigo, luego planifique la carga de objetos.
 *	1. 	En la clase TGestionSerializado
 *		1.1 Compruebe si se aplica las buenas practicas
 *		1.2 Crear el archivo de objetos profesore
 *		1.3 Muestre los datos de profesores
 *		1.4 Agregue objeto profesor
 *		1.4 Prueba las comportamientos que tiene
 *	2.	Ahora gestione los objetos Alumno
 *	3.	RETO: Que mejoras puede hacer a esta aplicacion.
 *	4.	RETO: Sistemnatice adecuadamente y aplique a su proyecto.
 *
 *
 * @author
 * @version 1.00 2022/9/9
 */


package proAlgoritmicaII.paqSemana11.Tarea05;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TGestionSerializado {


	public static void main(String[] args) {
		TGestionSerializado gestion = new TGestionSerializado();
		gestion.iniciarMenu();
	}

	private void iniciarMenu() {
		Scanner sc = new Scanner(System.in);
		GestionSerializado<Profesor> gs = new GestionSerializado<>("profesores.dat");

		int opc = -1;
		while (opc != 0) {
			mostrarMenu();
			try {
				opc = sc.nextInt();
				procesarOpcion(opc, gs);
			} catch (InputMismatchException e) {
				System.out.println("Por favor, ingrese una opción válida.");
				sc.next();
			}
		}
		System.out.println("Saliendo...");
	}

	private void mostrarMenu() {
		System.out.println("\nMENU-----------");
		System.out.println("1. Recuperar datos");
		System.out.println("2. Salvar datos");
		System.out.println("3. Mostrar datos");
		System.out.println("4. Existe dato");
		System.out.println("5. Eliminar dato");
		System.out.println("0. SALIR");
		System.out.print("--> ");
	}

	private void procesarOpcion(int opc, GestionSerializado<Profesor> gs) {
		switch (opc) {
			case 1:
				gs.recuperarDatos();
				break;
			case 2:
				agregarProfesor(gs);
				break;
			case 3:
				gs.mostrarDatos();
				break;
			case 4:
				verificarExistenciaProfesor(gs);
				break;
			case 5:
				eliminarProfesor(gs);
				break;
			case 0:
				break;
			default:
				System.out.println("Opción inválida, intente nuevamente.");
				break;
		}
	}

	private void agregarProfesor(GestionSerializado<Profesor> gs) {
		Profesor p = new Profesor();
		p = p.leerProfesor();
		gs.salvarDato(p);
		System.out.println("Profesor agregado correctamente.");
	}

	private void verificarExistenciaProfesor(GestionSerializado<Profesor> gs) {
		Profesor profesorBusqueda = new Profesor();
		profesorBusqueda = profesorBusqueda.leerProfesor();
		gs.existeDato(profesorBusqueda);
		if (profesorBusqueda != null) {
			System.out.println("El profesor existe en los datos.");
		} else {
			System.out.println("El profesor no se encuentra en los datos.");
		}
	}

	private void eliminarProfesor(GestionSerializado<Profesor> gs) {
		Profesor profesorEliminar = new Profesor();
		profesorEliminar = profesorEliminar.leerProfesor();
		gs.eliminarDato(profesorEliminar);
		if (profesorEliminar != null) {
			System.out.println("Profesor eliminado correctamente.");
		} else {
			System.out.println("No se encontró el profesor a eliminar.");
		}
	}
}