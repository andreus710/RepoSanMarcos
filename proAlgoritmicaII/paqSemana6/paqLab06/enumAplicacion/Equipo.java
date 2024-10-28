/**
 * @(#)Equipo.java
 *		Operaciones basicas de la clase enum Java
 *	Atributos, se definen como privados
 *	constructores, deben ser privados
 *	getters y setters
 *	toString
 *
 *				TAREA
 *	1. Implemente un torneo
 *	2. Implemente la tabla de posiciones
 *	2. Implemente la operacion para ver rtesultados de un encuentro
 *	3. etc.
 *
 *	Implemente una aplicacion para torneo interfacultades.
 *
 * @author
 * @version 1.00 2024/9/18
 */
package proAlgoritmicaII.paqSemana6.paqLab06.enumAplicacion;

public enum Equipo{
	ALIANZA_LIMA("Club Alianza",3), UNIVERSITARIO("Club Universitario",2),
	SPORTING_CRISTAL("Club Sporting Cristal",1), MELGAR("FC Melgar",5);

	private String nombreClub;
	private int puestoLiga;

	private Equipo (String nombreClub, int puestoLiga){
		this.nombreClub = nombreClub;
		this.puestoLiga = puestoLiga;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public int getPuestoLiga() {
		return puestoLiga;
	}
	public String toString(){
		String cad="";
		cad=String.format("%-25s %5d",nombreClub, puestoLiga);
		return cad;
	}
}
