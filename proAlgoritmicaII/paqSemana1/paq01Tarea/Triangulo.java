/**
* nombreClase: Triangulo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 25-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana1.paq01Tarea;
import java.util.*;

public class Triangulo {
	
	float x1,x2,x3,y1,y2,y3;
	float a;
	double l1 , l2 , l3;
	
	public Triangulo(Punto p1 , Punto p2 , Punto p3) {
		x1 = p1.getX();
		x2 = p2.getX();
		x3 = p3.getX();
		y1 = p1.getY();
		y2 = p2.getY();
		y3 = p3.getY();
	}
	
	public void TipoTriangulo() {
		a=(x1*y2+x2*y3+x3*y1)-(y1*x2+y2*x3+y3*x1);
		a=a/2;
		if(a>0) {
			System.out.println("--->SI es un triangulo");
			lado();
			if(l1 == l2 || l2 == l3 ||l1==l3) {
				if(l1 == l2 || l2 == l3) {
					System.out.println("Es un trinagulo EQUILATERO");
				}else {
					System.out.println("Es un trinagulo ISOCELES");
				}
			}else {
				System.out.println("Es un trinagulo ESCALENO");
			}
		}else {
			System.out.println("-->No es un triangulo");
		}
	}
	
	public void lado () {
		l1 = Math.sqrt (Math.pow( x1-x2 , 2) + Math.pow( y1-y2 , 2));
		l2 = Math.sqrt (Math.pow( x2-x3 , 2) + Math.pow( y2-y3 , 2));
		l3 = Math.sqrt (Math.pow( x1-x3 , 2) + Math.pow( y1-y3 , 2));
	}
	
	public void area() {
		System.out.println("AREA : " + a);
	}

}
