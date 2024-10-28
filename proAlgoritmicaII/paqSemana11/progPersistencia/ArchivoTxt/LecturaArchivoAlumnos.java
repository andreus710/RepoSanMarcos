package proAlgoritmicaII.paqSemana11.progPersistencia.ArchivoTxt;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 610
 */
import java.io.*;
import java.lang.*;
import java.util.*;

public class LecturaArchivoAlumnos {
    private Scanner entrada;

    public LecturaArchivoAlumnos() {
    }
    public void abrirArchivo(){
        try{
           entrada=new Scanner(new File("alumnos.txt"));
           entrada.useDelimiter(",");
       }
       catch(FileNotFoundException e){
           System.err.println("Error al abrir el archivo");
           System.exit(1);
       }       
    }
    
    public void leerArchivo(){
       String dni,codigo,nombre;
       double nota;
       while(entrada.hasNextLine()){                 
       try{
           //while(entrada.hasNextLine()){
               codigo=entrada.nextLine();
               nombre=entrada.nextLine();
               dni=entrada.nextLine();
               nota=entrada.nextDouble();
                            
               Alumno a=new Alumno(codigo,nota,nombre,dni);
               //System.out.println(a.toString());
               System.out.println(a.getCodigo());
               System.out.println(a.getNota());
               System.out.println(a.getNombre());
               System.out.println(a.getDni());
           }
       //}
       catch(NoSuchElementException e){
           System.err.println("El archivo no esta bien formado");
           entrada.close();
           System.exit(1);
       }
       catch(IllegalStateException e){
           System.err.println("Error al leer del archivo");
           System.exit(1);
       } 
    }     
   }
    
   public void cerrarArchivo1(){
       if(entrada!=null){
           entrada.close();
       }
   }
}

    
    

