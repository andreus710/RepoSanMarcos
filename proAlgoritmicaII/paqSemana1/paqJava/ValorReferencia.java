/**
* nombreClase: ValorReferencia.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 19-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana1.paqJava;

/**
 * 
 */
public class ValorReferencia {
	private String cad = new String();
	//public  String cad = new String();

	public ValorReferencia() {
	}
	public ValorReferencia(String vcad) {
		setCad(vcad);
	}

	public void setCad(String vcad) {
		cad = vcad;
	}
	public String getCad() {
		return cad;
	}

	public static void cambiarObjeto(ValorReferencia objeto) {
		objeto = new ValorReferencia("Este es un nuevo objeto.");
		System.out.println("Luego de  \"reasignar\" obj: " + objeto);
	}

	public static void cambiarCad(ValorReferencia objeto) {
		objeto.setCad("Este es un nuevo valor para cad");
	}

	public String toString() {
		return "[cad = " + this.getCad() + "]";
	}

 	public void tiposDeDatos(){
		byte byte1;
		short short1;
		int int1;
		long long1;
		float float1;
		double double1;
		char car1, car2;
		byte1=1;
		short1=100;
		int1=1000;
		long1=10000000;
		float1=1.111111111111F;
		double1=1.1111111111111E+9D;
		car1=65;
		car2='C';
		System.out.println("\n\tTIPOS DE DATOS JAVA\n");
		System.out.println("byte = " + byte1);
		System.out.println("short = " + short1);
		System.out.println("int = " + int1);
		System.out.println("long = " + long1);
		System.out.println("float = "+ float1);
		System.out.println("double = "+ double1);
		System.out.println("car1 = " + car1);
		System.out.println("car2 = " + car2);
		System.out.println("car1 + 1 = " + car1 + 1);
		System.out.println("++car2 + 1 = " + ++car2);
 	}
}
