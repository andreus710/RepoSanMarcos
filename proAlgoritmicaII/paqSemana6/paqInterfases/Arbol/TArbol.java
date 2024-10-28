/**
 * @(#)TArbol.java
 *
 *
 * @author 
 * @version 1.00 2009/9/27
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Arbol;

import java.io.*;
public class TArbol {
   public TArbol() {
   }
	public static void main( String args[] ) throws IOException{ 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Arbol arbol = new Arbol();

		int valor;
		System.out.println();
		System.out.print( "Insertando los siguientes valores: " );

		for ( int i = 1; i <= 10; i++ ){ 
			valor = ( int ) ( Math.random() * 100 );
			System.out.print( valor + " " );
			arbol.insertarNodo( valor );
		}
		System.out.print( "\n\nRecorrido PREorden................: " ); arbol.Preorden();
		System.out.print( "\n\nRecorrido INorden....................: " ); arbol.Inorden();

		System.out.println(0); System.out.print("Digite Enter para Salir: ");
		double opcion=Double.valueOf(in.readLine().trim()).doubleValue();
	}
}
