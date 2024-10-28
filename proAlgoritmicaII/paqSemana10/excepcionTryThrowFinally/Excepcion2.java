package proAlgoritmicaII.paqSemana10.excepcionTryThrowFinally; /**
 * @(#)Excepcion2.java
 *
 *
 * @author :http://puntocomnoesunlenguaje.blogspot.pe/2014/04/java-excepciones.html
 * @version 1.00 2016/5/28
 */

import java.util.*;

public class Excepcion2 {

   public static void main(String a[]) {
   	Scanner jin=new Scanner(System.in);	
   	int i;
   	boolean flag=false;
   	int v[]={1,2,3,4};
   	do{
   		try{
   			flag=false;
   			System.out.print("Ingrese un entero entre [0 y "+v.length+"]: ");
   			i=jin.nextInt();
   			System.out.println("v["+i+"]= "+v[i]);
   		}
   		catch(InputMismatchException  e){
   			jin.nextInt();
   			i=0;
   			System.out.println("Ingrese un numero entero...");
   			flag=true;
   		}
   		catch(IndexOutOfBoundsException e){
   			System.out.println("Indice fuera de rango...!");
   			//System.out.println("Ingrese un entero entre [0 y "+v.length+"]");
   			flag=true;
   		}
   		catch(Exception e){
   			System.out.print("Error...!"+e.toString());
   			flag=true;
   		}
   	}while(flag);
   	
   } 
}