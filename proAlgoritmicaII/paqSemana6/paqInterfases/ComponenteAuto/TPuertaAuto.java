/**
 * @(#)TPuerta.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.ComponenteAuto;

public class TPuertaAuto {
	public static void main( String[] args ) {
   PuertaAuto p = new PuertaAuto();
   int opcion;
   do {
   	System.out.println();
      System.out.println("1. Abrir la puerta.");
      System.out.println("2. Cerrar la puerta.");
      System.out.println("3. Bloquear la puerta.");
      System.out.println("4. Desbloquear la puerta.");
      System.out.println("5. Activar la alarma.");
      System.out.println("6. Desactivar la alarma.");
      System.out.println("0. Terminar.");
      System.out.print("Que quieres hacer? ");
      opcion = Leer.leerInt();
      if(opcion == 0) 
      	break;
      if((opcion < 1) || (opcion > 6)) 
      	continue;
      switch(opcion) {
        case 1: p.abrir(); break;
        case 2: p.cerrar(); break;
        case 3: p.bloquea(); break;
        case 4: p.desbloquea(); break;
        case 5: p.activarAlarma(); break;
        case 6: p.desactivarAlarma(); break;
      }
    } while(opcion != 0);
  }
}  