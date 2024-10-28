/**
 * @(#)Leer.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */

package proAlgoritmicaII.paqSemana6.paqInterfases.ComponenteAuto;

import java.io.*;
public class Leer {

	public Leer() {
   }
	//Lee una cadena desde del teclado
  	public static String leerString(){
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);
		String string = "";
		// Obtiene cadena desde del teclado
		try{
			string = br.readLine();
		}
		catch (IOException ex){
			System.out.println(ex);
		}

   	return string;
	}

	//Lee un entero desde del teclado
	public static int leerInt(){
		return Integer.parseInt(leerString());
	}
  	public static float leerFloat(){
		return Float.parseFloat(leerString());
	}     
   public static double leerDouble(){
   	return Double.parseDouble(leerString());
  	}
	public static byte leerByte(){
   	return Byte.parseByte(leerString());
	}
  	public static short leerShort(){
   	return Short.parseShort(leerString());
  	}
}