/**
* nombreClase: Gatos.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 02-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana3.Lab03;


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
	
	public void mostrarGatos() {
		System.out.printf("%6d",getCod());
		System.out.printf("%-15s ",getNom());
		System.out.printf("%6.1f",getPeso());
		System.out.printf("%6d",getEdad());
	}
    
	public String toString(){ //hexadecimal
	   	String cad=null;
	   	cad=String.format(" %6d    %-15s  %6.1f  %6d\n",getCod(),getNom(),getPeso(), getEdad());
	   	return(cad);
	   }
}
