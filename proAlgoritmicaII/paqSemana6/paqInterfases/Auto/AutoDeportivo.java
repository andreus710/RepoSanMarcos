/**
 * @(#)AutoDeportivo.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Auto;

public class AutoDeportivo extends Auto {
	public AutoDeportivo(String conductor, String tipo, String color) {
   	super(conductor, tipo, color, new Punto(0, 200));
	}  
  
	public void avanza() {
   	Punto p = getPosicion();
   	if(Math.random() >= 0.7) 
   		p.desplaza(50, 0);
    	else 
    		p.desplaza(30, 0);
    	setPosicion(p);
 	}
}