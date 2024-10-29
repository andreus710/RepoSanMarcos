/**
 * @(#)DatosDePrueba.java
 *	Se genera datos/objetos de prueba de cada una de las clases.
 *
 *
 * @author
 * @version 1.00 2022/9/9
 */
package proAlgoritmicaII.paqSemana11.Tarea05;

import java.util.*;
import java.io.*;

public class DatosDePrueba {

	public DatosDePrueba() {
	}

	public void datosProfesores(){
		ArrayList<Profesor> apro=new ArrayList();
		apro.add(new Profesor("101", "Carlos", "Asociado", "Metodología de la enseñanza"));
		apro.add(new Profesor("102", "Sofia", "Principal", "Educación inclusiva"));
		apro.add(new Profesor("104", "Luis", "Auxiliar", "Tecnologías educativas"));
		apro.add(new Profesor("106", "Marta", "Asociado", "Desarrollo curricular"));
		apro.add(new Profesor("107", "Jorge", "Principal", "Psicopedagogía"));
		apro.add(new Profesor("108", "Ana", "Auxiliar", "Didáctica de las matemáticas"));
		apro.add(new Profesor("109", "Pedro", "Asociado", "Evaluación educativa"));
		apro.add(new Profesor("110", "Laura", "Principal", "Educación ambiental"));
		
		GestionSerializado<Profesor> gs=new GestionSerializado("profesores.dat");


	   	for(Profesor p : apro){
	   		gs.salvarDato(p);
	   	}


	}
	
	public void datosAlumnos() {
		ArrayList<Alumno> alu = new ArrayList();
		
		alu.add(new Alumno("23200282", "María", "Redes", "Estudiante"));
		alu.add(new Alumno("23200283", "Luis", "Ciberseguridad", "Estudiante"));
		alu.add(new Alumno("23200284", "Ana", "Desarrollo Web", "Estudiante"));
		alu.add(new Alumno("23200285", "Carlos", "Inteligencia Artificial", "Estudiante"));
		alu.add(new Alumno("23200286", "Sofía", "Data Science", "Estudiante"));
		alu.add(new Alumno("23200287", "Javier", "Computación", "Estudiante"));
		alu.add(new Alumno("23200288", "Isabel", "Ingeniería de Software", "Estudiante"));
		alu.add(new Alumno("23200289", "Pedro", "Sistemas", "Estudiante"));;
		GestionSerializado<Alumno > ga=new GestionSerializado("Alumnos.dat");

		for( Alumno p : alu) {
			ga.salvarDato(p);
		}
	}

}