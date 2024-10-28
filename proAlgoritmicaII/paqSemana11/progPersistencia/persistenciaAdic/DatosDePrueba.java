package proAlgoritmicaII.paqSemana11.progPersistencia.persistenciaAdic; /**
 * @(#)DatosDePrueba.java
 *	Se genera datos/objetos de prueba de cada una de las clases.
 *
 *
 * @author
 * @version 1.00 2022/9/9
 */
import java.util.*;
import java.io.*;

public class DatosDePrueba {

	public DatosDePrueba() {
	}

	public void datosProfesores(){
		ArrayList<Profesor> apro=new ArrayList();
		apro.add(new Profesor("120","Zacarias","Asociado","Procesos Ensenanza"));
		apro.add(new Profesor("105","Juana","Principal","Capacitacion docente"));
		apro.add(new Profesor("103","Juliana","Auxiliar","Invstigacion"));
		apro.add(new Profesor("115","Penelope","Asociado","Standarizacion criterios evalucion"));

		GestionSerializado<Profesor> gs=new GestionSerializado("profesores.dat");


	   	for(Profesor p : apro){
	   		gs.salvarDato(p);
	   	}


	}

}