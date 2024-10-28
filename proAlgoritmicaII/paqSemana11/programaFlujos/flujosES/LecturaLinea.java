package proAlgoritmicaII.paqSemana11.programaFlujos.flujosES; /**
 * @(#)LecturaLinea.java
 *
 *
 * @author 
 * @version 1.00 2011/11/4
 */


import java.io.*;
class LecturaLinea {
	public static void main( String args[] ) throws IOException {
		int c;
		int cbytes = 0;
		// se lee hasta encontrar fin de l�nea o ENTER
		System.out.println("Ingrese una secuencia de carateres");
		System.out.println("para terminar: ENTER");
		c=System.in.read();
		while(c  != '\n' ){
			cbytes=cbytes+1;
			System.out.print( (char) c );
			c = System.in.read();
		}
		System.out.println();
		System.err.println( "Son "+ cbytes +" bytes." );
	}
}