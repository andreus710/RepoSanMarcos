/**
 * @(#)AutoEconomico.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Auto;

public class AutoEconomico extends Auto {
  
	public AutoEconomico(String conductor, String tipo, String color, Punto posicion) {
   	super(conductor, tipo, color, posicion);
	}
  
	public void avanza(){
   	Punto p = getPosicion();
   	if(Math.random() >= 0.5) 
   		p.desplaza(20, 0);
		else 
			p.desplaza(25, 0);
		setPosicion(p);
   }
}
