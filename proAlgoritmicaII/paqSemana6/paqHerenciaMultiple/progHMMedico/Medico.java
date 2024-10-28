
/*
 * Nombre Medico.java
 *	Detalle: Esta clase hereda de Odontologo e implementa las interfaces
 *				PuedeCurar, PuedeConsultar, PuedeRecetar e implementa los metodos
 *				de dichas interfaces
 *			
 *		- 	Cuando una clase hace uso de INTERFACE utiliza implements ademas debe
 *			implementar todos los metodos definidos en la interface
 *
 *		� Podemos HEREDAR una clase que implementado una INTEFACE ?
 *
 *	Autor:
 *
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMMedico;

import java.util.*;



class Medico extends Odontologo implements PuedeCurar, PuedeConsultar, PuedeRecetar{
	public void curar(){
		System.out.println("Medico.curar()");
	}
	public void consultar(){
		System.out.println("Medico.consultar()");
	}
	public void recetar(){
		System.out.println("Medico.recetar()");
	}
}