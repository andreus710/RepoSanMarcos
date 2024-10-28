/**
* nombreClase: Nodo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqLista;

public class Nodo{
	String val="";
	Nodo sgte;
		
	public Nodo(){
	}
	// Crea un nodo con el dato dato
	public Nodo(String dato){
	  val=dato;
	  sgte=null; 
	}
	//Crea un nodo a partir de otro nodo
	public Nodo(Nodo p, String dato){
	  val=dato;
	  sgte=p; 
	}
}
