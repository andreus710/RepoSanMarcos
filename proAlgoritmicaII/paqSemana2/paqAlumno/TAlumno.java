/**
* nombreClase: TAlumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqAlumno;

import java.util.*;
import java.io.*;

public class TAlumno {
	public static void main(String[] args) {
   	// TODO code application logic here
   	System.out.println("objeto a1");
   	Alumno a1 = new Alumno(100 , "Adan ");
   	System.out.println(a1);

   	Alumno a2 = new Alumno(102 , "Eva " , 18.1f);
   	System.out.println(a2);
   	
   	Alumno a3 = new Alumno();
   	a3= a3.leerAlumno();
   	a3.mostrarAlu();
   	
   	
   }
}

/*
    	a2.setCod(104);
   	a2.setNom("Adan");
   	a2.setNota(15.5F);

 */

/*
   	a2.cod(102);
   	a2.nom("Adan");
   	a2.nota(15.5F);
   	a2.mostrarAlu();
   	
    	System.out.println("objeto a2");
   	Alumno a2=new Alumno(100, "Eva", 18.9F);
   	a2.mostrarAlu(a2);

 */