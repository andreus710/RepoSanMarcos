package proEstructuraDeDatos.paqTareasHuayna.Parcial.Pregunta01;

public class CentroTuristico {
    private String nombre;
    private int numSencillas;
    private int numDobles;
    private int totalRestaurantes;

    public CentroTuristico() {

    }

    public CentroTuristico(String nombre, int numSencillas, int numDobles, int totalRestaurantes) {
        this.nombre = nombre;
        this.numSencillas = numSencillas;
        this.numDobles = numDobles;
        this.totalRestaurantes = totalRestaurantes;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumSencillas(){
        return  numSencillas;
    }
    public void setNumSencillas(int numSencillas){
        this.numSencillas = numSencillas;
    }

    public int getNumDobles(){
        return numDobles;
    }
    public void setNumDobles(int numDobles){
        this.numDobles = numDobles;
    }

    public int getTotalRestaurantes(){
        return totalRestaurantes;
    }
    public void setTotalRestaurantes(int totalRestaurantes){
        this.totalRestaurantes = totalRestaurantes;
    }

    public CentroTuristico leerVector(){
        CentroTuristico a = new CentroTuristico();
        System.out.print("Nombre Centro turistico: ");
        String nom = Leer.dato();
        a.setNombre(nom);
        System.out.print("Habitaciones Sencillas : ");
        int dato = Leer.dInt();
        a.setNumSencillas(dato);
        System.out.print("Habitaciones Dobles : ");
        int dob = Leer.dInt();
        a.setNumDobles(dob);
        System.out.print("Habitaciones Restaurantes : ");
        int rest = Leer.dInt();
        a.setTotalRestaurantes(rest);

        return a;
    }

    public void mostrar(){
        System.out.print(this.toString());
    }

    public String toString(){
        String cad = null;
        cad = String.format("%-20s%-10d%-10d%-10d\n", getNombre() , getNumSencillas() , getNumDobles() , getTotalRestaurantes());
        return cad;
    }
}
