package proAlgoritmicaII.paqSemana10.excepcionTryThrowFinally;

/**
 * @(#)CThrows.java
 *		El metodo que use throws debe capturar todas las excepciones
 *		listado en throws
 *
 * @author 
 * @version 1.00 2016/5/28
 */


public class CThrows {
	// Esto da error
	//static void metodoThrows() {
	public static void metodoThrows() throws IllegalAccessException {
		System.out.println("Dentro metodo throws");
		throw new IllegalAccessException("demo");
	}
	
	public static void main(String args[]) {
		try {
			metodoThrows();
		} 
		catch (IllegalAccessException e) {
			System.out.println("Capturado");
		}
	}
}
