/**
* nombreClase: Empleado.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqPlanilla;

class Empleado {
	//atributos
	private String nombre;
	private double sueldo;
	
	//Constructor
	public Empleado (String n, double s ) { 
		nombre = n;
		sueldo = s;
	}
	public Empleado ( ) { 
		this("NN"); // Otro uso de this investigar
	}
	public Empleado ( String n) { 
		this(n, 0); 
	}
	public Empleado ( double s) { 
		this("NN", s); 
	}
	
	public String getNombre() {
		return nombre;
 	}

	public double getSueldo() {
		return sueldo;
	}
}
