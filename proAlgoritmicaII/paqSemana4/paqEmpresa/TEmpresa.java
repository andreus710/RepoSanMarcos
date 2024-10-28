/**
* nombreClase: TEmpresa.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqEmpresa;

public class TEmpresa {
	public static void main(String args[]){
		boolean op=true;
		Empresa e1=new Empresa();
		do{
			switch(e1.menu()){
				case 0: 
					System.exit(1);     
				case 1: 
					e1.ingresarEmpresa();
					break;
				case 2:
					e1.mostrarEmpresa();
					break;
				case 3:
					e1.ingresarCliente();
					break;
				case 4:
					e1.ingresarCredito();
					break;
				case 5:
					e1.mostrarCliente();
					break;
				default: 
					System.out.println("opcion incorrecta");			
			}
		}while(op);
	}
}
