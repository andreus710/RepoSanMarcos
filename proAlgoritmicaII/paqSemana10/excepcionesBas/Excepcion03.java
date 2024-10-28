package proAlgoritmicaII.paqSemana10.excepcionesBas;

/**
 * @(#)Excepcion03.java
 *	    Operaciones basicas
 *
 *   Ejemplo que le permite controlar las excepciones.
 *
 * @author 
 * @version 1.00 2017/5/31
 */public class Excepcion03 {
	public static void main(String args[]) {
		int valor=5, cero=0;
		int[] array = {1, 2, 3};
		try {
			try {
				valor = valor/cero; //divisi�n por cero
				array[4]= 5; //acceso a una posici�n no disponible
			}
			catch( ArithmeticException e ) {
				System.out.println( "Division por cero" );
				throw e;
			}
			catch( Exception e ) {
				System.out.println( "Se ha producido un error" );
				throw e;			}	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}
}