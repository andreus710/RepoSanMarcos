package proAlgoritmicaII.paqSemana10.excepcionesBas; /**
 * @(#)Excepcion04.java
 *	    Operaciones basicas
 *
 *   Ejemplo que le permite controlar las excepciones.
 *
 * @author 
 * @version 1.00 2017/5/31
 */
import java.io.*;
public class Excepcion04 {
	public static char leer() throws IOException {
		return (char) System.in.read();
	}
	public static void main(String args[]) {
		try {
			int car=leer();
			System.out.println("Caracter: "+car);
		} 
		catch (IOException e) {
			System.out.println("Error de entrada de datos");
		}
	}
}