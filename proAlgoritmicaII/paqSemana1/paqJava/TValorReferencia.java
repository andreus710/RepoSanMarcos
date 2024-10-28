/**
* nombreClase: TValorReferencia.java
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
public class TValorReferencia {

	public static void main(String[] args) {
		ValorReferencia obj =new ValorReferencia("Objeto inicial");

		System.out.println("\nENTENDER QUE Java PASA PARAMETROS POR VALOR\n");
		System.out.println("Antes de modificar obj es: " + obj);
		ValorReferencia.cambiarObjeto(obj);
		System.out.println("De vuelta en  main obj es: " + obj);
		System.out.println("\nAhora vamos a cambiar sólo cad:\n");
		ValorReferencia.cambiarCad(obj);
		System.out.println("Veamos  cad  ha  cambiado: " + obj);
		System.out.println("\nQue puede decir usted?");
		System.out.println("Apliue sus conocimientos previos de paso de parametros...");

		ValorReferencia vf=new ValorReferencia();
		vf.tiposDeDatos();


	}
}
