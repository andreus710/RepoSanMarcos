package proEstructuraDeDatos.paqS1.EjercicioVector06;

public class ComparacionEntreVectores {
    public void leerVectores(int[] v ){
        for(int i = 0; i < v.length; i++){
            v[i]= (int) (Math.random()*5);
        }
    }

    public void compararVectores(int[] v1 , int[] v2){
        for(int i = 0; i < v1.length; i++){
            if(v1[i] == v2[i]){
                System.out.println("\nEn la posicion " + i + " los vectores son iguales");
            }
        }
    }

    public void mostrarVector(int[] v ){
        for (int j : v) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];

        ComparacionEntreVectores c = new ComparacionEntreVectores();

        c.leerVectores(v1);
        c.leerVectores(v2);
        c.mostrarVector(v1);
        c.mostrarVector(v2);
        c.compararVectores(v1,v2);

    }
}
