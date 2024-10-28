/**
 * @(#)GerenteDeVentas.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas2;

public class GerenteVentas extends Vendedor implements GerenteOp{  
	public String nom;
	
	public GerenteVentas() {
	}
	public String Nombre(){
		nom=nombre;
		return(nom);
	}
}
