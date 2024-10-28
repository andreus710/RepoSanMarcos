package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo4;

/**
 * @(#)Persona.java
 *			EXCEPCIONES
 *
 *		Analice el programa, 
 *		�Que puede decir con respecto a la formalidad del codigo?
 *	1. Formalice la clase agregando ademas los atributos edad, dni, 
 *	   y un vector de Persona, cuyas operaciones minimas deben 
 *    ser lee y mostrar.
 *	2. Implementar al menos 3 excepciones personalizadas.
 * 3. Crear la clase TPersona con un menu de opciones.
 *
 *
 * @author  GASA
 * @version 1.00 2019/10/20
 */

public class Persona{
	
	public Persona(String nombre, String apellidos) throws Exception{
		if(nombre == null || apellidos == null){
			throw new Exception("Argumentos no validos");
			//si el constructor lanza la excepci�n el objeto no se crea
		}
	}
	public static void main(String args[]) {
		try{
			Persona per = new Persona("Juan", "Soto");
			//Persona per = new Persona(null, "hola");
		}
		catch (Exception e){
			System.out.println("Excepcion: "+ e.getMessage());
		}
	}
}