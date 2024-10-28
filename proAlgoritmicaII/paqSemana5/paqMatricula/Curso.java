/**
* nombreClase: Curso.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqMatricula;

public class Curso {
	private String Codigo;
	private String Nombre;
	private Docente D;
	private boolean verificarD;
	private Alumno[] Al;
	private int dimAl;
	private final static int maxAl=5;
	
	public Curso(){
		verificarD=false;
		dimAl=0;
	}
	public Curso(String Nombre) {
		this.Nombre=Nombre;
		verificarD=false;
		dimAl=0;
	}
	public void setCurso(String Nombre){
		this.Nombre=Nombre;
	}
	public String getCurso(){
		return Nombre;
	}
	public String getDocente(){
		return verificarD==true ? D.getNombre():"No hay profesor";
	}
	public String getCodigo(){
		return verificarD==true ? D.getCod():"";
	}
	public void setDocente(Docente A){
		D=A;
		verificarD=true;
	}
	public void agregarAlumno(Alumno A){
		redimensionar(dimAl+1,1);
		Al[dimAl-1]=new Alumno();
		Al[dimAl-1]=A;
	}
	public void redimensionar(int tam,int n){
		int i;
		Alumno[] Aux=new Alumno[tam];
		for(i=0;i<tam-n;i++ ){
			Aux[i]=Al[i];
		}
		dimAl=tam;
		Al=Aux;
	}
	public int getVacante(){
		return maxAl-dimAl;
	}
	public int getDimAl(){
		return dimAl;
	}
	public void setCod(int cont){
		Codigo="00"+cont;
	}
	public String getCod(){
		return Codigo;
	}
	public boolean getVerificar(){
		return verificarD;
	}
	public void mostrarAlumnos(){
		int i;
		raya();
		encabezado();
		if(dimAl==0){
			System.out.println("No hay Alumnos");
		}
		ordenarAlumnos();
		raya();
		for(i=0;i<dimAl;i++){
			System.out.printf("%10s\t\t%-20s \n",Al[i].getCodigo(),Al[i].getNombre());
		}
		raya();
	}
	public static void encabezado(){
		System.out.println("Codigo\t\tNombre" );
	}
	public static void raya(){
		System.out.println("========================================================");	
	}
	public void ordenarAlumnos(){
		int i;
		int j;
		for(i=0;i<dimAl-1;i++){
			for(j=i+1;j<dimAl;j++){
				if(Al[j].getCodigo().compareTo(Al[i].getCodigo())<=0){
					Alumno AUX=Al[j];
					Al[j]=Al[i];
					Al[i]=AUX;
				}
			}	
		}
	}
}