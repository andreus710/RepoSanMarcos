/**
* nombreClase: VectorAlumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 02-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana3.paqAlumnoTarea;

import java.util.Scanner;

public class VectorAlumno {
	private Alumno x[];

	public VectorAlumno() {
		x=new Alumno[0];
		//System.out.println("dimx: "+x.length);
	}
	public VectorAlumno(Alumno va[]){
		x=va;
	}

	public Alumno leerAlumno(){
		int codigo;
		String nombre;
		float nota;
		Alumno a=new Alumno();

		//Se captura los datos de alumno
		System.out.print("Codigo ---> ");
		codigo=Leer.datoInt();
		a.setCod(codigo);

		System.out.print("Nombre ---> ");
		nombre=Leer.dato();
		a.setNom(nombre);

		System.out.print("Nota   ---> ");
		nota=Leer.datoFloat();
		a.setNota(nota);
		return a;
	}

	public void agregarAlumno(){
		int i;
		//Se captura la dimencion del vector
		i=x.length;
		Alumno a;
		redimensionar1();
		a=leerAlumno();

		x[i]=a;
	}

	public Alumno[] leerVector(){
		int i,n;
		Alumno a;
		System.out.print("Numero alumnos del vector ---> ");
		n=Leer.datoInt();
		Alumno v[]=new Alumno[n];

		for(i=0;i<n;i=i+1){
			System.out.println("Alumno "+(i+1)+": ");
			a=leerAlumno();
			v[i]=a;
		}
		return v;
	}

	public void insertarxPos(Alumno dato, int posi){
		//Inserta dato en laposicion pos del vector x
		//PRE: x={} o x={v1,v2, ...vn} y dato pertenece Z
		//POS:
		int i;
		redimensionar1();
		i=x.length-1;
		if(posi >=0 && posi<x.length){
			while(i>posi){
				x[i] = x[i-1];
				i = i-1;
			}
			x[posi] = dato;
		}
		else{
			System.out.println("Dimension o Posicion fuera de Rango");
		}
	}

	private void redimensionar1() {
		int n=x.length;
		n=n+1;
		Alumno y[]=new Alumno[n];
		for(int i=0;i<x.length;i=i+1){
			y[i]=x[i];
		}
		x=y;
	}

	public void mostrarVector(){
		if(x.length > 0){
			for(int i=0;i<x.length;i=i+1){
				System.out.printf("%4d% 6d\t%-15s %10.1f\n",i+1,x[i].getCod(),x[i].getNom(),x[i].getNota());
			}
		}
		else{
			System.out.println("Vector vacio...");
		}
	}

	public void mostrarVector(Alumno v[]){
		if(v.length > 0){
			encabezado1();
			encabezado2();
			for(int i=0;i<v.length;i=i+1){
				System.out.printf("%4d  %6d\t  %-15s  %10.1f\n",i+1,v[i].getCod(),v[i].getNom(),v[i].getNota());
			}
			raya1();
		}
		else{
			System.out.println("Vector vacio...");
		}
	}

	public void raya1(){
		int i;
		for(i=0;i<40;){
		System.out.print("-");
		i=i+1;
		}
		System.out.print("\n");
	}
	public void raya2(){
		int i;
		for(i=0;i<40;){
		System.out.print("=");
		i=i+1;
		}
		System.out.print("\n");
	}

	public void encabezado1(){
		String t1="RELACION DE ALUMNOS";
		String t2="Algoritmica II";
		System.out.printf("\t\t%s\n",t1);
		System.out.printf("\t\t\t%s\n\n",t2);
	}
	public void encabezado2(){
		String s1="No";
		String s2="CODICO";
		String s3="NOMBRE";
		String s4="NOTA";

		raya2();
		System.out.printf("%3s %8s %12s %10s\n",s1,s2,s3,s4);
		raya1();
	}

	@Override
	public String toString(){
		//String cad=null;
		String cad="";
		int dx=x.length;
		for(int i=0;i<dx;){
			//cad=cad+x[i].toString();
			cad=cad+String.format("%6d %-15s %6.1f\n",
			x[i].getCod(),x[i].getNom(),x[i].getNota());
			i=i+1;
		}
		return(cad);
	}
}
