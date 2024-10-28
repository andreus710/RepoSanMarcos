package proAlgoritmicaII.paqSemana10.excepcionTryThrowFinally; /**
 * @(#)DThrow2.java
 *		Uso de throw. Cuando ocurre un error el programa no termina
 *		pide nuevamente ingtresar los datos. ...?
 *			TAREA
 *	1. Analice, compile y ejecute.
 *	2.	Esta disenado en un bucle infinito, que debe hacer para que
 *		termine cuando el usuario desee?.
 * 3.	Pruebe el programa de tal forma de probar todos y cada de los catch.
 * 4.	Que hace toString(). Que diferencia hay getMessage(), printStackTrace, 
 *		getStackTrace.
 *
 *
 * @author :http://www.academia.edu/8949759/Java_Cap4-Excepciones_Muy_completo
 * @version 1.00 2016/5/29
 */

import java.io.*;

public class CThrow2 {

   public static void main(String ar[]) {
   	double nume,deno,rpta;
   	InputStreamReader isr=new InputStreamReader(System.in);
   	BufferedReader jin=new BufferedReader (isr);
   	//bucle infinito
   	while(true){
   		try { 
   			System.out.println("\n*** Nueva Divisi�n ***"); 
   			System.out.print("\nNumerador: "); 
   			nume=Double.parseDouble(jin.readLine()); 
   			System.out.print("\nDenominador: ");
				deno=Double.parseDouble(jin.readLine());
				if(deno==0){
					throw new ArithmeticException(); 
				}
				rpta=nume/deno; 
				System.out.println("\nResultado: "+Double.toString(rpta)); 
			} 
			catch(ArithmeticException ae){ 
				System.out.println("\nError aritm�tico: "+ae.toString()); 
					
				StackTraceElement stck[]=ae.getStackTrace();
				System.out.println("Mensaje     : "+ae.getMessage());
				System.out.println("NombreFile  : "+stck[stck.length-1].getFileName());
				System.out.println("Linea numero: "+stck[stck.length-1].getLineNumber());
				System.out.println("NombreMetodo: "+stck[stck.length-1].getMethodName());
			} 
			catch(NumberFormatException nfe){ 
				System.out.println("\nError de formato num�rico: "+nfe.toString());
			}
			catch(IOException ioe){
				System.out.println( "\nError de entrada/salida: "+ioe.toString() ); 
			} 
			catch(Exception e){ 
				// Captura cualquier otra excepci�n 
				System.out.println( e.toString());				
   		}
   	}
	}
}