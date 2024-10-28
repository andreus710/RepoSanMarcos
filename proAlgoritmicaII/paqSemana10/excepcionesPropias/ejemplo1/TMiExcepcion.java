package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo1; /**
 * @(#)TMiExcepcion.java
 *
 *
 * @author 
 * @version 1.00 2019/10/20
 */
import java.util.*;

public class TMiExcepcion {

   public TMiExcepcion() {
   }
   
 	public static double leerValor() throws ValorNoValido {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce n�mero > 0: ");
		double n = sc.nextDouble();
		if (n <= 0) {
		  throw new ValorNoValido("El n�mero debe ser positivo");
		}
		return n;
	}    

 	public static void main(String args[]) {
		try {
			double x = leerValor();
			System.out.println("Raiz cuadrada de " + x + " = " + Math.sqrt(x));
		}
		catch (ValorNoValido e) {
			System.out.println(e.getMessage());
		}
	} 
}