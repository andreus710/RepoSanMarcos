/**
 * @(#)EmpleadoHoras.java
 *
 *
 * @author 
 * @version 1.00 2011/10/17
 */
package proAlgoritmicaII.paqSemana6.paqHerenciaMultiple.progHMGerenteVentas1;

public class EmpleadoHoras extends Empleado{
    
   protected  double horas;
	protected double salario;
	public EmpleadoHoras() {
   	horas=0.0;
      salario=0.0;
   } 
	public EmpleadoHoras(double horas, String nombre, double salario){
   	super(nombre);
      this.horas=horas;
      this.salario=salario;
   }
   public EmpleadoHoras(String nombre){
   	super(nombre);
   } 
   public void setHoras(double horas){
   	this.horas=horas;
   }
   public double getHoras(){
   	return horas;
   } 
   public void setSalario(double salario){
   	this.salario=salario;
   } 
   public double getSalario(){
        return salario;
   }
}
