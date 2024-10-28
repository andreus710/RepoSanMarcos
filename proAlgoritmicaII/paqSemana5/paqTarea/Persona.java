/**
* nombreClase: Persona.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 16-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana5.paqTarea;

class Persona{
String nombre;
 private String direccion;
 private String fono;
public Persona(String nom, String dir, String f){
nombre = nom;
direccion = dir;
fono = f;
 }
public String getNombre(){
return nombre;
 }
//Se define el metodo mostrarInfo
public void mostrarInfo(){
System.out.println("nombre : " + nombre);
System.out.println("direccion : " + direccion);
System.out.println("telefono : " + fono);
 }
}

