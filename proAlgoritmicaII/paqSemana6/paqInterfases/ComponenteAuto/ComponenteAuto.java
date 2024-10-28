/**
 * @(#)ComponenteAuto.java
 *
 *
 * @author
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.ComponenteAuto;

public class ComponenteAuto {
	public String descripcion;
	public double peso;
	public double coste;
  
	public ComponenteAuto() {
		descripcion = "";
 		this.peso = 0;
 		this.coste = 0;
  	}

	public ComponenteAuto(String desc, double peso, double coste) {
   	descripcion = desc;
   	this.peso = peso;
   	this.coste = coste;
  	}
  
	public String toString() {
   	return descripcion + " (" + peso + " gr., "+ coste + " eur)";
  	}
}