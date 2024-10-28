package proAlgoritmicaII.paqSemana11.progPersistencia.ArchivoTxt;/*
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
public class Alumno extends Persona implements Serializable {

    private String codigo;
    private double nota;

    public Alumno(String codigo, double nota, String nombre, String dni) {
        super(nombre, dni);
        this.codigo = codigo;
        this.nota = nota;
    }

    public Alumno() {
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString(){   
        return  super.toString()+" "+codigo+" "+nota; 
    }   
}
