/**
* nombreClase: TLeer1.java
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
public class TLeer1 {


   public static void main(String[] args) {
   		String datoCad;
   		byte datoByte=0;
		short datoShort=0;
		int datoInt=0;
		long datoLong=0;
		float datoFloat=0;
		double datoDouble=0;

		System.out.print("Ingrese una cadena : ");
		datoCad=Leer.dato();

		System.out.print("Ingrese dato Byte  : ");
		datoByte=Leer.dByte();
		/*
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
		*/
		System.out.println(datoCad);
		System.out.println(datoByte);
		/*
		System.out.println(datoInt);
		System.out.println(datoLong);
		System.out.println(datoFloat);
		System.out.println(datoDouble);
		*/
   }
}
