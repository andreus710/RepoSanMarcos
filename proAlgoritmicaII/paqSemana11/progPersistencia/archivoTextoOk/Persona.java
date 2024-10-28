package proAlgoritmicaII.paqSemana11.progPersistencia.archivoTextoOk;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;

/**
 *
 * @author 610
 */
public class Persona  implements Serializable{
    
    private int dni;
    private String nombre;

    public Persona() {
    }     

    public Persona(int dni,String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return "\nNombre: "+nombre+"\nDNI: "+dni;
    }
}
