/**
* nombreClase: Docente.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqMatricula;

public class Docente {
	private String Nombre;
	private String cod;
	private Curso[] C;
	private int dimC;
	private final static int max=3;
	public Docente() {
		dimC=0;
	}
	public void setNombre(String Nombre){
		this.Nombre=Nombre;
	}
	
	public String getNombre(){
		return Nombre;
	}
	public void setCodigo(String cod){
		this.cod=cod;
	}
	public String getCod(){
		return cod;
	}
	public void agregarCurso(Curso Cur){
		redimension(dimC+1,1);
		C[dimC-1]=new Curso();
		C[dimC-1]=Cur;
		C[dimC-1].setCod(dimC);
	}
	public boolean verificar(){
		return  dimC<3;
	}
	public void redimension(int tam,int n){
		Curso[] Aux=new Curso[tam];
		int i;
		for(i=0;i<tam-n;i++){
			Aux[i]=C[i];
		}
		dimC=tam;
		C=Aux;
	}
	public void mostarCursos(){
		mostrarDocente();
		raya();
		encabezado();
		raya();
		int i;
		for(i=0;i<dimC;i++){
			System.out.printf("%10s\t%-20s\n",C[i].getCod(),C[i].getCurso());
		}
		raya();
	}
	public static void encabezado1(){
		System.out.println("Codigo\t\tNombre Docente");
	}
	public static void raya(){
		System.out.println("==================================================================");
	}
	public void  encabezado(){
		System.out.println("Codigo\t\tCurso");
	}
	public void mostrarDocente(){
		System.out.printf("%10s\t%-20s\n",cod,Nombre);
	}
}