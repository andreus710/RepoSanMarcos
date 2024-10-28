package proAlgoritmicaII.paqSemana11.progPersistencia.archivoTextoOk;

/**
 * @(#)TCrearFile.java
 *
 *		Testea o prueba leer File de texto
 *
 * @author 
 * Tomado de: JAVA Como Programar de Deitel y  Deitel 
 * @version 1.00 2012/6/8
 */
public class TLeerFile{
	
   public static void main( String args[] ){
      LeerFileTexto lft = new LeerFileTexto();
      lft.abrirArchivo();
      lft.leerRegistros();
      lft.cerrarArchivo();
   }
} 