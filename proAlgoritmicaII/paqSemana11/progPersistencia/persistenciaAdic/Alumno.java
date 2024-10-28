package proAlgoritmicaII.paqSemana11.progPersistencia.persistenciaAdic; /**
 * @(#)Alumno.java
 *		Clase Alumno, operaciones basicas.
 *
 *
 * @author 
 * @version 1.00 2022/9/2
 */
import java.io.Serializable;

public class Alumno implements Serializable {
	
	private static final long serialVersionUID = -1L;
	private String cod;
	private String nom;
	private String eap;
	private String req;
	
	public Alumno() {
	}
	public Alumno(String vcod, String vnom, String veap, String vreq) {
		cod = vcod;
		nom = vnom;
		eap = veap;
		req = vreq;
	}
	
	public void setCod(String vcod) {
		cod = vcod;
	}
	public void setNom(String vnom) {
		nom = vnom;
	}
	public void setEap(String veap) {
		eap = veap;
	}
	public void setReq(String vreq) {
		req = vreq;
	}
	
	public String getCod() {
		return cod;
	}
	public String getNom() {
		return nom;
	}
	public String getEap() {
		return eap;
	}
	public String getReq() {
		return req;
	}
	
	@Override
	public String toString() {
		String cad=null;
		cad=String.format("%10s %-15s %-10s %-10s",cod,nom,eap,req);
		return cad;
	}
}