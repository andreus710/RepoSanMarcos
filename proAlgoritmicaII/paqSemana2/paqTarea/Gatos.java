/**
* nombreClase: Gatos.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqTarea;

import java.util.*;

public class Gatos {
	private int cod;
	private String nom;
	private float peso;
	private int edad;
	
	
	//constructores
	
	public Gatos() {
	}
	
	public Gatos(int vcod, String vnom, float vpeso , int vedad) {
		cod=vcod;
		nom=vnom;
		peso= vpeso;
		edad=vedad;
   }
	
	public void setCod(int vcod) {
		cod=vcod;
	}
	public void setNom(String vnom) {
		nom=vnom;
	}
	public void setPeso(float vpeso) {
		peso=vpeso;
	}
	public void setEdad(int vedad) {
		edad=vedad;
	}
	
	public int getCod() {
		return cod;
	}
	public String getNom() {
		return nom;
	}
	public float getPeso() {
		return peso;
	}
	public int getEdad() {
		return edad;
	}
	
	public Gatos leerGatos(){
		
	   	Gatos a = new Gatos();
	   	String vnom;
	   	int vcod , vedad;
	   	float vpeso;
	   	
	   	System.out.print("Ingrese codigo ->");
	   	vcod=Leer.dInt();
	   	a.setCod(vcod);
	   	System.out.print("Ingrese Nombre ->");
	   	vnom= Leer.dato();
	   	a.setNom(vnom);
	   	System.out.print("Ingrese Peso ->");
	   	vpeso=Leer.dFloat();
	   	a.setPeso(vpeso);
	   	System.out.print("Ingrese Edad ->");
	   	vedad=Leer.dInt();
	   	a.setEdad(vedad);
	   	
	   	return(a);
	   	
	   }

		
	public void mostrarGatos(){
	   	System.out.printf("%6d %-15s %10.1f %6d\n",cod , nom , peso , edad);
	   }
	
	public void mostrarGatos(Gatos x){
	   	System.out.println(this.toString());
	   }
	
	@Override 
	public String toString(){ 
	   	String cad=null;
	   	cad = String.format("%6d %-15s %10.1f %6d\n", getCod() , getNom() , getPeso() , getEdad());
	   	return(cad);
	   }
	}

