package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia0; /**
 * @(#)DesSerializar.java
 *
 *
 * @author 
 * @version 1.00 2012/6/4
 */

import java.io.*;

public class DesSerializar {
	public static void main(String[] args){
		try {
			//Creacion de variables flujos de files y de objetos
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			
			//Crea, abre un file para recuperar objetos
			fis = new FileInputStream("SerializaObj.obj");
			ois = new ObjectInputStream(fis);
			
			//Hace casting de Persona a los objetos recuperados
			Persona p1r=(Persona) ois.readObject();
			Persona p2r=(Persona) ois.readObject();
			
			//Cierra el flujo de objetos
			ois.close();
			
			//Presenta los objetos debidamente formateados
			System.out.printf("%6s\t%-16s%6d\n",p1r.getDni(),p1r.getNombre(),p1r.getEdad());
			System.out.printf("%6s\t%-16s%6d\n",p2r.getDni(),p2r.getNombre(),p2r.getEdad());
		}
		catch(Exception e){
			System.out.println("DesSerializar: main(): " + e);
		}
	}
}