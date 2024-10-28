/**
 * @(#)ArrayAlumnos.java
 *
 *
 * @author
 * @version 1.00 2024/10/5
 */
package proAlgoritmicaII.paqSemana9.paqColecciones.Colecciones02;

import java.util.*;
public class ArrayAlumnos {
	private ArrayList<Alumno> alumnos;

    public ArrayAlumnos() {
    	alumnos=new ArrayList<>();
    }
    public ArrayAlumnos(ArrayList<Alumno> a) {
    	alumnos=a;
    }

	public void addAlumnos(Alumno a){
		alumnos.add(a);
	}

	public void mostrarAlumnos(){
		int da;
		da=alumnos.size();

		if(da<1){
			System.out.println("Array vaciooo...");
		}
		else{
			for(Alumno alu: alumnos){
				System.out.println(alu.toString());
			}
		}

	}

}