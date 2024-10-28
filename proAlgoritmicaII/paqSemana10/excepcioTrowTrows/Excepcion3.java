package proAlgoritmicaII.paqSemana10.excepcioTrowTrows;

/**
 * @(#)Excepcion3.java
 *		Analice
 *		�Cual es la diferencia entre las excepciones 0,1,2, 3?
 *
 * @author 
 * @version 1.00 2019/10/20
 */


public class Excepcion3 {
	public static int dividendo = 5;
	public static int divisor = 0;

	public Excepcion3(){
	}

	public static void dividir() {
		try {
			if (divisor == 0){
				throw new IllegalArgumentException("No se puede dividir por cero");
			}
			System.out.println(dividendo / divisor);
		} 
		catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		dividir();
   }

}