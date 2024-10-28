/**
* nombreClase: Deportivo.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public class Deportivo extends Auto {
    private String turbo; // "s" para sí, "n" para no

    public Deportivo() {
        super();
    }

    public Deportivo(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos,
                     double estadoTanque, String tipoCombustible, String esAutomatico, int numPuertas, String turbo) {
        super(codigo, marca, placa, kilometraje, ciMotor, numAsientos, estadoTanque, tipoCombustible, esAutomatico, numPuertas);
        this.turbo = turbo;
    }

    // Getters y Setters
    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    @Override
    public Deportivo leer() {
        System.out.println("---- Ingrese los datos del Deportivo ----");
        // Leer atributos de Vehiculo y Auto
        super.leerAuto();

        // Leer atributo específico de Deportivo
        System.out.print("Tiene turbo (s/n): ");
        String turboInput = Leer.dato();
        setTurbo(turboInput);

        return this;
    }

    @Override
    public String toString() {
        String turboStr = getTurbo().equalsIgnoreCase("s") ? "Sí" : "No";
        return super.toString() + String.format("\nTiene Turbo: %10s", turboStr);
    }


    
}