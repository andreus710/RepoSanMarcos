/**
* nombreClase: Manager.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia03;

public class Manager extends Empleado{
	   private double bonus;

	   public Manager(String n, double s,int year, int month, int day){  
	      super(n, s, year, month, day);
	      bonus = 0;
	   }

	   public double getSalary(){ 
	      double baseSalary = super.getSalary();
	      return baseSalary + bonus;
	   }

	   public void setBonus(double b){  
	      bonus = b;
	   }

	}
