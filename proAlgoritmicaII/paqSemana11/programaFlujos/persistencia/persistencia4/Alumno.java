package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia4; /**
 * @(#)Alumno.java
 *       
 *    La Serializacion es el proceso de escribir el estado de un objeto 
 *    a un flujo de bytes. Esto permite serializar un objeto: SALVAR y 
 *    tambien permite des serializar: RECUPERAR
 *
 *    Tener en cuenta que cuando se serializa un objeto este puede tener 
 *    referencias a otros objetos y estos a su vez a otros objetos.
 *
 *    Para que un objeto sea salvado y recuperado DEBE implementar la 
 *    INTERFACE serializable. Si una clase es serializable tambien lo
 *    seran sus subclases.
 *
 *
 * @author GASA
 * @version 1.00 2009/11/15
 */

import java.io.*;
public class Alumno implements Serializable{
   String nom;
   int nota;
   
   public Alumno(String nom, int nota) {
      this.nom =nom;
      this.nota=nota;
   }
   public String  toString(){
      return nom+"\t\t\t"+nota;
   }   
   public void  encabezado00(){
      System.out.println("\n\t\tRELACION DE ALUMNOS\n");
      System.out.println("===================");
      System.out.println("Nombre\t\tNota");
      System.out.println("===================");
   }   
}