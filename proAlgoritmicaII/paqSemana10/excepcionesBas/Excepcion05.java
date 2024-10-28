package proAlgoritmicaII.paqSemana10.excepcionesBas; /**
 * @(#)Excepcion05.java
 *	    Operaciones basicas
 *
 *   Ejemplo que le permite controlar las excepciones.
 *
 * @author 
 * @version 1.00 2017/5/31
 */

import java.util.*;
public class  Excepcion05 {
	
	public static void main(String ar[]) {
		Scanner jin = new Scanner(System.in);
		int v[] = {4,2,5,9};
		int n;
		boolean esok = false;
		do{
			try{
				esok = false;
				System.out.print("Ingrese un n�mero entero [ > 0 y < " + v.length + "]: ");
				n = jin.nextInt();
				System.out.println("Valor en la posici�n v[" + n + "]= " + v[n]);
			}
			//Cuando no es un numero
			catch(InputMismatchException e){
				jin.nextLine();
				n = 0;
				System.out.println("Debe introducir un n�mero entero ");
				esok = true;
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("Debe ingresar un n�mero entero [ > 0 y < " + v.length + "] ");
				esok = true;
			}
			catch(Exception e){ //otras excepciones
				System.out.println("Error inesperado " + e.toString());
				esok = true;
			}
		}while(esok);
	}
}