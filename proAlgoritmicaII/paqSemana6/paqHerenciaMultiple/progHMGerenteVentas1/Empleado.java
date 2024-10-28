/**
 * @(#)Empleado.java
 *
 *
 * @author 
 * @version 1.00 2011/10/17
 */

package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas1;


public class Empleado{ 
	protected String nombre;
   
	public Empleado() {
		nombre="Juan Perez";
	}
	
	public Empleado(String nombre){
		this.nombre=nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
}
