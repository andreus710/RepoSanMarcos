/**
* nombreClase: Persona.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia02;

public class Persona {
	protected String dni;
	protected String nombre;	
	protected String direccion;
	protected String fono;
	
	public Persona(){	
	}	
	public Persona(String vdni, String vnom, String vdir, String vfono){
		dni=vdni;
		nombre=vnom;
		direccion=vdir;
		fono=vfono;
	}
	public void  setDni(String vdni){
		dni=vdni;
	}
	public void  setNombre(String vnom){
		nombre = vnom;
	}
	public void  setDireccion(String vdir){
		direccion = vdir;
	}
	public void  setFono(String vfono){
		fono = vfono;
	}
	public String getDni(){
	  	return dni;
	}
	public String getNombre(){
	  	return nombre;
	}
	public String getDireccion(){
	  	return direccion;
	}
	public String getFono(){
	  	return fono;
	}
	public void mostrarInfo(){
		System.out.println("dni          : " + dni);
		System.out.println("nombre       : " + nombre);
		System.out.println("direccion    : " + direccion);
		System.out.println("telefono     : " + fono);		
	}
	
	public String toString(){
		return dni+""+nombre+""+direccion+""+fono;
	}
}
