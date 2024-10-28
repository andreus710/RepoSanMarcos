/**
 * @(#)Gerente.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas3;

public class Gerente extends Empleado {
	protected double salario_sem;
	
	public Gerente() {
		super();
		salario_sem=0.0;
	}
	public Gerente(double salario1){
		salario_sem=salario1;
	}	
	public double getSalario_sem(){
		return salario_sem;
	}
	public void ponSalario_sem(double salario1){
		salario_sem=salario1;
	}	  
	public Gerente lee(){
		super.lee();
		System.out.print(" Ingrese salario semanal: "); 
		salario_sem=Leer.datoDouble();	
		return new Gerente(salario_sem);
	}
	public String toString(){
		return super.toString()+"; \n Salario Semanal: "+salario_sem;
	}	
}