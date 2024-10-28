
/**
 * @(#)Leer.java
 *		Operaciones basicas de captura datos
 * 	de la clase Leer.
 *
 *		Analice las operaciones y los conceptos de 
 *		la OO aplicados.
 *
 * @author F Cevallos. Programacion Java
 * @version 1.00 
 * @Since 2014/3/30
 */
package proAlgoritmicaII.paqSemana6.paqLab06.enum00;

import java.io.*;
public class Leer {	
	public static String dato(){
		String sdato=" ";
		try{
			//definir un flujo de caracteres de entrada: flujoE
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader flujoE=new BufferedReader(isr);
			//Leer.la entrada finaliza al pulsar la tecla entrar
			sdato =flujoE.readLine();
		}
		catch(IOException e){
			System.err.println("error: "+e.getMessage());
		}
		return sdato;//devolver el dato tecleado
	}
	public static int datoInt(){
		try{
			return Integer.parseInt(dato());
		}
		catch(NumberFormatException e){
			return Integer.MAX_VALUE;//valor mas pequeno
		}
	}
	public static float datoFloat(){
		try{
			Float f=new Float(dato());
			return f.floatValue();
		}
		catch(NumberFormatException e){
			return Float.NaN;//no es un numero: valor double	
		}
	}
	public static double datoDouble(){
		try{
			Double d=new Double(dato());
			return d.doubleValue();
		}
		catch(NumberFormatException e){
			return Double.NaN;//no es un numero: valor double
		}
	}
}
