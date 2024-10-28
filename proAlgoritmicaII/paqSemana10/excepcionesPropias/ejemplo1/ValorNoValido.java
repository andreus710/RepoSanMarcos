package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo1;

/**
 * @(#)ValorNoValido.java
 *
 *
 * @author 
 * @version 1.00 2019/10/20
 */


public class ValorNoValido extends Exception {

   public ValorNoValido() {
   }
   
 	public ValorNoValido(String cadena){
   	super(cadena); //Llama al constructor de Exception y le pasa el contenido de cadena
   }     
}