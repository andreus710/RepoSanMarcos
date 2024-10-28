/**
* nombreClase: Camion.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/

package proAlgoritmicaII.paqSemana8;

public  class Camion extends Vehiculo {
    private int numEjes;
    private double capacidadCarga; // en toneladas

    public Camion() {
        super();
    }

    public Camion(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos,
                  double estadoTanque, String tipoCombustible, String esAutomatico, int numPuertas, int numEjes,
                  double capacidadCarga) {
        super(codigo, marca, placa, kilometraje, ciMotor, numAsientos, estadoTanque);
        this.numEjes = numEjes;
        this.capacidadCarga = capacidadCarga;
    }

    // Getters y Setters
    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public Camion leer() {
        System.out.println("---- Ingrese los datos del Camion ----");
        
        System.out.print("Ingrese el código: ");
        setCodigo( Leer.dato());
        
        System.out.print("Ingrese la marca: ");
        setMarca(Leer.dato());
     
        System.out.print("Ingrese la placa: ");
        setPlaca(Leer.dato());
        
        System.out.print("Ingrese el kilometraje: ");
        setKilometraje(Leer.dDouble());
        
        System.out.print("Ingrese el cilindraje del motor (ciMotor): ");
        setCiMotor(Leer.dDouble());
        
        System.out.print("Ingrese el número de puertas: ");
        setnumAsientos(Leer.dInt());
        
        System.out.print("Ingrese el estado del tanque (en litros): ");
        setEstadoTanque( Leer.dDouble());

        System.out.print("Ingrese el número de ejes: ");
        int numEjesInput = Leer.dInt();
        setNumEjes(numEjesInput);

        System.out.print("Ingrese la capacidad de carga (en toneladas): ");
        double capacidadCargaInput = Leer.dDouble();
        setCapacidadCarga(capacidadCargaInput);

        return this;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            "\nNúmero de ejes: %10d\nCapacidad de carga: %10.2f toneladas",
            getNumEjes(), getCapacidadCarga());
    }
}
