/**
* nombreClase: TMatricula.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqMatricula;

import java.io.*;
import java.util.*;
public class TMatricula {
        
    /**
     * Creates a new instance of <code>TMatricula</code>.
     */
    public TMatricula() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	//Runtime.getRuntime().exec("clear");
   	//Runtime.getRuntime().exec("cls");

        Matricula M=new Matricula();
        
        Docente D=new Docente();
        D.setCodigo("789043");
        D.setNombre("Manrique Diaz,Luis");
        
        Docente D1=new Docente();
        D1.setCodigo("231234");
        D1.setNombre("Diaz Gonzales,Alberto");
        
        Curso C1=new Curso();
        C1.setCurso("Matematica");
        
        Curso C2=new Curso();
        C2.setCurso("Programacion 2");
        
        Curso C3=new Curso();
        C3.setCurso("Estadistica");
        
        Alumno A1=new Alumno();
        A1.setCodigo("1020323");  
        A1.setNombre("Morales Espino,Cynthia");      
        
        Alumno A2=new Alumno();
        A2.setCodigo("1123421");
        A2.setNombre("Bellido Barrientos,Daniel");
        Alumno A3=new Alumno();
        
        A3.setCodigo("1234567");
        A3.setNombre("Quispe Martinez,Walter");
        //****************************************************
        C1.setDocente(D);
        C2.setDocente(D1);
        C3.setDocente(D);
        D.agregarCurso(C1);
        D.agregarCurso(C3);
        D1.agregarCurso(C2);
        //***************************************************
        C1.agregarAlumno(A1);
        C1.agregarAlumno(A2);
        C1.agregarAlumno(A3);
        A1.agregarCurso(C1);
        A2.agregarCurso(C1);
        A3.agregarCurso(C1);
        
        //****************************************
         C2.agregarAlumno(A1);
        C2.agregarAlumno(A2);
        C2.agregarAlumno(A3);
        A1.agregarCurso(C2);
        A2.agregarCurso(C2);
        A3.agregarCurso(C2);
        //**************************************
         C3.agregarAlumno(A1);
        C3.agregarAlumno(A2);
        
        A1.agregarCurso(C3);
        A2.agregarCurso(C3);
        //*********************************
        M.agregarAlumno(A1);
        M.agregarAlumno(A2);
        M.agregarAlumno(A3);	
        M.agregarCurso(C1);
        M.agregarCurso(C2);
        M.agregarCurso(C3);
        M.agregarDocente(D1);
        M.agregarDocente(D);
        M.operaciones();  
    }
}

