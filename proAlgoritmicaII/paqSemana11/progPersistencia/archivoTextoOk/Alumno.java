package proAlgoritmicaII.paqSemana11.progPersistencia.archivoTextoOk;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author 610
 */
//public class Alumno extends Persona implements Serializable{
public class Alumno{
    private int dni;
    private String nombre;

    private String codigo;
    private double nota;

    public Alumno() {
    }
	/*
    public Alumno(int dni,String nombre,String codigo,double nota) {
        super(dni,nombre);
        this.codigo = codigo;
        this.nota = nota;
    }
    */
    public Alumno(int dni,String nombre,String codigo,double nota) {
        this.dni = dni;
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota = nota;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public int getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }

    public double getNota() {
        return nota;
    }

    public String toString(){   
        return  super.toString()+"\nCodigo: "+codigo+"\nNota: "+nota; 
    }
    
}
