/**
 * @(#)TEquipo.java
 *			TAREA
 *	Analice el testeo de las operaciones
 *	Como y porque se imprrimen los datos como se muestran en la salida.
 *
 *	Que otras operaciones puede realizar
 *
 * @author
 * @version 1.00 2024/9/18
 */
package proAlgoritmicaII.paqSemana6.paqLab06.enumAplicacion;

public class TEquipo {

	public static void main(String args[]) {

		Demarcacion delantero = Demarcacion.DELANTERO;
		Demarcacion defensa = Demarcacion.DEFENSA;

		System.out.println("\nDevuelve un String con el nombre de la constante");
		System.out.println("delantero.name()= "+delantero.name());
		System.out.println("defensa.toString()= "+defensa.toString());

		System.out.println("\nDevuelve un entero con la posicion de la constante segun esta declarada.");
		System.out.println("delantero.ordinal()= "+delantero.ordinal());

		System.out.print("\nCompara el enum con el parametro segun el orden en el que esan declaradas las constantes.");
		System.out.println("delantero.compareTo(defensa)= "+delantero.compareTo(defensa));
		System.out.println("delantero.compareTo(delantero)= "+delantero.compareTo(delantero));

		System.out.print("\nRecorre todas las constantes de la enumeracion");
		for(Demarcacion d: Demarcacion.values()){
			System.out.print(d.toString()+" - ");
		}

		System.out.println();

		System.out.println("\nInstanciamos el enumerado");
		Equipo alima = Equipo.ALIANZA_LIMA;

		System.out.println("\nDevuelve un String con el nombre de la constante");
		System.out.println("alima.name()= "+alima.name());

		System.out.println("\nDevuelve el contenido de los atributos");
		System.out.println("alima.getNombreClub()= "+alima.getNombreClub());
		System.out.println("alima.getPuestoLiga()= "+alima.getPuestoLiga());
		System.out.println("\nInstanciacion de objetos Futbolista");
		Futbolista gallese = new Futbolista("Gallese", 1, Demarcacion.PORTERO, Equipo.MELGAR);
		Futbolista zambrano = new Futbolista("Zambrano", 11, Demarcacion.DEFENSA, Equipo.ALIANZA_LIMA);
		Futbolista paolo = new Futbolista("Paolo", 6, Demarcacion.MEDIOCAMPISTA, Equipo.ALIANZA_LIMA);
		Futbolista gianluca = new Futbolista("Gianluca", 22, Demarcacion.DELANTERO, Equipo.SPORTING_CRISTAL);

		System.out.println(gallese.toString());
		System.out.println(zambrano.toString());
		System.out.println(paolo.toString());
		System.out.println(gianluca.toString());
	}

}
