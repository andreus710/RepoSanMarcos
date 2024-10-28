/**
 * @(#)TMetodoGenerico.java
 *		Analice el programa.
 *
 *	Implemente mas aplicaciones de los temas visto hasta ahora.
 *	�Facilia o hace mas farragoso las implementacion de aplicaciones?
 *
 * @author
 * @version 1.00 2024/10/5
 */
package proAlgoritmicaII.paqSemana9.paqColecciones.Colecciones02;

import java.util.*;
public class TMetodoGenerico {

    public static void main(String[] args) {
    	String s1="Hola mundo Java...";
		Alumno a1=new Alumno(105, "Eva", 15.5f);
		Alumno a2=new Alumno(106, "Adan", 11.5f);
		Alumno va[]=new Alumno[2];
		va[0]=new Alumno(105, "Eva", 15.5f);
		va[1]=new Alumno(106, "Adan", 12.5f);
		//Alumno a2;
		//a2=a1.leerAlumno();
		ArrayList<Alumno> aa1=new ArrayList<>();
		aa1.add(a1);
		aa1.add(a2);
		System.out.println("Alumno: "+a2);

		ArrayAlumnos aa=new ArrayAlumnos();

    	aa.mostrarAlumnos();

    }
}