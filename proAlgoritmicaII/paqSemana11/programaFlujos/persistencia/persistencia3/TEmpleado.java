package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia3; /**
 * @(#)TEmpleado.java
 *
 *
 * @author 
 * @version 1.00 2009/11/15
 */
import java.io.*;
public class TEmpleado {
   public TEmpleado() {
   }
   public static void main(String args[]) {
      // Creaci�n y serializar objeto Empleado
      Empleado s = new Empleado("09089901","Fernando",3500.90);
      try {
         s.salvar("FEmpleado");
      } 
         
      catch (IOException e1) {
         System.err.print(e1.getMessage());
      }
      // Creaci�n de un objeto Empleado y recuperar 
      Empleado h = new Empleado();
      try {
         h = h.recuperar("FEmpleado");
         h.encabezado00();
         h.mostrarEmpleado(h);
      }
      
      catch (IOException e1) {
         System.err.print(e1.getMessage());
      }
       
      catch (ClassNotFoundException e1) {
         System.err.print(e1.getMessage());
      }
   }
}
