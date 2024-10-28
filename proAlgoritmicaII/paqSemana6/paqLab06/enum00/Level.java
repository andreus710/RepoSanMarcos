/**
 * @(#)Level.java
 *		Clase enumerado enum
 *
 * @author
 * @version 1.00 2024/9/18
 */

package proAlgoritmicaII.paqSemana6.paqLab06.enum00;

public enum Level {
	LOW,
  	MEDIUM,
  	HIGH;

  	private Level(){
  	}

	public static void mostrarNiveles(){
		for (Level nivel : Level.values()) {
			System.out.println(nivel);
		}
	}

}