package proAlgoritmicaII.paqSemana10.excepcionesBas; /**
 * @(#)Excepcion02.java
 *	    Operaciones basicas
 *
 *   Ejemplo que le permite controlar las excepciones.
 *
 * @author 
 * @version 1.00 2017/5/31
 */
import java.io.*;
public class Excepcion02 {
	public static void main(String args[]) {
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try {
			//valor = valor/cero; //divisi�n por cero
			array[4]= 5; //acceso a una posici�n no disponible
		}
		catch( ArithmeticException e ) {
			System.out.println( "Division por cero" );
			System.out.printf( "%s\n\n", e.getMessage() );
			e.printStackTrace();
		}
		catch( Exception e ) {
			System.out.println( "Se ha producido un error" );
			System.out.printf( "%s\n\n", e.getMessage() );
			e.printStackTrace();
		}
	}
}