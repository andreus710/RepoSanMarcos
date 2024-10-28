package proAlgoritmicaII.paqSemana11.programaFlujos.flujosES; /**
 * @(#)Lectura.java
 *
 *
 * @author 
 * @version 1.00 2011/11/4
 */


import java.io.*;
public class Lectura{
	public static void main (String[] args)  throws IOException {
		//InputStreamReader entrada = new InputStreamReader(System.in);
		//BufferedReader teclado=new BufferedReader (entrada);

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		String mensaje;
		System.out.println ("Ingrese una l�nea de texto:");
		mensaje= teclado.readLine();
		System.out.println ("Introducido: \"" + mensaje + "\"");
	}
}