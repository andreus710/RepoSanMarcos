/**
 * @(#)TLevel.java
 *		Anaalice las operaciones del enumerado enum
 *
 *
 * @author
 * @version 1.00 2024/9/18
 */

package proAlgoritmicaII.paqSemana6.paqLab06.enum00;

public class TLevel {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;

		switch(myVar) {
			case LOW:
				System.out.println("Low level");
				break;
			case MEDIUM:
				System.out.println("Medium level");
				break;
			case HIGH:
				System.out.println("High level");
				break;
		}
		menuLevel();
		System.out.println("Vector de elementos");
		myVar.mostrarNiveles();
	}

	public static void menuLevel(){
		int opc;
		Level level=Level.MEDIUM;
;
		System.out.println("\n\tMenu Level\n");
		System.out.println("0.SALIR");
		System.out.println("1.Low");
		System.out.println("2.Medium");
		System.out.println("3.High");
		System.out.print("\n\tDigite su opcion: ");
		opc=Leer.datoInt();
		switch(opc) {
			case 0:
				System.out.println("Fin...");
				break;
			case 1:
				level=Level.LOW;
				break;
			case 2:
				level=Level.MEDIUM;;
				break;
			case 3:
				level=Level.HIGH;;
				break;
		}
		System.out.println(level);
	}

}