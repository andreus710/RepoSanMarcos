package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo0; /**
 * @(#)CThrows2.java
 *		El metodo que use throws debe capturar todas las excepciones
 *		listado en throws
 *		
 *		Analice e implemente en su proyecto.
 *
 * @author 
 * @version 1.00 2016/5/28
 */

import java.util.*;

public class CThrows2 {
	public static void main(String args[]) {
		try {
			System.out.println("RAIZ CUADRADA");
			double x = leerValor();
			System.out.println("Raiz cuadrada de: " + x + " = " + Math.sqrt(x));
		}
		catch (ValorNoValido vnv) {
			System.out.println(vnv.getMessage());
		}
	}
	
	public static double leerValor() throws ValorNoValido {
		Scanner jin = new Scanner(System.in);
		System.out.print("Ingresa un numero > 0 ---> ");
		double n = jin.nextDouble();
		if (n <= 0) {
			throw new ValorNoValido("El n�mero debe ser positivo");
		}
		return n;
	}
}
