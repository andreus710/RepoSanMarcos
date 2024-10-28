package proAlgoritmicaII.paqSemana9.paqGenericos.javaGenericos.metodoGenerico.metodoGenerico03;
/**
 * @(#)TProducto.java
 *
 *
 * @author
 * @version 1.00 2024/10/4
 */


public class TProducto {

    public static void main(String ar[]){
    	Producto p1=new Producto(1099, "Alicate de presion 12\" ", 325.50);
    	Producto p2=new Producto("W199", "Smartwatch Pro Huaweo", 980.50);
    	System.out.println(p2);

    	System.out.println("\nCodigo  : "+p1.getCodProd());
    	System.out.println("Descrip : "+p1.getDescripcion());
    }
}