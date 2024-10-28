/**
 * @(#)Auto.java
 *
 *
 * @author 
 * @version 1.00 2009/10/4
 */
package proAlgoritmicaII.paqSemana6.paqInterfases.Auto;

public abstract class Auto {
  private String conductor;
  private String tipo;
  private String color;
  private Punto posicion;
  
  public Auto(){
  }
  
  public Auto(String conductor, String tipo, String color, Punto posicion) {
    this.conductor = conductor;
    this.tipo = tipo;
    this. color = color;
    this.posicion = posicion;
  }
  
  public String getConductor() { return conductor; }
  public String getTipo() { return tipo; }
  public String getColor() { return color; }
  public Punto getPosicion() { return posicion; }
  
  public void setConductor(String conductor) { this.conductor = conductor; }
  public void setTipo(String tipo) { this.tipo = tipo; }
  public void setColor(String color) { this.color = color; }
  public void setPosicion(Punto posicion) { this.posicion = posicion; }
  
  public String toString() {
    return "Conductor: " + conductor
      + "\nTipo: " + tipo
      + "\nColor: " + color
      + "\nPosicion: " + posicion;
  }
  
  public abstract void avanza();
}