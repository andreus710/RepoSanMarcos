package proAlgoritmicaII.paqSemana10.excepcionesBas;

/**
 * @(#)Excepcion01.java
 *	    Operaciones basicas
 *
 *   Ejemplo que le permite controlar las excepciones.
 *
 * @author 
 * @version 1.00 2017/5/31
 */
public class Excepcion01 {
	public static void main (String args[]){
		int i = 0;
		String vectorS [] = {
			"Hola mundo	1",
			"Hola mundo 2",
			"Hola mundo 3"
		};
		while (i < 4 ) {
			System.out.println(vectorS[i]);
			i++; 
		}
	}
}