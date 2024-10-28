package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia2; /**
 * @(#)ListaPuntos.java
 *
 *
 * @author 
 * @version 1.00 2011/6/11
 */


import java.io.*;
import java.util.*;

public class ListaPuntos implements Serializable {
   private LinkedList lista = new LinkedList();

   public ListaPuntos() {
   }
   
   ListaPuntos(int np){
		System.out.println("Constructor de Lista  de Puntos");
      int x,y;
      
      for (int i=0; i<np; i++){
         x = (int) (Math.random()*10);
         y = (int) (Math.random()*10);
         lista.add(new Punto(x,y));
      }
   }
   
   public void mostrarPuntos(){
      ListIterator li = lista.listIterator(0);
      Punto p;
      
      while (li.hasNext()){
         p=(Punto)li.next();  
         System.out.println("x = " + p.getX() + ", y = " + p.getY());
      }
   }
    
}