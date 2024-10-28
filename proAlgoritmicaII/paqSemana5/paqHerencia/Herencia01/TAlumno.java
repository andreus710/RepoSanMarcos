/**
* nombreClase: TAlumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia01;

public class TAlumno {
	
	public  static void main (String args[]){
		Alumno a1 = new Alumno();
		a1.setCodigo("20101320E");
		a1.setNombre("Felipe");
		
		Alumno a2 = new Alumno();
		a2.setCodigo("20090456A");
		
		System.out.println("Alumno 1 ->\t"+a1.getNombre());
		System.out.println("Alumno 2 ->\t"+a2.getNombre());
	}    
}


