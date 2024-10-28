/**
* nombreClase: TVectorGatos.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 02-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana3.Lab03;


public class TVectorGatos {

	
	public static void main(String[] args) {
		System.out.println("-----------------------");
		VectorGatos g = new VectorGatos();
		
		System.out.println(g);
		
		Gatos va[];
		
		va = g.leerVector();
		g.mostrarVector(va);
		g.buscarVector(va);
		
		System.out.println("Ordenado el vector respecto a los codigos -->");
		
		g.ordenarVector(va);//Sale con numeros de doble
		g.mostrarVector(va);
		
		

	}

}
