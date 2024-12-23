package proEstructuraDeDatos.paqS1.EjercicioVector02;
import java.util.*;

public class RellenoRandom {
    public int[] vector = new int[20];
    int suma1 = 0, suma2 = 0;

    public void random(){
        Random rand = new Random();
        for(int i=0  ; i < 20 ; i++){
            vector[i] = rand.nextInt(1000);
        }

        for(int i=0 ; i < 20 ; i++){
            int num = vector[i];

            System.out.printf( i + ". "+ vector[i] + "\n ");
            if(num % 2 == 0){
                suma1 = suma1 + vector[i];
            }else{
                suma2 = suma2 + vector[i];
            }

        }
        System.out.println( " Suma pares : " + suma1+ "\nSuma impares : " + suma2);
    }

    public static void main(String[] args) {
        RellenoRandom r = new RellenoRandom();
        r.random();
    }
}
