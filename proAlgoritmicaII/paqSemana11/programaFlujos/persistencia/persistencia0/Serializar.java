package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia0; /**
 * @(#)Serializar.java
 *
 *
 * @author 
 * @version 1.00 2012/6/4
 */

import java.io.*;
public class Serializar {
	public static void main(String[] args){
		try {
			//Creacion de objetos
			Persona p1= new Persona();
			Persona p2= new Persona();
			p1.setDni("100");
			p1.setNombre("Eva");
			p1.setEdad(20);
			
			p2.setDni("102");
			p2.setNombre("Adan");
			p2.setEdad(20);
			
			//Creacion de variables flujos de files y de objetos
			FileOutputStream fos=null;
			ObjectOutputStream oos=null;
			
			//Crea, abre un file para salvar objetos
			fos=new FileOutputStream("SerializaObj.obj");
			oos=new ObjectOutputStream(fos);
			
			//Salva objetos
			oos.writeObject(p1);
			oos.writeObject(p2);
			
			//Vacia el buffer y cierra los flujos
			oos.flush();
			oos.close();
		}
		catch(Exception e){
			System.out.println("Serializa: main(): " + e);
		} 
	}
}