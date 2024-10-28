package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo3;

/**
 * @(#)ValorNoValido.java
 *
 *
 * @author 
 * @version 1.00 2019/10/20
 */


public class MiExcepcion extends Exception{
     
   private int codigoError;
     
   public MiExcepcion(int codError){
   	super();
      this.codigoError=codError;
   }
	public String getMessage(){
		String mensaje="";
		switch(codigoError){
			case 111:
				mensaje="Error, el numero esta entre 0 y 10";
				break;
			case 222:
				mensaje="Error, el numero esta entre 11 y 20";
				break;
			case 333:
				mensaje="Error, el numero esta entre 21 y 30";
				break;
		}	
		return mensaje;
	}   
}