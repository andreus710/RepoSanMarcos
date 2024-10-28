/**
* nombreClase: Circulo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia00;

public class Circulo extends Punto {
	private Punto p;
   private double radio; 

   // constructor por defecto
   public Circulo(){
       //llamada implícita al constructor de Punto
       System.out.println( "Constructor sin argumentos de Circulo: " + this );
   } 
  
	// constructor sobrecargado
	public Circulo( int valorX, int valorY, double valorRadio ){
		super( valorX, valorY );  // llamada al constructor de Punto
		setRadio( valorRadio );
		
		System.out.println( "Constructor de Circulo: " + this );
	} 
	
	// finalizador
	protected void finalize(){
		System.out.println( "Finalizador de Circulo: " + this );	
		super.finalize();  // llamada al método finalize de la superclase
	}
	
	// establecer el radio
	public void setRadio( double valorRadio ){
		// cosistencia de radio >0.0
		radio=( valorRadio < 0.0 ? 0.0 : valorRadio );
	} 
	
	// devolver el radio
	public double getRadio(){
		return radio;
	} 
	
	// calcular y obtener diámetro
	public double getDiametro(){
		return 2 * getRadio();
	} 
	
	// calcular y obtener la circunferencia
	public double getCircunferencia(){
		return Math.PI * getDiametro();
	} 
	
	// calcular y obtener el área
	public double getArea(){
		return Math.PI * getRadio() * getRadio();
	} 
	
	// obtener representación String del objeto Circulo
	public String toString(){
		return "Centro = " + super.toString() + "; Radio = " + getRadio();
	} 
	
} 
