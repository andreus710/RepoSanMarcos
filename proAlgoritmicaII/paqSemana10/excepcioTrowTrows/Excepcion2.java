package proAlgoritmicaII.paqSemana10.excepcioTrowTrows;

/**
 * @(#)Excepcion2.java
 *
 *
 * @author 
 * @version 1.00 2019/10/20
 */


public class Excepcion2 {
	public static int dividendo = 5;
	public static int divisor = 0;

	public Excepcion2(){
	}

	public static void dividir() throws ArithmeticException {
		try {
			System.out.println(dividendo / divisor);
		} 
		catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		dividir();
   }

}