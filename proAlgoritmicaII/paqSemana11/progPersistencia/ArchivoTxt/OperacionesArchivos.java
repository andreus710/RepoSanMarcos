package proAlgoritmicaII.paqSemana11.progPersistencia.ArchivoTxt;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 610
 */
import java.lang.SecurityException;
import java.util.*;
import java.io.*;

public class OperacionesArchivos {
    private Formatter salida;
    private Scanner entrada;
    
    public void crearArchivo(){
        try{
            salida=new Formatter("alumnos.txt");
        }
        catch(SecurityException se){
            System.err.println("No tiene acceso de escritura a este archivo");
            System.exit(1);
        }
        catch(FileNotFoundException fnfe){
            System.err.println("Error al crear el archivo");
            System.exit(1);
        }
    }
    
    public void agregarAlumno(Alumno a){
       try{
           salida.format("%s %s %s %.1f\n",a.getCodigo(),a.getNombre(),a.getDni(),a.getNota());        
       }
       catch(FormatterClosedException e){
           System.err.println("Error al escribir en el archivo");
       } 
        
    }
    
    public void cerrarArchivo(){
        if(salida!=null){
            salida.close();
        }
    }
}