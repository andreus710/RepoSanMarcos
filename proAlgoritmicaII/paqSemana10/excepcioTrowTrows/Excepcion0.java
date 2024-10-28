package proAlgoritmicaII.paqSemana10.excepcioTrowTrows;

/**
 * @(#)Excepcion0.java
 *
 *
 * @author 
 * @version 1.00 2019/10/20
 */


public class Excepcion0 {
	public static int dividendo = 5;
	public static int divisor = 0;
	
   public Excepcion0() {
   }   
	public static void main(String[] args) {
		try {
			System.out.println(dividendo / divisor);
		} 
		catch (ArithmeticException e) {
			System.err.println(e);//tambi�n podr�a poner e.getMessage()
		}
	}   	
}