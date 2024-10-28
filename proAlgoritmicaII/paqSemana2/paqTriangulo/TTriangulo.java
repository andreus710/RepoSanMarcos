/**
* nombreClase: TTriangulo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqTriangulo;

public class TTriangulo {
	public static void main(String args[]) {
		double ll[],per=0;
		//Vertices de un traingulo
		Punto v1 = new Punto(0,0);
		System.out.println(v1);
		Punto v2 = new Punto(3,3);
		Punto v3 = new Punto(5,5);

		Triangulo t1=new Triangulo(v1,v2,v3);
		System.out.println(t1);

		System.out.println(t1.esTriangulo());




		ll=t1.calcularLongitudLados();
		for(int i=0;i<ll.length;i=i+1){
			per=per+ll[i];
		}

	}
}
