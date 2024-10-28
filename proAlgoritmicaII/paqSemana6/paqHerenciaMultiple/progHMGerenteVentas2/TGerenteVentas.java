/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas2;

public class TGerenteVentas {
	public static void main(String args[]){	
		EmpleadoHoras emp= new EmpleadoHoras("Juan Marco PORTESA");
		System.out.println(emp.getNombre());
		
		Gerente ger= new Gerente("Alberto FUGIMITO");
		System.out.println(ger.getNombre());
		
		GerenteVentas gven = new GerenteVentas();
		System.out.println(gven.Nombre());
		
		Vendedor ven= new Vendedor("Ana Helena GINO");
		System.out.println(ven.getNombre());          
	}    
}
