/**
 * @(#)Alumno.java
 *
 *
 * @author 
 * @version 1.00 2011/9/20
 */
package proAlgoritmicaII.paqSemana9.paqColecciones.Colecciones01;

import java.util.*;

public class Alumno extends Persona{
	String codAlu;
	
	public Alumno() {
		super();
	}
	public Alumno(String vdni, String nom, int edad,String cod){
	   super(vdni, nom,edad);
	   codAlu=cod;
	}
	void setCodigo(String cod){
	   codAlu=cod;
	}
	
	public String getCodigo(){
	   return codAlu;
	}
	@Override
	public void mostrarVector(Collection x){
		super.mostrarVector(x);
	}
	
}