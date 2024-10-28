package proAlgoritmicaII.paqSemana11.progPersistencia.archivoTextoOk; /**
 * @(#)CrearFileTexto.java
 *
 *		Uso de la clase Formatter para escribir datos em un file de texto
 *
 * @author 
 * Tomado de: JAVA Como Programar de Deitel y  Deitel
 * @version 1.00 2012/6/8
 */

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearFileTexto{
	private Formatter salida; // objeto usado para enviar texto al archivo

   // permite al usuario abrir el archivo
   public void abrirArchivo(){
   	try{
      	salida = new Formatter( "alumno.txt" );
      }
      catch(SecurityException securityException ){
      	System.err.println("No tiene acceso de escritura a este archivo." );
         System.exit(1);
      }
      catch(FileNotFoundException filesNotFoundException){
      	System.err.println( "Error al crear el archivo." );
         System.exit( 1 );
      }
   }

   
   public void agregarRegistros(){
      // objeto a escribir en el archivo
      Alumno regAlu=new Alumno();

      Scanner jin=new Scanner( System.in );

      System.out.printf( "%s\n%s\n%s\n%s\n\n",
         "Para terminar la entrada, escriba el indicador de fin de archivo ",
         "cuando se le pida que escriba los datos de entrada.",
         "En UNIX/Linux/Mac OS X escriba <ctrl> d y oprima Intro",
         "En Windows escriba <ctrl> z y oprima Intro" );

      System.out.printf( "%s\n"," Para terminar ingrese DNI -1");
		
		// itera hasta encontrar el indicador de fin de archivo
		int opc;
		System.out.print("DNI    ---> ");
		opc=jin.nextInt();
      while(opc>1){
      	// env�a valores al archivo
         try {
         	// obtiene datos alumno que se van a grabar
         	regAlu.setDni(opc);	
         	System.out.print("Nombre ---> ");
         	regAlu.setNombre(jin.next());
         	System.out.print("codigo ---> ");
         	regAlu.setCodigo(jin.next());
         	System.out.print("Nota   ---> ");
         	regAlu.setNota(jin.nextDouble());
            if(regAlu.getDni()>0){
               // escribe el nuevo registro
               salida.format( "%d %s %s %.1f\n", regAlu.getDni(),regAlu.getNombre(), regAlu.getCodigo(),regAlu.getNota());
            }
            else{
               System.out.println("El numero de DNI debe ser mayor a 0." );
            }
         }
         catch ( FormatterClosedException formatterClosedException ){
            System.err.println( "Error al escribir en el archivo." );
            return;
         }
         catch ( NoSuchElementException elementException ){
            System.err.println( "Entrada invalida. Intente de nuevo." );
            jin.nextLine(); // descarta la entrada para que el usuario intente de nuevo
         }

         System.out.print("DNI    ---> ");
         opc=jin.nextInt();  
      }
   }

   public void cerrarArchivo(){
      if ( salida != null )
      	salida.close();
   }
}