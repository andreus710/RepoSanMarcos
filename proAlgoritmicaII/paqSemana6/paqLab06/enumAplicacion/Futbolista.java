/**
 * @(#)Futbolista.java
 *
 *
 * @author
 * @version 1.00 2024/9/18
 */
package proAlgoritmicaII.paqSemana6.paqLab06.enumAplicacion;

public class Futbolista {
	private int dorsal;
	private String nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista() {
	}
	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion,
			Equipo equipo) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public void viajar() {
		System.out.println("Viajo");
	}

	public void concentrarse() {
		System.out.println("Me Concentro");
	}

	public void jugarPartido() {
		System.out.println("Juego Partido");
	}

	@Override
	public String toString(){
		String cad="";
		cad=String.format("%4d %-12s %-15s %-25s",dorsal,nombre,demarcacion,equipo);
		return cad;

	}

}
