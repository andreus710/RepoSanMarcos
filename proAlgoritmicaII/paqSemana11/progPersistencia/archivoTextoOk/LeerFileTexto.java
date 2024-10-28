package proAlgoritmicaII.paqSemana11.progPersistencia.archivoTextoOk; /**
 * @(#)LeerFileTexto.java
 *
 *		Lee un archivo de texto y muestra cada registro
 *
 * @author 
 * Tomado de: JAVA Como Programar de Deitel y  Deitel
 * @version 1.00 2012/6/8
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerFileTexto{
   private Scanner jin;

   public void abrirArchivo(){
      try{
         jin = new Scanner( new File( "alumno.txt" ) );
      }
      catch ( FileNotFoundException fileNotFoundException ){
         System.err.println( "Error al abrir el archivo." );
         System.exit( 1 );
      }
   }

   // lee registro del archivo
   public void leerRegistros(){
      // objeto a escribir en la pantalla
      Alumno regAlu=new Alumno();
		
      try {
      	// lee registros del archivo, usando el objeto Scanner
      	encabezado1();
         while(jin.hasNext()){
         	regAlu.setDni(jin.nextInt());
         	regAlu.setNombre(jin.next());
         	regAlu.setCodigo(jin.next());
         	regAlu.setNota(jin.nextDouble());
            // Muestra el contenido del registro leido del file
            System.out.printf("\n%6d\t%-18s %-15s%.1f\n",regAlu.getDni(),regAlu.getNombre(),regAlu.getCodigo(),regAlu.getNota());
         }
         raya1();
      }
      catch ( NoSuchElementException elementException ){
         System.err.println( "El archivo no esta bien formado." );
         jin.close();
         System.exit( 1 );
      }
      catch ( IllegalStateException stateException ){
         System.err.println("Error al leer del archivo.");
         System.exit( 1 );
      }
   }
	void raya1(){
		System.out.print("--------------------------------------------------");
	}
	void raya2(){
		System.out.print("==================================================");
	}
	void encabezado1(){
		System.out.printf("\t\t\tRELACION DE REGISTROS\n\n");
		raya2();
		System.out.printf("\n%6s\t%-18s%-15s%-7s\n","DNI","NOMBRE","CODIGO","NOTA");
		raya1();
	}
   public void cerrarArchivo(){
      if ( jin != null){
         jin.close();
      }
   }
}