/**
 * @(#)Persona.java
 *		Tarea
 *		
 *		1. Analice, compile y ejecute
 *		2. Agregue los metodo leer, mostrar, buscar, ordenar, 
 *			eliminar, editar, etc.
 *		3. Agreugue el metodo toString() a la clase Persona.
 *		4. Agregue la clase mostrar a la clase Alumno ??
 *		5. Agregue el metodo toString() a la clase Alumno??
 *
 *		Vease: https://docs.oracle.com/javase/tutorial/collections/index.html
 * @author 
 * @version 1.00 2011/9/20
 */
package proAlgoritmicaII.paqSemana9.paqColecciones.Colecciones01;

import java.util.*;

public class Persona {
	protected String dni;
	protected String nombre;	
	protected int edad;	
	
	public Persona(){	
	}	
	public Persona(String vdni, String nom,int ed){
		dni=vdni;
		nombre=nom;
		edad=ed;
	}
	public void  setDni(String vdni){
	  this.dni=vdni;
	}
	public void  setNombre(String nom){
	  this.nombre = nom;
	}
	public void  setEdad(int ed){
	  this.edad=ed;
	}
	
	public String getDni(){
	  return this.dni;
	}
	public String getNombre(){
	  return this.nombre;
	}
	public int getEdad(){
	  return this.edad;
	}
	
	public Collection leerVector(){
		Vector vp=new Vector();
		vp.add(new Persona("112","Eva", 20));
		vp.add(new Persona("111","Adan", 21));
		vp.add(new Persona("123","Juan", 18));
		return vp;
	}
	public void mostrarVector(Collection x){
		Collection co;
		Iterator it;
		Persona pa;
		Persona p=new Persona();
		x=p.leerVector();
		
		for(it=x.iterator();it.hasNext();){
			pa=(Persona)it.next();
			System.out.println(pa);
		}	
	}
	public String toString(){
		String cad=dni+" "+nombre+" "+edad;
		return cad;
	}
}