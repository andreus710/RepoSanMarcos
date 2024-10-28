package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico02;
/**
 * @(#)Bolsa.java
 *
 *
 * @author
 * @version 1.00 2024/10/4
 */


public class Bolsa<T> {
	private T vt;

    public Bolsa() {
    }
    public Bolsa(T t) {
    	vt=t;
    }

 	public void setVt(T t){
 		vt=t;
 	}
 	public T getVt(){
 		return(vt);
 	}

 	public String toString(){
 		String cad=new String();
 		cad= vt.toString();
 		return cad;
 	}
}