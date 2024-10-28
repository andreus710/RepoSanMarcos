/**
* nombreClase: Punto.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 25-08-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana1.paq01Tarea;

public class Punto {
	int x;
	int y;

   public Punto() {
   }

   public Punto(int vx, int vy) {
   	   x=vx;
   	   y=vy;
   }

   public void setX(int vx){
   	x=vx;
   }
   public void setY(int vy){
   	y=vy;
   }

   public int getX(){
   	return x;
   }
   public int getY(){
   	return y;
   }

   public void trasladar(int dx, int dy){
   	x = x+dx;
   	y = y+dy;
   }

   public String toString(){
   	return "("+x+","+y+")";
   }

}
