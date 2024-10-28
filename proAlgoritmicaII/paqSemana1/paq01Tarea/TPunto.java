/**
* nombreClase: TPunto.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 25-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana1.paq01Tarea;

public class TPunto {

	   public static void main(String ar[]) {
		   
	   	Punto p1 = new Punto();
	   	Punto p2 = new Punto();
	   	Punto p3 = new Punto(2,3);
	   	

	   	p1.setX(5);
	   	p1.setY(3);
	   	
	   	
	   	p2.trasladar(0, 7);
	   	
	   	System.out.println("Punto 1 = " + p1);
	   	System.out.println("Punto 2 = " + p2);
	   	System.out.println("Punto 3 = " + p3);
	   	
	   	Triangulo total = new Triangulo( p1 , p2 , p3);
	   	
	   	total.TipoTriangulo();
	   	total.area();

	   }


	}
