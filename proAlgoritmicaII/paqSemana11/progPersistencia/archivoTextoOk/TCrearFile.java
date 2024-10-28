package proAlgoritmicaII.paqSemana11.progPersistencia.archivoTextoOk;

/**
 * @(#)TCrearFile.java
 *
 *		Testea o prueba crear File de texto
 *
 * @author 
 * Tomado de: JAVA Como Programar de Deitel y  Deitel 
 * @version 1.00 2012/6/8
 */

public class TCrearFile{
   public static void main( String args[] ){
      CrearFileTexto cft = new CrearFileTexto();
      cft.abrirArchivo();
      cft.agregarRegistros();
      cft.cerrarArchivo();    
   } 
}