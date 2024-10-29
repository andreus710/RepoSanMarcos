/**
 * @(#)Profesor.java
 *		Clase Profesor, operaciones basicas.
 *
 * @author 
 * @version 1.00 2022
 */
package proAlgoritmicaII.paqSemana11.Tarea05;

import java.io.Serializable;
import java.util.*;

public class Profesor implements Serializable {
	
	private static final long serialVersionUID = -1L;
	private String dni;
	private String nom;
	private String cat;
	private String req;
	
	public Profesor() {
	}
	public Profesor(String vnom) {
		nom=vnom;
	}
	public Profesor(String vdni, String vnom, String vcat, String vreq) {
		dni = vdni;
		nom = vnom;
		cat = vcat;
		req = vreq;
	}
	
	public void setDni(String vdni) {
		dni = vdni;
	}
	public void setNom(String vnom) {
		nom = vnom;
	}
	public void setCat(String vcat) {
		cat = vcat;
	}
	public void setReq(String vreq) {
		req = vreq;
	}
	
	public String getDni() {
		return dni;
	}
	public String getNom() {
		return nom;
	}
	public String getCat() {
		return cat;
	}
	public String getReq() {
		return req;
	}
	
	
	public  Profesor leerProfesor() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el DNI del profesor:");
        String dni = scanner.nextLine();
        
        System.out.println("Ingrese el nombre del profesor:");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese la categoría del profesor:");
        String categoria = scanner.nextLine();
        
        System.out.println("Ingrese el requisito del profesor:");
        String requisito = scanner.nextLine();
        
        // Crear y devolver un objeto Profesor
        return new Profesor(dni, nombre, categoria, requisito);
        
    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Profesor other = (Profesor)obj;
		if (!Objects.equals(this.nom, other.nom)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		String cad=null;
		cad=String.format("%10s %-15s %-10s %-10s",dni,nom,cat,req);
		return cad;
	}
}