/**
 * @(#)Taxi.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Auto;

class Taxi extends Auto{
	private int plazas;
  
	public Taxi(String conductor, String tipo, Punto posicion, int plazas) {
   	super(conductor, tipo,"blanco", posicion);
   	this.plazas = plazas;
  	}
  	public void avanza(){
   	Punto p = getPosicion();
    	if(Math.random() < 0.33) 
    		p.desplaza(15, 0);
    	else 
    		p.desplaza(35, 0);
    	setPosicion(p);
  	}
	public String toString(){
  		return super.toString() + "\nPlazas: " + plazas;
  	}
}
