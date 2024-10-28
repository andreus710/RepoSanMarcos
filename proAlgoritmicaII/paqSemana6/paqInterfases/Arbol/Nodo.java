/**
 * @(#)Nodo.java
 *
 *
 * @author 
 * @version 1.00 2009/9/27
 */

package proAlgoritmicaII.paqSemana6.paqInterfases.Arbol;

public class Nodo {
	Nodo Izquierdo;
	int datos;	
	Nodo Derecho;

   public Nodo() {
   }

	public Nodo( int datosNodo ) { 
		datos = datosNodo; 
		Izquierdo = Derecho = null; 
	}
	// localizar el punto de inserci?n de nuevo nodo
	public synchronized void insertar( int valorInsertar ) { // e ignorar duplicados
		if ( valorInsertar < datos ) { 
			if ( Izquierdo == null ) 
				Izquierdo = new Nodo( valorInsertar ); // insertar nuevo NodoArbol
			else 
				Izquierdo.insertar( valorInsertar ); // continuar recorriendo sub?rbol izquierdo
		}
		else 
			if ( valorInsertar > datos ) { // insertar en sub?rbol derecho
				if ( Derecho == null ) 
					Derecho = new Nodo( valorInsertar ); // insertar nuevo NodoArbol
				else 
					Derecho.insertar( valorInsertar ); // continuar recorriendo sub?rbol derecho

			}
	}    
}