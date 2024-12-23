package proEstructuraDeDatos.paqS1.EjercicioVector01;



public class RellenarVector {
     int[] vector1 = new int[100];
     double[] vector2 = new double[100];


     public void rellenarVector() {
         for( int i = 0 ; i<100 ; i++){
            vector1[i] = i;
         }

         for(int i=0 ; i<100 ; i++){
             vector2[i] = Math.pow(vector1[i] , 2);
         }

         for(int i=0 ; i<100 ; i++){
             System.out.printf( i+". " +vector1[i] + "    " + vector2[i] + "\n" );
         }

     }

     public static void main(String[] args) {
         RellenarVector rellenarVector = new RellenarVector();
         rellenarVector.rellenarVector();
     }


}
