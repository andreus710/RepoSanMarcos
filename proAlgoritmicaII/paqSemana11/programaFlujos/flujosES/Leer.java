package proAlgoritmicaII.paqSemana11.programaFlujos.flujosES; /**
 * @(#)Leer.java
 *
 *
 * @author 
 * @version 1.00 2011/11/5
 */


import java.io.*;
public class Leer {
	//entrada variable de clase asignada a entrada est�ndar
	//public static BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
	public static InputStreamReader teclado = new InputStreamReader(System.in);
	public static BufferedReader entrada=new BufferedReader (teclado);

	//Lee una cadena desde entrada estandar
	public static String leerString() {
		String cadena="";
		try {
			cadena = new String(entrada.readLine());
		}
		catch (IOException e) {
			System.out.println("Error de E/S"); 
		}
		return cadena; 
	}
	
	//Lee un entero desde entrada estandar
	public static int leerInt() {
		int entero = 0;
		boolean error = false;
		do {
			try {
				error = false;
				entero = Integer.valueOf(entrada.readLine()).intValue();
			}
			catch (NumberFormatException e1) {
				error = true;
				System.out.println("Error de formato del numero. Ingrese de nuevo.");
			}
			catch (IOException e) {
				System.out.println("Error de E/S");
			}
		}while (error);
		return entero;
	}
}