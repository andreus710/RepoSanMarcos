package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico02;
/**
 * @(#)TArreglo.java
 *
 *
 * @author
 * @version 1.00 2024/10/4
 */


public class TArreglo {

	public static void main(String ar[]) {
		Integer ia[] = { 11, 22, 33, 44, 55};
		Double da[] = { 1.11, 2.12, 3.13, 4.14, 5.15 };
		String s1[] = { "La","bisagra","es","un","fosil","de","mariposa.","Sofocleto"};
		String s2[] = { "El","verdadero","primer","amor","es","el","ultimo.","Sofocleto"};

		Arreglo va=new Arreglo();

		va.mostrarArreglo(s1);
		va.mostrarArreglo(s2);

	}
}