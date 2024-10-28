/**
* nombreClase: TFabrica.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqPlanilla;

import java.util.*;

class TFabrica{
	public static void main(String[] args){	
		int op=0,ctdor=0;
		Fabrica fab = new Fabrica(10);
		do{ 
			//Variable que captura desde teclado
			Scanner in=new Scanner(System.in);
			System.out.println("SUELDOS\n");
			System.out.println("1. Registrar Empleado\n2. Mostrar Listado\n3. Monto de Planilla\n4. Eliminar Ultimo Registro\n5. Salir\n\n");
			System.out.print("Su opcion ---> ");
			op=in.nextInt();
			switch(op){
   			case 1:	
   				fab.leerDatos(ctdor++);   	  			
   				break;
   			case 2:	
   				fab.mostrarEmp(ctdor);
   				break;
   			case 3:	
   				fab.totalSueldo(ctdor);
   				break;   	  			
   			case 4:	
   				ctdor=ctdor-1;
   				fab.setNEmp(ctdor);
   	        	System.out.println("\nRegistro Eliminado!...\n");
   				break;   	  			   				
   			case 5:	System.exit(0);
   				break;  
   		}
		}while(op!=5);
 	}
}