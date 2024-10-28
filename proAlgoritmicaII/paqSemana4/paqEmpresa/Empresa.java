/**
* nombreClase: Empresa.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqEmpresa;

public class Empresa {
	private String nomEmp;
	private String direccion;
	Cliente c[];
	Credito cre[];
	
	public Empresa(){
	}
	public void ingresarEmpresa(){
		System.out.print("Ingrese nombre    ---> ");
		nomEmp=Leer.dato();
		System.out.print("ingrese direccion ---> ");
		direccion=Leer.dato();
	}
	public void mostrarEmpresa(){
		System.out.println("Nombre   : "+nomEmp);
		System.out.println("Direccion: "+direccion);
	}
	public void ingresarCliente(){
		String cod,nom;
		double s;
		Cliente c[]=new Cliente[3];
		Cliente cl=new Cliente();
		for(int i=0;i<3;i++){
			System.out.print("Codigo  cliente "+(i+1)+": ");
			cod=Leer.dato();
			cl.setCodigo(cod);
			System.out.print("Nombre  cliente "+(i+1)+": ");
			nom=Leer.dato();
			cl.setNombre(nom);
			System.out.print("Sueldo cliente  "+(i+1)+": ");
			s=Leer.datoDouble();
			cl.setSueldo(s);
			c[i]=cl;
		}
	}
	public void ingresarCredito(){
		String nom,nu;
		double im;
		Credito cre[]=new Credito[3];
		Credito cr=new Credito();
		for(int i=0;i<3;i++){
			System.out.print("Tipo    de credito "+(i+1)+": ");
			nom=Leer.dato();
			cr.setNombre(nom);
			System.out.print("Tarjeta de credito "+(i+1)+": ");
			nu=Leer.dato();
			cr.setNumtarjeta(nu);
			System.out.print("Importe de credito "+(i+1)+": ");
			im=Leer.datoDouble();
			cr.setImporte(im);
			cre[i]=cr;
	  }
	}
	public void mostrarCliente(){
		for(int i=0;i<3;i++){
			System.out.println("Nombre del Cliente  "+(i+1)+" es: "+c[i].getNombre()) ;
			System.out.println("Sueldo del Cliente  "+(i+1)+" es: "+c[i].getSueldo());
			System.out.println("Tipo de    credito  "+(i+1)+" es: "+cre[i].getNombre());
			System.out.println("Tarjeta de credito  "+(i+1)+" es: "+cre[i].getNumtarjeta());
			System.out.println("Importe del credito "+(i+1)+" es: "+cre[i].getImporte());
		}
   }
	public int menu(){
		int op;
		System.out.println("\tOPERACIONES EMPRESA\n");
		System.out.println("0. TERMINAR");
		System.out.println("1. Ingresar empresa");
		System.out.println("2. Mostrar empresa");
		System.out.println("3. Ingresar cliente");
		System.out.println("4. Ingresar credito");
		System.out.println("5. Mostrar cliente");
		System.out.print(" Ingrese su opcion ---> ");
		op=Leer.datoInt();
		System.out.println();
		return op;
	}
}
