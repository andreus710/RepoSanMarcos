/**
* nombreClase: Alumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia01;

public class Alumno extends Persona{
	String codAlu;
	
	public Alumno() {
		super();
	}
	public Alumno(String vdni, String nom, String cod){
	   super(vdni, nom);
	   codAlu=cod;
	}
	void setCodigo(String cod){
	   codAlu=cod;
	}
	
	public String getCodigo(){
	   return codAlu;
	}
}