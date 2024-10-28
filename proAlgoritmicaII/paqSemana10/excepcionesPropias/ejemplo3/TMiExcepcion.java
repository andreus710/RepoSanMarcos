package proAlgoritmicaII.paqSemana10.excepcionesPropias.ejemplo3;

/**
 * @(#)TMiExcepcion.java
 *
 *
 * @author 
 * @version 1.00 2019/10/22
 */


public class TMiExcepcion {

	public static void main(String[] args) {
		int num;
		try {
			num = 5;
			if (num >= 0 && num <= 10) {
				throw new MiExcepcion(111);
			} 
			else {
				if (num > 10 && num <= 20) {
					throw new MiExcepcion(222);
				} 
				else {
					if (num > 20 && num <= 30) {
						throw new MiExcepcion(333);
					}
				}
			}
		} 
		catch (MiExcepcion ex) {
			System.out.println(ex.getMessage());
		}
	}   
}