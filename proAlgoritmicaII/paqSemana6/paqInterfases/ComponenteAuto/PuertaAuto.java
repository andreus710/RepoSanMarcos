/**
 * @(#)PuertaAuto.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.ComponenteAuto;

class PuertaAuto extends ComponenteAuto implements PuertaBloqueable, Alarma {
	// Debemos implementar todos los metodos de las interfaces

  	private boolean bloqueada = false;
  	private boolean activadaAlarma = false;
  	private boolean abierta = false;

  	// M�todos de la interfaz Alarma:

	public boolean alarmaActivada() {
   	return activadaAlarma;   
  	}
  
	public void activarAlarma() {
   	activadaAlarma = true; 
  	}
  
	public void desactivarAlarma() {
   	activadaAlarma  = false;
  	}
   
 	// M�todos de la interfaz Puerta:

  	public void abrir() {
   	if(abierta)
      	System.out.println("Ya estaba abierta!!!");
    	if(activadaAlarma)
      	System.out.println("Suena la alarma!!!");
    	else 
    		if(bloqueada)
      		System.out.println("Est� bloqueada!!!"); 
    		else {
      		System.out.println("La puerta se ha abierto.");
      		abierta = true;
    		}
  	}

  	public void cerrar() {
   	if(abierta)
      	System.out.println("La puerta se ha cerrado.");
    	else
      	System.out.println("Ya estaba cerrada!!!");
  	}

	// M�todos de la interfaz PuertaBloqueable:

	public void bloquea() {
   	bloqueada = true;   
	}
  
	public void desbloquea() {
   	bloqueada = false;
	}
}
