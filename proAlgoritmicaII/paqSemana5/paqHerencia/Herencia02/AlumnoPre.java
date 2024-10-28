/**
* nombreClase: AlumnoPre.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia02;

public class AlumnoPre extends Persona{
	private String codAlu;
	private int cantCursos;
	private int maxCantCursos;
	
	public AlumnoPre() {
		super();
	}
	public AlumnoPre(String vdni, String vnom, String vdir, String vfono, String vcodAlu){
	   super(vdni, vnom, vdir, vfono);
	   codAlu=vcodAlu;
	   cantCursos=0;
	   maxCantCursos=4;
	}
	void setCodAlu(String vcod){
	   codAlu=vcod;
	}
	void setCantCursos(int vcant){
	   cantCursos=vcant;
	}
	void setMaxCantCursos(int vmaxCant){
	   maxCantCursos=vmaxCant;
	}
	
	public String getCodAlu(){
	   return codAlu;
	}
	public int getCantCursos(){
	   return cantCursos;
	}
	public int getMaxCantCursos(){
	   return maxCantCursos;
	}
	public void mostrarInfo(){
		super.mostrarInfo();
		System.out.println("codigoAlu    : " + codAlu);
		System.out.println("cantCursos   : " + cantCursos);
		System.out.println("maxCantCursos: " + maxCantCursos);
	}
	
	public String toString(){
		return super.toString()+""+codAlu+""+cantCursos+""+maxCantCursos;
	}
}