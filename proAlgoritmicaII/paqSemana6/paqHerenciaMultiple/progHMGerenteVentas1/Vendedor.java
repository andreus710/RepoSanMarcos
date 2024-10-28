/**
 * @(#)Vendedor.java
 *
 *
 * @author 
 * @version 1.00 2011/10/17
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas1;

public class Vendedor extends EmpleadoHoras{  
	protected double comision;
   protected double ventas;

   public Vendedor() {
   	comision=0.0;
      ventas=0.0;
   }
   public Vendedor(String nombre){
   	super(nombre);
      // this.nombre=nombre;
   }
   public Vendedor(String nombre,double comision, double ventas){
   	super(nombre);
      this.ventas=ventas;
      this.comision=comision;
	}
   public void setComision(double comision){
   	this.comision=comision;
   }
   public double gerComision(){
   	return comision;
   }
   public void setVentas(double ventas){
   	this.ventas=ventas;
   }
   public double getVentas(){
   	return ventas; 
	}
}    
    
