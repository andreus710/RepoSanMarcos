// Fig. 10.4: Empleado.java
// La superclase abstracta Empleado.
package proAlgoritmicaII.paqSemana7;



public abstract class Empleado {
	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;
	
	// constructor con tres argumentos
	public Empleado(){
	}
	public Empleado( String nombre, String apellido, String nss ){
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	}
	
	// establece el primer nombre
	public void establecerPrimerNombre( String nombre ){
		primerNombre = nombre;
	}
	
	// devuelve el primer nombre
	public String obtenerPrimerNombre(){
		return primerNombre;
	} // fin del m�todo obtenerPrimerNombre
	
	// establece el apellido paterno
	public void establecerApellidoPaterno( String apellido ){
		apellidoPaterno = apellido;
	}
	
	// devuelve el apellido paterno
	public String obtenerApellidoPaterno(){
		return apellidoPaterno;
	}
	
	// establece el n�mero de seguro social
	public void establecerNumeroSeguroSocial( String nss ){
		numeroSeguroSocial = nss; // debe validar
	}
	
	// devuelve el n�mero de seguro social
	public String obtenerNumeroSeguroSocial(){
		return numeroSeguroSocial;
	}
	// devuelve representaci�n String de un objeto Empleado
	public String toString(){
		return String.format( "%s %s\nnumero de seguro social: %s", 
		obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial() );
	} 
	
	// m�todo abstracto sobrescrito por las subclases
	public abstract double ingresos(); // aqu� no hay implementaci�n
} 


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/