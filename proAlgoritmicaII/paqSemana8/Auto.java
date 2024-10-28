/**
* nombreClase: Auto.java
* descripción:
*
*
* @autor Morales Usca, Andres
* @date: 15-10-2024
* @version 1
*/
package proAlgoritmicaII.paqSemana8;

public abstract class Auto extends Vehiculo {
    private String tipoCombustible;
    private String esAutomatico;
    private int numPuertas;

    public Auto() {
        super();
    }

    public Auto(String codigo, String marca, String placa, double kilometraje, double ciMotor, int numAsientos,
                double estadoTanque, String tipoCombustible, String esAutomatico, int numPuertas) {
        super(codigo, marca, placa, kilometraje, ciMotor, numAsientos, estadoTanque);
        this.tipoCombustible = tipoCombustible;
        this.esAutomatico = esAutomatico;
        this.numPuertas = numPuertas;
    }

    // Getters y Setters
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(String esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    protected void leerAuto() {
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
    
        System.out.print("Ingrese el tipo de combustible: ");
        setTipoCombustible(Leer.dato());

        System.out.print("Es automático (s/n): ");
        String automatico = Leer.dato();
        setEsAutomatico(automatico);

        System.out.print("Número de puertas: ");
        setNumPuertas(Leer.dInt());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            "\nTipo de combustible: %10s\nEs automático: %10s\nNúmero de puertas: %10d",
            getTipoCombustible(), getEsAutomatico(), getNumPuertas());
    }

    // Método abstracto leer que será implementado en las clases hijas
    @Override
    public abstract Auto leer();
}
    
    















