package proAlgoritmicaII.paqSemana10.progException;

import java.io.*;
class LecturaLinea {
	public static void main( String args[] ) throws IOException {
		int c;
		//char c;
		int contador = 0;
		// Mientras no sea el fin de l�nea
		while( (c = System.in.read() ) != '\n' ) {
			contador++;
			System.out.print( (char) c );
		}
		System.out.println(); // Salto de linea 
		System.err.println( "Contados "+ contador +" bytes en total." );
	}
}