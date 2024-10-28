/**
* nombreClase: Triangulo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqTriangulo;

public class Triangulo {
	private Punto p1;
	private Punto p2;
	private Punto p3;

	public Triangulo(){
	}
	public Triangulo(Punto vp1, Punto vp2, Punto vp3) {
		p1 = vp1;
		p2 = vp2;
		p3 = vp3;
	}

	public double[] calcularLongitudLados() {
		double longLados[] = new double[3];

		longLados[0] = p1.distancia(p2);
		longLados[1] = p2.distancia(p3);
		longLados[2] = p3.distancia(p1);

		return longLados;
	}
	public double area(){
		double a,b,c,area,sp;
		Punto p=new Punto();
		a=p.distancia(p1,p2);
		b=p.distancia(p1,p3);
		c=p.distancia(p2,p3);
		sp=(a+b+c)/2;
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		return(area);
	}
	public double perimetro(){
		double a,b,c,sl=0.0;
		Punto p=new Punto();
		if(esTriangulo()){
			a=p.distancia(p1,p2);
			b=p.distancia(p1,p3);
			c=p.distancia(p2,p3);
			sl=a+b+c;
			return sl;
		}
		else{
			return(sl);
		}
	}
	public boolean esTriangulo(){
		double a,b,c,sl;
		Punto p=new Punto();
		a=p.distancia(p1,p2);
		b=p.distancia(p1,p3);
		c=p.distancia(p2,p3);
		if(a+b>c && a+c> b){
			return(true);
		}
		else{
			return(false);
		}
		//a*b != a*c
	}
	public void tipoTriangulo(){
		double a,b,c,sl;
		Punto p=new Punto();
		if(esTriangulo()){
			a=p.distancia(p1,p2);
			b=p.distancia(p1,p3);
			c=p.distancia(p2,p3);
			if(a==b && b==c){
				System.out.println("Equilatero...");
			}
			else{
				if(a!=b && b!=c && a!=c){
					System.out.println("Escaleno...");
				}
				else{
					System.out.println("Isosceles...");
				}
			}
		}
		else{
			System.out.println("No es triangulo...");
		}
	}
	public String toString(){
		String cad;
		cad=p1.toString()+"\n"+p2.toString()+"\n"+p3.toString();
		return cad;
	}
}
