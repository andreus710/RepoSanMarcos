package proAlgoritmicaII.paqSemana11.programaFlujos.persistencia.persistencia2; /**
 * @(#)Punto.java
 *
 *
 * @author 
 * @version 1.00 2011/6/11
 */

import java.io.*;
import java.util.*;

class Punto implements Serializable{
   private int x;
   private int y;
   
   Punto(int xv, int yv){
      System.out.println("Creando el punto (" + xv + ", " + yv + ")");
      x = xv;
      y = yv;
   }
   
   public int getX(){
      return x;
   }
   
   public int getY(){
      return y;
   }
} 
    