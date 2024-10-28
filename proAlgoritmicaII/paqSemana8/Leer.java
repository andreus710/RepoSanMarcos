/**
* nombreClase: Leer.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;


import java.util.*;
import java.io.*;

public class Leer {

	public static String dato(){
		String sdato=" ";
		try{
			//Definir un flujo de caracteres de entrada: flujoE
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader flujoE=new BufferedReader(isr);
			//Leer.la entrada finaliza al pulsar la tecla entrar
			sdato = flujoE.readLine();
		}
		catch(IOException e){
			System.err.println("error: "+e.getMessage());
		}
		return sdato;//devolver el dato tecleado
	}

	public static byte dByte(){
		try{
			return Byte.parseByte(dato());
		}
		catch(NumberFormatException e){
			return Byte.MIN_VALUE;//valor mas pequeNo
		}
	}

	public static short dShort(){
		try{
			return Short.parseShort(dato());
		}
		catch(NumberFormatException e){
			return Short.MIN_VALUE;//valor mas pequeNo
		}
	}

	public static int dInt(){
		try{
			return Integer.parseInt(dato());
		}
		catch(NumberFormatException e){
			return Integer.MIN_VALUE;//valor mas pequeNo
		}
	}

	public static long dLong(){
		try{
			return Long.parseLong(dato());
		}
		catch(NumberFormatException e){
			return Long.MIN_VALUE;//valor mas pequeNo
		}
	}

	public static float dFloat(){
		try{
			Float f=new Float(dato());
			return f.floatValue();
		}
		catch(NumberFormatException e){
			return Float.NaN;//no es un numero: valor double
		}
	}

	public static double dDouble(){
		try{
			Double d=new Double(dato());
			return d.doubleValue();
		}
		catch(NumberFormatException e){
			return Double.NaN;//no es un numero: valor double
		}
	}
}
