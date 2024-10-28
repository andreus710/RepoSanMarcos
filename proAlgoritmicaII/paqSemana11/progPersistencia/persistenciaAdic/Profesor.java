package proAlgoritmicaII.paqSemana11.progPersistencia.persistenciaAdic; /**
 * @(#)Profesor.java
 *		Clase Profesor, operaciones basicas.
 *
 * @author 
 * @version 1.00 2022
 */
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