/**
 * @(#)GerenteDeVentas.java
 *
 *
 * @author 
 * @version 1.00 2011/10/17
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas1;

public class GerenteVentas extends Vendedor implements GerenteAux{
	public String nom;
   
   public GerenteVentas() {
   }
   public String Nombre(){
   	nom=nombre;
		return(nom);
	}
}
