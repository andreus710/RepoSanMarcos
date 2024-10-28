package proAlgoritmicaII.paqSemana10.excepcioTrowTrows;

/**
 * @(#)Excepcion1.java
 *		Analice
 *
 * @author 
 * @version 1.00 2019/10/20
 */


public class Excepcion1 {
	public static int dividendo = 5;
	public static int divisor = 0;

	public Excepcion1(){
	}

	public static void dividir() throws ArithmeticException {
		System.out.println(dividendo / divisor);
	}
	
	public static void main(String[] args) {
		try {
			dividir();
		} 
		catch (ArithmeticException e) {
			System.err.println(e);// tambi�n podr�a poner e.getMessage()
		}
	}

}