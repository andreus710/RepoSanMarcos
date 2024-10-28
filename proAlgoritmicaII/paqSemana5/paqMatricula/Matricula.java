/**
* nombreClase: Matricula.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqMatricula;

import java.util.*;
public class Matricula {
	private Curso[] C;    
	private Alumno[] Al;
	private Docente[] D;
	private int dimC;
	private int dimAl;
	private int dimD;
	private final static int maxdimC=6;
	
	public Matricula() {
		dimC=0;
		dimAl=0;
		dimD=0;
	}
	public void  operaciones(){
		boolean h=true;
		while(h){
			switch(menu1()){				
				case 0:
					h=false;
					break;
				case 1:
					System.out.println("\t\tNombre del Curso");
					agregarCurso(new Curso(Leer.dato()));
					break;
				case 2:
					inscribirDocente();   	 	            
					break;
				case 3:
					matricularAlumno();
					break;
				case 4:
					mostrarCursos();
					break;
				case 5:
					if(dimC==0){
						System.out.println("No hay cursos");
					}
					else{
						System.out.print("Codigo de curso: ");
						int s=buscarCurso(Leer.dato());
						if(s==dimC){
							System.out.println("No existe el curso");
						}
						else{
							raya();
							encabezado();
							raya();
							System.out.printf("%10s\t\t%-20s\t\t%10d\t\t%10d\t\t%-20s\t%10s\n",C[s].getCod(),C[s].getCurso(),C[s].getDimAl(),C[s].getVacante(),C[s].getDocente(),C[s].getCodigo());
							raya();
							System.out.println();
							C[s].mostrarAlumnos();
				
						}
					}
					break;
				case 6: 
					if(dimAl==0){
						System.out.println("No hay ningun alumno matriculado");
					}
					else{
						mostrarAlumnos();
						System.out.print("Codigo de Alumno:");
						String c=Leer.dato();
						int i=buscarAlumno(c);
						if(i==dimAl){
							System.out.println("No existe el alumno");
						}
						else
							Al[i].mostrarCursos();
					}
					break;
				case 7:
					if(dimD==0){
						System.out.println("No hay Docentes");
					}
					else{ 
						mostrarDocentes();
						System.out.print("Buscar docente:");
						String doc=Leer.dato();
						int posD=buscarCodDocent(doc);
						if(posD==dimD){
							System.out.println("No existe el docente");
						}
						else{
							D[posD].mostarCursos();
						}
					}
					break;
				case 8:
					mostrarDocentes();
					break;
				case 9:
					mostrarAlumnos();
					break;
				default : 
					System.out.println("Opcion Incorrecta");
			}	 
		}	
	}
	public int menu1(){
		System.out.println("\t\tMatricula");
		System.out.println("AgregrarCurso...............[1]");
		System.out.println("InscribirDocenteACurso......[2]");
		System.out.println("MatricularAlumno............[3]");
		System.out.println("MostrarCursos...............[4]");   
		System.out.println("BuscarCursos................[5]");
		System.out.println("BuscarAlumno................[6]");
		System.out.println("BuscarDocente...............[7]");
		System.out.println("MostrarDocentes.............[8]");
		System.out.println("MostrarAlumnos..............[9]");
		System.out.println("Salir.......................[0]");
		System.out.print("Opcion:");
		return Leer.datoIntMenu();
		
	}
	public void agregarCurso(Curso Cur){
		redimension(dimC+1,1);
		C[dimC-1]=new Curso();
		C[dimC-1]=Cur;
		C[dimC-1].setCod(dimC);	
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
	public void mostrarCursos(){
		if(dimC==0)
			System.out.println("No hay Cursos");
		else{
			raya();
			encabezado();
			int i;
			raya();
			for(i=0;i<dimC;i++){
				System.out.printf("%10s\t\t%-20s\t\t%10d\t\t%10d\t\t%-20s\t%10s\n",C[i].getCod(),C[i].getCurso(),C[i].getDimAl(),C[i].getVacante(),C[i].getDocente(),C[i].getCodigo());
			}
			raya();
		}
	}
	public void encabezado(){
		System.out.println("CodCurso\t\tNombreCurso\t\t\t Cantidad de Alumnos\t\tVacantes\t\t Profesor\t\tCodProfe");
	}
	public void raya(){
		System.out.println("============================================================================================================");
	}
	public int buscarCurso(String cod){
		boolean h=false;
		int i=0;
		while(i<dimC&&!h){
			if(C[i].getCod().compareTo(cod)==0)
				h=true;
			else
				i++;			
		}
		return i;
	}
	public void agregarDocente(Docente d){
		redimensionarDoce(dimD+1,1);
		D[dimD-1]=new Docente();
		D[dimD-1]=d;
	}
	public void redimensionarDoce(int tam,int n){
		Docente[] Aux=new Docente[tam];
		int i;
		for(i=0;i<tam-n;i++){
			Aux[i]=D[i];		
		}
		dimD=tam;
		D=Aux;
	}
	public int buscarCodDocent(String cod){
		boolean h=false;
		int i=0;
		while(i<dimD&&!h){
		if(D[i].getCod().compareTo(cod)==0)
			h=true;
		else
			i++;		
		}
		return i;
	}
	public void inscribirDocente(){
		if(dimC!=0){
			mostrarCursos();
			System.out.println("Codigo de Curso");
			String cod=Leer.dato();
			int i=buscarCurso(cod);
			if(i!=dimC){
				if(C[i].getVerificar()){
					System.out.println("El curso "+ C[i].getCurso()+" ya esta siendo dictado por :");
					System.out.println("Profesor(a): "+C[i].getDocente());
				}
				else{
					System.out.println("Codigo del Docente :");
					String codP=Leer.dato();
					int pos=buscarCodDocent(codP);
					if(pos!=dimD){
						if(D[pos].verificar()){
							System.out.println("El docente "+D[pos].getNombre()+" va dictar el curso de " +C[i].getCurso());
							D[pos].agregarCurso(C[i]);
							C[i].setDocente(D[pos]);
						}
						else
							System.out.println("El Docente "+ D[pos].getNombre()+" ya dicta 3 cursos");
					}
					else{
						System.out.println("Nombre del Profesor");
						Docente D=new Docente();
						D.setNombre(Leer.dato());
						D.setCodigo(codP);
						D.agregarCurso(C[i]);
						System.out.println("El docente "+D.getNombre()+" va dictar el curso de " +C[i].getCurso());
						agregarDocente(D);
						C[i].setDocente(D);
					}
				}
			}
			else
				System.out.println("No existe el Curso");
		}
		else
			System.out.println("No puede Inscribir ningun docente porque no hay ningun curso");
	}
	public int menuMatricula(){
		System.out.println("MatricularseEnCurso....[1]");
		System.out.println("Salir..................[0]");
		System.out.print("Opcion:");
		return Leer.datoIntMenu();
	}
	public void agregarAlumno(Alumno Alum){
		redimensionarAlumn(dimAl+1,1);
		Al[dimAl-1]=new Alumno();
		Al[dimAl-1]=Alum;
	}
	public void redimensionarAlumn(int tam,int n){
		Alumno[] Aux=new Alumno[tam];
		int i;
		for(i=0;i<tam-n;i++){
			Aux[i]=Al[i];
		}
		dimAl=tam;
		Al=Aux;
	}
	public int buscarAlumno(String cod){
		boolean h=false;
		int i=0;
		while(i<dimAl&&!h){
			if(Al[i].getCodigo().compareTo(cod)==0)
				h=true;
			else
				i++;
		}
		return i;
	}
	public void matricularAlumno(){
		if(dimC!=0){
			System.out.println("Codigo del Alumno : ");
			String codAl=Leer.dato();
			int pos=buscarAlumno(codAl);
			boolean agre=false;
			if(pos==dimAl){
				Alumno A=new Alumno();
				A.setCodigo(codAl);
				System.out.print("Nombre:");    	 	 	   	        
				A.setNombre(Leer.dato());
				A.mostrarCursos();
				agregarAlumno(A);
				pos=dimAl-1;
				agre=false;
			}
			else{
				System.out.println("Alumno:"+Al[pos].getNombre());
				Al[pos].mostrarCursos();
				agre=true;
			}
			boolean p=true;
			while(p){    	 	 	   	    
				mostrarCursos();
				switch(menuMatricula()){
					case 0:
						p=false;
						break;
					case 1:
						if(Al[pos].verificar()){
							System.out.print("Codigo de curso : ");
							String codigoCur=Leer.dato();
							int posC=buscarCurso(codigoCur);
							if(posC!=dimC){
								if(!Al[pos].buscarCurso(codigoCur)){
									if(C[posC].getVacante()==0)
										System.out.println("El curso "+C[posC].getCurso()+" ya no tiene vacantes");
									else{
										C[posC].agregarAlumno(Al[pos]);
										Al[pos].agregarCurso(C[posC]);
										agre=true;
									}
								}
								else 
									System.out.println("Ya se matriculo en el curso "+C[posC].getCurso());
							}
							else
								System.out.println("No existe el curso");
						}
						else
							System.out.println("Solo se puede matricular en "+Al[pos].getMax()+"cursos");
						break;
				}
			}
			if(!agre){
				eliminar(dimAl-1);
			}
		}
		else
			System.out.println("No existe curso por lo que no puede matricular ningun alumno");
	}
	
	public void eliminar(int pos){
		int i=0;
		while(i<dimAl-1){
		Al[i]=Al[i+1];
		i++;
		}
		redimensionarAlumn(dimAl-1,0);
	}
	public void mostrarDocentes(){
		int i;
		Docente.raya();
		Docente.encabezado1();
		Docente.raya();
		if(dimD==0){
			System.out.println("No hay docentes");	
		}
		else{
			for(i=0;i<dimD;i++){
				D[i].mostrarDocente();
			}
		}
		Docente.raya();
	}
	public void mostrarAlumnos(){
		Curso.raya();
		Curso.encabezado();
		Curso.raya();
		if(dimAl==0){
			System.out.println("No hay alumnos");
		}
		else{
			int i;
			for(i=0;i<dimAl;i++){
				System.out.printf("%10s\t\t%-20s \n",Al[i].getCodigo(),Al[i].getNombre());
			}
		}
		Curso.raya();
	}
}
