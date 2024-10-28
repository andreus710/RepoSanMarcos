package proAlgoritmicaII.paqSemana10.excepcionTryThrowFinally;

/**
 * @(#)CThrow.java
 *		Anlice
 *
 * @author 
 * @version 1.00 2016/5/28
 */


public class CThrow {
	public static void metodoThrow() {
		try {
			throw new NullPointerException("demo");
		} 
		catch(NullPointerException e) {
			System.out.println("Captura de metodoThrow");
			throw e; // relanza la excepci�n
		}
	}
	public static void main(String args[]) {
		try {
			metodoThrow();
		} 
		catch(NullPointerException e) {
			System.out.println("Nueva captura: " + e);
		}
	}
}