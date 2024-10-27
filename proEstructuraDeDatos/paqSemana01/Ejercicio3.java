package proEstructuraDeDatos.paqSemana01;

public class Ejercicio3 {

    public static void main(String[] args) {

        int[][] mtr = new int[2][2];

        int n=0;

        for(int i=0 ; i<2 ; i++) {
            for(int j=0 ; j<2 ; j++) {
                mtr[i][j]=n+1;
                n+=1;
            }
        }

        System.out.println("PRIMERA VEZ");

        for(int i=0 ; i<2 ; i++) {
            for(int j=0 ; j<2 ; j++) {
                System.out.print(mtr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("SEGUNDA VEZ");

        int[][] trans = new int[2][2];

        for(int i=0 ; i<2 ; i++) {
            for(int j=0 ; j<2 ; j++) {
                trans[i][j] = mtr[j][i];

            }
        }

        for(int i=0 ; i<2 ; i++) {
            for(int j=0 ; j<2 ; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }




    }

}

