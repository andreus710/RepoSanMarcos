package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia4; /**
 * @(#)Recuperar.java
 *
 *
 * @author GASA
 * @version 1.00 2009/11/15
 */
import java.io.*;
public class Recuperar {
   public Recuperar() {
   }
   public static void main(String[] args) {
      //RUTINA DE DES SERIALIZACION DEL OBJETO
      try {
         Alumno alu1;
         Alumno alu2;
         //La clase crea un imputStream para leer los bytes 
         //del archivo en este caso "seria00"
         FileInputStream fis = new FileInputStream("seria01");
         /*
          * FileInputStream(File archivo);
          * FileInputStream("C:\progJava\seria00");//por ejemplo
          *          
          */
         //Es la clase responsable de leer los objetos a streams
         ObjectInputStream ois = new ObjectInputStream(fis);
         //Se asigna a obj2 mediante un casting ...?
         alu1 = (Alumno)ois.readObject();
         alu2 = (Alumno)ois.readObject();
         ois.close();
         System.out.println();
         System.out.println("Se  ha RECUPERADO del archivo seria01");
         alu1.encabezado00();
         System.out.println(alu1);
         System.out.println(alu2);
      } 
      catch(Exception e) {
         System.out.println(e.getMessage());
         System.exit(0);
      }
      
   }
}
