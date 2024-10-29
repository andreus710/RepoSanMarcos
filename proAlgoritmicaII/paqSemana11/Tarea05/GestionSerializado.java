/**
 * @(#)GestionSerializado.java
 *    Operacionas basicas de serializado.
 *
 * @author
 * @version 1.00 2022/9/3
 */
package proAlgoritmicaII.paqSemana11.Tarea05;

import java.util.*;
import java.io.*;

public class GestionSerializado<TD> {

	private File fichero;
	private ArrayList<TD> datos;

	public GestionSerializado() {
	}
	public GestionSerializado(String fichero) {
		this.fichero = new File(fichero);
		this.datos = new ArrayList();
		recuperarDatos();
	}
	public GestionSerializado(File fichero) {
		this.fichero = fichero;
		this.datos = new ArrayList();
		recuperarDatos();
	}


	/**
	* Recupera datos de file serializado y los pasa a un ArrayList
	*/
	public void recuperarDatos() {
		if (fichero.exists()) {
			TD elemento;
			//try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))) {
			try {
				FileInputStream   fis=new FileInputStream(fichero);
				ObjectInputStream ois=new ObjectInputStream(fis);

				while (true) {
					elemento = (TD)ois.readObject();
					datos.add(elemento);
				}
			}
			catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
			catch (EOFException ex) {
				System.out.println(ex.getMessage());
			}
			catch (IOException | ClassNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	/**
	* Salva el dato elemento de tipo TD en el file y en ArrayList
	* @param elemento
	*/
	public void salvarDato(TD elemento) {
		if (fichero.exists() && fichero.length() > 0) {
			// Se usa MiObjectOutputStream para evitar problemas de cabecera
			try {
				FileOutputStream     fos=new FileOutputStream(fichero, true);
				MiObjectOutputStream oos=new MiObjectOutputStream(fos);

				oos.writeObject(elemento);
			}
			catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
			catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		else {
			// Se usa ObjectOutputStream para crear la cabecera
			try {
				//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))
				FileOutputStream   fos=new FileOutputStream(fichero);
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				oos.writeObject(elemento);
			}
			catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
			}
			catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		datos.add(elemento);
	}

	/**
	* Obtener datos
	* @return
	*/
	public ArrayList<TD> getDatos() {
		return datos;
	}

	/**
	* Muestra datos de tipo TD del ArrayList, la clase debe tener
	* un toString formateado con String.format()
	*/
	public void mostrarDatos() {
		if(datos.size()>0){
			for (TD e : datos) {
				System.out.println(e);
			}
		}
		else{
			System.out.println("ArrayList vaciooo...");
		}
	}

	/**
	* Determina si dato elemento de tipo TD existe
	* @param elemento
	*/
	public boolean existeDato(TD elemento) {
		if(datos.size()>0){
			for (TD e : datos) {
				if (e.equals(elemento)) {
					return true;
				}
			}
		}
		else{
			System.out.println("ArrayList vaciooo...");
		}
		return false;
	}

	/**
	* Elimina el dato elemento de tipo TD si existe
	* @param elemento
	*/
	
	
	public void eliminarDato(TD elemento) {
		if(datos.size()>0){
			if(datos.remove(elemento)){
				ArrayList<TD> copia = datos;
				datos = new ArrayList<>();

				fichero.delete();
				for (TD e : copia) {
					salvarDato(e);
				}
			}
			else{
				Object ele=(TD)elemento;
				System.out.println(elemento+":"+"No se encuentra...");
			}
		}
		else{
			System.out.println("ArrayList vaciooo...");
		}
	}
}