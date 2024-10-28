/**
* nombreClase: Leer.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqMatricula;

import java.io.*;
public class Leer {
	
	public Leer() {
	}
	public static String dato(){
		String sdato="";
		try{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader flujoE=new BufferedReader(isr);
			sdato=flujoE.readLine();
		}
		catch(IOException e){
			System.err.println("Error:"+ e.getMessage());
		}
		return sdato;
	}
	public static int datoIntMenu(){
		try{
			return Integer.valueOf(dato());
		}
		catch(NumberFormatException e){
			return -1;
		}
	}	
}
