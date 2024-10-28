package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia3; /**
 * @(#)Empleado.java
 *
 *
 * @author 
 * @version 1.00 2009/11/14
 */

//Detalle explicito de java.io
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

public class Empleado implements Serializable {
   String  dni;
   String  nombre;
   double  sueldo;

   public Empleado(String dni, String nombre, double sueldo) {
      super();
      this.dni = dni;
      this.nombre = nombre;
      this.sueldo = sueldo;
   }
   public Empleado() {
      super();
   }
   //throws IOException Excepci�n de entrada/salida 
   public void salvar (String archivo) throws IOException {
      ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo));
      salida.writeObject(this);
   }
    //throws IOException Excepci�n de entrada/salida 
    //throws ClassNotFoundException Escepci�n de clase no encontrada
   public Empleado recuperar (String archivo) throws IOException, ClassNotFoundException {
      ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo));
      return (Empleado) entrada.readObject();
   }
   public String getDni() {
      return dni;
   }
   public String getNombre() {
      return nombre;
   }
   public double getSueldo() {
      return sueldo;
   }
   public void mostrarEmpleado(Empleado e) {
      System.out.println(e.dni+"\t"+e.nombre+"\t\t"+e.sueldo);
   }
   public void encabezado00() {
      System.out.println("\n\t\tRELACION DE EMPLEADOS\n");
      System.out.println("===================================");
      System.out.println("DNI\t\tNombre\t\t\tSueldo");
      System.out.println("===================================");     
   }
   
}
