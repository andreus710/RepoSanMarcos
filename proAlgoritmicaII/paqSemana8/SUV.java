/**
* nombreClase: SUV.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public class SUV extends Auto {
    private String tipoAtraccion; // "4x2" o "4x4"

    public SUV() {
        super();
    }

    public SUV(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos,
               double estadoTanque, String tipoCombustible, String esAutomatico, int numPuertas, String tipoAtraccion) {
        super(codigo, marca, placa, kilometraje, ciMotor, numAsientos, estadoTanque, tipoCombustible, esAutomatico, numPuertas);
        this.tipoAtraccion = tipoAtraccion;
    }

    // Getters y Setters
    public String getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(String tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }

    @Override
    public SUV leer() {
        System.out.println("---- Ingrese los datos del SUV ----");
        // Leer atributos de Vehiculo y Auto
        super.leerAuto();

        // Leer atributo específico de SUV
        System.out.print("Ingrese el tipo de atracción (4x2 o 4x4): ");
        String tipoAtraccionInput = Leer.dato();
        setTipoAtraccion(tipoAtraccionInput);

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nTipo de atracción: %10s", getTipoAtraccion());
    }
}