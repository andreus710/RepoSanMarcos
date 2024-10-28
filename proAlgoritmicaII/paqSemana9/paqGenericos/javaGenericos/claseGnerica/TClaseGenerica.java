package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.claseGnerica;
/**
 * @(#)TClaseGenerica.java
 *		Anaice la clase generica.
 *	�Que aplicaciones podria hacer con lo aprendido?
 *
 * @author
 * @version 1.00 2024/10/5
 */


public class TClaseGenerica {

    public static void main(String ar[]) {
    	ClaseGenerica<String> c1=new ClaseGenerica<>();
    	c1.setItem("Hola mundo cruel...");
    	System.out.println("String: "+c1);
    	System.out.println();

    	ClaseGenerica<Integer> c2=new ClaseGenerica<>(999);
    	System.out.println("Entero: "+c2.getItem());
    	System.out.println();

    	ClaseGenerica<Float> c3=new ClaseGenerica<>(19.5f);
    	System.out.println("Float: "+c3);
    	System.out.println();
    }

}