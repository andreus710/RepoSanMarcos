package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia4; /**
 * @(#)Salvar.java
 *    Investigue serializacion  de Java y aplique a:
 * 1. Aplique a sus aplicaciones serializacion de objetos 
 * 2. Aplique a sus aplicaciones creando metodos salvar y recuperar  
 * 3. Luego construya una aplicacion de  8 a 10 clases dotadas de clases
 *    abstractas, interfaces,  herencia  y crear los metodos de de salvar y recuperar
 *
 * @author GASA
 * @version 1.00 2009/11/15
 */
import java.io.*;
public class Salvar {
   public Salvar() {
   }
   public static void main(String[] args) {
      //RUTINA DE SERILAIZACION DEL OBJETO
      try {
         Alumno a1 = new Alumno("Eva ", 15);
         Alumno a2 = new Alumno("Adan", 15);
         System.out.println("Objeto : " + a1);
         System.out.println("Objeto : " + a2);
         //Es la clase crea un OutputStream para enviar un flujo de bytes 
         //a un archivo en este caso "seria01"
         FileOutputStream fos = new FileOutputStream("seria01");
         /*
          * Si el archivo existe lo destruira al menos que le digamos 
          * que adicione datos, esto es, poniendo append a true.
          * FileOuputStream(String filePath, boolean append);
          * FileOuputStream("C:\progJava\seria00" true)por ejemplo
          */
         //Es la clase responsable de escribir los objetos a streams
         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(a1);
         oos.writeObject(a2);
         System.out.println("Se ha SALVADO en el archivo seria01");
         oos.flush();
         oos.close();
      }  
      catch (Exception e){
         System.out.println(e.getMessage());
         System.exit(0);
      }      
   }
}
