package proAlgoritmicaII.paqSemana10.excepcionTryThrowFinally;

/**
 * @(#)Excepcion.java
 *
 *
 * @author 
 * @version 1.00 2016/5/27
 */


public class Excepcion {
	public static void main(String args[]) {
		int val=10, cero=0;
		int v[] = {1, 2, 3};
		try {
			try {
				val = val/cero; //divisi�n entre cero
				v[4]= 10; //acceso a una posici�n no disponible
			}catch( ArithmeticException e ) {
			System.out.println( "Division entre cero" );
			throw e;
			}catch( Exception e ) {
				System.out.println( "Errorrrr....!" );
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}