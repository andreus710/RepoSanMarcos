/**
* nombreClase: TLeer.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqAlumno;

import java.util.*;
import java.io.*;
public class TLeer {
        
  
   public static void main(String[] args) {
		short datoShort=0;    	
		int datoInt=0;    	
		long datoLong=0;    	
		float datoFloat=0;    	
		double datoDouble=0;    
			
		System.out.print("Ingrese dato Short : ");
		datoShort=Leer.dShort();	
		System.out.print("Ingrese dato Int   : ");
		datoInt=Leer.dInt();	
		System.out.print("Ingrese dato Long  : ");
		datoLong=Leer.dLong();	
		System.out.print("Ingrese dato Float : ");
		datoFloat=Leer.dFloat();	
		System.out.print("Ingrese dato Double: ");
		datoDouble=Leer.dDouble();	
			
		System.out.println(datoShort);
		System.out.println(datoInt);
		System.out.println(datoLong);
		System.out.println(datoFloat);
		System.out.println(datoDouble);				
   }
}
