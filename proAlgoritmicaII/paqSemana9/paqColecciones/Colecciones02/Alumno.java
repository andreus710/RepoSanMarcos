/**
 * @(#)Alumno1.java
 *		Tipo de contructores
 *
 * 0. Analice el codigo, luego compile y ejecute y analice los resultados.
 * 1. Analice los constructores.
 * 2. Que uso tiene los constructores implementados.
 *
 * Investigue acerca de constructores de Java
 *
 * @author GASA
 * @fecha: 2021/10/15
 * @version 1.00
 */
package proAlgoritmicaII.paqSemana9.paqColecciones.Colecciones02;

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

		String vnom;
		int vcod;
		float vnota;
		Scanner jin=new Scanner(System.in);
		cod= jin.nextInt();
		setCod(cod);
		nom= jin.next();
		//vnom= jin.nextLine();
		setNom(nom);
		nota=jin.nextFloat();
		setNota(nota);
		return(this);
	}
	public void escribirAlu(){
		System.out.printf("%6d %-15s%10.1f\n",cod,nom,nota);
	}
	public void mostrarAlu(Alumno a){
		System.out.printf("%6d %-15s%10.1f\n",a.cod,a.nom,nota);
	}
	public String toString(){
		String cad=null;
		cad=String.format("%6d %-15s%10.1f",cod,nom,nota);
		return(cad);
	}
}