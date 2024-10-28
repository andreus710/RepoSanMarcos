/**
* nombreClase: TCirculo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia00;

public class TCirculo {
	 
	   public static void main( String a[] ){
			Punto punto;
			Circulo circulo1, circulo2;
			
			punto = new Punto( 10, 20 );
			
			System.out.println();
			circulo1 = new Circulo( 7, 2, 5.5 );
			
			System.out.println();
			circulo2 = new Circulo( 2, 7, 10.55 );
			// se marca para la recolector de basura. Para que?
			punto = null;   
			circulo1 = null;  
			circulo2 = null;  
			
			System.out.println();
			// llamada al garbage collector: recolector de basura
			System.gc();  	
	    } 	
	} 