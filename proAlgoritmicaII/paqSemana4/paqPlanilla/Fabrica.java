/**
* nombreClase: Fabrica.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqPlanilla;

import java.util.*;

//Ejemplo de COMPOSICION
//Una fabrica está compuesta de empleados(arreglo de)

public class Fabrica {
	//datos de la fabrica
	private Empleado empleados[]; //la fabrica "TIENE" empleados
	private int nEmp; // # de empleados
	
	public Fabrica(int d){
		empleados = new Empleado[d];
		nEmp=d;
	}
	
	public Fabrica(){ 
		//constructor por default
		this(5);
	}
	public void setNEmp(int n){
		nEmp=n;
	}
	public int getNEmp(){
		return empleados.length;
	}
	
	public void leerDatos(int limite){
		String n;
		double s;
		Scanner in = new Scanner(System.in);
		System.out.println("Empleado ["+(limite+1)+"]: ");
		System.out.print("Nombre ---> ");
		n = in.nextLine();
		System.out.print("Sueldo ---> ");
		s = in.nextDouble();
		empleados[limite]= new Empleado(n, s);
	}

	public void mostrarEmp(int limite){  
		encabezado1();
		if(limite>0){
			for(int i=0;i<limite;i++){
				System.out.println((i+1)+"\t"+empleados[i].getNombre()+"\t\t"+empleados[i].getSueldo());
			}
			raya1();
		}
		else{
			System.out.println("No Hay Registros Disponibles!...\n");  			
		}
	}

	public void totalSueldo(int limite){  
		encabezado1();
		double tSueldo=0;
		if(limite>0){
			for(int i=0;i<limite;i++){
				System.out.println((i+1)+"\t"+empleados[i].getNombre()+"\t\t\t\t"+empleados[i].getSueldo());
				tSueldo=tSueldo+empleados[i].getSueldo();
 		}
			raya1();
 		System.out.println("Nomina total a Pagar:"+tSueldo+"");
			raya1();
		}
		else{
			System.out.println("No Hay Registros Disponibles!...\n");
		}
	}
	
	public void encabezado1(){
		System.out.println("\t\tPLANILLA DE SUELDOS \n");
		System.out.println("========================================");
		System.out.println("No.\t APELLIDOS, Nombres\t\t\tSueldo");
		System.out.println("----------------------------------------");		
	}
	
	public void raya1(){
		System.out.println("----------------------------------------");		 		
	}
} 
