package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico01;
/**
 * @(#)MetodoGenerico.java
 *
 *
 * @author
 * @version 1.00 2024/10/5
 */


public class MetodoGenerico {

    public MetodoGenerico() {
    }

    public <T> void mostrarItem(T item) {
        System.out.println(item.toString());
    }

    public <T> void mostrarVectorItem(T item[]) {
		int ditem;
		ditem=item.length;
		if(ditem<1){
			System.out.println("Vector vaciooo...");
		}
		else{
	        for(T ele : item){
	        	System.out.println(ele.toString());
	        }
		}
    }

}