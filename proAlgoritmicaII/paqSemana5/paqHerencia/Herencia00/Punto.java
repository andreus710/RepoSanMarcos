/**
* nombreClase: Punto.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqHerencia.Herencia00;

public class Punto {
    private int x;  // x, y  par de coordenadas
    private int y;  

    // constructor por defecto
    public Punto(){
       // la llamada implícita al constructor de Object
       System.out.println( "Constructor sin argumentos de Punto: " + this );
    } 

    // constructor sobrecargado con dos parametros
    public Punto( int valorX, int valorY ){
       // la llamada implícita al constructor de Object
       x = valorX; 
       y = valorY; 
       System.out.println( "Constructor de Punto: " + this );
    } 

    // finalizador
    protected void finalize(){
       System.out.println( "Finalizador de Punto: " + this );
    } 

    // establecer x en el par de coordenadas
    public void setX( int valorX ){
       x = valorX;  
    } 

    // establecer y en el par de coordenadas
    public void setY( int valorY ){
       y = valorY; 
    } 
    // obtener x del par de coordenadas
    public int getX(){
       return x;
    }  
    // obtener y del par de coordenadas
    public int getY(){
       return y;
    } 
  
    // obtener la representación String del objeto Punto
    public String toString(){
       return "(" + getX() + ", " + getY() + ")";
    } 
}