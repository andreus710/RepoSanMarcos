/**
 * @(#)GerenteVentas.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas3;

class GerenteVentas extends Gerente implements Vendedor{
	protected double comision, ventas, sueldot;

	public GerenteVentas(){
		super();
		comision=0.0;
		ventas=0.0;
	}
	public GerenteVentas(double com,double ven){
		comision=com;
		ventas=ven;
	}
	public double getComision(){
		return comision;
	}
	public void ponComision(double com){
		comision=com;
	}
	public double getVentas(){
		return ventas;
	}
	public void ponVentas(double ven){
		ventas=ven;
	}
	public GerenteVentas lee(){
		super.lee();
		System.out.print(" Ingrese el importe de las ventas: "); 
		ventas=Leer.datoDouble();
		return new GerenteVentas(comision,ventas);
	}
	public double hallarComision(){
		comision=ventas*(0.15);
		return comision;
		//System.out.printn(" La comision por las ventas es: "+comision);
	}
	public double Sueldo(){
		sueldot=comision+salario_sem;
		return sueldot;
	}
	public String toString(){
		return super.toString() +"; \n comision: " + hallarComision()+"; \n Sueldo: "+ Sueldo();
	}
} 