/**
* nombreClase: VectorGatos.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 02-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana3.Lab03;

import java.util.*;

public class VectorGatos {

	private Gatos x[];
	
	public VectorGatos() {
		x= new Gatos[0];
	}
	
	public VectorGatos(Gatos v[]) {
		x=v;
	}
	
	public Gatos leerGatos(){
	   	Gatos a = new Gatos();
	   	String vnom;
	   	int vcod , vedad;
	   	float vpeso;
	   	
	   	System.out.println("Ingrese codigo ->");
	   	vcod= Leer.datoInt();
	   	a.setCod(vcod);
	   	System.out.println("Ingrese Nombre ->");
	   	vnom=Leer.dato();
	   	a.setNom(vnom);
	   	System.out.println("Ingrese Peso ->");
	   	vpeso=Leer.datoFloat();
	   	a.setPeso(vpeso);
	   	System.out.println("Ingrese Edad ->");
	   	vedad=Leer.datoInt();
	   	a.setEdad(vedad);
	   	return(a);
	   }
	
	public void agregarGatos(){
		int i;
		i=x.length;
		Gatos a;
		redimensionar1(); //incremento del vector
		a = leerGatos();

		x[i]=a;
	}
	
	private void redimensionar1() {
		int n=x.length;
		n=n+1;
		Gatos y[]=new Gatos[n];
		for(int i=0;i<x.length;i=i+1){
			y[i]=x[i];
		}
		x=y;
	}
	
	public Gatos[] leerVector(){
		int i,n;
		Gatos a;
		System.out.print("Numero de animales  del vector ---> ");
		n=Leer.datoInt();
		Gatos v[]=new Gatos[n];

		for(i=0;i<n;i=i+1){
			System.out.println("Gatos "+(i+1)+": ");
			a = leerGatos();
			v[i]=a;
		}
		return v;
	}
	
	public void insertarxPos(Gatos dato, int posi){
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

	public void mostrarVector(){
		if(x.length > 0){
			for(int i=0;i<x.length;i=i+1){
				System.out.printf("%4d   %6d   %-15s  %6.1f  %6d\n",i+1,x[i].getCod(),x[i].getNom(),x[i].getPeso(),x[i].getEdad());
			}
		}
		else{
			System.out.println("Vector vacio...");
		}
	}
	
	public void mostrarVector(Gatos v[]){
	    if(v.length > 0){
	        encabezado1();
	        encabezado2();
	        for(int i = 0; i < v.length; i = i + 1){
	            System.out.printf("%4d   %6d   %-15s  %6.1f  %6d\n" , i + 1, v[i].getCod(), v[i].getNom(), v[i].getPeso(), v[i].getEdad());
	        }
	        raya1();
	    } else {
	        System.out.println("Vector vacío...");
	    }
	}
	
	public void buscarVector(Gatos v[]){
		int cod,  opc=1 , i=0;
		System.out.print("Ingrese el codigo  que quiera buscar---> ");
		cod=Leer.datoInt();
		
		
		while(opc!=0 || i != v.length  ){
			
			if(cod==v[i].getCod()) {
				opc=0;
			}else {
				i =i+1;
			}
		}
		if(opc==0) {
			encabezado1();
			encabezado2();
			System.out.printf("%4d   %6d   %-15s  %6.1f  %6d\n" , i + 1, v[i].getCod(), v[i].getNom(), v[i].getPeso(), v[i].getEdad());
			raya1();
		}else {
			System.out.println("Codigo invalido...");
		}
	}
	
	
	public void ordenarVector( Gatos v[]) {
		int n = v.length;
        Gatos g;
        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n - i-1 ; j++) {
                if (v[j].getCod() > v[j + 1].getCod()) {
                    g = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = g;
                }
            }
        }
	}
	
	public void raya1(){
		int i;
		for(i=0;i<60;){
		System.out.print("-");
		i=i+1;
		}
		System.out.print("\n");
	}
	public void raya2(){
		int i;
		for(i=0;i<60;){
		System.out.print("=");
		i=i+1;
		}
		System.out.print("\n");
	}
	
	
	public void encabezado1(){
		String t1="RELACION DE ANIMALES";
		System.out.printf("\t\t%s\n",t1);
	}
	public void encabezado2(){
		String s1="No";
		String s2="CODIGO";
		String s3="NOMBRE";
		String s4="PESO";
		String s5="EDAD";

		raya2();
		System.out.printf("%3s %8s %12s %10s  %14s \n",s1,s2,s3,s4 ,s5);
		raya1();
	}
	
	public String toString(){
		//String cad=null;
		String cad="";
		int dx=x.length;
		for(int i=0;i<dx;){
			//cad=cad+x[i].toString();
			cad=cad+String.format("   %6d   %-15s  %6.1f  %6d\n",x[i].getCod(),x[i].getNom(),x[i].getPeso() , x[i].getEdad());
			i=i+1;
		}
		return(cad);
	}
	
	
}
