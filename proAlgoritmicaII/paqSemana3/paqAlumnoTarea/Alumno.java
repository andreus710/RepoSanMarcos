/**
* nombreClase: Alumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 02-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana3.paqAlumnoTarea;

import java.util.*;

public class Alumno {
	private int cod;
	private String nom;
	private float nota;

	public Alumno() {
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
	void setNota(float vnota){
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

	public void mostrarAlu(){
		System.out.printf("%6d",getCod());
		System.out.printf("%-15s ",getNom());
		System.out.printf("%6.1f\n",getNota());
	}
	public String toString(){
		String cad=String.format("%6d %-15s %6.1f\n",getCod(),getNom(),getNota());
		return cad;
	}

}
