/**
 * @(#)Arbol.java
 *
 *
 * @author 
 * @version 1.00 2009/9/27
 */

package proAlgoritmicaII.paqSemana6.paqInterfases.Arbol;

public class Arbol
{ 
	private Nodo raiz;
	public Arbol() { 
		raiz = null; 
	} // construir un objeto Arbol vac?o de enteros
	public synchronized void Preorden() { 
		ayudantePreorden( raiz ); 
	} // empezar recorrido preorden
	public synchronized void Inorden() { 
		ayudanteInorden( raiz ); 
	} // empezar recorrido inorden	
	public synchronized void Postorden(){ 
		ayudantePostorden( raiz ); 
	} // empezar recorrido postorden
	public synchronized void insertarNodo( int valorInsertar) {// insertar un nuevo nodo en el arbol 
		if ( raiz == null ) 
			raiz = new Nodo( valorInsertar ); // crear el nodo raiz aqu?
		else 
			raiz.insertar( valorInsertar ); // llamar al m?todo insertar
	}

	private void ayudantePreorden( Nodo nodo ) { 
		if ( nodo == null ) 
			return;
		System.out.print( nodo.datos + " " ); // mostrar datos del nodo
		ayudantePreorden( nodo.Izquierdo ); // recorrer sub?rbol izquierdo
		ayudantePreorden( nodo.Derecho ); // recorrer sub?rbol derecho
	}
	private void ayudanteInorden( Nodo nodo ) { // metodo recursivo para realizar recorrido inorden
		if ( nodo == null ) 
			return;
		ayudanteInorden( nodo.Izquierdo ); // recorrer sub?rbol izquierdo
		System.out.print( nodo.datos + " " ); // mostrar datos del nodo
		ayudanteInorden( nodo.Derecho ); // recorrer sub?rbol derecho
	}
	private void ayudantePostorden( Nodo nodo ) { 
		if ( nodo == null ) 
			return;
		ayudantePostorden( nodo.Izquierdo ); // recorrer sub?rbol izquierdo
		ayudantePostorden( nodo.Derecho ); // recorrer sub?rbol derecho
		System.out.print( nodo.datos + " " ); // mostrar datos del nodo
	}
}