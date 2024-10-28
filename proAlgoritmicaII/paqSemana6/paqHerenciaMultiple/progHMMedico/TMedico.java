
/*
 * Nombre TMedico.java
 *	Detalle: En esta clase se tiene el programa principal
 *			
 *		-	Se crea instancia de la clase Medico
 *		-	A travez de dicha referencia son invocados o llamados los diversos metodos 
 *			implenmentados en esta clase.
 *		- 	Analice su funcionamiento y aplique
 *
 *
 *	Autor:
 *
 */

package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMMedico;

import java.util.*;
public class TMedico{
	static void cu(PuedeCurar m){
		m.curar();
	}
	static void co(PuedeConsultar m){
		m.consultar();
	}
	static void re(PuedeRecetar m){
		m.recetar();
	}
	static void od(Odontologo m){
		m.extraerDiente();
	}
	
	public static void main(String Ar[]){
		Medico med = new Medico();
		cu(med);
		co(med);
		re(med);
		od(med);
	}	
}