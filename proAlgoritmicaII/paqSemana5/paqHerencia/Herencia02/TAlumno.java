/**
* nombreClase: TAlumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia02;

public class TAlumno {
	
	public  static void main (String args[]){
		Persona p1=new Persona("0101","Adan","Av. Wilson 1800","999111222");
		AlumnoPre a1=new AlumnoPre("0102","Eva","Av. Wilson 1802","999111223","030002");

		//Porque imprime. getDireccion nos es de la clase AlumnoPre?		
		System.out.println ("Direc. Persona :"+p1.getDireccion());
		System.out.println ("Direc. Alumno  :"+a1.getDireccion());
		
		//Porque mostrarInfo() tiene diferente comportamiento?
		System.out.println ();
		p1.mostrarInfo();
		System.out.println ();
		a1.mostrarInfo();
	}    
}
