/**
 * @(#)EmpleadoHoras.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas3;

class EmpleadoHoras extends Empleado{
	protected int horas;
	protected int salario,sueldo;
	
	public EmpleadoHoras(){
		super();
		salario=0;
		horas=0;
		sueldo=0;
	}
	public EmpleadoHoras(int hora, int salari0){
		horas=hora;
		salario=salari0;	
	}
	public int getHoras(){
		return horas;
	}
	public void ponHoras(int hora){
		horas=hora;
	}
	public int getSalario(){
		return salario;
	}
	public void ponSalario(int salari0){
		salario=salari0;
	}
	public int getSueldo(){
		return sueldo;
	}
	public void ponSueldo(int su){
		sueldo=su;
	}
	public EmpleadoHoras lee(){
		//Que es esto?
		super.lee();
		do{
		   System.out.print(" Ingrese las horas de trabajo: "); 
		  	horas=Leer.datoInt();
		}while(horas>15);  
		System.out.print(" Ingrese salario por hora: "); 
		salario=Leer.datoInt();	
		return new EmpleadoHoras(horas,salario);
	}
	public int hallarSueldo(){
		sueldo=horas*salario;
		return sueldo;
	}
	public String toString(){
		return super.toString()+";\n Horas de Trabajo: "+horas+"; \n Salario por hora: "+salario+";\n Sueldo :"+hallarSueldo(); 
	}
}