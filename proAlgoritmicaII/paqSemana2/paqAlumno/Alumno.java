/**
* nombreClase: Alumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqAlumno;

import java.util.*;
import java.io.*;

public class Alumno {
	private int cod;
	private String nom;
	private float nota;
	
	
	//Constructores
	//constructor por defecto
	
	public Alumno(){
	}
	
	//constructor parametrizado
	public Alumno(int vcod){
		cod=vcod;
		nom=null;
		nota=0.0F;
	}
	public Alumno(int vcod, String vnom){
		cod=vcod;
		nom=vnom;
		nota=0.0F;
	}
	public Alumno(int vcod, String vnom, float vnota) {
		cod=vcod;
		nom=vnom;
		nota=vnota;
   }

   public void setCod(int vcod){
   	cod=vcod;
   }
   public void setNom(String vnom){
   	nom=vnom;
   }
   public void setNota(float vnota){
   	nota=vnota;
   }

   public int getCod(){
   	return cod;
   }
   public String getNom(){
   	return nom;
   }
   public float getNota(){
   	return nota;
   }
   
   public Alumno leerAlumno(){
   	Alumno a=new Alumno();
   	String vnom;
   	int vcod;
   	float vnota;
   	Scanner jin=new Scanner(System.in);
   	System.out.println("Ingrese codigo ->");
   	vcod= jin.nextInt();
   	a.setCod(vcod);
   	System.out.println("Ingrese Nombre ->");
   	vnom= jin.next();
   	//vnom= jin.nextLine();
   	a.setNom(vnom);
   	System.out.println("Ingrese Nota ->");
   	vnota=jin.nextFloat();
   	a.setNota(vnota);
   	return(a);
   }
   
   
   public void mostrarAlu(){
   	System.out.printf("%6d %-15s%10.1f\n",cod,nom,nota);
   }
   public void mostrarAlu(Alumno x){
   	System.out.println(this.toString());
   }
   
   public String toString(){ //hexadecimal
   	String cad=null;
   	cad=String.format("%6d %-15s%10.1f",cod,nom,nota);
   	return(cad);
   }
}
