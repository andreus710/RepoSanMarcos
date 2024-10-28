/**
* nombreClase: Empleado.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia03;

import java.util.*;


public class Empleado {
	private String name;
	private double sueldo;
	private Date hireDay;
	private double salary;

	public Empleado(String n, double s, int year, int month, int day){  
	   name = n;
	   salary = s;
	   GregorianCalendar calendar=new GregorianCalendar(year, month - 1, day);
	      // GregorianCalendar uses 0 for January
	   hireDay = calendar.getTime();
	}
	
	public String getName(){
	   return name;
	}
	
	public double getSalary(){  
	   return salary;
	}
	
	public Date getHireDay(){  
	   return hireDay;
	}
	
	public void raiseSalary(double byPercent){  
	   double raise = salary * byPercent / 100;
	   salary += raise;
	}
	
}
