package proAlgoritmicaII.paqSemana11.progPersistencia.ArchivoTxt;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 610
 */
public class TArchivoAlumnos {
    public static void main(String args[]){
        Alumno a0=new Alumno("100", 12.00, "Eva", "123456");
        Alumno a1=new Alumno("102", 12.00, "Adan", "123457");
        Alumno a2=new Alumno("104", 12.00, "Abel", "123458");
        Alumno a3=new Alumno("106", 12.00, "Tomas", "123459");
        Alumno a4=new Alumno("108", 12.00, "Zacacho", "123460");
        
        
        OperacionesArchivos o=new OperacionesArchivos();
        o.crearArchivo();
        o.agregarAlumno(a0);
        o.agregarAlumno(a1);  
        o.agregarAlumno(a2);  
        o.agregarAlumno(a3);  
        o.agregarAlumno(a4);  
          
        o.cerrarArchivo();
        
        LecturaArchivoAlumnos l=new LecturaArchivoAlumnos();
        l.abrirArchivo();
        l.leerArchivo();
        l.cerrarArchivo1();
    }
    
}
