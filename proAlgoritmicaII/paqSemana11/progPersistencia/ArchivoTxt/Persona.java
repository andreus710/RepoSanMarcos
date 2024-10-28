package proAlgoritmicaII.paqSemana11.progPersistencia.ArchivoTxt;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author 610
 */
public class Persona implements Serializable {
    
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {
    }
        
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }

    public String toString(){
        return nombre+" "+dni;
    }
    // metodo que sera sobrepuesto
    /*
    public String getCodigo(){
        return "";
    }
    */
}
