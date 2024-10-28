/**
* nombreClase: Credito.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 08-09-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana4.paqEmpresa;

public class Credito {
    private String nombre;
    private String numtarjeta;
    private double importe;
   
    public Credito(){

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(String numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }




}
