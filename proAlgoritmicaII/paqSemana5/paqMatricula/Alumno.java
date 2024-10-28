/**
* nombreClase: Alumno.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqMatricula;

public class Alumno {
	private String Nombre;
	private String codigo;
	private Curso[] C1;
	private int dimC1;
	private final static int maxC=3;
	
	public Alumno() {
		dimC1=0;
		C1=new Curso[dimC1];
	}
	public void setNombre(String N){
		this.Nombre=N;
	}
	public void setCodigo(String Cod){
		this.codigo=Cod;
	}
	public boolean verificar(){
		return dimC1<maxC;
	}
	public String getNombre(){
		return Nombre;
	}
	public String getCodigo(){
		return  codigo;
	}
	public void agregarCurso(Curso Cur){
		redimension(dimC1+1,1);
		C1[dimC1-1]=new Curso();
		C1[dimC1-1]=Cur;
		
		
	}
	public void redimension(int tam,int n){
		Curso[] Aux=new Curso[tam];
		int i;
		for(i=0;i<tam-n;i++){
			Aux[i]=C1[i];
		}
		dimC1=tam;
		C1=Aux;
	}
	public void mostrarCursos(){
		raya();
		encabezado();
		raya();
		encabezado1();
		raya();
		if(dimC1==0){
			System.out.println("No se ha matriculado en ningun curso");
		}
		else{		
			for(int i=0;i<dimC1;i++){
				System.out.printf("%7s\t\t%-20s\t\t%-20s\n",C1[i].getCod(),C1[i].getCurso(),C1[i].getDocente());
			}
		}
		raya();
	}
	public void raya(){
		System.out.println("=======================================================");
	}
	public void encabezado(){
		System.out.println("\t\tCursos Matriculados  ");
	}
	public void encabezado1(){
		System.out.println("Codigo\t\tCurso\t\t\tDocente");
	}
	public int getMax(){
		return maxC;
	}
	public boolean  buscarCurso(String cod){
		boolean h=false;
		int i=0;
		if(dimC1==0){
			return false;
		}	
		while(i<dimC1&&!h){
			if(C1[i].getCod().compareTo(cod)==0){
				h=true;	
			}
			else{
				i++;
			}  		    		
		}
		return i<dimC1;
	}
	public int getDimc(){
		return dimC1;
	}
}
