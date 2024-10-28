package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico02;
/**
 * @(#)Arreglo.java
 *
 *
 * @author
 * @version 1.00 2024/10/4
 */


public class Arreglo {

	public Arreglo() {
	}

	public <T> void mostrarArreglo( T ta[] ){
		System.out.println();
		for(T vt : ta){
			System.out.printf("%s ", vt);
		}
		System.out.println();
	}
}