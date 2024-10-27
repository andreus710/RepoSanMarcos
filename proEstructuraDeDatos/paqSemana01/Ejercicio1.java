package proEstructuraDeDatos.paqSemana01;

public class Ejercicio1 {

    public static void main(String[] args) {

        int suma=0;

        int[] array = new int[10];


        for(int i=0; i<10; i++) {
            array[i]=i+1;
        }

        for(int i=0; i<10 ; i++) {
            suma += array[i];
            System.out.println("- "+suma);
        }


        System.out.println("La sumatoria de los 10 numeros es "+ suma);
    }

}
