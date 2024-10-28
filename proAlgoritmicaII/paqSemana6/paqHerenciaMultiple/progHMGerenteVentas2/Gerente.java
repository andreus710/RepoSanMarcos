/**
 * @(#)Gerente.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas2;

public class Gerente extends Empleado{  
   protected double salariosemanal;
	
	public Gerente() {
	  	salariosemanal=0.0;
	}
	public Gerente(double salariosemanal){
	  	this.salariosemanal=salariosemanal;
	}
	public Gerente(String nombre){
		this.nombre=nombre;
	}
	public void setSalariosemanal(double salariosemanal){
		this.salariosemanal=salariosemanal;
	}
	public double getSalariosemanal(){
		return salariosemanal;
	}
}
