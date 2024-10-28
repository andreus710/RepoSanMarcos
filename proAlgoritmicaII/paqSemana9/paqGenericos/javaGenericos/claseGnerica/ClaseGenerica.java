package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.claseGnerica;
/**
 * @(#)ClaseGenerica.java
 *
 *
 * @author
 * @version 1.00 2024/10/5
 */


public class ClaseGenerica<T> {
	private T item;

    public ClaseGenerica() {
    }
    public ClaseGenerica(T vitem) {
    	item=vitem;
    }

	public void setItem(T vitem){
		item=vitem;
	}
	public T getItem(){
		return item;
	}

	public String toString(){
		String cad=new String();
		cad=item.toString();
		return cad;
	}
}