/**
* nombreClase: Persona.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia01;

public class Persona {
	protected String dni;
	protected String nombre;	
	protected String colorCabello;
	
	public Persona(){	
	}	
	public Persona(String vdni, String nom){
		dni=vdni;
		nombre=nom;
	}
	public void  setDni(String vdni){
	  this.dni=vdni;
	}
	public void  setNombre(String nom){
	  this.nombre = nom;
	}
	public String getDni(){
	  return this.dni;
	}
	public String getNombre(){
	  return this.nombre;
	}
}
