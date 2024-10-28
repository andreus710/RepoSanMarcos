package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico03;
/**
 * @(#)Producto.java
 *
 *
 * @author
 * @version 1.00 2024/10/4
 */


public class Producto<T> {
	private T codProd;
	private String descripcion;
	private double precio;

	Producto(){
	}
	public Producto(T cod, String desc, double pre) {
		codProd = cod;
		descripcion = desc;
		precio = pre;
	}

	public T getCodProd() {
		return codProd;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public double getPrecio() {
		return precio;
	}

	@Override
	public String toString() {
		String cad=new String();
		cad="\nPRODUCTO: {"+
		"\nCodigo     : "+codProd+
		"\nDescripcion: "+descripcion+
		"\nPrecio     : "+precio+
		"\n}";
		return cad;
	}
}
