package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia2; /**
 * @(#)TListaPuntos.java
 *
 *
 * @author 
 * @version 1.00 2011/6/11
 */
import java.io.*;
import java.util.*;

public class TListaPuntos {
   public static void main(String[] args) {
      // TODO code application logic here
      ListaPuntos lpe = new ListaPuntos(5);
      
      try{
      	//Crea file para serializar
         //ObjectOutputStream fileOut = new ObjectOutputStream(new FileOutputStream("FilePunto.bin"));
         FileOutputStream fos=new FileOutputStream("objeto.bin");
         ObjectOutputStream fileOut=new ObjectOutputStream(fos);
         
         //Serializa objetos de lpe
         System.out.println("Antes");
         fileOut.writeObject(lpe);
         System.out.println("Despues");
         
         //Cierra el file de salida
         fileOut.close();
         
         //Crea file para des serializar
         //ObjectInputStream fileIn = new ObjectInputStream(new FileInputStream("FilePunto.bin"));
         FileInputStream fis=new FileInputStream("objeto.bin");
         ObjectInputStream fileIn = new ObjectInputStream(fis);
         
         //Recupera los objetos de la lista
         ListaPuntos lps = (ListaPuntos)fileIn.readObject();
         
         fileIn.close();
         
         //Muestra los objetos de la lista recuperados
         lps.mostrarPuntos();
      }catch(FileNotFoundException fnfe){ 
      	System.out.println("Error de E/S");
      }
      catch(IOException ioe){ 
      	System.out.println("Error de E/S");
      }
      catch(ClassNotFoundException cnfe){ 
      	System.out.println("Clase no encontrada");
      }        
   }
}
