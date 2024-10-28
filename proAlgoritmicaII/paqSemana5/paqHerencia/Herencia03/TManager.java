/**
* nombreClase: TManager.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia03;

import java.util.*;

public class TManager
{  
   public static void main(String[] args)
   {  
      // construct a Manager object
      Manager boss = new Manager("Carl Cracker", 80000,
         1987, 12, 15);
      boss.setBonus(5000);

      Empleado[] staff = new Empleado[3];

      // fill the staff array with Manager and Employee objects

      staff[0] = boss;
      staff[1] = new Empleado("Harry Hacker", 50000,
         1989, 10, 1);
      staff[2] = new Empleado("Tommy Tester", 40000,
         1990, 3, 15);

      // print out information about all Employee objects
      for (int i = 0; i < staff.length; i++)
      {  
         Empleado e = staff[i];
         System.out.println("name=" + e.getName()
            + ",salary=" + e.getSalary());
      }
   }
}





