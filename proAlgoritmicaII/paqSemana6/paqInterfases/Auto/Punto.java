/**
 * @(#)Punto.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Auto;

public class Punto {
	private double x;
	private double y;

	public Punto() {
  		x = 0;
   	y = 0;
  	}

  	public Punto(double cx, double cy) {
   	x = cx;
   	y = cy;
  	}

	public double x() { return x; }
	public double y() { return y; }
	public void x(double d) { x = d; }
	public void y(double d) { y = d; }

	public void desplaza(double deltaX, double deltaY) {
   	x += deltaX;
   	y += deltaY;
  	}

	public double distancia(Punto otro) {
   	double ox = otro.x();
   	double oy = otro.y();
   	return Math.sqrt((ox - x) * (ox - x) +
      (oy - y) * (oy - y));
  }

  // Otro m�todo para visualizar objetos:
  // M�todo est�ndar toString() que construye una cadena
  // que representa el objeto.
  // Para construir la cadena se usa el potente operador
  // de concatenaci�n (+) que permite construir una cadena
  // concatenando cadenas literales y valores.
  // La cadena construida se devuelve como resultado
  // (de clase String, que explicaremos en siguiente tema).
  // As�, cuando se usa un objeto de esta clase (Punto)
  // en el argumento del m�todo print() o println()
  // de System.out, se llama autom�ticamente
  // al m�todo toString() de la clase para obtener
  // la representaci�n de cadena del objeto.
  public String toString(){
    return "(" + x + "," + y + ")";
  }
  // A partir de ahora crearemos en las clases el m�todo
  // toString() en lugar del m�todo print().
}
