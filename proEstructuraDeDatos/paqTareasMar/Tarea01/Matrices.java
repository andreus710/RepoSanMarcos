package proEstructuraDeDatos.paqTareasMar.Tarea01;

import java.util.*;
public class Matrices {
    public static void crearMatriz(int[][] matriz ){
        Random random = new Random();
        for (int i=0 ; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
    }

    public static  void mostrarMatriz(int[][] matriz){

        for (int i=0 ; i <3 ; i++) {
            for (int j=0 ; j <3 ; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumaMatriz(int[][] matriz1 , int[][] matriz2 , int[][] matriz3){
        for (int i=0 ; i <3 ; i++) {
            for (int j=0 ; j <3 ; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j] ;
            }
        }
    }


    public static void main(String[] args){
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        int[][] matriz3 = new int[3][3];

        crearMatriz(matriz1);
        crearMatriz(matriz2);

        System.out.println("\nMatriz 1 -------------------------------");
        mostrarMatriz(matriz1);
        System.out.println("\nMatriz 2 -------------------------------");
        mostrarMatriz(matriz2);

        sumaMatriz(matriz1,matriz2,matriz3);
        System.out.println("\nSuma de matriz -------------------------");
        mostrarMatriz(matriz3);




    }
}
