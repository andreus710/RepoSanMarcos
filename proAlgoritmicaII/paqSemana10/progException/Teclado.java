package proAlgoritmicaII.paqSemana10.progException;

import java.io.*;
public class Teclado {
	public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
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
				System.out.println("Error en el formato del numero, intentelo de nuevo.");
			}
			catch (IOException e) {
				System.out.println("Error de E/S");
			}
		} while (error);
		return entero;
	}
} // final de la clase Teclado