package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia0; /**
 * @(#)Persona.java
 *
 *
 * @author 
 * @version 1.00 2011/6/10
 */
import java.io.Serializable;

public class Persona implements Serializable {
	private String dni;
	private String nombre;
	private int edad;
	
   public Persona() {
   }
	public void setDni(String vdni){
		dni=vdni;
	}    
	public void setNombre(String nom){
		nombre=nom;
	}    
	public void setEdad(int vedad){
		edad=vedad;
	}    
	public String getDni(){
		return dni;
	}    
	public String getNombre(){
		return nombre;
	}    
	public int getEdad(){
		return edad;
	}        
}
