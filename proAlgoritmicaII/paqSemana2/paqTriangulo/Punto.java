/**
* nombreClase: Punto.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 26-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana2.paqTriangulo;

public class Punto {
	double x;
	double y;

	public Punto() {
	}

	public Punto(double vx, double vy) {
		x=vx;
		y=vy;
	}

	public void setX(double	 vx){
		x=vx;
	}
	public void setY(double vy){
		y=vy;
	}

	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public int calcularCuadrante() {
		if (x>0.0 && y>0.0) {
			return 1;
		}
		else {
			if (x<0.0 && y>0.0) {
				return 2;
			}
			else{
				if (x<0.0 && y<0.0) {
					return 3;
				}
				else{
					if (x>0.0 && y<0.0) {
						return 4;
					}
					else {
						// (x==0.0 || y==0.0)
						return 0;
					}
				}
			}
		}
	}
	public void trasladar(double dx, double dy){
	   	x = x+dx;
	   	y = y+dy;
   	}
  	public double distancia(Punto p1, Punto p2) {
    	double x,y,d;
    	x = p2.getX() - p1.getX();
    	y = p2.getY() - p1.getY();
    	d = Math.sqrt(x * x + y * y);
    	//d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    	//d = Math.sqrt(Math.pow(p2.getX() - p1.getX(),2)+Math.pow(p2.getY() - p1.getY(),2));
    	return d;
  	}
  	public double distancia(Punto p1) {
    	double vx,vy;
    	vx = x - p1.getX();
    	vy = y - p1.getY();
    	return Math.sqrt(vx * vx + vy * vy);
  	}

  	public Punto calcularMasCercano(Punto x[]) {
  		int i;
  		double d, dmin;
  		Punto p0=new Punto(0,0);
    	Punto masCercano = null;

    	if (x != null && x.length > 0) {
      		// me guardo el primero como mas cercano
      		dmin=distancia(p0,x[0]);
      		masCercano = x[0];

      		for (i = 1; i < x.length; i++) {
        		// si encuentro otro mas cercano, lo sustituyo
        		d = distancia(p0, x[i]);
        		if (d < dmin) {
          			dmin=d;
          			masCercano = x[i];
        		}
      		}
    	}
    	return(masCercano);
  	}

	public String toString(){
		String cad;
		cad="("+x+","+y+")";
		return cad;
	}
}