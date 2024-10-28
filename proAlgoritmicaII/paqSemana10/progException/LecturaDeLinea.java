package proAlgoritmicaII.paqSemana10.progException;

import java.io.*;

class LecturaDeLinea {
	//public static void main( String args[] ) throws IOException {
	public static void main( String args[] ) throws Exception {
		int c;
		int contador = 0;

		// Mientras no sea el fin de l�nea
		/*while((c = Int()) != '\n' ) { //error?
			contador++;
			//System.out.print( (char) c );
			System.out.print( c );
		}

		 */

		System.out.println(); // Salto de linea 
		System.err.println( "Contados "+ contador +" bytes en total." );
	}
}