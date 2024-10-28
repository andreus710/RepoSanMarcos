/**
 * @(#)Empleado.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas3;

public class Empleado{
	protected String nombre;
	protected int edad;
	
	public Empleado(){
	}
	public Empleado(String nom,int e){
		nombre=nom;
		edad=e;
	}
	public String getNombre(){
		return nombre;
	}
	public void ponNombre(String n){
		nombre=n;
	}
	public int getEdad(){
		return edad;
	}
	public void ponEdad(int ed){
		edad=ed;
	}	
	public Empleado lee(){
		//Que es esto?
		System.out.print("\n Ingrese su nombre: "); 
		nombre=Leer.dato();
		do{
		   System.out.print(" Ingrese su edad: "); 
		  	edad=Leer.datoInt();
		}while(edad<18||edad>80);
		
		return new Empleado(nombre,edad);  
	}
	public String toString(){
		return "\n Nombre: "+ nombre +";\n Edad: "+edad;
	}
}
