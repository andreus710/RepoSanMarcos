package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo0;

/**
 * @(#)ValorNoValido.java
 *
 *
 * @author 
 * @version 1.00 2017/5/31
 */


 public class ValorNoValido extends Exception{
	public ValorNoValido(){ }

	public ValorNoValido(String cadena){
		//Llama al constructor de Exception
		super(cadena); 
	}
}