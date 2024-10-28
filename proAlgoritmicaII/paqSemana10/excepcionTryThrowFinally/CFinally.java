package proAlgoritmicaII.paqSemana10.excepcionTryThrowFinally;

/**
 * @(#)CFinally.java
 *			Analice
 *
 * @author 
 * @version 1.00 2016/5/28
 */


public class CFinally {
	// Lanza una excepci�n fuera del m�todo
	public static void metodoA() {
		try {
			System.out.println("Dentro metodoA");
			throw new RuntimeException("demo");
		} 
		finally {
			System.out.println("finally de metodoA");
		}
	}
	// Ejecuta la sentencia return del try
	public static void metodoB() {
		try {
			System.out.println("Dentro metodoB");
			return;
		} 
		finally {
			System.out.println("finally de metodoB");
		}
	}
	// Ejecuta un bloque try normalmente
	public static void metodoC() {
		try {
			System.out.println("Dentro metodoC");
		} 
		finally {
			System.out.println("finally de metodoC");
		}
	}
	
	public static void main(String args[]) {
		try {
			metodoA();
		} 
		catch (Exception e) {
			System.out.println("Excepcion capturada ");
		}
		metodoB(); 
		metodoC();
	}
}