/**
* nombreClase: Turismo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public class Turismo extends Auto {
    private String tipoPasajero;

    public Turismo() {
        super();
    }

    public Turismo(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos,
                   double estadoTanque, String tipoCombustible, String esAutomatico, int numPuertas, String tipoPasajero) {
        super(codigo, marca, placa, kilometraje, ciMotor, numAsientos, estadoTanque, tipoCombustible, esAutomatico, numPuertas);
        this.tipoPasajero = tipoPasajero;
    }

    // Getters y Setters
    public String getTipoPasajero() {
        return tipoPasajero;
    }

    public void setTipoPasajero(String tipoPasajero) {
        this.tipoPasajero = tipoPasajero;
    }

    @Override
    public Turismo leer() {
        System.out.println("---- Ingrese los datos del Turismo ----");
        // Leer atributos de Vehiculo y Auto
        super.leerAuto();

        // Leer atributo específico de Turismo
        System.out.print("Ingrese el tipo de pasajero: ");
        String tipoPasajeroInput = Leer.dato();
        setTipoPasajero(tipoPasajeroInput);

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nTipo de pasajero: %10s", getTipoPasajero());
    }
}
