/**
 * @(#)PruebaInterfaz.java
 *
 *
 * @author 
 * @version 1.00 2011/5/27
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas3;

public class TGerenteVentas{
	
	public static void main(String []args){
		
		GerenteVentas GV=new GerenteVentas();
		EmpleadoHoras EH=new EmpleadoHoras();
		Gerente G=new Gerente();
		Empleado E=new Empleado();
		
		System.out.println("\n\t...Empleado a Horas...");
		System.out.println("\t======================");  
		  
		EH.lee();
		System.out.println(" Datos: \n"+EH.toString());
		
		System.out.println("\n\t...Gerente...");
		System.out.println("\t=============");   
		G.lee();
		System.out.println(" Datos: \n"+G.toString());
		
		System.out.println("\n\t...Gerente Ventas...");
		System.out.println("\t====================");     
		GV.lee();
		System.out.println(" Datos: \n"+GV.toString());
		
		System.out.println("\n\n");
		
	}
}