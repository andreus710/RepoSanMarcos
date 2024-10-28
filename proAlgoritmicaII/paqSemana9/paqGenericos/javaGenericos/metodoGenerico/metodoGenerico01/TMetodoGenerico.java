package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico01;
/**
 * @(#)TMetodoGenerico.java
 *		Analice el programa.
 *
 *	Implemente mas aplicaciones de los temas visto hasta ahora.
 *	�Facilia o hace mas farragoso las implementacion de aplicaciones?
 *
 * @author
 * @version 1.00 2024/10/5
 */


public class TMetodoGenerico {

    public static void main(String[] args) {
    	String s1="Hola mundo Java...";
		Alumno a1=new Alumno(105, "Eva", 15.5f);
		Alumno va[]=new Alumno[2];
		va[0]=new Alumno(105, "Eva", 15.5f);
		va[1]=new Alumno(106, "Adan", 12.5f);


    	MetodoGenerico mg1=new MetodoGenerico();
    	mg1.mostrarItem(s1);
    	mg1.mostrarItem(a1);

    	mg1.mostrarVectorItem(va);

    }
}