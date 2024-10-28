/**
* nombreClase: TractoCamion.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public class TractoCamion extends Camion {
    private double capacidadRemolque; // en toneladas

    public TractoCamion() {
        super();
    }

    public TractoCamion(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos,
                       double estadoTanque, String tipoCombustible, String esAutomatico, int numPuertas, int numEjes,
                       double capacidadCarga, double capacidadRemolque) {
        super(codigo, marca, placa, kilometraje, ciMotor, numAsientos, estadoTanque, tipoCombustible, esAutomatico, numPuertas,
              numEjes, capacidadCarga);
        this.capacidadRemolque = capacidadRemolque;
    }

    // Getters y Setters
    public double getCapacidadRemolque() {
        return capacidadRemolque;
    }

    public void setCapacidadRemolque(double capacidadRemolque) {
        this.capacidadRemolque = capacidadRemolque;
    }

    @Override
    public TractoCamion leer() {
        System.out.println("---- Ingrese los datos del TractoCamion ----");
        // Leer atributos de Vehiculo, Auto y Camion
        super.leer();

        // Leer atributo específico de TractoCamion
        System.out.print("Ingrese la capacidad de remolque (en toneladas): ");
        double capacidadRemolqueInput = Leer.dDouble();
        setCapacidadRemolque(capacidadRemolqueInput);

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCapacidad de remolque: %10.2f toneladas", getCapacidadRemolque());
    }
}
