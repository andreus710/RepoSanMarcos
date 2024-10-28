/**
* nombreClase: Vehiculo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public abstract class Vehiculo {
    private String codigo;
    private String marca;
    private String placa;
    private double kilometraje;
    private double ciMotor;
    private int numAsientos;
    private double estadoTanque;

    public Vehiculo() {
    }

    public Vehiculo(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos, double estadoTanque) {
        this.codigo = codigo;
        this.marca = marca;
        this.placa = placa;
        this.kilometraje = kilometraje;
        this.ciMotor = ciMotor;
        this.numAsientos = numAsientos;
        this.estadoTanque = estadoTanque;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getCiMotor() {
        return ciMotor;
    }

    public void setCiMotor(double ciMotor) {
        this.ciMotor = ciMotor;
    }

    public int getnumAsientos() {
        return numAsientos;
    }

    public void setnumAsientos(int numPuertas) {
        this.numAsientos = numPuertas;
    }

    public double getEstadoTanque() {
        return estadoTanque;
    }

    public void setEstadoTanque(double estadoTanque) {
        this.estadoTanque = estadoTanque;
    }

    public abstract Vehiculo leer();

    public void mostrar() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format(
                "\nCodigo: %10s  \nMarca: %10s  \nPlaca: %10s \nKilometraje: %10.2f km \nMotor: %10.2f  \nNumero Asientos: %10d  \nEstado Tanque: %10.2f",
                getCodigo(), getMarca(), getPlaca(), getKilometraje(), getCiMotor(), getnumAsientos(), getEstadoTanque());
    }
}











